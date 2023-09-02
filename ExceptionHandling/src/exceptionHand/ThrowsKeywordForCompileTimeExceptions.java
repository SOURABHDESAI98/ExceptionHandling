package exceptionHand;

import java.io.IOException;

public class ThrowsKeywordForCompileTimeExceptions {

	/*
	 * 1. throws keyword is used along with method name eg- void m1() throws
	 * ExceptionClassName
	 *
	 * 2. it is used for throwing compile time exceptions and Exception class
	 * 
	 * 3. rest of the things are same as throwing run time exceptions
	 * 
	 * 4. if you want to throw compile time exceptions or Exception class then you
	 * need to use "throws CompileTimeExceptionClassName" after method eg- void m1()
	 * throws Exception{}; void m1() throws IOException{} //compile time exception
	 * 
	 */

	public static void customException(int a) throws IOException {

		if (a < 25) {
			throw new IOException("Age is less than 25");

			// instead of using this- System.out.println("not eligible");
		} else {
			System.out.println("you are eligible");
		}

	}

	public static void main(String[] args) {

		int a = 20;

		try {
			customException(a);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
