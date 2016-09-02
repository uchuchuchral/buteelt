package theExceptionHandling;

import java.util.Scanner;

public class Toog0tHuwaah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
	  
      System.out.println("Huwaagch ba huwaagdagchiig oruul :");
      int number1= input.nextInt();
      int number2= input.nextInt();
      
      
      try{
      
      System.out.println(number1+"/"+number2+"="+Diviser(number1, number2));
       
      }
      
      catch(ArithmeticException ex){
    	  System.out.println("Aldaa garlaa 0d too huwaagdahgui !");  
    	  
      }
      
      finally{
    	  System.out.println("Programm zui esoor duuslaa");
      }
      
      
      
	}
	
	
 public static int Diviser(int n1, int n2){
	 if(n2==0){
	    	throw new ArithmeticException(); 
	      }
      
	  return n1/n2;
 }
 
}
