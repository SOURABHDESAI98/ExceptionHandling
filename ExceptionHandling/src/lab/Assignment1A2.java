package lab;

public class Assignment1A2 {

	public static void main(String[] args) {

		int a[] = new int[3];

		try {
			for (int i = 0; i <= a.length; i++) {

				a[i] = i;

			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());

			e.getStackTrace();
		}

	}

}
