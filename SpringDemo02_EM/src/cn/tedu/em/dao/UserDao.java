package cn.tedu.em.dao;

import cn.tedu.em.domain.User;

public interface UserDao {
	
	void addUser(User user);
	void updateUser(User user);
	void deleteUser(int id);
	void queryUser(int id);

}
