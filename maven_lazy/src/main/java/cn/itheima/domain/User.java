package cn.itheima.domain;

import java.util.List;
public class User {
	  //对应关系一个用户可以有多个账户
      private Integer id;
      private String username;
      private String password;
      private List<Acount> accounts;
      public List<Acount> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Acount> accounts) {
		this.accounts = accounts;
	}
    	public User() {
		super();
	}
	public User(Integer id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public Integer getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
      
}
