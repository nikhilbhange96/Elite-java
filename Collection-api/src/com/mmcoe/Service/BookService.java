	package com.mmcoe.Service;
	
	import java.util.List;
	
	import com.mmcoe.pojo.Book;
	
	public interface BookService {
	
		
	boolean save(Book b);
		
		Book find(int isbn) throws BookNotFoundException;
		
		List<Book>list()throws BookNotFoundException;
		
		boolean delete(int isbn) throws BookNotFoundException;
		
		List<Book> findByPrice(double MIN,double MAX);
	
		List<Book> listOrderBytitle();
		
	}
