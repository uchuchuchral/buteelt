package daalgavar8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bodlogo2 extends JFrame{
    JPanel p1;
	JComboBox b1;
	
	
	public Bodlogo2(){
		p1= new JPanel(new BorderLayout());
		b1= new JComboBox(new Object[]{"white","green","black","blue","cyan","gray","orange","pink","red"});
		
		p1.add(b1,BorderLayout.NORTH);
		add(p1);
		b1.addItemListener(new ItemChangeListener1());
		
	}
	
	 class ItemChangeListener1 implements ItemListener{ // interface tul implements hiine 

		public void itemStateChanged(ItemEvent event) {
			 if (event.getStateChange() == ItemEvent.SELECTED) {
		          Object item = event.getItem();  // daragdsan object turliig awna 
		          System.out.println("daragdsan :"+item);
		          String s=(String)item;
		          
		          if(item.equals("gray")){
		        	   p1.setBackground(Color.GRAY);
		          }
		          if(item.equals("white")){
		        	   p1.setBackground(Color.white);
		          }
		          if(item.equals("green")){
		        	   p1.setBackground(Color.green);
		          }
		          if(item.equals("black")){
		        	   p1.setBackground(Color.BLACK);
		          }
		          if(item.equals("blue")){
		        	   p1.setBackground(Color.blue);
		          }
		          if(item.equals("cyan")){
		        	   p1.setBackground(Color.cyan);
		          }
		          
		          if(item.equals("orange")){
		        	   p1.setBackground(Color.ORANGE);
		          }
		          if(item.equals("pink")){
		        	   p1.setBackground(Color.PINK);
		          }
		          if(item.equals("red")){
		        	   p1.setBackground(Color.red);
		          }
			 } 
			
		}
		 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Bodlogo2 frame= new Bodlogo2();
	       frame.setSize(500,400);
	       frame.setTitle("Cars ");
	       frame.setVisible(true);
	       frame.setLocationRelativeTo(null);
	       frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

}
