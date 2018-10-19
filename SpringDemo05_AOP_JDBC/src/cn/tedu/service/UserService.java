package cn.tedu.service;

import cn.tedu.beans.User;

public interface UserService {
	public void addUser(User user);
	public void deleteUser(int id);
	public void updateUser(User user);
	public void queryUser(int id);
	public void queryUsers();
}
