package appletAndGame;

import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JOptionPane;


public class GaraasUtgaAwahApplet extends JApplet{  // JApplet heregleh bol udamshuulah yostoi
     double sum;
     
     public void init(){
    	 String firstNumber;  //hereglegchiin oruulah ehnii too
    	 String secondNumber;
    	 
    	 double number1; // ehnii toog hadgalna
    	 double number2; //2dahi toog hadgalna
    	 
    	 firstNumber= JOptionPane.showInputDialog("Ehnii toog oruul");
    	 secondNumber= JOptionPane.showInputDialog("2Dahi toog oruul");
    	 
    	 // temdegt muriig too ruu hurvuuleh 
    	 
    	 number1=Double.parseDouble(firstNumber);
    	 number2=Double.parseDouble(secondNumber); 
    	 
    	 sum=number1+number2;
    	 
     }
	
     public void paint(Graphics g){
    	
    	 super.paint( g );
    	
    	g.drawRect(15, 10, 270, 20);
    	
    	g.drawString("sum = "+sum, 25, 25);
    	 
        g.drawRect(15, 40, 60, 40);    	
     }
}
