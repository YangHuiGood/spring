package cn.tedu.em.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cn.tedu.em.domain.User;
import cn.tedu.em.service.UserService;

@Controller
public class RegistServlet {
	@Autowired
	private UserService userService;
	public void regist(){
		User user = new User(1,"张三","最帅的男人","piaolaoshi@tedu.com");
		userService.registUser(user);
	}
	
}
