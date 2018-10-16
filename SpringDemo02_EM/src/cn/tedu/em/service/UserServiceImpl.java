package cn.tedu.em.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cn.tedu.em.dao.UserDao;
import cn.tedu.em.domain.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public void registUser(User user) {
		userDao.addUser(user);
	}

}
