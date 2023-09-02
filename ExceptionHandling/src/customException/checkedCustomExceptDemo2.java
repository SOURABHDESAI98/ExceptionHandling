package customException;

class WrongPrice1 extends Exception { // extends Exception

	WrongPrice1(String msg) {

		super(msg);
	}
}

class Book1 {

	public static void price(int a) throws WrongPrice1 { // throws must be there

		if (a > 500 || a < 100) {

			throw new WrongPrice1("This is Custom CompileTime exception");

		} else {
			System.out.println("No exception found");
		}

	}
}

public class checkedCustomExceptDemo2 {

	public static void main(String[] args) {

		try {
			Book1.price(10);
		} catch (WrongPrice1 e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		}

		System.out.println("Exception handled !!");

	}

}
