package com.newlecture.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.entity.Menu;
import com.newlecture.web.service.MenuService;


@Controller
@RequestMapping("/menu")
public class MenuController {

	@Autowired 
	private MenuService service;
	
	public MenuController() {
		// TODO Auto-generated constructor stub
	}
	public MenuController(MenuService service) {
		super();
		this.service = service;
	}
	
	public void setService(MenuService service) {
		this.service = service;
	}

	//@autowired : DI 하기위한 -> 이게 정확히 어떤
	// di 하고 무언가 다른걸 호출해야하는 추가적인 로직이 있으면 constructor, setter
	// di 외의 추가적 로직없으면 field 에 @Autowired


	@RequestMapping("list")
	public String list(Model model) {
		List<Menu> list = service.getList();
		model.addAttribute("list",list);
		return "menu/list";
	}
}
