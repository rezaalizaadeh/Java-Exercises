
public class BankAccount {
private double balance;
	
	public BankAccount (double initialBalance) {
		balance = initialBalance;
	}
	public BankAccount() {
		balance= 0;
	}
	public void deposit(double amount) {
		balance = balance+amount;
	}
	public void withdraw(double amount) {
		balance =  balance-amount;
	}
	public double getBalance() {
		return balance;
	}
		public String toString() {
			return "BankAccount: balance is equal to: " +balance;
		}
	}

