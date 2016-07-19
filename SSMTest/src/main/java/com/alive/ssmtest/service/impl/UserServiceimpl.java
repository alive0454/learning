package com.alive.ssmtest.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alive.ssmtest.dao.IUserDao;
import com.alive.ssmtest.pojo.User;
import com.alive.ssmtest.service.IUserService;

@Service("userService")
public class UserServiceimpl implements IUserService {

	@Resource
	private IUserDao userDao;
	
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		System.out.println("select");
		return this.userDao.selectByPrimaryKey(userId);
	}
	
}
