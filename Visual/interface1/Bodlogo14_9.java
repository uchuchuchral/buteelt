package interface1;

import java.util.Date;
import java.util.Random;

// hamgiiin tom objectiig oloh 
public class Bodlogo14_9 {
	
	public static void main(String[] args){
	      	Integer []arr={1,100,850,99,50,1000,999,8,95,59};
	      	String []arr1={"Baishin","Woohoo","haha","hooh","Aaaaaaa","medehguiee","zaza"};
		    Date []da=new Date[10];
		    
		    Random rnd=new Random(100);
		    
		    for(int i=0; i<10; i++){
		    	da[i].setTime(100);
		    	System.out.println(rnd.nextInt());
		    }
		     
		     
	      	 System.out.println("Largest integer = "+max(arr));	
	 		 System.out.println("Largest string = "+max(arr1));
		      System.out.println("Largest Date = "+max(da));
		
		
	}
	
	public static Object max(Comparable[] a){
		 Comparable max;
		 max=a[0];
		 
		 for(int i=0; i<a.length; i++){
			 if(a[i].compareTo(max)==1){
			    max=a[i]; 	 
			 }
		 }
		 
		 return max;
	}
}
