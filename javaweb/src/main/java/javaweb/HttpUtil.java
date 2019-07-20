package javaweb;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class HttpUtil {

	public void doGet(String uri) throws ClientProtocolException, IOException {
		
		HttpClientBuilder builder = HttpClientBuilder.create();
		CloseableHttpClient client = builder.build();
		
		HttpGet httpGet = new HttpGet(uri);
		CloseableHttpResponse response = client.execute(httpGet);
		HttpEntity entity = response.getEntity();
		
		if (entity!=null) {
			
			String entityStr = EntityUtils.toString(entity, "utf-8");
			System.out.println(entityStr);
			
			System.out.println(httpGet.getURI());
		}
		
		client.close();
	} 
}
