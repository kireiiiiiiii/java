public class BankClient {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        BankAccount account2 = new BankAccount("Me", 1000, "002 3 ");

        System.out.println(account + " - empty acc");
        System.out.println(account2 + " - name 'Me' and balance 1000");

        account.withdraw(500);
        account2.withdraw(500);

        System.out.println(account2 + " - 500");

        account2.deposit(100);

        System.out.println(account2 + " - should be 600");
    }
}
