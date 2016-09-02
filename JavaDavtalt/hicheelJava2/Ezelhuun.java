package hicheelJava2;

import java.util.Scanner;

public class Ezelhuun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input= new Scanner(System.in);
    System.out.println("Эзэлхүүн олох :");
    System.out.print("R = ");
    double r=input.nextDouble();
    System.out.print("L = ");
    double l=input.nextDouble();
	
    System.out.print("The area is "+area(r) );
    System.out.print("\nThe volume is "+volume(area(r),l));
    
    //
	}
	
	public static double area (double ra){
		double area;
		area=ra*ra*Math.PI;
		return area;
	}
	
	public static double volume(double  ar, double len){
	 double volume;
	 volume=ar*len;
	 return volume;
		
	}

}
