package exceptionHand;

public class RunTimeExceptionPropagation {

	/*
	 * you don't need to use "throws keyword" for run time exception
	 * 
	 */

	// postponding handling exceptions

	public static void m1() {

		throw new ArithmeticException("Arithmetic exception");

	}

	// postponding handling exceptions
	public static void m2() {

		m1();

	}

	// postponding handling exceptions
	public static void m3() {

		m3();

	}

	public static void main(String[] args) {

		try {
			m3();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
