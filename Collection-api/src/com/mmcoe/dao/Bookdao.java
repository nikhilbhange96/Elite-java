package com.mmcoe.dao;

import java.util.List;

import com.mmcoe.pojo.Book;

public interface Bookdao {

	boolean save(Book b);
	
	Book find(int isbn);
	
	List<Book>list();
	
	boolean delete(int isbn);
	
	List<Book> findByPrice(double MIN,double MAX);

}
