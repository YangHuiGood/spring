package cn.tedu.em.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cn.tedu.em.domain.User;

@Service("userService")
public class UserServiceImplStaticProxy implements UserService{
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService service;
	@Override
	public void registUser(User user) {
		try {
			System.out.println("校验权限。。。");
			System.out.println("开启事务。。。");
			System.out.println("记录日志。。。");
			service.registUser(user);
			System.out.println("提交事务。。。");
		} catch (Exception e) {
			System.out.println("回滚事务");
			e.printStackTrace();
		}
		
	}

}
