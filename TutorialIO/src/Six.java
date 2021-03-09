import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Six {
	public static void main(String[] args) throws IOException {
		DataOutputStream d = new DataOutputStream(new FileOutputStream("E://data.txt"));
		d.writeInt(121324);
		d.writeFloat(121324.90f);
		d.writeUTF("Hello Friends");
		
		DataInputStream di=new DataInputStream(new FileInputStream("E://data.txt"));
		di.readInt();
		di.readFloat();
		System.out.println(di.readUTF());

	}
}
