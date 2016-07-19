package com.alive.ssmtest.controllers;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alive.ssmtest.pojo.User;
import com.alive.ssmtest.service.IUserService;


@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId=Integer.parseInt(request.getParameter("id"));
		System.out.println(1111);
		User user=this.userService.getUserById(userId);
		model.addAttribute("user",user);
		return "showUser";
	}
}
