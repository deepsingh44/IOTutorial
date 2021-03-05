import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Third {
	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("C:/Users\\deepsingh44\\Desktop\\abc.mp4");
		int i = 0;
		FileOutputStream fo = new FileOutputStream("E://mydata.mp4");
		byte[] buffer = new byte[1024];
		while ((i = fi.read(buffer)) != -1) {
			// System.out.print((char)i);
			fo.write(buffer, 0, i);
			fo.flush();
		}

		System.out.println("success");
	}
}
