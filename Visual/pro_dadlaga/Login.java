package pro_dadlaga;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.toedter.calendar.JCalendar;

public class Login {
      JButton login;
      JLabel l1;
      JPasswordField f1;
      JFrame main;
      connectSQLDiary csd1;
      
      public Login(){
    	  main= new JFrame();
    	  main.setTitle("Diary");
    	  main.setVisible(true);
    	  main.setLocationRelativeTo(null);
    	  main.setSize(300, 100);
    	  main.setLayout(new FlowLayout());
    	  
    	  csd1= new connectSQLDiary();
  
    	
    	  
    	  l1= new JLabel("Password:");
    	  f1= new JPasswordField(8);
    	  login= new JButton("login");
    	  // huudas 419 
    
    	  
    	  main.add(l1);  
    	
    	  main.add(f1);
    	  
    	  main.add(login);
    	  
    	  login.addActionListener(new ActionListener(){ // password unen esehiig shalgana 

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			    try {
			    	   System.out.println("label : "+f1.getText());
			    	   System.out.println("label : "+csd1.getPass());
			    	   
					 if(f1.getText().equals(csd1.getPass())){
				    	
						main.setVisible(false);
						new Menu();
					 }
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
    		  
    	  });
      }
	  
      
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new Login();
	}

}
