package bodlogo19;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Bodlogo19_12 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		String s= System.getProperty("user.dir");
		System.out.println("Odoo bgaa zam->"+s);
		BufferedOutputStream bw=null;

		int maxReadBufferSize = 8 * 1024; //8KB aar buffer ihdee unshij awna

		try{
			int i=1;
			bw = new BufferedOutputStream(new FileOutputStream("floor.mp4"));
			//  BufferedInputStream bm = new BufferedInputStream(new FileInputStream)
			while(true){


				File raf1= new File("split."+i);
				
				if(raf1.exists()){
					System.out.println(raf1+" file bn ");
					RandomAccessFile raf= new RandomAccessFile("split."+i,"r");
					System.out.println(raf1+"iin hemjee (byte) -> "+raf.length());
					long numReads = raf.length()/maxReadBufferSize; //heden udaa buffert unshih too
					System.out.println("Heden udaa bufert tsugluulah we -"+numReads);
					long remainingReads= raf.length()%maxReadBufferSize;

					
						for(int j=0; j<numReads; j++){
							readWrite(raf, bw, maxReadBufferSize);
						}
						readWrite(raf,bw,remainingReads);
					
				
				}

				else {
					System.out.println("Tugsgul hurlee");
					break;
				}
				i++;


			}
		}
		catch(IOException e){
			e.printStackTrace();  
		}

		finally{

			bw.close();

		}
	}



	static void readWrite(RandomAccessFile raf, BufferedOutputStream bw, long numBytes) throws IOException { //ehnii argumenteer damjsan filedeer  2dahi argumenteer damjsan file iig nemj bichih funtks
		byte[] buf = new byte[(int) numBytes];// byte hemjeetei buf massiv uusgelee 
		int val = raf.read(buf);
		if(val != -1) {
			bw.write(buf);
		}
	}


}
