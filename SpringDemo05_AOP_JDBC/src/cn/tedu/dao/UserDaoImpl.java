package cn.tedu.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.tedu.beans.User;
import cn.tedu.spring.rowmapper.UserRowMapper;
@Repository("userDao")
public class UserDaoImpl implements UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addUser(User user) {
		jdbcTemplate.update("insert into user values(null,?,?)", user.getName(),user.getAge());
	}

	@Override
	public void deleteUser(int id) {
		jdbcTemplate.update("delete from user where id=?",id);
	}

	@Override
	public void updateUser(User user) {
		jdbcTemplate.update("update user set name=?,age=? where id=?",user.getName(),user.getAge(),user.getId());
	}

	@Override
	public User queryUser(int id) {
		//自定义UserRowMapper封装bean
//		return jdbcTemplate.queryForObject("select * from user where id=?",new UserRowMapper(),id);
		//通过BeanPropertyRowMapper实现自动封装bean
		return jdbcTemplate.queryForObject("select * from user where id=?",new BeanPropertyRowMapper(User.class),id);
	}

	@Override
	public List<User> queryUsers() {
//		return jdbcTemplate.query("select * from user", new UserRowMapper());
		return jdbcTemplate.query("select * from user", new BeanPropertyRowMapper(User.class));
	}

}
