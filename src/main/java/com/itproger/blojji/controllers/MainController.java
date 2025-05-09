package com.itproger.blojji.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "Главная страница");
		return "home";
	}

	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "О нас");
		return "about";
	}

	@GetMapping("/relogin")
	public String relogin(Model model) {
		model.addAttribute("title", "О нас");
		return "relogin";
	}

	@GetMapping("/login")
	public String login(Model model) {
    	model.addAttribute("title", "Вход");
    	return "login";
	}

}