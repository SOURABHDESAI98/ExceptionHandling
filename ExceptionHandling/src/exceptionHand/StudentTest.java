package exceptionHand;

import java.util.Scanner;

class Student {

	String name;

	public Student(String name) {
		this.name = name;
	}

	public void acceptMarks(int marks) {

		if (marks < 0 || marks > 100) {

			throw new ArithmeticException("Please provide marks between 0 to 100");
		} else {
			System.out.println(name + " has obtained " + marks + " marks");
		}

	}

}

public class StudentTest {

	public static void main(String[] args) {

		Student stu = new Student("Sourabh");

		Scanner sc = new Scanner(System.in);
		System.out.println("Provide marks of student :");
		int m = sc.nextInt();

		try {
			stu.acceptMarks(m);

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

		System.out.println("Exception handled");

	}

}
