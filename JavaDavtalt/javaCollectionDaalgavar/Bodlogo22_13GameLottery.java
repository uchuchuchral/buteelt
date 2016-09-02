package javaCollectionDaalgavar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

public class Bodlogo22_13GameLottery {
         int guess;  // hereglegchiin oruulsan 3orontoi toog hadgalah huwisagch
	     int lottery;
         int []guessDigit=new int[3];
         int []lotteryDigit= new int[3];
         
         List<Integer> listGuess= new ArrayList<Integer>();
         List<Integer> listLottery= new ArrayList<Integer>();
         List<Integer> inter;
         
	public Bodlogo22_13GameLottery(){
         lottery=(int)(Math.random()*1000);
		 System.out.println("lottery="+lottery);
         
		 Scanner input=new Scanner(System.in); 	 
         System.out.print("toog oruul :");
         guess=input.nextInt();
         
         
         lotteryDigit[0]=lottery/100;
         lotteryDigit[1]=lottery-lotteryDigit[0]*100;
         lottery=lotteryDigit[1];
         lotteryDigit[1]=lotteryDigit[1]/10;
         lotteryDigit[2]=lottery%10;
         
         
         guessDigit[0]=guess/100;
         guessDigit[1]=guess-guessDigit[0]*100;
         guess=guessDigit[1];
         guessDigit[1]=guessDigit[1]/10;
         guessDigit[2]=guess%10;
         
         for(int i=0; i<guessDigit.length; i++){
        	 listGuess.add(guessDigit[i]);
        	 listLottery.add(lotteryDigit[i]);	 
         }
       
        inter=interSection(listGuess,listLottery);
         
        System.out.println("Hereglegchiin oruulsan toonuud :");
        showList(listGuess);
        System.out.println("Randomoor songogdson toonuud :");
        showList(listLottery);
        System.out.println("Tedgeeriin ogtloltsol :");
        showList(inter);
        
        checking();
	}
	
	
       void checking(){
    	   if(lottery==guess) System.out.println("10000 $ hojloo "); 
    	   else{
    	   if(listGuess.containsAll(listLottery))System.out.println("3000 $ hojloo");
    	   else{
    	      if(inter.size()==2) System.out.println("2000 $ hojloo");
    	   else{
    		  if(inter.size()==1) System.out.println("1000 $ hojloo"); 	   
    	      }
    	   }
    	   }
    	  
       }
       
       
	public <Integer> List<Integer> interSection(List<Integer> l1, List<Integer> l2){
		List<Integer> list= new ArrayList<Integer>();
		Set<Integer> s1= new HashSet<Integer>();
		Set<Integer> s2= new HashSet<Integer>();
		
		for(Integer i: l1){
			s1.add(i);
		}
		
		for(Integer i: l2){
			s2.add(i);
		}
		
		
		for(Integer i: s1){
			if(s2.contains(i)){ // hervee l1 iin element l2 t bwal ogtloltsol bolgoj awna 
			   list.add(i);	
			}
		}
		return list;
	}
     
	
   public void showList(List<Integer>l1){
	   ListIterator iterator=l1.listIterator();
	   while(iterator.hasNext()){
		   System.out.print(iterator.next()+"  "); 
	   }
	   System.out.println();
	   
   }
	
	public static void main(String[] args) {
		new Bodlogo22_13GameLottery();
	}

}
