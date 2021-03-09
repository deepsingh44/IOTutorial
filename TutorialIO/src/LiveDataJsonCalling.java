import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONArray;

import com.google.gson.Gson;

public class LiveDataJsonCalling {
public static void main(String[] args) throws IOException {

	URL url = new URL("https://api.mocki.io/v1/b043df5a");
	URLConnection uc = url.openConnection();
	HttpURLConnection hc = (HttpURLConnection) uc;
	InputStream im = hc.getInputStream();
	
	BufferedReader br=new BufferedReader(new InputStreamReader(im));
	String line=br.readLine();
	StringBuffer data=new StringBuffer();
	while(line!=null) {
		//System.out.println(line);
		data.append(line).append("\n");
		line=br.readLine();
	}
	
	JSONArray ja=new JSONArray(data.toString());
	for(int i=0;i<ja.length();i++) {
		//System.out.println(ja.getJSONObject(i));
		City city=new Gson().fromJson(ja.getJSONObject(i).toString(), City.class);
		System.out.println(city.getCity()+"\t"+city.getName());
	}
	
}
}
