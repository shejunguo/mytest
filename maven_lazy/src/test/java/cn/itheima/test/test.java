package cn.itheima.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.itheima.dao.AccountDao;
import cn.itheima.dao.UserDao;
import cn.itheima.domain.Acount;
import cn.itheima.domain.User;

public class test {

	private SqlSessionFactory factory;
	
	@Before
	public void init() throws IOException {
		InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
		//1.创建factory
		factory = new SqlSessionFactoryBuilder().build(is);
	}
	/**
	 * 测试查询全部账户
	 */
	@Test
	public void testFindAllAccount() {//
		SqlSession session = factory.openSession();
		UserDao dao = session.getMapper(UserDao.class);
        List<User> users= dao.findAllUser();
		  for (User user : users) {
			System.out.println(user);
		}
	}
}
