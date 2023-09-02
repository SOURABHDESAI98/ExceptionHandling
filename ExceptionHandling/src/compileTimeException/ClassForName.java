package compileTimeException;

public class ClassForName {

	public static void main(String[] args) {

		try {
			Class cname = Class.forName("/iexceptionHand.FinallyBlock");
			System.out.println("Class Name :" + cname);

		} catch (ClassNotFoundException e) {
			System.out.println(e);// it gives error message if class not found or if wrong class name is given
		}

	}

}
