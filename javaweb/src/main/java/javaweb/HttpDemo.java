package javaweb;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

public class HttpDemo {
	public static void main(String[] args) throws ClientProtocolException, IOException {
	
	HttpUtil httpUtil = new HttpUtil();
	httpUtil.doGet("http://www.baidu.com");
	
	
	
}
}
