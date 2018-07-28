package cn.itheima.dao;

import java.util.List;

import cn.itheima.domain.Acount;

public interface AccountDao {
	//条件通过内链接查询所有的用户账户信息
       public List<Acount> findAccountsById(Integer id);
}
