package lab;

import java.io.IOException;

public class checkedExcepPropagationA15 {

	static int a = 10;
	static int b = 0;
	static int div;

	public static void m1() throws ClassNotFoundException, IOException {

		throw new ClassNotFoundException("Class not found");

	}

	public static void m2() throws ClassNotFoundException, IOException {
		m1();
	}

	public static void main(String[] args) {

		try {

			m2();

		} catch (ClassNotFoundException | IOException e) {
			System.out.println(e.getMessage());

		}

		/*
		 * OR
		 * 
		 * catch (ClassNotFoundException e) { System.out.println(e.getMessage()); }
		 * 
		 * catch (IOException e) { System.out.println(e.getMessage()); }
		 * 
		 * 
		 * 
		 */

	}

}
