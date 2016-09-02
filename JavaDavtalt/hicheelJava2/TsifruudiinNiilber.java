package hicheelJava2;

import java.util.Scanner;

public class TsifruudiinNiilber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input= new Scanner(System.in);
     System.out.print("0 ээс 1000 завсарт тоо оруул :");
     int n=input.nextInt();
     
     System.out.println("Цифрүүдийн нийлбэр нь : "+Tsifr(n));
		
	}
	
	public static int Tsifr(int a){
		int sum=0;
		while(a>0){
		sum=sum+a%10;
		a=a/10;
		}
		
		return sum;	
	}

}
