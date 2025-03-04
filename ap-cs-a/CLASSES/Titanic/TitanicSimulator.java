import java.util.ArrayList;

public class TitanicSimulator extends TitanicSimulatorBase {
    // Constructor(s)
    public TitanicSimulator() {
    }

    // Sorts students by the requested method, the returned list should contain the
    // number of students equal to 'studentCount' and ordered by the requested
    // method.
    public ArrayList<Student> pickStudents(Skyward skyward, int studentCount, SortMethod sortMethod) {
        ArrayList<Student> students = skyward.getStudents(); // get students from the skyward class
        Student[] studentsArr = new Student[students.size()];
        for (int i = 0; i < students.size(); i++) {
            studentsArr[i] = students.get(i);
        }
        Student[] sortedStudentsArr = mergeSort(studentsArr, sortMethod);
        students.clear();
        for (int i = 0; i < sortedStudentsArr.length; i++) {
            students.add(sortedStudentsArr[i]);
        }
        return copyFirstN(students, studentCount);
    }

    /**
     * Recursive merge sort method for an array of Student objects
     * 
     * @param sortMethod - type of sort method you want to sort with
     * @param arr        - array of Student objects you want to sort
     * @return returns sorted arraylist
     */
    private Student[] mergeSort(Student[] arr, SortMethod sortMethod) {
        int arrLength = arr.length;
        // base case
        if (arrLength == 1) {
            return arr;
        } else {

            // separate into two halves
            int leftLength = arrLength / 2;
            int rightLength = arrLength - leftLength;
            Student[] leftHalf = new Student[leftLength];
            Student[] rightHalf = new Student[rightLength];
            for (int i = 0; i < leftLength; i++) {
                leftHalf[i] = arr[i];
            }
            for (int i = 0; i < rightLength; i++) {
                rightHalf[i] = arr[i + leftLength];
            }

            // sort the halves with recursion
            leftHalf = mergeSort(leftHalf, sortMethod);
            rightHalf = mergeSort(rightHalf, sortMethod);

            // merge
            int leftIndex = 0;
            int rightIndex = 0;
            Student[] returnArr = new Student[arrLength];
            for (int i = 0; i < arrLength; i++) {
                if (leftIndex >= leftLength) {
                    returnArr[i] = rightHalf[rightIndex];
                    rightIndex++;
                } else if (rightIndex >= rightLength) {
                    returnArr[i] = leftHalf[leftIndex];
                    leftIndex++;
                } else if (compareStudents(leftHalf[leftIndex], rightHalf[rightIndex], sortMethod) < 0) {
                    returnArr[i] = leftHalf[leftIndex];
                    leftIndex++;
                } else {
                    returnArr[i] = rightHalf[rightIndex];
                    rightIndex++;
                }
            }
            return returnArr;
        }
    }

    // This is a helper method you can use. It compares two students using your the
    // provided comparison method.
    private int compareStudents(Student a, Student b, SortMethod sortMethod) {
        assert (a != null && b != null) : "Student parameter null";
        if (sortMethod == SortMethod.FIRST_NAME) {
            return a.getFirstName().toUpperCase().compareTo(b.getFirstName().toUpperCase());
        } else if (sortMethod == SortMethod.LAST_NAME) {
            return a.getLastName().toUpperCase().compareTo(b.getLastName().toUpperCase());
        } else if (sortMethod == SortMethod.STUDENT_ID) {
            return Integer.compare(a.getStudentId(), b.getStudentId());
        } else { // sortMethod == SortMethod.GRADE
            return Double.compare(b.getGrade(), a.getGrade());
        }
    }

    // Here's another helper method for you. It copies the first 'count' students
    // into a new ArrayList for you.
    private ArrayList<Student> copyFirstN(ArrayList<Student> students, int count) {
        ArrayList<Student> copy = new ArrayList<Student>();
        for (int i = 0; (i < count) && (i < students.size()); i++) {
            copy.add(students.get(i));
        }
        return copy;
    }
}
