package hicheelJava8;

public class PrintChar implements Runnable{
    char ch;// ch  temdegt
    int n; // tuuniig hevleh too 
	
	public PrintChar(char ch, int n){
		this.ch=ch;
		this.n=n;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Runnable r1= new PrintChar('a',10);
        Runnable r2= new PrintChar('b',10);
        Runnable r3= new PrintChar('c',10);
        
		
        Thread thread1= new Thread(r1);
        Thread thread2= new Thread(r2);
        Thread thread3= new Thread(r3);
        
        //runnable iig implements hiiisen classiinhaa obektiiig Threadiin parametrt ugch uusgene
        thread1.start();
        thread2.start();
        thread3.start();
        
	}

	
	public void run() {
	 for(int i=0; i<n; i++){
		 System.out.println(""+ch);
	 }
		
	}

}
