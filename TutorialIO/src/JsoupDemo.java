import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupDemo {
	public static void main(String[] args) throws IOException {
		URL u = new URL(
				"https://timesofindia.indiatimes.com/entertainment/hindi/bollywood/top-20-best-bollywood-movies-of-2020");
		HttpURLConnection hr = (HttpURLConnection) u.openConnection();
		InputStream im = hr.getInputStream();

		BufferedReader br = new BufferedReader(new InputStreamReader(im));
		String line = br.readLine();
		StringBuffer sb = new StringBuffer();
		while (line != null) {
			sb.append(line).append("\n");
			line = br.readLine();
		}

		Document document = Jsoup.parseBodyFragment(sb.toString());
		Element body = document.body();
		Elements paragraphs = body.getElementsByClass("topten_movie_block");
		for (Element paragraph : paragraphs) {
			System.out.println(paragraph.text());
			// System.out.println(paragraph.tagName("img").tagName("img").attr("src"));
			break;
		}

	}
}
