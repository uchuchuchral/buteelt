package geriinDaalgavruud;

import hicheelJava2.Bodlogo6;

import javax.swing.JOptionPane;

public class Daalgavar1_Bodlogo2_11 {
	   private String name , output;
	   private int hoursWorked ;
	   private  double hourPay, federalTax, stateTax ;
	   private double GrossPay, Fwith, Swith;
	   
	   
	   
	   public Daalgavar1_Bodlogo2_11(){
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
			Daalgavar1_Bodlogo2_11 bo= new Daalgavar1_Bodlogo2_11();
			bo.inputValue();
			bo.calculate();
			bo.ShowValue();
			
		}

		


	}
