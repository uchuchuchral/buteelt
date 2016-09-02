package geriinDaalgavruud;

import java.util.ArrayList;
import java.util.Date;

public class AccountNew {
    private String name;  // Dans ezemshigchiin ner 
    private int id;  // Dans ezemshigchiin ID
    private double balance; // Dansnii uldegdel hadgalah
    private ArrayList transactions;  // hiisen guilgeenuudiig hadgalna
    private double annualInterestRate;  //jiliin hvv
    private Date dateCreated;  
    
	
    public AccountNew(){
  	  this.setId(0);   
  	  this.setBalance(0.0);
  	  this.setAnnualInterestRate(1.5);
  	  this.setName("");
  	  transactions = new ArrayList();
  	  dateCreated =new Date();
  	  
    }
    
    public AccountNew(int id, double balance){
  	  this.setId(id);
  	  this.setBalance(balance);
  	  this.setAnnualInterestRate(1.5);
  	  transactions = new ArrayList();
  	  dateCreated =new Date();
    }
    
    
    public AccountNew(String name, int id, double balance){
 	    this.setName(name);
 	    this.setId(id);
 	    this.setBalance(balance);
 	    this.setAnnualInterestRate(1.5);
 	    transactions = new ArrayList();
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



	
	void withdraw(double amount){ // dansnaas mungu awah method
		if(balance<amount){
		   System.out.println("Uldegdel hurehgui baina!");
		}
		balance=balance-amount;
		Date dateTake= new Date(); // tuhain tsag hugatsaa
		transactions.add(amount+" $ dansnaas awsan ->"+dateTake); // jagsaaltad element nemeh uildel
	    	
	}
	
	void deposit(double amount){ // dansand mungu nemeh method
		
		balance=balance+amount;
		Date dateTake= new Date();
		transactions.add(amount+" $  dansand hiisen ->"+dateTake);
		
	}

	void ShowAll(){
		String output="Dans ezemshigchiin medeelel ->";
		output+="\nner :"+name;
		output+="\njiliin hvv :"+annualInterestRate+"%";
		output+="\nDansnii uldegdel :"+balance+"$";
		output+="\nhiisen guilgeenvvd :";
	    int i=0;
		while(!transactions.isEmpty()){ // jagsaalt hooson bish bh ued ajillana
			output+="\n"+transactions.get(i);//tuhain i index deh obekt butsaah method
		
			transactions.remove(i); // tuhain index deh obekt ustgah funkts
		}
		System.out.println(output);
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}

