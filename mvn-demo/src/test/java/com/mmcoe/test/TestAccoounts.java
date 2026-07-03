package com.mmcoe.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mmcoe.pojo.Accounts;
import com.mmcoe.pojo.BalanceException;

public class TestAccoounts {
 private static Accounts a;
 @BeforeEach
 public  void init() {
     a=new Accounts(20000);
 }
 @Test
 public void TestBalance() {
     assertEquals(20000,a.getBalance());
 }
 @Test
 public void testDeposit() {
     assertEquals(22000,a.deposit(2000));
 }
 @Test
 public void testWithdraw() throws BalanceException {
     assertEquals(18000, a.withdraw(2000));
 }
 @Test
 public void testNegDeposit() {
     assertThrows(IllegalArgumentException.class,()->a.deposit(-1));
 }
 @Test
 public void testNegWith() {
    assertThrows(IllegalArgumentException.class,()->a.withdraw(-1));
     assertThrows(BalanceException.class,()->a.withdraw(50000));
 }
 
}