package exceptionHand;

import java.io.IOException;

public class CompileTimeExceptionPropagation {

	/*
	 * 1. this is the example of exception propagation or exception postponding for
	 * checked exceptions
	 * 
	 * 2.only one throw can be used in block
	 */

	// postponding handling exceptions

	public static void m1() throws IOException, ClassNotFoundException {
		throw new IOException("I/O exception occurred");// only one throw can be used in block
	}

	// postponding handling exceptions
	public static void m2() throws IOException, ClassNotFoundException {

		m1();

	}

	// postponding handling exceptions
	public static void m3() throws IOException, ClassNotFoundException {

		m2();

	}

	public static void main(String[] args) {

		try {
			m3();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		/*
		 * 
		 * try { m3(); } catch (IOException | ClassNotFoundException e) {
		 * System.out.println(e.getMessage()); }
		 */
	}

}
