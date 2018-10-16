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
			System.out.println("У��Ȩ�ޡ�����");
			System.out.println("�������񡣡���");
			System.out.println("��¼��־������");
			service.registUser(user);
			System.out.println("�ύ���񡣡���");
		} catch (Exception e) {
			System.out.println("�ع�����");
			e.printStackTrace();
		}
		
	}

}
