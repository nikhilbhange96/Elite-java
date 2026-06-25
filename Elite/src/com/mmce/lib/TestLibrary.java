package com.mmce.lib;

public class TestLibrary {
	public static void main(String[] args) {
		Book b1=new Book("George Ritzer");
		Book b2=new Book("Harlambous ");
		
		Member m1=new Member("Nikhil");
		Member m2=new Member("");
		

//		b1.status();
		
		//print their status
		//return book from member
		//issue book to member
		b1.status();
        b2.status();
        m1.status();
        m2.status();

        // Issue books
        System.out.println("\nAfter Issuing Books:");
//        m1.issueBook(b1);
//        m2.issueBook(b2);
	}

}
