package com.newlecture.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

	@RequestMapping("/hello")
	public String service() {
		return "hello boot~~dd~~dd~~dd";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "index~";
	}
	
}
