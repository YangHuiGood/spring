package cn.tedu.em.dao;

import org.springframework.stereotype.Repository;

import cn.tedu.em.domain.User;
@Repository("userDao")
public class MySqlUserDaoImpl implements UserDao {

	@Override
	public void addUser(User user) {
		System.out.println("mysql...�����û������ݿ���");

	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("mysql...�����û������ݿ���");

	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("mysql...ɾ���û������ݿ���");

	}

	@Override
	public void queryUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("mysql...��ѯ�û������ݿ���");

	}

}
