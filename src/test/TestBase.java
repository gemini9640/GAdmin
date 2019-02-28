package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestBase {
	public static ApplicationContext ctx; 
	public static void init() {
		ctx = new ClassPathXmlApplicationContext("/spring/applicationContext-main.xml");
	}
}
