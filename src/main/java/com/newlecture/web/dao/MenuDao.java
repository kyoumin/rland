package com.newlecture.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.newlecture.web.entity.Menu;

@Mapper//
public interface MenuDao {
	
	List<Menu> getList(
			int offset,
			int size,
			String field,
			String query);
	
	Menu get(int id);
	int count(String query);
	
	
	int insert(Menu menu);
	int update(Menu menu);
	int updateAll(Menu[] menus);	
	
	int delete(int id);
	int deleteAll(int[] ids);
}
