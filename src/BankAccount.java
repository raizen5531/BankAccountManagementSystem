public class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private double balance;

	public BankAccount(int accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount;
	}

	public double checkBalance() {
		return this.balance;
	}

	public String displayDetails() {
		return String.format("Account No: %d, Account Holder: %s, Balance: %.2f", this.accountNumber, this.accountHolderName, this.balance);
	}
}