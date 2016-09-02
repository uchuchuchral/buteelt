package daalgavruud;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calc extends JFrame{
     JPanel p,p1,p2,p3,g1, g2;
     JTextField jtf;
     JButton []b= new JButton[23];
     
     public Calc(){
    	 createButton();
    	 p= new JPanel();
    	 p1= new JPanel();
    	 p2= new JPanel();
    	 p3=new JPanel();
    	 g1= new JPanel();
    	 g2= new JPanel();
    	 
    	 p2.setLayout(new GridLayout(2,1));
    	 
    	 jtf= new JTextField("0");
    	 p1.setLayout(new BorderLayout());
    	 
    	 p1.add(jtf, BorderLayout.CENTER);
    	 
    	 g1.setLayout(new GridLayout(3,5));
    	 for(int i=0; i<15; i++){
    		 g1.add(b[i]);
    	 }
    	 
    	 g2.setLayout(new GridLayout(2,3));
    	 for(int i=15; i<22; i++){
    		 g2.add(b[i]);
    	 }
    	 
    	 p3.setLayout(new BorderLayout());
    	 p3.add(g2, BorderLayout.CENTER);
    	 p3.add(b[22],BorderLayout.WEST);
    	 
    	 p2.add(g1);
    	 p2.add(p3);
    	 
    	 
    	 
    	 setLayout(new BorderLayout());
    	 add(p1,BorderLayout.NORTH);
    	 add(p2,BorderLayout.CENTER);
     }
       
     public void createButton(){
    	 b[0]= new JButton("0");
    	 b[1]= new JButton("1");
    	 b[2]= new JButton("2");
    	 b[3]= new JButton("3");
    	 b[4]= new JButton("4");
    	 b[5]= new JButton("5");
    	 b[6]= new JButton("6");
    	 b[7]= new JButton("7");
    	 b[8]= new JButton("8");
    	 b[9]= new JButton("9");
    	 b[10]= new JButton("&#8592");
    	 b[11]= new JButton("CE");
    	 b[12]= new JButton("C");
    	 b[13]= new JButton("&#177");
    	 b[14]= new JButton("&#8730");
    	 b[15]= new JButton("+");
    	 b[16]= new JButton("-");
    	 b[17]= new JButton("/");
    	 b[18]= new JButton("*");
    	 b[19]= new JButton("=");
    	 b[20]= new JButton("M");
    	 b[21]= new JButton("%");
    	 b[22]= new JButton(".");
    	
    	 
    	 
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Calc b1= new Calc();
          b1.setSize(300, 350);
          b1.setLocationRelativeTo(null);
          b1.setVisible(true);
          b1.setTitle("Grapes");
          b1.setDefaultCloseOperation(b1.EXIT_ON_CLOSE);
          
	}

}
