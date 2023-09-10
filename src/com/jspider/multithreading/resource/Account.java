package com.jspider.multithreading.resource;

 public class Account {
	private int balance;
	
 public Account(int balance) {
	this.balance=balance;
	
}
 public int CheckBalance() {
	return balance;
}

 public void deposit (int amount) {
	 System.out.println("Trying to deposit"+ amount + " RS.");
	 balance += amount;
	 
	 System.out.println("Deposit Succesfull");
	 System.out.println("Account balance :"+CheckBalance());
	 		
}
 
 public void Withdraw (int amount) {
	 System.out.println("Trying to Withdraw "+amount+"RS.");
	 
	 if(balance >=amount) {
		 balance-= amount;
		 System.out.println("Withdraw Successfull");
		 System.out.println("Account balance :"+CheckBalance());
	 }
	 else {
		 System.out.println("Insuficient balance");
	 }
 }
	

}
