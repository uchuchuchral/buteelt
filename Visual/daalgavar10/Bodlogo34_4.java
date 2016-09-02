package daalgavar10;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class Bodlogo34_4 extends JFrame{
 // huudas 1184
	JMenu flags;
	JMenuBar menubar;
	JToolBar toolbar;
	AbstractAction caAction, usAction;
	Image caImage,usImage;
	ImageViewer1 panel1;
	//JPanel lpanel;
	JLabel l1,l2;
	
	public Bodlogo34_4(){
		handlingActions();
		flags= new JMenu("flags");
		toolbar= new JToolBar();
		menubar= new JMenuBar();
		menubar.add(flags);
		
		flags.add(usAction);
		flags.add(caAction);
		
		toolbar.add(usAction);
		toolbar.add(caAction);
		toolbar.setBorderPainted(true);  // hureetei bhaar
		toolbar.setOrientation(toolbar.VERTICAL);
		
		
		caImage= new ImageIcon(getClass().getResource("image/CAfixed.gif")).getImage();
		usImage= new ImageIcon(getClass().getResource("image/USfixed.gif")).getImage();
		
		panel1= new ImageViewer1();
		panel1.setXcoordinate(170);
		panel1.setYcoordinate(70);
		panel1.setStretched(false);
		
       // l1= new JLabel();
        
		
		// huudas 520 imageViewer class 
		this.add(panel1, BorderLayout.CENTER);
		this.setJMenuBar(menubar);
		this.add(toolbar,BorderLayout.EAST);
	
		
	}
	
	
	void handlingActions(){
	    caAction= new AbstractAction("CA",new ImageIcon(getClass().getResource("image/CAfixed.gif"))){
				public void actionPerformed(ActionEvent e){
				//	JOptionPane.showMessageDialog(null, "you chosed CA","CA flags",JOptionPane.INFORMATION_MESSAGE);	
				    panel1.setImage(new ImageIcon(getClass().getResource("image/CAfixed.gif")).getImage());
				    panel1.setDescription("Select the CA flag to display");
				    repaint();
				}	
			};
	   
	     usAction= new AbstractAction("US",new ImageIcon(getClass().getResource("image/USfixed.gif"))){
					public void actionPerformed(ActionEvent e){
					//	JOptionPane.showMessageDialog(null, "you chosed US","US flags",JOptionPane.INFORMATION_MESSAGE);	
					    panel1.setImage(new ImageIcon(getClass().getResource("image/USfixed.gif")).getImage());
					    panel1.setDescription("Select the US flag to display");
					    repaint();
					}	
				};	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bodlogo34_4 frame= new Bodlogo34_4();
			frame.setTitle("exercises 34_4");
			frame.setSize(400,200);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

}
