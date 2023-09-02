package customException;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidInputException extends RuntimeException {

	public InvalidInputException(String msg) {
		super(msg);
	}
}

public class InputValidation {

	public static void inputValidation(String input) {

		char ch;
		boolean flag = true;

		for (int i = 0; i < input.length(); i++) {

			ch = input.charAt(i);

			if (Character.isDigit(ch)) {
				flag = false;
			}
		}

		if (flag) {

			throw new InputMismatchException("input must contain digit");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.next().strip();

		try {

			inputValidation(input);
		} catch (InvalidInputException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

}
