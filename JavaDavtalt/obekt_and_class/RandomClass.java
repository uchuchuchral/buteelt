package obekt_and_class;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Random random1= new Random(3); // 
     
     System.out.println("random1 :");
     for(int i=0; i<10; i++){
    	 System.out.println(random1.nextInt(1000)+" ");// 1000 hurtelh toonoos randomoor ingej songono
    	 
     }
     Random random2= new Random(3);  // haaltand bichsen toonoos hamaarch oron uurchlugduj baina magadgvi 2 orontoi too gevel 2 iig uguh baih
     System.out.println("random2 :");
     for(int i=0; i<10; i++){
    	 System.out.println(random2.nextInt(1000)+" ");// 1000 hurtelh toonoos randomoor ingej songono
    	 
     }
     
		
	}

}
