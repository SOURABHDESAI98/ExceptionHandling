package exceptionHand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingRules {

	/*
	 * 1. try block can not be alone, it should always comes with catch or finally
	 * or catch-finally
	 * 
	 * 2. catch or finally can not be alone
	 * 
	 * 3. sequence for finally try-finally or try-catch-finally
	 * 
	 * 4. do not put try-catch in catch block but you can use try-catch in finally
	 * block or in try block
	 * 
	 * 5. if exception occurs at any line then it gets directed only to catch block
	 * and then code after catch block will work, any code after that line and
	 * before catch block will not work
	 * 
	 * 
	 */

	public static void main(String[] args) {

		// case1 if we know exception class
		int a = 10;
		int b = 0;
		try {
			int div = a / b;

		} catch (ArithmeticException e) {
			System.out.println("Error");

		}

		// case 2 if we don't know exception class or want to handle all exceptions
		int c = 10;
		int d = 0;
		try {
			int div = a / b;

		}

		catch (RuntimeException e) { // child class should come first before parent class
			System.out.println(e);
		}

		catch (Exception e) { // parent class should come after child, otherwise child catch block will not
								// work
			System.out.println(e);
		}

		// case 3 to get only exception message or to get all details
		int v[] = new int[2];
		v[0] = 1;
		v[1] = 2;

		try {
			v[2] = 3;

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());// to get only description of exception
			e.printStackTrace();// to get all details of exception class

		}

		// case 4- trying multiple catch blocks
		int s[] = new int[3];
		Scanner sc = new Scanner(System.in);

		try {
			for (int i = 0; i < s.length; i++) {

				System.out.println("provide input :");
				s[i] = sc.nextInt();

			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		catch (InputMismatchException e) {
			System.out.println("Wrong input");
		}

	}

}
