package com.nt.multithreading;
/*
 * Develop a project with multiple threads to perform
 * deposit() and withdraw() operations concurrently 
 * for multiple customers
 * 
 */
//BankAccount.java
class BankAccount {
	private double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amt) {
		this.balance = this.balance + amt;
	}
	
	public void withraw(double amt) {
		this.balance = this.balance - amt;
	}
	
	public void currentBalance() {
		System.out.println(balance);
	}
}

//Depositer.java
class Depositer implements Runnable {
	private BankAccount acc;
	private double amt;
	
	public Depositer(BankAccount acc, double amt) {
		this.acc = acc;
		this.amt = amt;
	}
	
	@Override
	public void run() {
		acc.deposit(amt);
	}
}

//Withdraw.java
class Withdraw implements Runnable {
	private BankAccount acc;
	private double amt;
	
	public Withdraw(BankAccount acc, double amt) {
		this.acc = acc;
		this.amt = amt;
	}
	
	@Override
	public void run() {
		acc.withraw(amt);
	}
}

//Test13_Project_Bank.java
public class Test13_Project_Bank {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("bank start");
		
		BankAccount acc1 = new BankAccount(5000);			//for HK
		BankAccount acc2 = new BankAccount(10000);		//for BK
		BankAccount acc3 = new BankAccount(15000);		//for PK
		
		Depositer d1 = new Depositer(acc1, 3000);			//cashier1
		Depositer d2 = new Depositer(acc2, 5000);			//cashier2
		Withdraw w1 = new Withdraw(acc3, 4000);		//cashier3
		
		Thread th1 = new Thread(d1);
		Thread th2 = new Thread(d2);
		Thread th3 = new Thread(w1);
		
		th1.start();
		th2.start();
		th3.start();
		
		Thread.sleep(5000);
		
		System.out.println("acc1 balance:: " );	acc1.currentBalance();
		System.out.println("acc2 balance:: " );	acc2.currentBalance();
		System.out.println("acc3 balace:: " );	acc3.currentBalance();
	}
}
