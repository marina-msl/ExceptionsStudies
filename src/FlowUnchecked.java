import java.awt.Checkbox;

import domain.CheckoutAccount;

public class FlowUnchecked {

	public static void main(String[] args) {
		System.out.println("Start main");
		try {
			method1();
		} catch (Exception ex) {
			System.out.println("Exception: ");
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		System.out.println("End main");
	}

	private static void method1() {
		System.out.println("Start method 1");
		method2();
		System.out.println("End method1");
	}

	private static void method2() {
		System.out.println("Start method 2");
		throw new NullPointerException();
		//System.out.println("End method 2");
	}
}
