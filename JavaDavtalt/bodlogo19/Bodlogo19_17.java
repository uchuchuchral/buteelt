package bodlogo19;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Bodlogo19_17 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      BitOutputStream bit= null;
      File f=new File("Exercise19_7.dat");
      
      bit= new BitOutputStream(f);
      
     // bit.writeChar('1');
     // bit.writeChar('0');
      bit.writeString("00010001");
      bit.close();
      
      
      
      FileInputStream in= new FileInputStream(f);
      int value;
      if(f.exists()){
    	  System.out.println("Baina");
      }
      
      while((value=in.read())!=-1){
    	  System.out.println("value is ->"+value);
    	  printBit(value);
      }
      
     // printBit(value);
      in.close();
	}
	
	
	public static void printBit(int value){
		 String s="";
		 byte b=(byte)value;
		 System.out.println("Value funkts dotor->"+value);
		 for(int i=7; i>=0; i--){
			 if(((b>>i)&1)==1){
				s+=1; 
			 }
			 
			 else{
				s+=0; 
			 }
		  }
		 
		 System.out.println(s);
	}

}
