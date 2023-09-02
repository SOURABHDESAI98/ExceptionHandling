package lab;

public class Demo1 {

	public static void sortDescending(int a[]) {
		int temp;

		for (int j = 0; j < a.length; j++) {

			for (int i = 0; i < a.length - 1; i++) {

				if (a[i] < a[i + 1]) {
					temp = a[i + 1];
					a[i + 1] = a[i];
					a[i] = temp;
				}

			}

		}

		for (int n : a) {
			System.out.print(n);
		}

	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		try {

			sortDescending(a);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
