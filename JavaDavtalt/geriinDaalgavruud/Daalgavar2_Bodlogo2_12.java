package geriinDaalgavruud;

import java.util.Scanner;

public class Daalgavar2_Bodlogo2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input= new Scanner(System.in);
        
         System.out.println("Enter Balance :");
         int balance=input.nextInt();
         System.out.println("Enter interest rate");
         double interestRate=input.nextDouble();
         
		System.out.println("The interest is "+Cal(balance, interestRate));
		
		
		
	}
	
	public static double Cal (int bal, double inter){
		double calc;
		calc=bal*(inter/1200);
		return calc;
		
	}

}
