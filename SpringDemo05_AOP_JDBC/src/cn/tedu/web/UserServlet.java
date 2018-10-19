package cn.tedu.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cn.tedu.beans.User;
import cn.tedu.service.UserService;

@Controller("userServlet")
public class UserServlet {
	@Autowired
	private UserService userService;
	public void testServlet(User user){
		userService.addUser(user);
	}
}
