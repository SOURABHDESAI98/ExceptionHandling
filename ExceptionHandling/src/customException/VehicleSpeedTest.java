package customException;

import java.util.Scanner;

class VehicleSpeedExceed extends RuntimeException {

	VehicleSpeedExceed(String msg) {
		super(msg);
	}
}

class Vehicle {

	public static void checkSpeed(int a) {

		if (a > 80) {
			throw new VehicleSpeedExceed("Please slow down your vehicle !!");

		} else {
			System.out.println("Speed is within the limit !!");
		}

	}

}

public class VehicleSpeedTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Provide Speed :");
		int a = sc.nextInt();

		try {
			Vehicle.checkSpeed(a);
		} catch (VehicleSpeedExceed e) {
			System.out.println(e.getMessage());
		}

	}

}
