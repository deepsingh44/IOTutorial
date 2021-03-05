import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Fifth {
public static void main(String[] args) throws IOException {
	Vector v=new Vector();
	v.add(new FileInputStream("e://a1.txt"));
	v.add(new FileInputStream("e://a2.txt"));
	Enumeration e=v.elements();
	
	SequenceInputStream si=new SequenceInputStream(e);
	int i = 0;

	while ((i = si.read()) != -1) {
		System.out.print((char) i);
	}
}
}
