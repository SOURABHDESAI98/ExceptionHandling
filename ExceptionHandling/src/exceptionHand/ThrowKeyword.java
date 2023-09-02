package exceptionHand;

public class ThrowKeyword {

	/*
	 * 1. java throw keyword is used to throw an exception explicitly
	 * 
	 * 2.it is mainly used in custom exception
	 *
	 * 3. we can throw checked or unchecked exceptions
	 * 
	 * 4. throw always comes under a block
	 * 
	 * 5. if you want to throw compile time exceptions or Exception class then you
	 * need to use "throws CompileTimeExceptionClassName" after method eg- void m1()
	 * throws Exception{}; void m1() throws IOException{} //compile time exception
	 * 
	 * and rest of the things are same as throwing run time exceptions
	 * 
	 * 
	 */

	public static void customException(int a) {

		if (a < 25) {
			throw new ArithmeticException("Age is less than 25");

			// instead of using this- System.out.println("not eligible");
		} else {
			System.out.println("you are eligible");
		}

	}

	public static void main(String[] args) {

		int a = 20;

		try {
			customException(a);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
