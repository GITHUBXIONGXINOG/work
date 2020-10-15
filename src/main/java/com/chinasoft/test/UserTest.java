package com.chinasoft.test;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.chinasoft.pojo.login_User;

/**
 * Unit test for simple App.
 */
public class UserTest {
	/**
	 * Rigorous Test :-)
	 * 
	 * @throws IOException
	 */
	// 查找所用用户
	@Test
	public void searchAllUser() {
		// 获得sqlSessionFactory
		InputStream inputStream = null;
		SqlSession session = null;
		try {
			String resource = "mybatis-config.xml";
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

			session = sqlSessionFactory.openSession();
			List<login_User> users = session.selectList("com.chinasoft.mapper.selectAllUser");
			for (login_User user : users) {
				System.out.println(user);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (session != null) {
				session.close();
			}
		}

	}

	  //增加用户
	  @Test public void addUser() throws IOException { 
		  //获得sqlSessionFactory 
	  String resource = "mybatis-config.xml"; 
	  InputStream inputStream = Resources.getResourceAsStream(resource); SqlSessionFactory
	  sqlSessionFactory = new SqlSessionFactoryBuilder() .build(inputStream);
	  
	  SqlSession session = sqlSessionFactory.openSession(); login_User user = new
	  login_User("test456111","123456");
	  session.insert("com.chinasoft.mapper.addUser",user); // session提交 事务提交s
	  session.commit(); inputStream.close(); session.close(); }
	 

	// 删除
	@Test
	public void delUser() throws IOException {
		// 获得sqlSessionFactory
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();

		session.delete("com.chinasoft.mapper.delUser", "test678");

		// session提交 事务提交
		session.commit();
		inputStream.close();
		session.close();
	}
	
	//修改
	@Test
	public void updateUser() throws IOException {
		// 获得sqlSessionFactory
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		
		login_User user = new login_User("test567","xiongaadhio");
	    session.update("com.chinasoft.mapper.updateUser",user);
		 

		// session提交 事务提交
		session.commit();
		inputStream.close();
		session.close();
	}
	
	
	

}
