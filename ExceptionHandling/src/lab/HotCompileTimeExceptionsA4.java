package lab;

import java.io.FileWriter;
import java.io.IOException;

public class HotCompileTimeExceptionsA4 {

	public static void main(String[] args) {

		// i/o exception
		FileWriter fW = null;

		try {

			fW = new FileWriter("myFile.txt");
			String data = "New data";
			fW.write(data);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {

			try {
				fW.close();
			} catch (IOException e2) {
				System.out.println(e2.getMessage());
			}

		}

		// class file not found exception

		try {
			Class cname = Class.forName("anyname");
			System.out.println("Class Name :" + cname);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
