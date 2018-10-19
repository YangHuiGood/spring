package cn.tedu.dao;

import java.util.List;

import cn.tedu.beans.User;

public interface UserDao {
	public void addUser(User user);
	public void deleteUser(int id);
	public void updateUser(User user);
	public User queryUser(int id);
	public List<User> queryUsers();
}
