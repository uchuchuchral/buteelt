package clientServerDaalgavar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClientDaalgavar1 extends JFrame{
	  List<Student> list1= new ArrayList<Student>();
      ObjectOutputStream output1;
      ObjectInputStream  input1;
      JPanel []panel= new JPanel[5];
      JPanel panel1= new JPanel();
      JButton []button = new JButton[4]; // 
	  JLabel label= new JLabel("Оюутан Бүртгэл ");
      Socket socket;
	  
	 public ClientDaalgavar1(){
      Display();	   	 
	 }
	 
	 public void Display(){
		 panel1.setLayout(new GridLayout(5,1));
		 
		 this.setTitle("Client Student");
		 this.setSize(400,400);
		 this.setVisible(true);
		 this.setLocationRelativeTo(null);
		 this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
	  	 panel1.add(label);
	  	 button[0]= new JButton("Бүртгэл нэмэх ");
	  	 button[1]=new JButton("Бүртгэл хасах");
	  	 button[2]=new JButton("Бүртгэл засах");
	  	 button[3]=new JButton("Бүртгэл үзэх");
	  	 
	  	 for(int i=0; i<button.length; i++){
	  		 panel1.add(button[i]);
	  		// System.out.println("nemsen");
	  	 }
	  	 
	  	 add(panel1, BorderLayout.CENTER);
	  	 button[0].addActionListener(new ButtonListener());
	 }
	 

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new ClientDaalgavar1();
	}

	
	public class ButtonListener implements ActionListener{
            JPanel panel2= new JPanel();
		    JButton button= new JButton("Оруулах");
            
		public void actionPerformed(ActionEvent e) {
		    
			panel2.setLayout(new BorderLayout());
			panel2.add(button,BorderLayout.CENTER);
			
			System.out.println("Orj irsen");
			add(panel2,BorderLayout.CENTER);
		}
		
		
	}
}
