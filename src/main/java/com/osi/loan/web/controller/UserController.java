package com.osi.loan.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.osi.loan.domain.User;
import com.osi.loan.repository.jpa.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;

	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String addUser(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "addUser";
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(User user) {
		userRepository.save(user);
		return "useradded";
	}

	@RequestMapping(value = "/findUser", method = RequestMethod.GET)
	public String findUser(Model model) {
		User user = new User();
		List<String> userNameList = userRepository.getAllUserNames(new PageRequest(1, 5));
		List<String> userNameListSorted = userRepository.getAllUserNames(new Sort(Sort.Direction.DESC, "email"));
		model.addAttribute("user", user);
		model.addAttribute("userNameList", userNameListSorted);
		return "findUser";
	}

	@RequestMapping(value = "/findUser", method = RequestMethod.POST)
	public String findUser(User user, Model model) {
		User resultUser = userRepository.findByUserName(user.getUserName());
		model.addAttribute("user", resultUser);
		return "showUser";
	}

	@RequestMapping(value = "/updateordelete", method = RequestMethod.POST, params = "update")
	public String updateUser(User user) {
		userRepository.updateUserNameById(user.getUserId(), user.getUserName());
		return "userUpdated";
	}

	@RequestMapping(value = "/updateordelete", method = RequestMethod.POST, params = "delete")
	public String deletUser(User user) {
		userRepository.delete(user);
		return "userUpdated";
	}

}
