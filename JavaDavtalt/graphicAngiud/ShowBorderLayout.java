package graphicAngiud;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ShowBorderLayout extends JFrame{
     
	public ShowBorderLayout(){
		BorderLayout bo= new BorderLayout();
		setLayout(bo);
		add(new JButton("North"), BorderLayout.NORTH); // north buyu hoid bairlal deer north towchiig nemlee
	    add(new JButton("East"), BorderLayout.EAST);
	    add(new JButton("West"), BorderLayout.WEST);
	    add(new JButton("South"), BorderLayout.SOUTH);
	    add(new JButton("Center"), BorderLayout.CENTER);
	    
	   }
	
	public static void main(String[] args) {
	 	// TODO Auto-generated method stub
      ShowBorderLayout bo= new ShowBorderLayout();
      bo.setTitle("BorderLayout");
      bo.setSize(300,300);
      bo.setVisible(true);
      bo.setLocationRelativeTo(null);
	}

}
