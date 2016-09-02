package System;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class loginPanel extends JPanel{
	
       BufferedImage image;
       URL url;
       JLabel jlName, jlPass;
 	   JTextField jtfName;
 	   JPasswordField jtfPass;
 	   JPanel p1;
 	   JButton login;
 	   int x=0;
 	 //  CardLayout card1;
       
	 public loginPanel() throws MalformedURLException, IOException, IllegalArgumentException, NullPointerException{
		//  image = new ImageIcon(this.getClass().getResource("image/damb.jpg"));
    //      this.setLayout(new BorderLayout());
		  
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
		  this.add(p1);
		  
		 try{ 
		 // image = javax.imageio.ImageIO.read(new java.net.URL(getClass().getResource("damb.jpg"), "damb.jpg"));
			
		      image = ImageIO.read(getClass().getResource("image/sur2.jpg"));
		 }
		 catch(Exception e){
			 System.out.println("Aldaa");
		 }
		 
	 }
	
	 
	  
	 
	 public void paint(Graphics g){
		
		 if(image!=null ){
		    g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(),this);
		    x++;
		 }
	 }
	  
}
