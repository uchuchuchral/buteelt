package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel1 extends JFrame{
	 JLabel lb, lb1, lb2;
	 JCheckBox chkCenter, chkBold, chkItalic;
	 JComboBox cbName, cbSize;
	 JPanel centerPanel, southPanel, north1Panel, north2Panel, northPanel;
	 
	 
	 public Panel1(){
		 lb= new JLabel("Java is Cool");
		 lb1= new JLabel("Font Name");
		 lb2= new JLabel("Font Size");
		 

	      chkCenter= new JCheckBox("Centered");
	      chkBold= new JCheckBox("Bold");
	      chkItalic= new JCheckBox("Italic");
	      
	      cbName= new JComboBox(new Object[]{"SansSerif"});
	      cbSize= new JComboBox(new Object[]{18});
	      
	      centerPanel= new JPanel(new BorderLayout());
	      centerPanel.add(lb, BorderLayout.CENTER);
	      lb.setHorizontalAlignment(NORMAL);
	      centerPanel.setBackground(Color.gray);
	      
	      
	      southPanel= new JPanel(new FlowLayout( FlowLayout.CENTER));
	      southPanel.add(chkCenter);
	      southPanel.add(chkBold);
	      southPanel.add(chkItalic);
	      
	      
	      north1Panel= new JPanel(new BorderLayout());
	      north1Panel.add(lb1,BorderLayout.WEST);
	      north1Panel.add(cbName, BorderLayout.CENTER);
	      
	      north2Panel= new JPanel(new BorderLayout());
	      north2Panel.add(lb2,BorderLayout.WEST);
	      north2Panel.add(cbSize, BorderLayout.CENTER);
	      
	      northPanel= new JPanel(new BorderLayout());
	      northPanel.add(north2Panel,BorderLayout.EAST);
	      northPanel.add(north1Panel, BorderLayout.CENTER);
	      //north1Panel.setBorder(BorderLayout.WEST);
	      

	      setLayout(new BorderLayout());
	      
	      add(centerPanel,BorderLayout.CENTER);
	      add(southPanel,BorderLayout.SOUTH);
	      add(northPanel,BorderLayout.NORTH);
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Panel1 tfd= new Panel1();
        tfd.setTitle("Exercise17_8");
        tfd.setSize(400,200);
        tfd.setLocationRelativeTo(null);
        tfd.setVisible(true);
        tfd.setDefaultCloseOperation(tfd.EXIT_ON_CLOSE);
        
	}

}
