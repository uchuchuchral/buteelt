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
import javax.swing.JTextField;

public class Tohirgoo2 {
	JFrame frame;  
	 JButton solih , butsah;
	 JPanel pUp, pDown;
     JLabel label1, label2;
     JTextField f1, f2;
     connectSQLDiary csd1;
     
     public Tohirgoo2() throws SQLException{
    	 frame = new JFrame();
		 frame.setTitle("Settings");
		 frame.setVisible(true);
		 frame.setLocationRelativeTo(null);
		 frame.setSize(300, 130);
		 frame.setLayout(new BorderLayout());
		 
		 solih= new JButton("Солих");
		 butsah= new JButton("Буцах");
		 
		 label1= new JLabel("old pagePieceText");
		 label2= new JLabel("new pagePieceText");
		 f1= new JTextField(8);
		 f2= new JTextField(8);
		 
		 csd1= new connectSQLDiary();
		 f1.setText(csd1.getPagePieceTemdeglel());
		 
		 pUp= new JPanel(new GridLayout(2,2));
		 pDown= new JPanel(new GridLayout(1,2));
		 
		 pUp.add(label1); pUp.add(f1);
		 pUp.add(label2); pUp.add(f2);
		 pDown.add(solih); pDown.add(butsah);
		 
		 frame.add(pUp,BorderLayout.CENTER);
		 frame.add(pDown, BorderLayout.SOUTH);
		 
		 solih.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					 try {
					//	 System.out.println("label f1: "+f1.getText());
				   // 	 System.out.println("label cs: "+csd1.getPass());
				   // 	 System.out.println("label f2: "+f2.getText());
				    	 
						
					     
						 csd1.setPagePieceTemdeglel(f2.getText());	
						 JOptionPane.showMessageDialog(frame, "Aмжилттай солигдлоо");
						 frame.setVisible(false);
						 new Tohirgoo();
						
						 
					} catch (HeadlessException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				 
			 });
		 
		 butsah.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					frame.setVisible(false);
					new Tohirgoo();
				}
				 
			 });
		 
     }
}
