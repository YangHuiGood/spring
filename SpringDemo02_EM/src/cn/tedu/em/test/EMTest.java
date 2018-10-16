package cn.tedu.em.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.em.web.RegistServlet;

public class EMTest {
	@Test
	public void testRegistUserServlet(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		RegistServlet rs = (RegistServlet) context.getBean("registServlet");
		rs.regist();
	}
}
