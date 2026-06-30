package com.mmcoe.Service;

import java.util.Comparator;
import java.util.List;

import com.mmcoe.dao.BookDaoCollectionImpl;
import com.mmcoe.dao.Bookdao;
import com.mmcoe.pojo.Book;

public class BookServiceImpl implements BookService {
	
	private Bookdao dao;
	

	public BookServiceImpl() {
		dao=new BookDaoCollectionImpl();
	}
	
	

	public BookServiceImpl(Bookdao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public boolean save(Book b) {
		// TODO Auto-generated method stub
		return dao.save(b);
	}

	@Override
	public Book find(int isbn) throws BookNotFoundException{
		Book b=dao.find(isbn);
		if(b==null) {
			throw new BookNotFoundException("Book not found with ISBN "+isbn);
		}
		return b;
	}

	@Override
	public List<Book> list() throws BookNotFoundException {
		
		return dao.list();
	}

	@Override
	public boolean delete(int isbn) throws BookNotFoundException {
		if(dao.delete(isbn))
			return true;
		else
			throw new BookNotFoundException("Book not found with ISBN "+isbn);
		
	}

	@Override
	public List<Book> findByPrice(double MIN, double MAX) {
		// TODO Auto-generated method stub
		return dao.findByPrice(MIN, MAX);
	}
	
	public List<Book> listOrderBytitle(){
		Comparator<Book> titleComp=(b1,b2)->b1.getTitle().compareTo(b2.getTitle());
		
		List<Book>list=dao.list();
		list.sort(titleComp);
		return list;
	}
	

}
