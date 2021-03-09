import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	public Person() {
		System.out.println("hi papa");
	}
}

class User extends Person {
	private String email;
	private transient String pass;

	User() {
		System.out.println("hello i am initialized...");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}

public class Seven {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("E://obj.txt"));
		User user = new User();
		user.setEmail("deep@gmail.com");
		user.setPass("1234567");
		oo.writeObject(user);

		ObjectInputStream oi = new ObjectInputStream(new FileInputStream("E://obj.txt"));
		Object o = oi.readObject();
		User uu = (User) o;
		System.out.println(uu.getEmail() + "\t" + uu.getPass());

	}
}
