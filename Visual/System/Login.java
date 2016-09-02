package System;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
	 
	   BufferedImage image;
       JLabel jlName, jlPass;
	   JTextField jtfName;
	   JPasswordField jtfPass;
	   JPanel p1;
	   JButton login;
	   JFrame frame;
	   
	  public Login() throws IOException{
		  
		  frame = new JFrame("login");
		  frame.setVisible(true);
		  frame.setLocationRelativeTo(null);
		  frame.setSize(200, 200);
		  
		  p1= new JPanel();
		  p1.setLayout(new FlowLayout(10,10,10));
		  
		  
		  login= new JButton("login");
	//	  handlingActions();
		  
		  jlName= new JLabel("username :  ");
		  jlPass= new JLabel("password :  ");
		  jtfName= new JTextField(15);
		  jtfPass= new JPasswordField(15);
		  
		  
		  p1.add(jlName);
		  p1.add(jtfName);
		  p1.add(jlPass);
		  p1.add(jtfPass);
		  p1.add(login);
	      
		  frame.add(p1);
	/*	  
		  try{ 
				 // image = javax.imageio.ImageIO.read(new java.net.URL(getClass().getResource("damb.jpg"), "damb.jpg"));
					
				      image = ImageIO.read(getClass().getResource("image/sur2.jpg"));
				 }
				 catch(Exception e){
					 System.out.println("Aldaa");
				 }

		  //this.add(p1, BorderLayout.NORTH); 		  
		*/  
		  
		  login.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				new main();
			}
			  
			  
		  });
	  }
	
	  public void paint(Graphics g){
			
			 if(image!=null ){
			    g.drawImage(image, 0, 0, frame.getWidth(), frame.getHeight(),frame);
			 }
		 }

	  
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
             Login l1= new Login();
	}

}
