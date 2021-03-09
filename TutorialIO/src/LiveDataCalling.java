import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class LiveDataCalling {
	public static void main(String[] args) throws IOException {

		URL url = new URL("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4");
		URLConnection uc = url.openConnection();
		HttpURLConnection hc = (HttpURLConnection) uc;
		InputStream im = hc.getInputStream();
		// System.out.println(im.available());
		FileOutputStream fo = new FileOutputStream("E://nature.mp4");
		byte[] buffer = new byte[1024];
		int i = 0;
		while ((i = im.read(buffer)) != -1) {
			// System.out.println(i);
			fo.write(buffer, 0, i);
		}
		System.out.println("success");

	}
}
