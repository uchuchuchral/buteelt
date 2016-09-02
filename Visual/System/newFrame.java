package System;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class newFrame {
          JButton fuck;
          JFrame frame;
          
	public newFrame(){
		  frame= new JFrame();
		  frame.setTitle("Hariltsaa");
		  frame.setVisible(true);
		  frame.setLocationRelativeTo(null);
		  frame.setSize(800, 800);
		  
		  fuck= new JButton("fuck");
		  frame.add(fuck);
		  fuck.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				// TODO Auto-generated method stub
				frame.setVisible(false);
				new newFrame2();
				
			}
			  
		  });
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               newFrame n= new newFrame();
	}

}
