package hicheelJava2;

import javax.swing.JOptionPane;

public class Bodlogo6Method {
    String name; 
	static int hoursWorked;
	static double hourlyPay , federalTax, stateTax;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String output="";
    String name=inputName();
    output+="Ажилтны нэр :"+name+"\n";
    
    hoursWorked=inputHours();
	output+="Aжилласан цаг :"+hoursWorked+"\n";
	
    hourlyPay=inputPay();
    output+="Цагийн хөлс ($) :"+hourlyPay+"\n";
    output+="Нийт цалин"+hourlyPay*10+"\n";
    
    federalTax=inputFederal();
    stateTax=inputState();
    output+="Суутгалууд : \n";
    output+="\tХолбооны татвар ("+federalTax+"%):  $"+(((hourlyPay*10)/100)*federalTax)+"\n";
	output+="\tУлсын татвар ("+stateTax+"%):  $ 2"+(((hourlyPay*10)/100)*stateTax)+"\n";
	output+="\tНийт татвар : $"+((((hourlyPay*10)/100)*stateTax)+(((hourlyPay*10)/100)*federalTax))+"\n";
	output+="Авах цалин : $"+((hourlyPay*10)-((((hourlyPay*10)/100)*stateTax)+(((hourlyPay*10)/100)*federalTax)));
	
	JOptionPane.showMessageDialog(null, output);
	}
	
	 static String inputName(){
		 String name=JOptionPane.showInputDialog("Ажилтны нэр  :");
		 return name;
	 }
	 static int inputHours(){
		 String hours=JOptionPane.showInputDialog("Aжилласан цаг :");
		 return Integer.parseInt(hours);
	 }
	 static double inputPay(){
		 String time=JOptionPane.showInputDialog("Цагийн хөлс ($):");
		 return Double.parseDouble(time);
	 }
	 static double inputFederal(){
		 String hours=JOptionPane.showInputDialog("Холбооны татвар (%) :");
		 return Double.parseDouble(hours);
	 }
	 
	 static double inputState(){
		 String hours=JOptionPane.showInputDialog("Улсын татвар (%) :");
		 return Double.parseDouble(hours);
	 }
     

}
