package geriinDaalgavruud;

import java.util.Scanner;

public class Students {
  
     
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input= new Scanner(System.in);
      System.out.println("Oyutnii too :");
      int  count= input.nextInt();
      
      String []name= new String[count];
      double []score=new double[count];
	
      inputArr(name,score);
      sort(score,name);
      show(name,score);
      
	}
	
	
  
	public static void sort(double []s, String []s1){
		double max;
		double temp;
		String temp1;
		for(int i=0; i<s.length; i++){
			max=s[i];
			
			
			for(int j=i+1 ; j<s.length; j++){
				if(max<s[j]){
					max=s[j];
					temp=s[i];
					temp1=s1[i];
					
					s[i]=s[j];
					s1[i]=s1[j];
					
					s1[j]=temp1;
					s[j]=temp;
				}
			}
		}
	}
	
	
	public static void inputArr(String[]s , double[]s1){
	Scanner input= new Scanner(System.in);
		for(int i=0; i<s.length; i++){
	    System.out.print("Ner :");
	    s[i]=input.next();
	    System.out.print("Dun :");
	    s1[i]=input.nextDouble();
	    		
			
	}
		
	}
	
	
	public static void show(String []s, double []s1){
		System.out.println();
		System.out.println("Oyutnuud  :");
		for(int i=0; i<s.length; i++){
		    System.out.println(s[i]+"  "+s1[i]);
		}
		
	}
}
