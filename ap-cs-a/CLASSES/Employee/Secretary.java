package Employee;

public class Secretary extends Employee {
    public Secretary(int yearsWorked) {
        super(yearsWorked, "Secretary");
    }
    
    public void takeDictation() {
        System.out.println("I'm taking dictation rn!");
    }
}
