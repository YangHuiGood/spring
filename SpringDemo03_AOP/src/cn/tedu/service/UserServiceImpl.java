package cn.tedu.service;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		System.out.println("����û�������");
	}

	@Override
	public void updateUser() {
		System.out.println("�����û�������");

	}

	@Override
	public void deleteUser() {
		System.out.println("ɾ���û�������");

	}

	@Override
	public void queryUser() {
		System.out.println("��ѯ�û�������");

	}

}
