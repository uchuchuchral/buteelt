package graphicAngiud;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestPanels extends JFrame{
     
	public TestPanels(){
	 
		JPanel p1= new JPanel();
	    p1.setLayout(new GridLayout(4,3));
	    
	    for(int i=1; i<=9; i++){
	    	p1.add(new JButton(""+i));
	    }
	    p1.add(new JButton(""+0));
	    p1.add(new JButton("Start"));
	    p1.add(new JButton("Stop"));
	    
	    JPanel p2= new JPanel(new BorderLayout());
	    
	    p2.add(new JTextField("time to displayed here "), BorderLayout.NORTH);
	    p2.add(p1,BorderLayout.CENTER);
	    
	    /// odoo paneluudaa frame dee nemii 
	    add(p2,BorderLayout.EAST);
	    add(new JButton("Food to be placed here"),BorderLayout.CENTER);
	    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TestPanels t1= new TestPanels();
       t1.setTitle("Panels");
       t1.setSize(400,250);
       t1.setLocationRelativeTo(null);
       t1.setVisible(true);
       t1.setDefaultCloseOperation(t1.EXIT_ON_CLOSE);
	}

}
