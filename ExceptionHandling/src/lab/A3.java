package lab;

public class A3 {

	public static void main(String[] args) {

		int a[] = new int[3];

		try {

			for (int i = 0; i <= a.length; i++) {

				a[i] = i;
			}
			int b = a[0] / 0;

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}
}
