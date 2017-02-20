package com.osi.loan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.osi.loan.dao.UserDAO;
import com.osi.loan.domain.User;
import com.osi.loan.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;

	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	@Override
	@Transactional(rollbackFor = Exception.class, readOnly = false)
	public void addUser(User user) {
		userDao.addUser(user);
	}

	@Override
	public void deleteUser(User user) {
		userDao.deleteUser(user);
	}

	@Override
	public User findUser(User user) {
		return userDao.findUser(user);
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	public User findByUserName(String userName) {
		return userDao.findByUserName(userName);
	}

	@Override
	public User findByMobile(String mobile) {
		return userDao.findByMobile(mobile);
	}

	@Override
	public List<String> getAllUserNames() {
		return userDao.getAllUserNames();
	}

}
