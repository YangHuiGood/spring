package cn.tedu.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.beans.User;
import cn.tedu.web.UserServlet;

public class DemoTest {
	ApplicationContext context = null;
	@Before
	public void before(){
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	
	@Test
	public void test01(){
		UserServlet us = (UserServlet) context.getBean("userServlet");
		User user = new User(0,"bbb",19);
		us.testServlet(user);
	}
}
