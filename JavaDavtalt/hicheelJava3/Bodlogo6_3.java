package hicheelJava3;

import java.util.Scanner;

/*toonii davtagdliig tooloh 
 1 eees 100 zavsartah buhel toonuudiig oruulj tus bur ni heden udaa davtagdaj orhiig todorhoiloh programm zohio
  0 oruulj oruulaltiig duusgana
*/
public class Bodlogo6_3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     int []arr=new int[100];  // element todorhoiguigeer uguh
     int []count=new int[100];
     inputArr(arr);
     CountArr(arr, count);
   
		
		
	}
	
	public static void CountArr(int [] array, int [] counter){
	   for(int i=0; i<array.length; i++){
		   for(int j=0; j<array.length; j++){
			   if(array[i]==array[j]){
				  counter[i]+=1; 
			   }
		   }
	   }
	
	 
	   for(int i=0; i<array.length; i++){
          if(array[i]==0){
           break; 
          }
          else{
	      System.out.println(array[i]+" too "+ counter[i]+" udaa");  
           }
	 }
		
	}
	
	
	
	public static void inputArr(int [] array){
		Scanner input =new Scanner(System.in);
		System.out.println("1 ees 100 hoorond buhel too oruul: ");
		for(int i=0; i<1000; i++){
				array[i]=input.nextInt();
		    	 if(array[i]==0){
		    		break; 
		    	 }
		     }
	
		
	}

}
