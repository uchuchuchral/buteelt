package hicheelJava7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Bodlogo19_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream output = new FileOutputStream("19_3.dat");
        Random rnd= new Random();
    
       for(int i=0; i<100; i++){		
			output.write(rnd.nextInt(200));     // 200hurtelh too random	    
		}
      
       FileInputStream input = new FileInputStream("19_3.dat");
       
       int value;
       int add=0;
       while((value=input.read())!=-1){
    	   add=add+value;
    			   
       }
       
	   input.close();
	   System.out.println("sum="+add);
	}

}
