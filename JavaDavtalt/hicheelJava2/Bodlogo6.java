package hicheelJava2;

import java.util.Scanner;

import javax.swing.JOptionPane;
/*2.11 sanhuugiin programm


*/
public class Bodlogo6 {
   private String name , output;
   private int hoursWorked ;
   private  double hourPay, federalTax, stateTax ;
   private double GrossPay, Fwith, Swith;
   
   
   
   public Bodlogo6(){
	    name="";
	    hoursWorked=0;
	    hourPay=0.0;
	    federalTax=0.0;
	    stateTax=0.0;
	    output="";
	    
   }
   
   public void inputValue(){
	  name=JOptionPane.showInputDialog("Ажилтны нэр : ");
	  hoursWorked=Integer.parseInt(JOptionPane.showInputDialog("Ажилласан цаг : "));
	  
	  
	  hourPay=Double.parseDouble(JOptionPane.showInputDialog("Цагийн хөлс ($) :"));
	  federalTax=Double.parseDouble(JOptionPane.showInputDialog("Холбооны татвар (%) :"));
	  
	  stateTax=Double.parseDouble(JOptionPane.showInputDialog("Улсын татвар (%) :"));
	  
   }
   
   public void ShowValue(){
	   output+="Ажилтны нэр : "+name+"\n";
	   output+="Ажилласан цаг : "+hoursWorked+"\n";
	   output+="Цагийн хөлс ($):"+hourPay+"\n";
	   output+="Нийт цалин : $"+GrossPay+"\n";
	   output+="Суутгалууд :"+"\n"+"\tХолбооны татвар ("+federalTax+")  $"+Fwith+"\n";
	   output+="\tУлсын татвар ("+stateTax+") : $"+Swith+"\n";
	   output+="\tНийт татвар : $"+(Swith+Fwith)+"\n";
	   output+="Авах цалин : $"+(GrossPay-(Swith+Fwith));
	   JOptionPane.showMessageDialog(null, output);
	   
   }
   
   public void calculate(){
	   GrossPay=hoursWorked*hourPay;
	   Fwith=(GrossPay/100)*federalTax;
	   Swith=(GrossPay/100)*stateTax;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bodlogo6 bo= new Bodlogo6();
		bo.inputValue();
		bo.calculate();
		bo.ShowValue();
	}

	


}

