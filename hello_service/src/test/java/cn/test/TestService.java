package cn.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.ccb.po.User;
import cn.ccb.service.HelloService;
@ContextConfiguration(locations=
				{"classpath:spring/applicationContext-service.xml"
				,"classpath:spring/applicationContext-dao.xml"
				})
@RunWith(SpringJUnit4ClassRunner.class) 
public class TestService {
	@Autowired
	private HelloService helloService;
	@Test
	public void findUserById() {
		User user = helloService.findUserById("1");
		System.out.println(user);
	}
}
