package lab;

public class Assignment6 {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;

		try {
			int div = a / b;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
