package hicheelJava7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Bodlogo19_6 {
   
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		Loan l1= new Loan();
		Loan l2= new Loan();
		Loan l3= new Loan();
		Loan l4= new Loan();
		Loan l5= new Loan();
		
		
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise19_6.dat"));
		
		output.writeObject(l1);
		output.writeObject(l2);
		output.writeObject(l3);
		output.writeObject(l4);
		output.writeObject(l5);
		
		output.close();
				
		
		/*ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise19_6.dat"));
		
		double totalLoanAmount=0;
		Loan lo1[]=null;
		
		for(int i=0; i<2; i++){
		    
			lo1[i]=(Loan) input.readObject();
		    totalLoanAmount+=lo1[i].getLoanAmount();
		}
		
		
		System.out.println("Loan= "+totalLoanAmount);
	
	*/
		}
}
