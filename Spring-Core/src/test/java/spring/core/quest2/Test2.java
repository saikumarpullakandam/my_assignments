package spring.core.quest2;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.quest1.Customer;

public class Test2 {

	@Test
	public void test() {
		ApplicationContext con= new ClassPathXmlApplicationContext("beans2.xml");
		Question q= (Question) con.getBean("question");
		Question ques= new Question(121, "What is your name ?", Arrays.asList("saikumar", "vijay", "pavan"));
		assertEquals(q,ques);
	}

}
