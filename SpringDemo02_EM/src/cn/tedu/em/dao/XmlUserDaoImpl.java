package cn.tedu.em.dao;

import org.springframework.stereotype.Repository;

import cn.tedu.em.domain.User;
@Repository
public class XmlUserDaoImpl implements UserDao {

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("xml...增加用户");

	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("xml...更新用户");

	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("xml...删除用户");

	}

	@Override
	public void queryUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("xml...查询用户");

	}

}
