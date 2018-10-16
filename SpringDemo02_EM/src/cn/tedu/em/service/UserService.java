package cn.tedu.em.service;

import cn.tedu.em.domain.User;

public interface UserService {

	/**
	 * 注册用户的方法
	 * @param user 用户信息对象
	 */
	void registUser(User user);

}
