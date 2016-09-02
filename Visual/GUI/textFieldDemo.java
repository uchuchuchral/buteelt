package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class textFieldDemo extends JFrame{
    JLabel lb, lbPanel;
    JTextField jtf;
    JRadioButton rdRed, rdGreen, rdBlue;
	JPanel leftPanel, centerPanel, rightPanel, northPanel, southPanel;
    JCheckBox chkCenter, chkBold, chkItalic;
	JButton btnLeft, btnRight;
    
	public textFieldDemo(){
	
		  lb= new JLabel("Enter a new message ");
	      lbPanel= new JLabel("Java Programming");
	      jtf= new JTextField("Java programming ");
	      jtf.setHorizontalAlignment(4);
	      
	      ButtonGroup bg= new ButtonGroup(); // group uusgeh songohod zuwhun neg ni songogdono 
	      rdRed= new JRadioButton("Red");
	      rdGreen= new JRadioButton("Green");
	      rdBlue= new JRadioButton("Blue");
	      bg.add(rdRed);
	      bg.add(rdGreen);
	      bg.add(rdBlue);
	      
	      
	      leftPanel= new JPanel(new GridLayout(3,1));
	      leftPanel.add(rdRed);
	      leftPanel.add(rdGreen);
	      leftPanel.add(rdBlue);
	      
	      centerPanel= new JPanel(new BorderLayout());
	      centerPanel.setBackground(Color.YELLOW);
	      centerPanel.add(lbPanel, BorderLayout.CENTER);
	      lbPanel.setHorizontalAlignment(NORMAL);
	      
	      rightPanel= new JPanel(new GridLayout(3,1));
	      
	      chkCenter= new JCheckBox("Centered");
	      chkBold= new JCheckBox("Bold");
	      chkItalic= new JCheckBox("Italic");
	      rightPanel.add(chkCenter);
	      rightPanel.add(chkBold);
	      rightPanel.add(chkItalic);
	      
	      
	      northPanel= new JPanel(new BorderLayout());
	      northPanel.add(lb,BorderLayout.WEST);
	      northPanel.add(jtf, BorderLayout.CENTER);
	      
	      
	      southPanel= new JPanel(new FlowLayout( FlowLayout.CENTER));
	      btnLeft= new JButton("Left");
	      btnRight= new JButton("Right");
	      southPanel.add(btnLeft);
	      southPanel.add(btnRight);
	      
	     
	     
	      setLayout(new BorderLayout());
	      
	      add(centerPanel,BorderLayout.CENTER);
	      add(northPanel,BorderLayout.NORTH);
	      add(leftPanel,BorderLayout.WEST);
	      add(southPanel,BorderLayout.SOUTH);
	      add(rightPanel,BorderLayout.EAST);
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        textFieldDemo tfd= new textFieldDemo();
        tfd.setTitle("TextField");
        tfd.setSize(400,200);
        tfd.setLocationRelativeTo(null);
        tfd.setVisible(true);
        tfd.setDefaultCloseOperation(tfd.EXIT_ON_CLOSE);
	}

}
