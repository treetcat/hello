package cn.ccb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ccb.po.User;
import cn.ccb.service.HelloService;

@Controller
@RequestMapping(value="/hello")
public class hello_ctrl {
	@Autowired
	private HelloService helloService;
	
	@RequestMapping(value="/findUser")
	public String findUserById(String id,Model model){
			User user = helloService.findUserById(id);
			model.addAttribute("id", id);
		return "/WEB-INF/user.jsp";
		
	}
}
