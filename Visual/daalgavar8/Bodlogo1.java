package daalgavar8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/*
 jcombobox oor neriin songood songoson nertei zurag hajuud ni garch ireh programmm 
 * 
 * mashinuudiin nereer zurag oruulii 
 */
public class Bodlogo1 extends JFrame{
        JComboBox cb;
        JPanel left, right, combo;
        JLabel pic;
        ImageIcon imgs;
        
        
        public Bodlogo1(){
        	
        	this.setLayout(new GridLayout(1,2));
             
        	imgs= new ImageIcon("Hummer.jpg");
        	
        	
        	pic= new JLabel("", imgs, SwingConstants.CENTER);
        	
        	
            cb=new JComboBox(new Object[]{"Hummer","Prius","Bmv","Bus", "Bike"});
            left= new JPanel(new BorderLayout());
            right=new JPanel(new BorderLayout());
     
            right.add(pic,BorderLayout.CENTER);
            left.add(cb, BorderLayout.NORTH);
            
            combo=new JPanel(new BorderLayout());
            combo.add(left,BorderLayout.NORTH);
            
          
            right.setBackground(Color.white);
            left.setBackground(Color.white);
            combo.setBackground(Color.white);
            this.add(combo);
            this.add(right);
            
            
            cb.addItemListener(new ItemChangeListener());
        }
        
        
        class ItemChangeListener implements ItemListener{

			@Override
			public void itemStateChanged(ItemEvent event) {
				 if (event.getStateChange() == ItemEvent.SELECTED) {
			          Object item = event.getItem();  // daragdsan object turliig awna 
			          System.out.println("daragdsan :"+item);
				      
			          String s=(String)item;
			          s=s.concat(".jpg");
			          pic.setIcon(new ImageIcon(s));
				 } 
				
			}
        	
        }

        
        
}
