package daalgavar10;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import Tses.PopUpMenu;
/*
 uuruu hiih 
 */
public class Bodlogo34_2 extends JFrame{
    JPanel upPanel, downPanel;
    JLabel n1Label, n2Label, rLabel, rResult;
    JTextField n1Field, n2Field;
    JButton add, subtract,multiply, divide;
    JPopupMenu pum;
    JMenu operation;
    Action addAction, subtractAction, multiplyAction, divideAction, exitAction;
    
    
    public Bodlogo34_2(){
    	HandlingActions();
        pum=new JPopupMenu();
        operation= new JMenu("operation");

        pum.add(operation);
        pum.addSeparator();
        pum.add(exitAction);
        
        operation.add(addAction);
        operation.add(subtractAction);
        operation.add(multiplyAction);
        operation.add(divideAction);
        
        
   // 	pum.add(OperationAction);
  //  	pum.addSeparator();
   //     pum.add(exitAction);
    	
    
        
    	upPanel= new JPanel(new FlowLayout());
        downPanel= new JPanel(new FlowLayout()); 
        n1Label = new JLabel("number1");
        n2Label = new JLabel("number2");
        n1Field= new JTextField(8);
        n2Field= new JTextField(8);
        rLabel= new JLabel("result");
        rResult= new JLabel("0");
        
        // huudas 1183
        
        upPanel.add(n1Label);
        upPanel.add(n1Field);
        upPanel.add(n2Label);
        upPanel.add(n2Field);
        upPanel.add(rLabel);
        upPanel.add(rResult);
        
        
        
        
        add= new JButton("Add");
        subtract = new JButton("subtract");
        multiply = new JButton("Multiply");
        divide= new JButton("divide");
        
        add.addActionListener(addAction);
        
        subtract.addActionListener(subtractAction);
        multiply.addActionListener(multiplyAction);
        divide.addActionListener(divideAction);
        
        downPanel.add(add);
        downPanel.add(subtract);
        downPanel.add(multiply);
        downPanel.add(divide);
        
	//	KeyStroke addKey=KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_MASK);
	//	downPanel.registerKeyboardAction(addAction, addKey, downPanel.WHEN_IN_FOCUSED_WINDOW);
	//	upPanel.registerKeyboardAction(addAction, addKey, upPanel.WHEN_IN_FOCUSED_WINDOW);
		
        this.getContentPane().add(upPanel, BorderLayout.CENTER);
        this.getContentPane().add(downPanel, BorderLayout.SOUTH);
        downPanel.setComponentPopupMenu(pum);
        upPanel.setComponentPopupMenu(pum);
    }
    
    private void showPopupMenu(MouseEvent e) {
    	   pum.show(this, e.getX(), e.getY());
    	}
    
    void HandlingActions() {
    	 exitAction= new AbstractAction("exit"){
 			public void actionPerformed(ActionEvent e){
 				System.exit(0);		
 			}
 		  };
 		 
  		  
  		 addAction= new AbstractAction("Add"){
   			public void actionPerformed(ActionEvent e){
   			//	JOptionPane.showMessageDialog(null, "add clicked","Garchig",JOptionPane.INFORMATION_MESSAGE);		
   			    double num1= Double.parseDouble(n1Field.getText());
   			    double num2= Double.parseDouble(n2Field.getText());
   				
   			    rResult.setText(Double.toString(num1+num2));
   			    
   			}
   		  };
   		 
   		 subtractAction= new AbstractAction("Subtract"){
    			public void actionPerformed(ActionEvent e){
    				  double num1= Double.parseDouble(n1Field.getText());
    	   			    double num2= Double.parseDouble(n2Field.getText());
    	   				
    	   			    rResult.setText(Double.toString(num1-num2));		
    			}
    		  };
     	
    	  multiplyAction= new AbstractAction("Multiply"){
    	   			public void actionPerformed(ActionEvent e){
    	   			  double num1= Double.parseDouble(n1Field.getText());
    	   			    double num2= Double.parseDouble(n2Field.getText());
    	   				
    	   			    rResult.setText(Double.toString(num1*num2));
    	   			}
    	   		  };
    	  
    	   divideAction= new AbstractAction("divide"){
    	    			public void actionPerformed(ActionEvent e){
    	    				  double num1= Double.parseDouble(n1Field.getText());
    	    	   			    double num2= Double.parseDouble(n2Field.getText());
    	    	   				
    	    	   			    rResult.setText(Double.toString(num1/num2));		
    	    			}
    	    		  }; 		  
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Bodlogo34_2 frame= new Bodlogo34_2();
		frame.setTitle("exercises 34_2");
		frame.setSize(500,200);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

}
