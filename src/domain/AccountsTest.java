package domain;

public class AccountsTest {
	
	public static void main(String[] args) {
		 Accounts account = new Accounts("123", 100.00);
		 
		 System.out.println(account.getTotal());
		 
		 try {
			 account.withdraw(130.00);
		 } catch (InsuficientBalanceException e) {
			 System.out.println("Insuficient Balance Exception " + e.getMessage());
			 e.printStackTrace();
		 }
		 System.out.println("Balance: " + account.getTotal());
	}

}
