
public class FlowArithmeticException {

	// understanding how stack works and the flow of the methods

	public static void main(String[] args) {

		System.out.println("Start main");
		try {
			method1();
		} catch (ArithmeticException ex) {
			//ArithmeticException is a Java's class!
			//So that ex is a reference of Arithmetic Java's class!
			System.out.println("ArithmeticException");
			System.out.println(ex.getMessage());
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
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
			int a = i / 0; //trouble code
		}
		System.out.println("End method2");
	}
}
