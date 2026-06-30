package com.mmcoe.pojo;

import com.mmcoe.Service.BookNotFoundException;
import com.mmcoe.Service.BookService;
import com.mmcoe.Service.BookServiceImpl;
import com.mmcoe.dao.BookDaoCollectionImpl;
import com.mmcoe.dao.Bookdao;

public class Main {
	
	public static void main(String[] args) throws BookNotFoundException {
		
		Bookdao dao=new BookDaoCollectionImpl();
		BookService service=new BookServiceImpl(dao);
		
		service.save(new Book(11,"The Alchemist","Paul coelho",250));
		service.save(new Book(12,"Metamorphisis","frank kafka",210));
		service.save(new Book(13,"Polity","M Laxmikanth",550));
		
		for(Book b:service.list()) {
			System.out.println(b);
		}
		try {
			System.out.println(service.find(12));
		}catch(BookNotFoundException e){
			e.printStackTrace();

		}
		for(Book b:service.findByPrice(200, 250)) {
			System.out.println(b);
		}
		try {
			service.delete(15);
			
		}catch(BookNotFoundException e) {
			e.printStackTrace();
		}
		
		service.listOrderBytitle().forEach(System.out::println);

	}
	
	
}

		
