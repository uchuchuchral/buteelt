package pro_dadlaga;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class Tohirgoo {
	JFrame frame;  
	 JButton tohirgoo1, tohirgoo2, butsah;
	 JPanel p1;
     connectSQLDiary csd1;
     
     public Tohirgoo(){
    	 frame = new JFrame();
		 frame.setTitle("Settings");
		 frame.setVisible(true);
		 frame.setLocationRelativeTo(null);
		 frame.setSize(300, 130);
		 frame.setLayout(new BorderLayout());
		 
		 tohirgoo1= new JButton("Нууц үг солих");
		 tohirgoo2= new JButton("1 нүүрэн дэх жагсаалтын тоо тохируулах");
		 butsah= new JButton("Буцах");
		 
		
		 
		 csd1= new connectSQLDiary();
		 p1= new JPanel(new GridLayout(3,1));
		 p1.add(tohirgoo1); p1.add(tohirgoo2); p1.add(butsah);
		  
		 frame.add(p1,BorderLayout.CENTER);
		 
		 
		 
				
		 butsah.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					frame.setVisible(false);
					new Menu();
				}
				 
			 });
		 
		 tohirgoo1.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					frame.setVisible(false);
					new Tohirgoo1();
				}
				 
			 });
		 
		 tohirgoo2.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					frame.setVisible(false);
					try {
						new Tohirgoo2();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				 
			 });
		 
     }
     
     
}
