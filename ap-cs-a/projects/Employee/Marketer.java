package Employee;

public class Marketer extends Employee{
    public Marketer(int yearsWorked) {
        super(yearsWorked, "Marketer");
    }
    
    public void advertise() {
        System.out.println("Buy!");
    }

    public double getSalaty() {
        return super.getSalary() + 10000;
    }
}
