package cn.ccb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.ccb.dao.hello_dao;
import cn.ccb.po.User;
import cn.ccb.service.HelloService;
@Service
public class HelloServiceImpl implements HelloService {
	@Autowired
	private hello_dao dao;
	public User findUserById(String id) {
		return dao.findUserById(id);
	}
	
}
