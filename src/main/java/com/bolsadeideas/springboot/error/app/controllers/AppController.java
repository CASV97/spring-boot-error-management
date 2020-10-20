package com.bolsadeideas.springboot.error.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	@SuppressWarnings("unused")
	@GetMapping("/index")
	public String index() {
//		int value = 100 / 0;
		Integer value=Integer.parseInt("10x");

		return "index";
	}
}
