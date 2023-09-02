package lab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Provide any value");

		try {
			int a = sc.nextInt();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} finally {
			sc.close();
			System.out.println("Still working");
		}

	}

}
