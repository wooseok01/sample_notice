package com.sample.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sample.user.dao.UserDAO;
import com.sample.user.model.User;

@Controller
@RequestMapping(value = "login")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserDAO userDAO;

	@RequestMapping(value = "form")
	public String form() {
		return "user/loginForm";
	}

	@RequestMapping(value = "submit")
	public String save(HttpServletRequest request, User user) {
		String returnURL = "redirect:/login/form";

		User admin = userDAO.getUser(user.getId());

		if (admin != null && StringUtils.equals(user.getPasswd(), admin.getPasswd())) {
			request.getSession().setAttribute("admin", "admin");
			returnURL = "redirect:/";
		}

		return returnURL;
	}
}