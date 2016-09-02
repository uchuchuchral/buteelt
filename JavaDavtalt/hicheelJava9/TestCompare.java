package hicheelJava9;

import java.util.PriorityQueue;

public class TestCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList arr= new ArrayList<String>(new Bodlogo22_1);
	  String s=new String("This is the moment! tonight! is-night");
	  
	  
	  String[] l = s.split("[!-]");
	  
	  
	  for(String var: s.split("!")){
		  System.out.println(var);
	  
	  }
	  
	  System.out.println("Split bol :");
	  for(String m:l){
		  System.out.println(m);
	  }
	}

}
