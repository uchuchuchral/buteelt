package hicheelJava7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Bodlogo19_1 {
    static String file="temp.txt";   
	
 	public static void main(String[] args) throws  IOException{
		// TODO Auto-generated method stub
 		String current=System.getProperty("user.dir"); //ene programm haana bga zamiig zaaj ugdug
 		
 		PrintWriter out = new PrintWriter(file);
 		
 		Random rnd= new Random();
 		
 	
 		System.out.println(current);  
 		
 		for(int i=0; i<100; i++){		
 			out.print(rnd.nextInt(200)+" ");     // 200hurtelh too random
 		
 		}
 		out.close();
	}

}
