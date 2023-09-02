package lab;

public class A8 {

	public static void main(String[] args) {

		String a = "sd";
		int b[] = { 1, 2, 3, 4 };

		try {
			for (int i = 0; i <= a.length(); i++) {
				a.charAt(i);
			}
			int c = b[4];

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

}
