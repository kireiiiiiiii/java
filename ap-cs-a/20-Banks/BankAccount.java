import java.util.Scanner;
// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
	private String name;
	private double balance;
	private int accId;
	private String password;
	Scanner console = new Scanner(System.in);
	private static int id = 0;

	/**
	 * Constructor with no parameters, initializes name to null and balance to zero
	 */
	public BankAccount() {
		this(null, 0, null);
	}

	/**
	 * Constructer with a name and balance parameters
	 * @param name - name of the owner of account
	 * @param balance - initial balance of the account
	 */
	public BankAccount(String name, double balance, String password) {
		this.name = name;
		this.balance = balance;
		this.password = password;
		accId = id;
		accId++;
	}

	/**
	 * Deposits money into the account
	 * @param amount - the money that is being deposited
	 */
	public void deposit(double amount) {
		balance = balance + amount;
	}

	/**
	 * Withdraws money from the account, if the moey withdrawn is not in the account, it prints a warning message
	 * @param amount
	 */
	public void withdraw(double amount) {
		if(amount>balance){
			balance = balance - amount;
			System.out.println("Withdraw succesful, balance: " + balance);
		}
		else
			System.out.println("Balance too low");
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Balance: " + balance;
	}

	public void printId() {
		System.out.println("");
		for (int i = 0; i<5; i++) {
			String input = console.nextLine();
			if (password.equals(input)){
				System.out.println("ID: " + id);
				break;
			}
			else
				console.next();
		}
		
		
	}
}