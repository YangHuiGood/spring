package cn.tedu.em.domain;

public class User {
	private int id;
	private String name;
	private String nickname;
	private String email;
	public User(int id, String name, String nickname, String email) {
		super();
		this.id = id;
		this.name = name;
		this.nickname = nickname;
		this.email = email;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", nickname=" + nickname
				+ ", email=" + email + "]";
	}
}
