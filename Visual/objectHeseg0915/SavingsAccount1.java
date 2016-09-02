package objectHeseg0915;

import hicheelJava5.Account;

public class SavingsAccount1 extends Account1{
    private double saving;  
    
public SavingsAccount1(){
    super();	
    saving=0;
    }
 
public SavingsAccount1(int id, double balance ){
	super(id,balance);
}



public void withdraw(double amount){
	if(getBalance()<amount){
		System.out.println("Dansan dahi uldegdel hureltsehgui baina!");
	}
	else{
		super.withdraw(amount);
	    saving=amount;
	}
}
 
public String toString(){
    String output;
    output="SavingAccounts class:";
    output+="\nId ="+id;
	output+="\nBalance ="+balance;
	output+="\nDate ="+getDateCreated();
	output+="\nMonthlyInterestRate ="+getMonthlyInterestRate();
	output+="\nAnnualInterestRate ="+getAnnualInterestRate();
    output+="\nBelneer awsan mungu :"+saving;
    return output;
}


}
