package hicheelJava8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCoin {
   static Runnable cflip1= new CoinFlip(30); // runnable iin instance uusgej bn 
   static Runnable cflip2= new CoinFlip(30);
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

    Thread thread1= new Thread(cflip1);
    Thread thread2= new Thread(cflip2);
    
    
    thread1.start();
    thread2.start();
  
		
    /*ExecutorService exec= Executors.newCachedThreadPool();
    exec.execute(new CoinFlip(30));
    exec.execute(new CoinFlip(30));
   
   
    exec.shutdown();*/
	}

}
