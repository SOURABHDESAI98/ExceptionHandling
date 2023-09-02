package exceptionHand;

public class NestedTryCatch {

	public static void main(String[] args) {

		int a[] = new int[2];
		a[0] = 5;
		a[1] = 0;

		try {

			try {
				System.out.println(a[0] / a[1]);
			} catch (ArithmeticException e) {
				System.out.println(e);
			}

			try {
				a[4] = 20;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

			// always put code of parent try block at bottom
			System.out.println(a[3]);

		} catch (Exception e) { // don not add try-catch in catch block
			System.out.println(e);
		}

	}

}
