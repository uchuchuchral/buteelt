package hicheelJava8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exec= Executors.newCachedThreadPool();
	    exec.execute(new CoinFlip(30));
	    exec.execute(new CoinFlip(30));
	   
	   
	    exec.shutdown();
		
	}

}
