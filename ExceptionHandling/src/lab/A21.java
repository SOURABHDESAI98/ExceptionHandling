package lab;

public class A21 {

	public static void m1() {

		int a[] = new int[5];

		try {

			for (int i = 0; i <= a.length; i++) {

				a[i] = i;

			}

		} catch (ArrayIndexOutOfBoundsException e) {

			throw new ArithmeticException();
		}
	}

	public static void m2() {
		try {

			m1();

		} catch (ArithmeticException e) {
			throw new NumberFormatException("Wrong number format");
		}

	}

	public static void main(String[] args) {

		try {

			m2();

		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}

	}

}
