package objectHeseg0915;

import java.util.Date;

public class Account1 {
	protected int id;
	protected double balance;
	protected double annualInterestRate;
	protected Date dateCreated;


	public Account1(){
		this.setId(0);
		this.setBalance(0.0);
		this.setAnnualInterestRate(0.0);
		dateCreated =new Date();

	}

	public Account1(int id, double balance){
		this.setId(id);
		this.setBalance(balance);
		dateCreated =new Date();
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
		return annualInterestRate/12;
	}

	public void withdraw(double amount){ // mungu awah 
		if(balance<amount){
			System.out.println("Dansanii uldegdel hureltsehgui baina ");
		}
		
		else{
		balance=balance-amount;
		}

	}

	protected void deposit(double amount){ // mungu nemeh 

		balance=balance+amount;

	}
   
	public String toString(){
		String output="Account Class";
		output+="\nId ="+id;
		output+="\nBalance ="+balance;
		output+="\nDate ="+getDateCreated();
		output+="\nMonthlyInterestRate ="+getMonthlyInterestRate();
		output+="\nAnnualInterestRate ="+getAnnualInterestRate();
		
		return output;
	}

}
