package hicheelJava2;

import java.util.Scanner;

public class ToParanheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input= new Scanner(System.in);
    System.out.print("Enter degree in celcius = ");
    double a=input.nextDouble();
    
    System.out.println(a+" celcius is "+Paranheit(a)+ " fahrenheit");
		
	}
	
	public static double  Paranheit (double b){
		double faranheit;
		double l= (9.0/5.0 );
		faranheit=l*b+32;
		return faranheit;
		
	}	
	


}
