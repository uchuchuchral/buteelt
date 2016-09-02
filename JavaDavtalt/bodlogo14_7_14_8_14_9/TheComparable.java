package bodlogo14_7_14_8_14_9;

import java.util.Date;

public class TheComparable {

	public static void main(String[] args){
	//	String []s=new String [10];
	//	int []n= new int [10];
		Date []d  = {new Date(10), new Date(25), new Date(100)};
		
		Integer[] intArray = {2, 4, 3, 5, 16, 20, 0, 100, 23, 11};
		String[] stringArray = {"Baishin", "Nom", "Uzeg", "Devter","Munhtulga", "Amraa","Tulhvvr", "Bagsh", "Aaaaaaaa"};
		
	//	int a=(int) max(intArray);
		
	    System.out.println("Largest integer = "+max(intArray));	
		System.out.println("Largest string = "+max(stringArray));
	    System.out.println("Largest date = "+max(d));
	    
	  
	    
	}
	
	
	public static Object max(Comparable[] a){
		Comparable max;
		max=a[0];
		
		for(int i=1; i<a.length; i++){
			if(a[i].compareTo(max) > 0){
				max=a[i];
			}
			
		  }
		
		
		
		
		return max;
	}
}

