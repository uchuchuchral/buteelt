package bodlogo19;

import java.util.Scanner;

public class Exercise4_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	short  a;
	 Scanner input = new Scanner(System.in);
     
	 
     System.out.print("Integer turliin too oruul :");
     a=input.nextShort();
     printBit(a);
     
     
     
	}
	public static void printBit(short a){
		 String s="";  
		 for(int i=15; i>=0; i--){
			 if(((a>>i)&1)==1){
				s+=1; 
			 }
			 else{
				s+=0; 
			 }
		  }
		 System.out.println(s);
	}

}
