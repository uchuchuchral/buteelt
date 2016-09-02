package bodlogo19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//ene programmiig ajilluulah burt tooluur negeer nemegdej filed hadgalagdah neg ugeer hed ajilluulsniig tooloh
public class Bodlogo19_8 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
  

	String s= System.getProperty("user.dir");
	System.out.println("Zam ni->"+s);

	File f= new File(s+"Bodlogo19_8.dat");
	if(f.isFile()){
	 System.out.println("Iim file bn");
	   try{
		  Replace(f); 
	   }
	  catch(IOException e){
		  
	  }
	}
	
	else{
	  System.out.println("Iiim file alga bn");	
	  try{
	     Create(f);
	  }
	  catch(IOException e){
		  }  
	}
	
	
 
	}
	
	 
   public static void Replace(File f) throws IOException {
	   int i=0;
	   FileInputStream in=null;
	   try{
		   in= new FileInputStream(f);
		    
		   i=in.read();
		   i++;
		   System.out.println("heden udaa ajilluulsan -> "+i);
		   
	   }
	   catch(IOException e){
		   
	   }
	   
	   FileOutputStream out=null;
	   
	   
	   try{
          out= new FileOutputStream(f);
          out.write(i);
          out.close();
		  in.close();
	   }
	   
	   catch(IOException e){
		   
	   }
	   
	 
   }
   
   public static void Create(File f) throws IOException{
	  int count=1;
	  FileOutputStream out= null;
	  try{
	  out=new FileOutputStream(f);	  
	  out.write(count);
	  }
	  
	  catch(IOException e){
		  
	  }
	  try{
		 out.close(); 
	  }
	  catch(IOException e){
		  
	  }
   }
}
