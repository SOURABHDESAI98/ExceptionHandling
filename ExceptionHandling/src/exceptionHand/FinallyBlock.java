package exceptionHand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {

	// code in finally block always executes whether exception occurs or not
	// catch or finally can not be alone
	// sequence for finally try-finally or try-catch-finally

	public static void main(String[] args) {

		// case1
		int a = 10;
		int b = 0;
		try {
			int div = a / b;

		} finally {
			System.out.println("always executes");
		}

		System.out.println("will not work if exception occurs");

		// case2
		int c = 10;
		int d = 0;
		try {
			int div = c / d;

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("always executes");
		}

		// example-

		Scanner sc = new Scanner(System.in);

		try {
			int l = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e);
		} finally {
			sc.close();
		}

	}

}
