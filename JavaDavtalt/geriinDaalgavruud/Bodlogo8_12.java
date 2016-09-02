package geriinDaalgavruud;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Bodlogo8_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double x1, x2, y1, y2;
      double ax1, ax2, ay1, ay2;
      
	   Scanner input = new Scanner(System.in);	
	   System.out.println("Ehnii shuluunii tseguud : ");
	   System.out.print("x1 : ");
	   x1=input.nextDouble();
	   System.out.print("y1 : ");
	   y1=input.nextDouble();
	   System.out.print("x2 : ");
	   x2=input.nextDouble();
	   System.out.print("y2 : ");
	   y2=input.nextDouble();
	   
	   System.out.print("Daraagiin shuluunii tseguud : ");
	   System.out.print("ax1 : ");
	   ax1=input.nextDouble();
	   System.out.print("ay1 : ");
	   ay1=input.nextDouble();
	   System.out.print("ax2 : ");
	   ax2=input.nextDouble();
	   System.out.print("ay2 : ");
	   ay2=input.nextDouble();
	   
	  
	   double a1,a2,b1,b2,e1,e2;
	  
	   a1=y1-y2;
	   b1=(x1-x2)*-1;
	   e1=a1*x1-(b1*y1*-1);
	   
	   a2=ay2-ay1;
	   b2=(ax2-ax1)*-1;
	   e2=a2*ax1-(b2*ay1*-1);
	   
	   System.out.println("a1="+a1);
	   System.out.println("b1="+b1);
	   System.out.println("e1="+e1);
	   System.out.println("a2="+a2);
	   System.out.println("b2="+b2);
	   System.out.println("e2="+e2);
	   
	 // LinearEquation l1= new  LinearEquation(m,1,m1,1, b ,b1);
	  LinearEquation l1= new  LinearEquation(a1, b1, a2 ,b2 , e1, e2);
	     if(l1.isSolvable()){

	    	 System.out.println("x="+l1.getX());
	     	 System.out.println("y="+l1.getY());
	    	 
	    	 
	     }
	     
	     else
	    	System.out.println("tegshitgel Shiidgui");
	     
		}
		
	   
	

	
}
