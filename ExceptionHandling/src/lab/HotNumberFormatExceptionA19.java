package lab;

public class HotNumberFormatExceptionA19 {

	public static void main(String[] args) {

		String s = null;

		try {
			int a = Integer.parseInt(s); // wrong(null) string format as a parameter
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}

	}

}
