package com.osi.loan.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.osi.loan.domain.User;
import com.osi.loan.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String addUser(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "addUser";
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(User user) {
		userService.addUser(user);
		return "useradded";
	}

	@RequestMapping(value = "/findUser", method = RequestMethod.GET)
	public String findUser(Model model) {
		User user = new User();
		List<String> userNameList = userService.getAllUserNames();
		model.addAttribute("user", user);
		model.addAttribute("userNameList", userNameList);
		return "findUser";
	}

	@RequestMapping(value = "/findUser", method = RequestMethod.POST)
	public String findUser(User user, Model model) {
		User resultUser = userService.findByUserName(user.getUserName());
		model.addAttribute("user", resultUser);
		return "showUser";
	}

	@RequestMapping(value = "/updateordelete", method = RequestMethod.POST, params = "update")
	public String updateUser(User user) {
		userService.updateUser(user);
		return "userupdated";
	}

	@RequestMapping(value = "/updateordelete", method = RequestMethod.POST, params = "delete")
	public String deletUser(User user) {
		userService.deleteUser(user);
		return "userUpdated";
	}

	// @ModelAttribute("userNameList")
	public List<String> userTypeList() {
		List<String> userTypeList = userService.getAllUserNames();
		return userTypeList;
	}

}
