package exceptionHand;

public class HandlingAllExceptions {

	public static void main(String[] args) {

		int c = 10;
		int d = 0;
		try {
			int div = c / d;

		}

		catch (RuntimeException e) { // child class should come first before parent class
			System.out.println("Runtime exception");
		}

		catch (Exception e) { // parent class should come after child, otherwise child catch block will not
								// work
			System.out.println("Exception occurred");
		}

	}

}
