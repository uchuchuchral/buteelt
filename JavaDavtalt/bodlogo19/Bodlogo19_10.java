package bodlogo19;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Bodlogo19_10 {

	public static void main(String[] args) throws Exception
    {   
		String s=System.getProperty("user.dir");
		System.out.println("Odoo bgaa zam ->"+s);
        RandomAccessFile raf = new RandomAccessFile("florida.mp4", "r"); // shuud handalttai file uusgeed split hiih file aa zaaj ugsun
        long numSplits = 10; //heden shirheg bolgoh too 
       
        
        
        long sourceSize = raf.length(); // tuhain file iin hemjee 
        long bytesPerSplit = sourceSize/numSplits ; // split hiigdeh 1 file iin hemjee 
        long remainingBytes = sourceSize % numSplits;// huwaagaad uldeh file iin hemjee 

        int maxReadBufferSize = 8 * 1024; //8KB aar buffer ihdee unshij awna 
        for(int j=1; j <= numSplits; j++) {
            BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream("split."+j)); //huwaagdah 1file bolgon deer 1buffer stream uusgene teruugeer bichne 
            if(bytesPerSplit > maxReadBufferSize) {
                long numReads = bytesPerSplit/maxReadBufferSize; //heden udaa buffert unshih too 
                long numRemainingRead = bytesPerSplit % maxReadBufferSize; // unshaad uldegdel too 
               
                for(int i=0; i<numReads; i++) {
                    readWrite(raf, bw, maxReadBufferSize); // buffert bichih funkts 
                }
                if(numRemainingRead > 0) {
                    readWrite(raf, bw, numRemainingRead); // ilvv garsan bwal dahiad 1 file bolgono 
                }
                
            }else {
                readWrite(raf, bw, bytesPerSplit);
            }
            bw.close();
        }
        if(remainingBytes > 0) {
            BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream("split."+(numSplits+1)));
            readWrite(raf, bw, remainingBytes);
            bw.close();
        }
            raf.close();
    }

    static void readWrite(RandomAccessFile raf, BufferedOutputStream bw, long numBytes) throws IOException {
        byte[] buf = new byte[(int) numBytes];// byte hemjeetei buf massiv uusgelee 
        int val = raf.read(buf);
        System.out.println("valiin hemjee ->"+val);
        if(val != -1) { //hervee fileiin tugsguld hursen bwal bichilt hiigdene 
            bw.write(buf);
        }
    }

}

