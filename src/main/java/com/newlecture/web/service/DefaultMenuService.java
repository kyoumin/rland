package com.newlecture.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.newlecture.web.dao.MenuDao;
import com.newlecture.web.entity.Menu;

@ Service
public class DefaultMenuService implements MenuService {

	@Autowired //
	private MenuDao menuDao;  //클래스가 아닌 인터페이스명 -> 결합력 낮춤
	
	public DefaultMenuService() {
		
	}
	
	public DefaultMenuService(MenuDao menuDao) {
		super();
		this.menuDao = menuDao;
	}

	public void setMenuDao(MenuDao menuDao) {
		this.menuDao = menuDao;
	}


	@Override
	public List<Menu> getList() {

		List<Menu> list = menuDao.getList(0,10,"name","메");
		System.out.println(list);
		return list;
//		Menu menu = menuDao.get(1);
	}

	@Override
	public int addToBasket(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Transactional(isolation=Isolation.READ_UNCOMMITTED)
	@Override
	public void testTS() {
		Menu menu = menuDao.get(117);
		menu.setPrice(menu.getPrice()-100);
		menuDao.update(menu);
		
		menu.setPrice(menu.getPrice()-11500);
		menuDao.update(menu);
	}

}















