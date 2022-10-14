import java.awt.Checkbox;

import domain.CheckoutAccount;

public class FlowExceptions {

	public static void main(String[] args) {
		System.out.println("Start main");
		try {
			method1();
		} catch (ArithmeticException | NullPointerException ex) {
			//ArithmeticException and NullPointerException are Java's class!
			//So that ex is a reference of Arithmetic or NullPointer Java's class!
			System.out.println("Exception: " + ex.getMessage());
			//using a public method of the ArithmeticException class!
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

		throw new ArithmeticException("trouble");
		
		//System.out.println("End method2");
	}
}
