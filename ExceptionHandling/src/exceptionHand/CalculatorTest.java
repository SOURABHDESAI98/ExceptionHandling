package exceptionHand;

import java.util.Scanner;

class Calculator {

	public int add(int a, int b) {

		return a + b;

	}

	public int subtract(int a, int b) {

		return a - b;

	}

	public int divide(int a, int b) {

		return a / b;

	}

	public int multiply(int a, int b) {

		return a * b;

	}

}

public class CalculatorTest {

	public static void main(String[] args) {

		int a, b;
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide first value :");
		a = sc.nextInt();
		System.out.println("Provide second value :");
		b = sc.nextInt();

		System.out.println("Choose option :");
		System.out.println("1. addition \n2.subtraction \n3.division \n4.multiply");

		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			cal.add(a, b);
			break;
		case 2:
			cal.subtract(a, b);
			break;
		case 3:
			try {
				cal.divide(a, b);

			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}

			break;
		case 4:
			cal.multiply(a, b);
			break;

		}

	}

}
