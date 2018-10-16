package cn.tedu.service;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		System.out.println("添加用户。。。");
	}

	@Override
	public void updateUser() {
		System.out.println("更新用户。。。");

	}

	@Override
	public void deleteUser() {
		System.out.println("删除用户。。。");

	}

	@Override
	public void queryUser() {
		System.out.println("查询用户。。。");

	}

}
