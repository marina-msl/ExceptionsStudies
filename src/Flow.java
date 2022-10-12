
public class Flow {

	// understanding how stack works and the flow of the methods

	public static void main(String[] args) {

		System.out.println("Start main");
		method1();
		System.out.println("End main");
	}

	private static void method1() {
		System.out.println("Start method1");
		method2();
		System.out.println("End method1");
	}

	private static void method2() {
		System.out.println("Start method2");
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
			try {
				int a = i / 0;
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException");
			}
		}
		System.out.println("End method2");
	}

}
