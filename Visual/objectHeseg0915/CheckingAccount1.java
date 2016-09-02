package objectHeseg0915;

import hicheelJava5.Account;

public class CheckingAccount1 extends Account1 {
    private double draftLimit;
    private double saving;
    
    public CheckingAccount1(){
 	   super();
 	   setDraftLimit(1000);
        saving=0;
    }
    
    public CheckingAccount1(int id, double balance, double draftLimit){
 	   super(id, balance);
 	   setDraftLimit(draftLimit);
 	   
    }

    
	public double getDraftLimit() {
		return draftLimit;
	}

	public void setDraftLimit(double draftLimit) {
		this.draftLimit = draftLimit;
	}
    
	
	public void withdraw(double amount){
		if(draftLimit<amount){
			System.out.println("Awch boloh deed hemjeenees hetersen baina!");
			
		}
		
		else{
			//super.withdraw(amount);
		    if(getBalance()<amount){
			   System.out.println("uldegdel hurehgui baina !");
		        }
		    else{
		      super.withdraw(amount);
		      saving=amount;
		    }
		    	
		}
		
	}
	

	public String toString(){
	    String output;
	    output="CheckingAccount class:";
	    output+="\nId ="+id;
		output+="\nBalance ="+balance;
		output+="\nDate ="+getDateCreated();
		output+="\nMonthlyInterestRate ="+getMonthlyInterestRate();
		output+="\nAnnualInterestRate ="+getAnnualInterestRate();
		output+="\nDraftLimit ="+getDraftLimit();
	    output+="\nCheckeer awsan mungu :"+saving;
	    return output;
	}
	
}

