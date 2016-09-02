package graphicAngiud;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShowGridLayout extends JFrame{
    public ShowGridLayout(){
     
    GridLayout l1= new GridLayout(3,2, 1,1 ); // 2 mur 3bagana 5,5 dahi bairshil deer 	
    setLayout(l1);
    
    add(new JLabel ("First name "));
    add(new JTextField(8));
    
    add(new JLabel ("Last name "));
    add(new JTextField(8));
    
    
    add(new JLabel ("ID "));
    add(new JTextField(4));
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	 ShowGridLayout l1= new ShowGridLayout();
	 l1.setSize(200,200);
	 l1.setVisible(true);
	 l1.setLocationRelativeTo(null);
	 l1.setDefaultCloseOperation(l1.EXIT_ON_CLOSE);
	}

}
