package hicheelJava3;

import java.util.Scanner;

// ugugdsun toonii hazailtiig bodoh
public class Bodlogo6_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double []arr=new double[10];
    inputArr(arr);
    double mean1;
    mean1=mean(arr);
    System.out.println("The mean is "+mean1);
    System.out.println("The standart deviation is "+deviation(arr));
		
	}

	
	
	public static void inputArr(double [] array){
		Scanner input =new Scanner(System.in);
		System.out.println("Enter ten numbers : ");
		for(int i=0; i<array.length; i++){
				array[i]=input.nextDouble();
		    	
		     }
	
		
	}
	
	public static double mean(double [] array){
		double mean=0;
		for(int i=0; i<array.length; i++){
			mean=mean+array[i];
		}
		
		mean=mean/array.length;
		return mean;
		
	}
	
	
	public static double deviation(double [] array){
		double devi=0;
	    double n=array.length-1;
		for(int i=0; i<array.length; i++){
			devi=devi+Math.pow(array[i]-mean(array), 2);
		}
		
		devi=devi/n;
		return Math.sqrt(devi);
		
	}
	
}
