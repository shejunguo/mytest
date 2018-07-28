package cn.itheima.dao;

import java.util.List;

import cn.itheima.domain.User;

public interface UserDao {
	   //查询用户id,然后关联到account表
      public List<User> findAllUser();
}
