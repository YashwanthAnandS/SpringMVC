package com.yash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	//Controller
	@RequestMapping("/")
	public String showHomePage() {
		return "main-menu";
	} 

}
