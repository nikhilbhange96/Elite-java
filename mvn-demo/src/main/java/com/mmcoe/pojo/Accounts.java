package com.mmcoe.pojo;

public class Accounts {
  private double balance;
  public Accounts(double balance) {
      this.balance=balance;
  }
  public double getBalance() {
      return balance;
  }
  public double deposit(double amount) {
      if(amount>0) {
          balance= balance+amount;
          return balance;
      }
      throw new IllegalArgumentException();
     
  }
  public double withdraw(double amount) throws BalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }

        if (amount > balance) {
            throw new BalanceException("Insufficient balance");
        }

        balance -= amount;
        return balance;
    }
}