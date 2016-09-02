package geriinDaalgavruud;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 100000 elementtei massiviin elementuudiig 100000 hurtelh toonoos sanamsargui songoj awch
 mun 100000 hurtelh toonoos sanamsargui songoj awsan too bnuu haih shugaman hailtiin hugatsaag oloh
 bodlogo 
 */

public class Bodlogo6_16TheCurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		long startTime=System.currentTimeMillis();
		int []arr=new int[100000];
		int key=(int)(Math.random()*arr.length);
		Randomly(arr);
		
		int a=linearSearch(arr,key);
		
		long endTime=System.currentTimeMillis();
		long executiontime=endTime-startTime;
		System.out.println("Haisan element= "+key);
		if(a==-1)
		  System.out.println("Haisan element oldsongui");
		else
		  System.out.println("Oldson dugaar = "+a);
		
		
		System.out.println("haisan hugatsaa(millsek)= "+executiontime);
		
		Arrays.sort(arr);
		
		long startTime1=System.currentTimeMillis();
		System.out.println("The binary search");
		
     	 a=binarySearch(arr,key);
		
		long endTime1=System.currentTimeMillis();
		long executiontime1=endTime1-startTime1;
		System.out.println("Haisan element= "+key);
		if(a==-1)
		  System.out.println("Haisan element oldsongui");
		else
		  System.out.println("Oldson dugaar = "+a);
		
		
		System.out.println("haisan hugatsaa(millsek)= "+executiontime1);
		
		
		
	}

	public static void Randomly(int[]arr ){
	    
		for(int i=0; i<arr.length; i++){
		   arr[i]=(int)(Math.random()*arr.length);
		   
	 }
	}
	
	public static int linearSearch(int[] list,int key){
		for(int i=0; i<list.length; i++){
			if(list[i]==key){
				return i;
			}
		}
		return -1;
		
	}
	
	public static int binarySearch(
			int[] list, int key) {
			int low = 0;
			int high = list.length - 1;
			while (high >= low) {
			
			int mid = (low + high) / 2;
			if (key < list[mid])
			high = mid - 1;
			else if (key == list[mid])
			return mid;
			else
			low = mid + 1;
			// Not found
			}
			return -1;
	}
}
