package customException;

class WrongPrice extends RuntimeException { // extends RuntimeException

	WrongPrice(String msg) {

		super(msg);
	}
}

class Book {

	public static void price(int a) { // no throws, Exception declaration

		if (a > 500 || a < 100) {

			throw new WrongPrice("This is Custom Runtime exception");

		} else {
			System.out.println("No exception found");
		}

	}
}

public class UncheckedCustomExceptDemo1 {

	public static void main(String[] args) {

		try {
			Book.price(10);
		} catch (WrongPrice e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		}

		System.out.println("Exception handled !!");

	}

}
