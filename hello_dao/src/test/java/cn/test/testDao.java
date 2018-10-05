package cn.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.ccb.dao.hello_dao;
import cn.ccb.po.User;
@ContextConfiguration(locations={"classpath:spring/applicationContext-dao.xml"})
@RunWith(SpringJUnit4ClassRunner.class) 
public class testDao {
	
	
	@Autowired
	private hello_dao dao;
	
	@Test
	public void testFindUser() {
//		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
//		dao = (hello_dao) classPathXmlApplicationContext.getBean("hello_dao");
		User user = dao.findUserById("2");
		System.out.println(user);
	}
}
