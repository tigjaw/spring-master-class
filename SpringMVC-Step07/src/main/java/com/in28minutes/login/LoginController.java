package com.in28minutes.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@Autowired
	private LoginService service;
	// see documentation.txt for an explanation of how this works

	private final static String LOGIN = "login";

	// returns login.jsp
	@RequestMapping(value = "/" + LOGIN, method = RequestMethod.GET)
	public String showLogin() {
		return LOGIN;
	}

	private final static String WELCOME = "welcome";

	@RequestMapping(value = "/" + LOGIN, method = RequestMethod.POST)
	public String showLogin(@RequestParam String name,
			@RequestParam String password,
			ModelMap model) {
		boolean isValidUser = service.validateUser(name, password);
		if (isValidUser) {
			model.put("name", name);
			model.put("password", password);
			return WELCOME;
		} else {
			model.put("errorMessage", "Invalid Credentials!!");
			return LOGIN;
		}
	}

	private final static String HELLO = "hello";

	// just displays hello to page
	@RequestMapping(value = "/" + HELLO)
	@ResponseBody
	public String sayHello() {
		return HELLO;
	}

}