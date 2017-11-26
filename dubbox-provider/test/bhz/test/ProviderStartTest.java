package bhz.test;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderStartTest {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "dubbo-provider.xml" });
		context.start();
		System.in.read();
	}
}