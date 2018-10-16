package cn.tedu.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.service.UserService;

public class AOPTest {

	@Test
	public void test01(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userservice = (UserService) context.getBean("userService");
		userservice.addUser();
	}
}
