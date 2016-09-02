package hicheelJava9;
/*
 * text file aas buh ugiig unshij delgetsend haruulah programm 
 * erembelj haruulna
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Bodlogo22_5 implements Comparator {
	PriorityQueue<String>arr; // erembet daraalalaar hiisen bolhoor shuud dotroo eremblegdsen bgaa
	static BufferedReader inputStream= null;


	public Bodlogo22_5(){
		arr= new PriorityQueue<String>();
		try{
			
			inputStream=new BufferedReader(new FileReader("MC.txt"));
			String l;
			while((l=inputStream.readLine())!=null){
				arr.add(l);
			} 		 
		}
		catch(Exception e){

		}


	}

	public PriorityQueue<String> getList(){
		return arr;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Bodlogo22_5 b= new Bodlogo22_5();

		String s= System.getProperty("user.dir");
		System.out.println("Odoo bgaa zam ->"+s);
		System.out.println(b.getList());  
  



		inputStream.close();
	}


	public int compare(Object o, Object o1) {
		String s1=(String)o;
		String s2=(String)o1;


		return s1.compareTo(s2);

	}

}  