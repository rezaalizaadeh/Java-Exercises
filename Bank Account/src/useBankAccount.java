
public class useBankAccount {

	public static void main(String[] args) {
		 
	final double RATE = 0.2;
	final long INITIAL_BALANCE = 10000L;
		 
         BankAccount acct = new BankAccount(INITIAL_BALANCE);
        		 
		 double interest = acct.getBalance() * RATE;
		 acct.deposit(interest);
		 System.out.println("Balance after one year: "+ acct.getBalance() + " $");
		 
		 
		 interest = acct.getBalance() * RATE;
		 acct.deposit(interest);
		 System.out.println("Balance after two year: "+ acct.getBalance() + " $");
		 
		 interest = acct.getBalance() * RATE;
		 acct.deposit(interest);
		 System.out.println("Balance after three year: "+ acct.getBalance() + " $");
			 
			 
		 }
	}


