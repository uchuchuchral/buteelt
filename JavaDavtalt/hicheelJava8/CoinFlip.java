package hicheelJava8;

import java.util.Random;
import java.util.concurrent.Executor;

public class CoinFlip implements Runnable, Executor{
    int FlipNum=0; // hayltiin too 
	int []Flipping;
   	int num;
	
	public CoinFlip(int Num){
		FlipNum= Num;
		Flipping= new int[Num];
		
	}
	
	public void run() {
	  Random rn= new Random();
	  for(int i=0; i<FlipNum; i++){
		   Flipping[i]=rn.nextInt(2); // 1hurtel;
		  
		  
		
	  }
	  System.out.println("ur dun->"+getConsecutiveHeads());
	  Print();	
	}
	
	
   void Print(){
	   for(int i=0; i<FlipNum; i++){
		  System.out.print(Flipping[i]+" ");
	  }
	   System.out.println();
   }
	
	int getConsecutiveHeads(){
		boolean foo=false;
		int count=0;
		int c=0;
		boolean f1=false;
		
		for(int i=0; i<FlipNum; i++){
			
			
			
			if(Flipping[i]==1 ){
				  count++;
				  foo=true;
				 
			}
			
			else{
			 	foo=false;
				count=0;
				if(f1){
					System.out.println("3aas davsan");
					 
					 c++;	
				}
				f1=false;
			}
			
			
			if(count>=3 ){
			    f1=true;
			    
				 if(foo){
					 
				 }
				 else{
					 System.out.println("3aas davsan");
					 
					 c++;	
				 }
				 
			     }
			  
			
			
		}
		
		return c;
		
	}

	@Override
	public void execute(Runnable arg0) {
		// TODO Auto-generated method stub
		 Random rn= new Random();
		  for(int i=0; i<FlipNum; i++){
			   Flipping[i]=rn.nextInt(2); // 1hurtel;
			  
			  
			
		  }
		  System.out.println("ur dun->"+getConsecutiveHeads());
		  Print();	
	}

}
