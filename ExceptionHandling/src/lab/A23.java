package lab;

public class A23 {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		String c = null;

		try {
			int div = a / b;

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {

			try {
				int f = c.length();
			} catch (NullPointerException e2) {
				System.out.println(e2.getMessage());
			}

		}

	}

}
