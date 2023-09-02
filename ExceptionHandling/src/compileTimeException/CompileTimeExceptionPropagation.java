package compileTimeException;

import java.io.IOException;

public class CompileTimeExceptionPropagation {

	/*
	 * 1. this is the example of exception propagation or exception postponding for
	 * checked exceptions
	 * 
	 */

	// postponding handling exceptions

	public static void m1() throws IOException, ClassNotFoundException {

		throw new IOException("I/O exception");

	}

	// postponding handling exceptions
	public static void m2() throws IOException, ClassNotFoundException {

		m1();

	}

	// postponding handling exceptions
	public static void m3() throws IOException, ClassNotFoundException {

		m3();

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
