package bodlogo19;


import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BitOutputStream implements Closeable {
    private File file;
    private byte b;
    
    public BitOutputStream(String string){
    	file=new File(string);
    	b=0;
    }
    public BitOutputStream(File f){
    	file=f;
    	b=0;
    }
    
	public void writeChar(char t){
		if(t=='0'){
			b=(byte) (b<<1);
		}
		if(t=='1'){
			b=(byte) (b<<1);
			b=(byte) (b|1);
			
		}
		
		
	}
	
	public void writeString(String s){
		if(s.length()>8){
			System.out.println("8bit ees hetersen bn !");
		}
		else{
			int a=Integer.parseInt(s);
			b=(byte) (b<<s.length());
			b=(byte) ((byte)b|a);
			
		}
	}
    

	
	public void close() throws IOException {
		FileOutputStream file1= null;
		
		try{
			file1= new FileOutputStream(file);
			file1.write(b);
			file1.close();
		}
		catch(IOException e){
			
		}
		
	}

}
