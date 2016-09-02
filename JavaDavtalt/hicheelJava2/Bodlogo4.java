package hicheelJava2;

import java.util.Scanner;

public class Bodlogo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
	     System.out.print("Минутаа оруул :");
	     int n=input.nextInt();
	     Convert(n);
	}

	
	public static void Convert (int a){
		int sum=0;
		
		a=a/1440;
		sum=a/365;
		a=a%365;
		System.out.println(a+" минут бол "+sum+" Жил "+ a+" өдөр");
	}


}
