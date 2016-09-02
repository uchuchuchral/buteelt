package hicheelJava5;

import java.util.Date;

public class Account {
      private int id;
      private double balance;
      private double annualInterestRate;
      private Date dateCreated;
      
	
      public Account(){
    	  this.setId(0);
    	  this.setBalance(0.0);
    	  this.setAnnualInterestRate(0.0);
    	  dateCreated =new Date();
    	  
      }
      
      public Account(int id, double balance){
    	  this.setId(id);
    	  this.setBalance(balance);
    	  dateCreated =new Date();
      }
      
      
      
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate(){
		return annualInterestRate/1200;
	}
	
	public void withdraw(double amount){
		if(balance<amount){
			System.out.println("Үлдэгдэл хүрэхгүй байна");
		}
		balance=balance-amount;
		
	}
	
	protected void deposit(double amount){
		
		balance=balance+amount;
		
	}

	
}
