package com.mmcoe.cart;

public class TestShopping {
	public static void main(String[] args) {
		ShoppingCart cart=new ShoppingCart();
		
		try {
			cart.addToCart(new Product("pen",25));
			cart.addToCart(new Product("NoteBook",45));
			cart.addToCart(new Product("Book",95));
			cart.addToCart(new Product("Book2",95));
			cart.addToCart(new Product("Book3",95));
//			cart.addToCart(new Product("Book4",95));
			cart.checkOut();
		}catch(ShoppingException e){
			//e.printStackTrace();
			
			System.out.println(e.getMessage());
		}
		
		
	}

}
