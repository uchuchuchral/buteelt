package hicheelJava7;

import java.io.Serializable;

public class Loan implements Serializable{
	
	 private double annualInterestRate;
     private int numberOfYears;
     private double loanAmount;
	 private transient java.util.Date loanDate;
	 private int numberOfMonths; // saraar bodoh huwisagch 27 sar geh met 
	 
	 public Loan() {
		 
		  this(2.5, 1, 1000);
	 }

	 
	 public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
		 this.annualInterestRate = annualInterestRate;
		  this.numberOfYears = numberOfYears;
		  this.loanAmount = loanAmount;
		  numberOfMonths=numberOfYears*12;
		 loanDate = new java.util.Date();
	 }
	 
	
	 
	 public Loan(double loanAmount){
		  this.loanAmount = loanAmount;
		  loanDate = new java.util.Date();
	 }
	 
	 public double getAnnualInterestRate() {
		 return annualInterestRate;
	 }
	 
	 public int getNumberOfMonths(){
		 return numberOfMonths;
	 }
	 
	 /** Set a new annualInterestRate */
	  public void setAnnualInterestRate(double annualInterestRate) {
	  this.annualInterestRate = annualInterestRate;
	  }
	   
	  public void setNumberOfMonths(int month){
		  numberOfMonths=month;
	  }
	  /** Return numberOfYears */
	  public int getNumberOfYears() {
	  return numberOfYears;
	  }
	 
	 /** Set a new numberOfYears */
	  public void setNumberOfYears(int numberOfYears) {
	  this.numberOfYears = numberOfYears;
	 }
	 
	 /** Return loanAmount */
	  public double getLoanAmount() {
	  return loanAmount;
	  }
	 
	  /** Set a newloanAmount */
	  public void setLoanAmount(double loanAmount) {
	  this.loanAmount = loanAmount;
	  }
	 
	  /** Find monthly payment */
	  public double getMonthlyPayment() {
	  double monthlyInterestRate = annualInterestRate / 1200;
	  double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
	  (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
	  return monthlyPayment;
	  }
	  
	  public double getMonthlyPaymentNew() {
		  double monthlyInterestRate = annualInterestRate / 1200;
		  double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
		  (Math.pow(1 / (1 + monthlyInterestRate), numberOfMonths)));
		  return monthlyPayment;
		  }
	 
	  /** Find total payment */
	  public double getTotalPayment() {
	  double totalPayment = getMonthlyPayment() * numberOfYears * 12;
	  return totalPayment;
	  }
	 
	  /** Return loan date */
	  public java.util.Date getLoanDate() {
	  return loanDate;
	  }
	  
	  //double summa(Loan[] ll){
		  
		  
	  //}
}
