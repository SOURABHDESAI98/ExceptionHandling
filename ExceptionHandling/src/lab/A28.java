package lab;

import java.io.IOException;;

public class A28 {

	public static void m1() throws IOException {

		throw new IOException("I/O exception arised");
	}

	public static void main(String[] args) {

		try {
			m1();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
