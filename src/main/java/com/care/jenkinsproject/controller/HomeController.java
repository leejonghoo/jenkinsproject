package com.care.jenkinsproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("header") public void header() {}
	@RequestMapping("main")	public void main() {}
	@RequestMapping("footer")	public void footer() {}
	
	@RequestMapping("/")
	public String index() {	return "index";	}
	
	@GetMapping("register")	public void register() {}
	@GetMapping("login")	public void login() {}
}
