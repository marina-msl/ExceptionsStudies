import domain.CheckoutAccount;
import domain.ExceptionChecked;

public class FlowCheckedException {
	
	public static void main(String[] args) {
		
		CheckoutAccount checkoutAccount = new CheckoutAccount("123", 100.40);
		
		try {
			
			//-> Alternative 1 : try/catch
			//-> Alternative 2: throws on the main method!
			checkoutAccount.deposit();
		} catch (ExceptionChecked e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
