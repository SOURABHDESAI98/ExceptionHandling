package lab;

class SpeedExceeds extends RuntimeException {

	SpeedExceeds(String msg) {
		super(msg);
	}
}

class Car {

	public static void speed(int a) {

		if (a > 80) {

			throw new SpeedExceeds("Speed exceeds 80");

		} else {
			System.out.println("Speed is within the limit");
		}

	}

}

public class HotCustomExceptionA22 {

	public static void main(String[] args) {

		try {

			Car.speed(88);

		} catch (SpeedExceeds e) {
			e.printStackTrace();
		}

	}

}
