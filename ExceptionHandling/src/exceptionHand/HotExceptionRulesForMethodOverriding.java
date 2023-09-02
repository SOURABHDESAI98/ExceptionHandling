package exceptionHand;

import java.io.IOException;

class Example {

	public void m1() throws RuntimeException, IOException {

	}

}

public class HotExceptionRulesForMethodOverriding extends Example {
	/*
	 * 1. if super class method does not declare an exception then subclass
	 * overriding method can not declare checked exception but it can declare
	 * unchecked exception
	 * 
	 * 2. if super class method declares an exception then then subclass overriding
	 * method can declare no exception or same exception or child class of that
	 * exception.
	 * 
	 * 3. So it is possible that overridden and overriding methods can declare
	 * different exceptions but will not show any error
	 * 
	 */

	// case 1- no exception
	/*
	 * public void m1() {
	 * 
	 * }
	 */

	// case 2- same exception
	/*
	 * public void m1() throws RuntimeException, IOException {
	 * 
	 * }
	 */

	// case 3- child class of exception class
	/*
	 * public void m1() throws ArithmeticException {
	 * 
	 * }
	 */

	// case 4- declares different exception
	/*
	 * public void m1() throws InputMismatchException {
	 * 
	 * }
	 * 
	 */

	public static void main(String[] args) {

	}

}
