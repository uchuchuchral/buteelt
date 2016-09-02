package javaCollectionDaalgavar;

import java.util.Arrays;
import java.util.Random;

public class Bodlogo22_12 {
    Random rnd= new Random();
    Point []p1=new Point[100];
    
    
	public Bodlogo22_12(){
		System.out.println("Random oor 100n utga:");
	    int rx, ry;
	    
		for(int i=0; i<p1.length; i++){
       	   rx=rnd.nextInt(100)+1;
       	   ry=rnd.nextInt(100)+1;
       	   p1[i]=new Point(rx, ry);
       	   
		}
		
		for(int i=0; i<p1.length; i++){
			p1[i].print();
		}
		System.out.println();
		
		Arrays.sort(p1, new CompareY());
		
		for(int i=0; i<p1.length; i++){
			p1[i].print();
		}
		
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new Bodlogo22_12();
	}

}
