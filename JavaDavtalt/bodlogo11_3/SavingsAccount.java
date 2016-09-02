package bodlogo11_3;

import hicheelJava5.Account;

public class SavingsAccount extends Account{
        private double saving;  
	    
	public SavingsAccount(){
        super();	
        saving=0;
        }
     
	public SavingsAccount(int id, double balance ){
		super(id,balance);
	}
	
	

    public void withdraw(double amount){
		if(getBalance()<amount){
			
		}
		else{
			super.withdraw(amount);
		    saving=amount;
		}
	}
     
	public String toString(){
	    String output;
	    output="SavingAccounts class:";
	    output+="\nID :"+getId();
	    output+="\nBalance :"+getBalance();
	    output+="\nAnnualInterestRate :"+getAnnualInterestRate();
	    output+="\nBelneer awsan mungu :"+saving;
	    return output;
	}
	
	
}
