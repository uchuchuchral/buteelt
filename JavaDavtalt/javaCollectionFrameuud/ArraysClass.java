package javaCollectionFrameuud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class ArraysClass {
// Arrays class ni massiviig bolowsruulah funktsuudiig gargaj ugdug
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int []arr= new int[100];
     //Arrays.fill(arr, 10);   // arr massiviig 10 aar duurgene
     
     Random rnd= new Random();
     
     for(int i=0; i<100; i++){
    	// arr[i]=rnd.nextInt(100);  // 100 hurtelh random too 
    	 arr[i]=rnd.nextInt(20)+5;  // 5aas 25hurtelh random too 
     }
     
     for(int i: arr){
    	 System.out.print(" "+i);
     }
     
     System.out.println();
     Arrays.sort(arr);  // arr massiviig erembleh
     for(int i: arr){
    	 System.out.print(" "+i);
     }
		
     int []arr1= new int[arr.length];
     
     arr1=Arrays.copyOf(arr, arr.length); // arr iin huulbar arr1 iig uusgeh
     
     System.out.println("Huulbar :");
     for(int i: arr1){
    	 System.out.print(" "+i);
     }
     
     //List<Integer>list= new LinkedList<Integer>(Arrays.asList(arr1));
     
     
	}

	
	

}
