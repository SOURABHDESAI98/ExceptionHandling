package exceptionHand;

public class ExceptionPropagation {

	public static void divide() {

		int a = 10;
		int b = 0;

		try {
			int div = a / b;
		} catch (ArithmeticException e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		divide();
		System.out.println("end");

	}

}
