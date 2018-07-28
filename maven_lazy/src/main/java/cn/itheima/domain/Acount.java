package cn.itheima.domain;

public class Acount {
      //查询所有的用户
	private Integer id;
	private String name;
	private Integer money;
	public Acount(Integer id, String name, Integer money) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
	}
	public Acount() {
		super();
		
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Integer getMoney() {
		return money;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Acount [id=" + id + ", name=" + name + ", money=" + money + "]";
	}
}
