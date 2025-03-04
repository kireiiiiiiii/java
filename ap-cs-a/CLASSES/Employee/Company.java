package Employee;

public class Company {
    public static void main(String[] args) {
        Lawyer l1 = new Lawyer(2);
        Marketer m1 = new Marketer(2);
        Secretary s1 = new Secretary(2);
        LegalSecretary ls1 = new LegalSecretary();

        System.out.println("Testing Lawyer");
        System.out.println("I have " + l1.getVacationDays() + " vacation days\n" +
                "I work " + l1.getHours() + " hours a week\n" +
                "I earn " + l1.getSalary() + " a year");
    }
}
