
package com.mmcoe.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



public class Order {
	@Id @GeneratedValue @Column(name="ord_no")
	private int OrderNo;
	@Column(name="ord_date")
	private LocalDate orderDate;
	private double amount;
	
	@ManyToOne @JoinColumn(name="cid")
	private Customer cust;
	public Order() {
	}
	public Order(LocalDate orderDate, double amount) {
		
		this.orderDate = orderDate;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Order [OrderNo=" + OrderNo + ", orderDate=" + orderDate + ", amount=" + amount + ", cust=" + cust + "]";
	}
	public int getOrderNo() {
		return OrderNo;
	}
	public void setOrderNo(int orderNo) {
		OrderNo = orderNo;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	
	

}
