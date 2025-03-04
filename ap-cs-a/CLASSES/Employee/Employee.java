package Employee;
// A class to represent employees in general (20-page manual).
public class Employee {
    private int yearsWorked = 0;
    private String employeeType = "";
    
    public Employee(int yearsWorked) {
        this.yearsWorked = yearsWorked;
        employeeType = "employee";
    }

    public Employee(int yearsWorked, String employeeType) {
        this.yearsWorked = yearsWorked;
        this.employeeType = employeeType;
    }
    
    public int getHours() {
        return 40;           // works 40 hours / week
    }
    
    public double getSalary() {
        return 40000.0;      // $40,000.00 / year
    }
    
    public int getVacationDays() {
        return 14 + getBonus();           // 2 weeks' paid vacation
    }

    public String getVacationForm() {
        return "yellow";     // use the yellow form
    }

    private int getBonus() {
        if (employeeType.equalsIgnoreCase("secretary")) {
            return 0;
        }
        else {
            return getSalary();
        }
    }
}
