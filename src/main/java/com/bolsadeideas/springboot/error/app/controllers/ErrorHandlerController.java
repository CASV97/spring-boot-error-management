package com.bolsadeideas.springboot.error.app.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bolsadeideas.springboot.error.app.errors.UserNotFoundException;

//maneja errores, captura los lanzamientos de exepcion o lo maneja en los metodos
@ControllerAdvice
public class ErrorHandlerController {
	@ExceptionHandler(ArithmeticException.class)
	public String arithmeticException(Exception ex, Model model) {
		model.addAttribute("error", "Arithmetic Error");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		// tambien si son las vistas iguales se puede usar generic para las dos
		return "error/arithmetic";
	}

	@ExceptionHandler(NumberFormatException.class)
	public String numberFormatException(NumberFormatException ex, Model model) {
		model.addAttribute("error", "Number Format Error");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "error/numberFormat";
	}

	@ExceptionHandler(UserNotFoundException.class)
	public String userNotFoundException(UserNotFoundException ex, Model model) {
		model.addAttribute("error", "User not found");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "error/userNotFound";
	}
}
