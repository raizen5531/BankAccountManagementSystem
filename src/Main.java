public class Main {

	public static void main(String[] args) {

		BankAccount account1 = new BankAccount(123, "Arjit", 88.88);
		BankAccount account2 = new BankAccount(124, "Piyush", 1.00);
		
		System.out.println(account1.displayDetails());
		account1.deposit(1.22);
		System.out.println(account1.displayDetails());
		account1.withdraw(1.22);
		System.out.println(account1.displayDetails());

		System.out.println(account2.displayDetails());
		account2.deposit(1.22);
		System.out.println(account2.displayDetails());
		account2.withdraw(1.22);
		
	}
}
