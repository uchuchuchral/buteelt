package layoutheseg;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GridBagLayout1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    JFrame frame= new JFrame("GridBag");
	    frame.setVisible(true);
	    frame.setSize(500, 500);
	    frame.setLocationRelativeTo(null);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    
	    
	    JButton saveAs= new JButton("Save as");
	    JButton ok= new JButton("ok");
	    JButton exit= new JButton("exit");
	    JTextField jt= new JTextField("Toog oruul");
	    JTextArea ar1= new JTextArea(12,40);
	    
	    
	    JPanel panel1= new JPanel();
	    GridBagLayout l1= new GridBagLayout();
	    panel1.setLayout(l1);
	    panel1.setSize(500, 500);
	    
	    GridBagConstraints c= new GridBagConstraints();
	    
	    c.fill=GridBagConstraints.HORIZONTAL; // hevtee bdalaar duurgeheer 
	    c.weightx=0.5;
	    c.gridx=0;// 0 deh bagana 
	    c.gridy=0;// 0 deh mur 
	    c.gridheight=1;
	    c.ipady=40; //  deeshee her undur towch bhiig tohiruulah funkts
	    c.gridwidth=3; // baganii daguu 3 nud
	    
	    
	    panel1.add(ar1, c);
	    
	    c.fill=GridBagConstraints.HORIZONTAL;
	    c.gridx=0;
	    c.gridy=1;
	    c.ipady=10;
	    c.gridheight=1;
	    c.gridwidth=1;
	    c.anchor=c.PAGE_START;
	    
	    
	    panel1.add(saveAs,c);
	    
	    c.weightx=1;
	    c.fill=GridBagConstraints.HORIZONTAL;
	    c.gridx=1;
	    c.gridy=1;
	    c.gridheight=1;
	    c.gridwidth=1;
	     
	    
	    panel1.add(jt,c);

	    
	  
	    
	    
	    
	    frame.setLayout(new BorderLayout());
	    frame.add(panel1,BorderLayout.CENTER);
	   
	    
	    
	} 

}
