package System;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class main {
     JFrame frame;  
	 JButton b1 , b2, b3, b4 , b5;
	 JPanel pLeft, pRight;
     JLabel label;
	 
	public main(){
		 frame = new JFrame();
		 frame.setTitle("Main");
		 frame.setVisible(true);
		 frame.setLocationRelativeTo(null);
		 frame.setSize(700, 500);
		 frame.setLayout(new BorderLayout());
		 
		 b1= new JButton("Èðö");
		 b2= new JButton("Daalgavar oruulah");
		 b3= new JButton("medkuee");
		 b4= new JButton("porn uzeh");
		 
		 pLeft= new JPanel();
		 pLeft.setLayout(new GridLayout(4,1));
		 pLeft.add(b1); pLeft.add(b2); pLeft.add(b3);  pLeft.add(b4);
		 
		 
		 label = new JLabel();
		 label.setIcon(new ImageIcon(this.getClass().getResource("image/sur2.jpg")));
		 
		 
		 pRight= new JPanel();
		 
		 
		 frame.add(pLeft, BorderLayout.WEST);
		 frame.add(label, BorderLayout.CENTER);
		 
		 b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				new irts();
			}
			 
		 });
	}
	


}
