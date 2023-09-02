package exceptionHand;

import java.io.IOException;

class CheckString {

	public static void checkLength(String a) throws IOException {

		try {
			System.out.println(a.length());

		} catch (NullPointerException e) {

			// rethrowing other exception
			throw new IOException("Input/output exception");

		}

	}

}

public class RethrowException {

	public static void main(String[] args) {

		String a = null;

		try {

			CheckString.checkLength(a);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
