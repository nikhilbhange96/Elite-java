package com.mmcoe.dao;

import java.util.List;
import java.util.Optional;
import java.util.Vector;

import com.mmcoe.pojo.Book;

public class BookDaoCollectionImpl implements Bookdao {
	
	private List<Book>  books;

	public BookDaoCollectionImpl() {
		books=new Vector<Book>();
	}

	@Override
	public boolean save(Book b) {
		books.add(b);
		return true;
	}

	@Override
	public Optional find(int isbn) {
		for(Book b:books){
			if(b.getIsbn()==isbn)
				return Optional.empty();
		}
		return null;
	}

	@Override
	public List<Book> list() {
		// TODO Auto-generated method stub
		return books;
	}

	@Override
	public boolean delete(int isbn) {
	    Optional book = find(isbn);
	    if (book != null) {
	        books.remove(book);
	        return true;
	    }
	    return false;
	}

	@Override
	public List<Book> findByPrice(double MIN, double MAX) {
		List<Book> foundbooks=new Vector<>();
		for(Book b:books) {
			if(b.getPrice()>=MIN&&b.getPrice()<=MAX) {
				foundbooks.add(b);
			}
		}
		return foundbooks;
	}
	

}
