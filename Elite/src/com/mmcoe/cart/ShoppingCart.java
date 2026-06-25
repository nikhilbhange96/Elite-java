package com.mmcoe.cart;

import java.util.LinkedList;

public class ShoppingCart {

    private LinkedList<Product> items;
    private double total;

    public ShoppingCart() {
        items = new LinkedList<>();
    }

    public void addToCart(Product p) throws ShoppingException {
        if (items.size() == 5) {
            throw new ShoppingException("Your cart is full");
        }

        items.add(p);
        total += p.getPrice();
    }

    public void checkOut() throws ShoppingException {
        if (items.isEmpty()) {
            throw new ShoppingException("Your Cart is Empty!");
        }

        for (Product p : items) {
            System.out.println(p);
        }

        System.out.println("Cart Total = " + total);
    }
}