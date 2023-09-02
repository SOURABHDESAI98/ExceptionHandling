package lab;

public class A11A12 {
	static int a = 10;
	static int b = 20;

	public static int returnInt1() {
		return a;
	}

	public static int returnInt2() {
		return b;
	}

	public static void main(String[] args) {

		try {

			System.out.println(returnInt1() + " try block code");

		} catch (Exception e) {

		} finally {
			System.out.println(returnInt2() + " finally block code");
		}

	}

}
