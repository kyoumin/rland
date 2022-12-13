package com.newlecture.web.service;

import java.util.List;

import com.newlecture.web.entity.Menu;

public interface MenuService {

	
	List<Menu> getList();
	int addToBasket(int id);
	
	
	void testTS();
}



//(좋아요 올리기)와 같은 사용자 요청에 대한 함수는 서비스인터페이스에
//slq 에 들어갈기능 구현함수는 Dao 에 들어가야함, 둘의 차이가 있음 