package com.newlecture.web;

import java.util.List;

import com.newlecture.web.entity.Menu;

public interface MenuService {

	
	List<Menu> getViewList();
	int addToBasket (int id);
}
