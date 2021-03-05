import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fourth {
	public static void main(String[] args) throws IOException {
		String msg = "Hello Friends";
/*		byte[] bytes = msg.getBytes();

		ByteArrayInputStream bi = new ByteArrayInputStream(bytes);
		int i = 0;

		while ((i = bi.read()) != -1) {
			System.out.print((char) i);
		}
*/
		ByteArrayOutputStream b=new ByteArrayOutputStream();
		b.write(msg.getBytes());
		b.writeTo(new FileOutputStream("e:/a1.txt"));
		b.writeTo(new FileOutputStream("e:/a2.txt"));
		
	}
}
