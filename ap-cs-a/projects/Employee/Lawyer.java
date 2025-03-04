package Employee;

public class Lawyer extends Employee {
    public Lawyer(int yearsWorked) {
        super(yearsWorked, "Lawyer");
    }
    
    public int getVacationDays() {
        return super.getVacationDays() + 7;
    }

    public String getVacationForm() {
        return "pink";
    }

    public void sue() {
        System.out.println("I'm suing rn!");
    }    
}
