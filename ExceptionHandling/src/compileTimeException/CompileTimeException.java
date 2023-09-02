package compileTimeException;

import java.io.FileWriter;
import java.io.IOException;

public class CompileTimeException {

	public static void main(String[] args) {

		FileWriter fw = null;

		try {
			fw = new FileWriter("myFill.txt");
			String data = "new data";
			fw.write(data);
			System.out.println("file created");

		} catch (IOException e) {
			System.out.println(e.getMessage()); // it gives error if we give wrong filename,path or data
		} finally {

			try {
				fw.close();
			} catch (IOException e2) {
				System.out.println(e2);
			}

		}

	}

}
