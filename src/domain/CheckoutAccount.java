package domain;

public class CheckoutAccount extends Accounts {

	
	public CheckoutAccount(String number, Double total) {
		super(number, total);
	}

	public void createCheckoutAccount() {
		System.out.println("Chcekout was created! Number: " + id );
	}
	
	public void deposit() throws ExceptionChecked {
		
	}
}
