package bhz.test;

import java.util.HashMap;
import java.util.Map;

import bhz.http.HttpCallerUtils;

public class HttpTest2 {

	private static final String IP ="localhost";
	private static final String restURI = "http://"+IP+":8888/";
	public static void main(String[] args) throws Exception{
    	Map<String, String> map = new HashMap<String, String>();
		String str = HttpCallerUtils.get(restURI+"provider/userService/get/1001", map);
		System.out.println(str);
	}
}
