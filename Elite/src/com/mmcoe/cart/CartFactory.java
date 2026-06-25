package com.mmcoe.cart;

public class CartFactory {
	private CartFactory() {
		
	}
	
	public static Shopping newCart() {
		return new ShoppingCart();
	}

}
