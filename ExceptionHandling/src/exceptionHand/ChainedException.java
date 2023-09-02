package exceptionHand;

import java.io.IOException;

public class ChainedException {

	public static void divide(int x, int y) {

		try {

			int div = x / y;
			System.out.println(div);

		} catch (ArithmeticException e) {
			System.out.println(e);
// or     ArithmeticException ex= new ArithmeticException();
//        ex.initCause(new IOException("I/O exception occurs"));
//        throw ex;

			e.initCause(new IOException("I/O exception occurs"));
			throw e;
		}

	}

	public static void main(String[] args) {
		int x = 10;
		int y = 0;

		try {

			divide(x, y);

		} catch (ArithmeticException e) {
			System.out.println(e.getCause());
		}

	}

}
