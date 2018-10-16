package cn.tedu.em.dao;

import org.springframework.stereotype.Repository;

import cn.tedu.em.domain.User;
@Repository("userDao")
public class MySqlUserDaoImpl implements UserDao {

	@Override
	public void addUser(User user) {
		System.out.println("mysql...增加用户到数据库中");

	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("mysql...增加用户到数据库中");

	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("mysql...删除用户到数据库中");

	}

	@Override
	public void queryUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("mysql...查询用户到数据库中");

	}

}
