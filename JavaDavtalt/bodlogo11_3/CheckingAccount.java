package bodlogo11_3;

import hicheelJava5.Account;

public class CheckingAccount extends Account {
       private double draftLimit;
       private double saving;
       
       public CheckingAccount(){
    	   super();
    	   setDraftLimit(1000);
           saving=0;
       }
       
       public CheckingAccount(int id, double balance, double draftLimit){
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
	    output+="\nID :"+getId();
	    output+="\nBalance :"+getBalance();
	    output+="\nAnnualInterestRate :"+getAnnualInterestRate();
	    output+="\nCheckeer awsan mungu :"+saving;
	    return output;
	}
	
}
