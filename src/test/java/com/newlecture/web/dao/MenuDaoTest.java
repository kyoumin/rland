package com.newlecture.web.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

@AutoConfigureTestDatabase(replace=Replace.NONE)
@MybatisTest
class MenuDaoTest {

	@Autowired
	private MenuDao menuDao;
	@Test
	
	void testGetList() {
		System.out.println(menuDao);
		int offsett =10;
		int size =10;
		System.out.println(menuDao.getList(offsett,size, null, null));
//		fail("Not yet implemented");
	}

}
