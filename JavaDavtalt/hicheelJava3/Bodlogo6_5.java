package hicheelJava3;

import java.util.Scanner;

/*toonii davtagdliig tooloh 
 1 eees 100 zavsartah buhel toonuudiig oruulj tus bur ni heden udaa davtagdaj orhiig todorhoiloh programm zohio
  0 oruulj oruulaltiig duusgana
*/
public class Bodlogo6_5 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     int []arr=new int[10];  // element todorhoiguigeer uguh
     int []count=new int[10];
     inputArr(arr);
     CountArr(arr, count);
   
		
		
	}
	
	public static void CountArr(int [] array, int [] counter){
	 
	    
	   System.out.println("Davhardaagui toonuud :");
	   int once;
	  for(int i=0; i<array.length; i++){
		  System.out.println(array[0]);
		  counter[i]=1;
	  }
	
	 

		
	}
	
	
	
	public static void inputArr(int [] array){
		Scanner input =new Scanner(System.in);
		System.out.println(" 10 shirheg  too oruul: ");
		for(int i=0; i<10; i++){
				array[i]=input.nextInt();
		     }
	
		
	}

}
