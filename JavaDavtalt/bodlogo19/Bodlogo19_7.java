package bodlogo19;

import hicheelJava7.Loan;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Bodlogo19_7 {

	
	public static void main(String[] args) throws EOFException, FileNotFoundException, IOException, ClassNotFoundException{
		Loan[]l1 = {new Loan(1000), new Loan(500), new Loan(), new Loan(200), new Loan(5000)};
		
		String s= System.getProperty("user.dir");
		System.out.println("Odoo bgaa zam ->"+s);
		File f=new File("Exercise19_7.dat");
		
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(f));
		
		for(int i=0; i<l1.length; i++){
			output.writeObject(l1[i]);
		}
		
		output.close();
	   
	    	
		ObjectInputStream in=null;
		Loan l=null;
	    double totalLoanAmount=0;
		
	    {
		try{
	     
		 in= new ObjectInputStream(new FileInputStream(f));
		 for(int i=0; i<5; i++){
		 l= (Loan) in.readObject();
	     System.out.println(""+l.getLoanAmount());
	     totalLoanAmount=totalLoanAmount+l.getLoanAmount();
		 }
		}
		
		
		
	 	catch(EOFException e){
		 e.printStackTrace();	
		 }
		catch(IOException e){
			
		}
		
	  
		 
		
		in.close();
		
	    
	    }
		 System.out.println("The totalLoanAmount is "+totalLoanAmount); 
	 
	}
	
}
