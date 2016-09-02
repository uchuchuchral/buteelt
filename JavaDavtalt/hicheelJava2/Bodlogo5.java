package hicheelJava2;

import java.util.Scanner;

public class Bodlogo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
	     System.out.print("0 - 128 ASCII тэмдэгтийн дугаар оруул  :");
	     int n=input.nextInt();
	     toAscii(n);
	}

	
	public static void toAscii (int a){
	    char l=(char) (a);  // ascii ruu hurvuuleh 
		System.out.println(	l);
	}

}
