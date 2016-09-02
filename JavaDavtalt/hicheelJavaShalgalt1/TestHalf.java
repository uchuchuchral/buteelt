package hicheelJavaShalgalt1;

import java.util.Scanner;

public class TestHalf {
    public static int[] eval(int []arr){
      // int []arr1= arr.clone();
    	Half h= new Half();
    	
    	for(int i=0; i<arr.length; i++){
    		
    		arr[i]=h.evaluate(arr[i]);
    	
    			
    	}
    	
    	return arr;
    }
	
    
    
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input= new Scanner(System.in);
     System.out.print("n=");
     int n=input.nextInt();
    	 
     int []arr= new int[n];
     System.out.println("Arr["+arr.length+"] :");
     for(int i=0; i<arr.length; i++){
    	 arr[i]=input.nextInt();
     }
     
     eval(arr);
     System.out.println("Arr["+arr.length+"] :");
     for(int i=0; i<arr.length; i++){
    	 System.out.print(arr[i]+" ");
     }
	}

}
