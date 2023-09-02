package lab;

public class HotNullPointerExceptionsA9 {

	static String a = null;

	static String b[] = new String[5];

	public static int findStringLength(String a) {

		return a.length();

	}

	public static int findArrLength() {

		return b.length;
	}

	public static char findChar(String a) {

		return a.charAt(1);
	}

	public static void main(String[] args) {

		try {

			try {

				findStringLength(a);
			} catch (NullPointerException e) {
				e.printStackTrace();
			}

			try {

				findChar(a);
			} catch (NullPointerException e) {
				e.printStackTrace();
			}

			findArrLength();

		} catch (NullPointerException e) {

			e.printStackTrace();
		}

	}

}
