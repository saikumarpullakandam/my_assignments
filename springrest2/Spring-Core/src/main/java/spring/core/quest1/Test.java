package spring.core.quest1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("core1.xml");
		Customer cus= (Customer) context.getBean("customer");
		System.out.println(cus);
	}

}
