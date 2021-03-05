import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Second {
	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users\\deepsingh44\\Desktop\\Firebase insert and fetch code using flutter.txt");
		FileInputStream fi = new FileInputStream(file);
		// System.out.println(fi.available());
		/*
		 * System.out.println((char)fi.read()); System.out.println((char)fi.read());
		 * System.out.println((char)fi.read());
		 */
		int i = 0;
		FileOutputStream fo = new FileOutputStream("E://mydata.txt");
		while ((i = fi.read()) != -1) {
			// System.out.print((char)i);
			fo.write(i);
		}
		fi.close();
		fo.close();
		file.delete();
		System.out.println("success");

	}
}
