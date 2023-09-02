package lab;

public class UncheckedExcepPropagationA14 {

	static int a = 10;
	static int b = 0;
	static int div;

	public static void m1() {
		div = a / b;
	}

	public static void m2() {
		m1();
	}

	public static void main(String[] args) {

		try {

			m2();

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
