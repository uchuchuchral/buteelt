package geriinDaalgavruud;

import java.util.Scanner;

public class Bodlogo6_18TheBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		   Scanner input= new Scanner(System.in);
		   System.out.println("n=");
		   int n=input.nextInt();
		 double []arr=new double[n];
	        inputArr(arr);
	        BubbleSort(arr);
			Show(arr);
		    
	}
   
	
	
	public static void inputArr(double []arr){
		Scanner input = new Scanner(System.in);	
		System.out.println("arr[]=");
		for(int i=0; i<arr.length; i++){
			arr[i]=input.nextDouble();
		}
	}
	
	public static void Show(double []arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"  ");
		}
	}
	
	
	
	
	
	public static void BubbleSort(double []arr){
	    double temp;
	    double max;
	    
		for(int i=0; i<arr.length; i++){
		
			
			for(int j=1; j<arr.length-i; j++){
				if(arr[j-1]>arr[j]){	
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
			
		 
	 }
		
	}
}
