package pro_dadlaga;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu {
     JFrame frame;  
	 JButton bichih , unshih, garah, tohirgoo, hailt;
	 JPanel pUp, pDown;
     JLabel label;
	 
	public Menu(){
		 frame = new JFrame();
		 frame.setTitle("Main");
		 frame.setVisible(true);
		 frame.setLocationRelativeTo(null);
		 frame.setSize(700, 500);
		 frame.setLayout(new BorderLayout());
		 
		 bichih= new JButton("Тэмдэглэл бичих");
		 unshih= new JButton("Тэмдэглэл унших");
		 garah= new JButton("Гарах");
		 tohirgoo= new JButton("Тохиргоо");
		 hailt= new JButton("Хайлт");
		   
		 pUp= new JPanel();
		 pUp.setLayout(new GridLayout(1,5));
		 
		 
		 pUp.add(bichih); pUp.add(unshih);  pUp.add(tohirgoo);  pUp.add(hailt); pUp.add(garah);
		 
		 
		 label = new JLabel();
		 label.setIcon(new ImageIcon(this.getClass().getResource("image/note.jpg")));
		 
		 
		 pDown= new JPanel();
		 
		 
		 frame.add(pUp, BorderLayout.NORTH);
		 frame.add(label, BorderLayout.CENTER);
		 
		 bichih.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				new Bichih();
			}
			 
		 });
		 
		 unshih.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					frame.setVisible(false);
					try {
						new Unshih();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				 
			 });
		 
		 tohirgoo.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					frame.setVisible(false);
					new Tohirgoo();
				}
				 
			 });
		 
		 hailt.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					frame.setVisible(false);
					new hailt();
				}
				 
			 });
		 
		 garah.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.exit(0);
					
				}
				 
			 });
		 
		 
	}
	


}
