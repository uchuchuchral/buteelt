package Tses;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class PopUpMenu extends JFrame{
	JPopupMenu pum;
	JMenuItem jmiOpen, jmiNew, jmiPrint, jmiExit;
	JTextArea textArea;
	JMenuBar menuBar;
	JToolBar toolBar;
	JMenu fileMenu;
	Action exitAction, newAction, openAction,printAction;


	public PopUpMenu(String title){
		super(title); 
		  HandlingActions();


		pum = new JPopupMenu();
		
	    pum.add(newAction);
	    pum.add(openAction);
	    pum.addSeparator();
	    pum.add(printAction);
	    pum.addSeparator();
	    pum.add(exitAction);
			 

		textArea= new JTextArea();
		
		
		toolBar= new JToolBar();
		toolBar.setBorderPainted(true);
		toolBar.add(newAction);
	    toolBar.add(openAction);
	    toolBar.add(printAction);
	    toolBar.add(exitAction);
		toolBar.setFloatable(false);
	//	toolBar.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		toolBar.setBorder(BorderFactory.createBevelBorder(1));
		
		
	

		menuBar= new JMenuBar();
		fileMenu= new JMenu("file");  // file nertei menu uusgej bn 
		menuBar.add(fileMenu);
		
		//fileMenu.add(jmiExit);

		textArea.setComponentPopupMenu(pum);
		KeyStroke exitKey=KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_MASK);
		textArea.registerKeyboardAction(exitAction, exitKey, textArea.WHEN_IN_FOCUSED_WINDOW);
		
		KeyStroke newKey=KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK);
		textArea.registerKeyboardAction(newAction, newKey, textArea.WHEN_IN_FOCUSED_WINDOW);
		
		KeyStroke openKey=KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_MASK);
		textArea.registerKeyboardAction(openAction, openKey, textArea.WHEN_IN_FOCUSED_WINDOW);
		
		KeyStroke printKey=KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_MASK);
		textArea.registerKeyboardAction(printAction, printKey, textArea.WHEN_IN_FOCUSED_WINDOW);
		
		
		
		this.getContentPane().add(textArea, BorderLayout.CENTER);
		this.getContentPane().add(toolBar, BorderLayout.NORTH);
		// this.getContentPane().add(menuBar); // uuriin gesen bairtai 
		setJMenuBar(menuBar);
		
	    fileMenu.add(newAction);
        fileMenu.add(openAction);
        fileMenu.addSeparator();
        fileMenu.add(printAction);
        fileMenu.addSeparator();
        fileMenu.add(exitAction);
    
       

	}


	void HandlingActions() {
		
		   
		    exitAction= new AbstractAction("exit",new ImageIcon(getClass().getResource("image/exit1.png"))){
			public void actionPerformed(ActionEvent e){
				System.exit(0);		
			}
			
			
			
		};
         

		
		
		 newAction= new AbstractAction("new",new ImageIcon(getClass().getResource("image/new1.jpg"))){
				public void actionPerformed(ActionEvent e){
					JOptionPane.showMessageDialog(null, "you chosed new menu item", "new menu",JOptionPane.INFORMATION_MESSAGE);	
				}
				
				
				
			};
			
			 openAction= new AbstractAction("open",new ImageIcon(getClass().getResource("image/open1.png"))){
					public void actionPerformed(ActionEvent e){
						JOptionPane.showMessageDialog(null,"you chosed open menu item", "open menu",JOptionPane.INFORMATION_MESSAGE);			
					}
					
					
					
				};
		
			printAction= new AbstractAction("print",new ImageIcon(getClass().getResource("image/print1.png"))){
						public void actionPerformed(ActionEvent e){
							JOptionPane.showMessageDialog(null,"you chosed print menu item", "print menu",JOptionPane.INFORMATION_MESSAGE);		
						}
						
						
						
					};			


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PopUpMenu frame= new PopUpMenu("PopUpMenu Demo");
		frame.setTitle("This is PopUpMenu demo");
		frame.setSize(600,400);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

}
