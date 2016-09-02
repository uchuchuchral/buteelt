package geriinDaalgavruud;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class LinearEquationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input= new Scanner(System.in);
     System.out.println();
    
     double a,b,c,d,e,f;
     
     JOptionPane.showMessageDialog(null,"Shuluunii koeffitsientuudiig oruul :");
     a=Double.parseDouble(JOptionPane.showInputDialog("a"));
     b=Double.parseDouble(JOptionPane.showInputDialog("b"));
     c=Double.parseDouble(JOptionPane.showInputDialog("c"));
     d=Double.parseDouble(JOptionPane.showInputDialog("d"));
     e=Double.parseDouble(JOptionPane.showInputDialog("e"));
     f=Double.parseDouble(JOptionPane.showInputDialog("f"));
     
     LinearEquation line = new LinearEquation(a,b,c,d,e,f);
     if(line.isSolvable()){

    	 JOptionPane.showMessageDialog(null, "x="+line.getX());
     	 JOptionPane.showMessageDialog(null, "y="+line.getY());
    	 
    	 
     }
     
     else
    	 JOptionPane.showMessageDialog(null,"tegshitgel Shiidgui");
     
	}
	
	
}
