package appletAndGame;

import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CarOption extends JPanel{
      private JLabel []j1= new JLabel[3];
      private JTextField [] t1= new JTextField[3];
      int xcoor, ycoor;
      
      
	 public CarOption(){
		 setLayout(new GridLayout(2,3));
		 
		
    	 j1[0]=new JLabel("M1:");
    	 j1[1]=new JLabel("M2:");
    	 j1[2]=new JLabel("M3:");
    	 
    	 t1[0]=new JTextField(4);
    	 t1[1]=new JTextField(4);
    	 t1[2]=new JTextField(4);
		 
    	
    	 for(int i=0; i<=2; i++){
    		 add(j1[i]);
    		 
    	 }
    	 for(int i=0; i<=2; i++){
    		 add(t1[i]);
    		 
    	 }
      }
      
      public void paintComponent(Graphics g){
    	  super.paintComponent(g);
    	    
      }
	 
}
