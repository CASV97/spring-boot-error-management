package com.bolsadeideas.springboot.error.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bolsadeideas.springboot.error.app.errors.UserNotFoundException;
import com.bolsadeideas.springboot.error.app.models.domain.User;
import com.bolsadeideas.springboot.error.app.services.UserService;

@Controller
public class AppController {
	@Autowired
	private UserService userService;

	@SuppressWarnings("unused")
	@GetMapping("/index")
	public String index() {
//		int value = 100 / 0;
		Integer value = Integer.parseInt("10x");

		return "index";
	}

	// Obtener al usuario
	@GetMapping("/show/{id}")
	public String show(@PathVariable Integer id, Model model) {
		/*
		 * if (user == null) { throw new UserNotFoundException(id.toString()); }
		 */
		User user = userService.getUserByIdOptional(id).orElseThrow(() -> new UserNotFoundException(id.toString()));
		model.addAttribute("user", user);
		model.addAttribute("title", "User Details: " + user.getFirstName());
		return "show";
	}
}
