package com.newlecture.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/notice/")
public class NoticeController {
	
	@RequestMapping("list1")
	public String detail() {
		return "notice/temp";
	}
	
	@GetMapping("list")
//	@ResponseBody	
	public String list() {
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("hi");
		return "notice/list";
	}
	

}

