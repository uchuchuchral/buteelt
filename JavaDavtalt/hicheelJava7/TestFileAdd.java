package hicheelJava7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TestFileAdd {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
     Scanner input = new Scanner(new File("temp.txt"));
     System.out.println(input.nextInt());
     
	  int sum=0;
      int value;
      
     
      while(input.hasNext()){
    	  sum=sum+input.nextInt();
    	  
      }
     
     
     
      System.out.println("The sum is = "+sum);
      input.close();
	}

}
