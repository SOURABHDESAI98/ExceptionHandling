package customException;

import java.util.Scanner;

class AgeIsTooLess extends RuntimeException {
	AgeIsTooLess(String msg) {
		super(msg);
	}

}

class AgeIsTooOld extends RuntimeException {
	AgeIsTooOld(String msg) {
		super(msg);
	}

}

class marriage {

	public static void checkAge(int a) {

		if (a < 21 || a > 45) {
			if (a < 21) {

				try {
					throw new AgeIsTooLess("Age is less for marriage !!");
				} catch (AgeIsTooLess e) {
					System.out.println(e.getMessage());
				}

			} else if (a > 45) {

				try {
					throw new AgeIsTooOld("Age is more for marriage !!");
				} catch (AgeIsTooOld e) {
					System.out.println(e.getMessage());
				}

			} else {
				System.out.println("You are eligible for marriage");
			}

		}

	}
}

public class MarriageTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Provide age ");
		int a = sc.nextInt();
		marriage.checkAge(a);
		sc.close();

	}

}
