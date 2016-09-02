package daalgavruud;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Bodlogo17_9 extends JFrame{
	 JLabel label1;
     JPanel [] panelArray= new JPanel[7];   
	 JLabel [] labelArray= new JLabel[7];
	 JComboBox panel1Up, panel1Down, panel2Up, panel2Down; 
     ImageIcon icon;  // zurag oruulah component
	 JPanel basic, upBasic;
     
	 public Bodlogo17_9(){
	  	 
		 icon= new ImageIcon("download.jpg");
		 label1= new JLabel("Grapes", icon, SwingConstants.CENTER); // icon zurgan file iig label1 d nemlee
		 label1.setHorizontalAlignment(label1.LEFT); // label zuun taldaa bairlaltai 
		 label1.setHorizontalTextPosition(label1.LEFT);
		 label1.setVerticalTextPosition(label1.TOP);
		 
		 setLayout(new GridLayout(2,1));
		 
		 upBasic=new JPanel(new BorderLayout());
		 upBasic.add(label1,BorderLayout.CENTER);
		 add(upBasic);
		 basic= new JPanel(new GridLayout(1,2)); // talaas dooshih componentuudiig hadgalah panel
		 add(basic);
		 upBasic.setBackground(Color.WHITE);
	
		 
		 
		 panelArray[0]= new JPanel();
		 panelArray[0].setLayout(new BorderLayout());
		 panelArray[1]= new JPanel();
		 panelArray[1].setLayout(new BorderLayout());
		 
		 labelArray[0]= new JLabel("Horizontal Alignment");
		 labelArray[1]= new JLabel("Text Position");
		 
		 panelArray[0].add(labelArray[0],BorderLayout.NORTH);
		 panelArray[1].add(labelArray[1],BorderLayout.NORTH);
		 
		 basic.add(panelArray[0]);
		 basic.add(panelArray[1]);
		 panelArray[0].setBackground(Color.GRAY);
		 panelArray[1].setBackground(Color.GRAY);
		 
		 panelArray[2]=new JPanel();
	     panelArray[3]=new JPanel();
	     
	     panelArray[2].setLayout(new GridLayout(2,2));
	     panelArray[3].setLayout(new GridLayout(2,2));
	     
	     labelArray[2]= new JLabel("Horizontal");
		 labelArray[3]= new JLabel("vertical");
		 labelArray[4]= new JLabel("Horizontal");
		 labelArray[5]= new JLabel("vertical");
		 
	
		 
		 panel1Up=new JComboBox(new Object[]{"LEFT","CENTER","RIGHT"});
		 panel1Up.addItemListener(new ItemChangeListener());
		 /*( new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				 label1.setHorizontalAlignment(label1.LEFT);
			   }
		      });
		      */
		 panel1Down=new JComboBox(new Object[]{"TOP","CENTER","BOTTOM"});
		 panel1Down.addItemListener(new ItemChangeListener());
		 panel2Up=new JComboBox(new Object[]{"LEFT","CENTER","RIGHT"});
		 panel2Up.addItemListener(new ItemChangeListener());
		 panel2Down=new JComboBox(new Object[]{"TOP","CENTER","BOTTOM"});
		 panel2Down.addItemListener(new ItemChangeListener());
		 
		 
		 panelArray[2].add(labelArray[2]);
		 panelArray[2].add(panel1Up);
		 panelArray[2].add(labelArray[3]);
		 panelArray[2].add(panel1Down);
		 
		 panelArray[3].add(labelArray[4]);
		 panelArray[3].add(panel2Up);
		 panelArray[3].add(labelArray[5]);
		 panelArray[3].add(panel2Down);
		 
		 panelArray[0].add(panelArray[2],BorderLayout.CENTER);
		 
		 panelArray[1].add(panelArray[3],BorderLayout.CENTER);
	 }
	 
	 
	 
	 
	 
	 class ItemChangeListener implements ItemListener{
		    @Override
		    public void itemStateChanged(ItemEvent event) {
		       if (event.getStateChange() == ItemEvent.SELECTED) {
		          Object item = event.getItem();  // daragdsan object turliig awna 
		          System.out.println("daragdsan :"+item);
		          // do something with object
		          String s=(String)item;
		          JComboBox cb = (JComboBox) event.getSource(); // comboBox luu hurvuulelt hiilee
		          
		          if(cb==panel1Up){ // horizontal alignment
		        	  if(("LEFT".compareTo(s))==0){
		        		  label1.setHorizontalAlignment(2);
		        	  }
		        	  if(("CENTER".compareTo(s))==0){
		        		  label1.setHorizontalAlignment(0);
		        	  }
		        	  if(("RIGHT".compareTo(s))==0){
		        		  label1.setHorizontalAlignment(4);
		        	  }
		          
		          }
		          
		          if(cb==panel1Down){  //vertical alignment
		        	  if(("TOP".compareTo(s))==0){
		        		  label1.setVerticalAlignment(1);
		        	  }
		        	  if(("CENTER".compareTo(s))==0){
		        		  label1.setVerticalAlignment(0);
		        	  }
		        	  if(("BOTTOM".compareTo(s))==0){
		        		  label1.setVerticalAlignment(3);
		        	  }
		          
		          }
		          
		          if(cb==panel2Up){  //horizontal text
		        	  if(("LEFT".compareTo(s))==0){
		        		  label1.setHorizontalTextPosition(2);
		        	  }
		        	  if(("CENTER".compareTo(s))==0){
		        		  label1.setHorizontalTextPosition(0);
		        	  }
		        	  if(("RIGHT".compareTo(s))==0){
		        		  label1.setHorizontalTextPosition(4);
		        	  }
		          
		          }
		          
		          if(cb==panel2Down){  //vertical text
		        	  if(("TOP".compareTo(s))==0){
		        		  label1.setVerticalTextPosition(1);
		        	  }
		        	  if(("CENTER".compareTo(s))==0){
		        		  label1.setVerticalTextPosition(0);
		        	  }
		        	  if(("BOTTOM".compareTo(s))==0){
		        		  label1.setVerticalTextPosition(3);
		        	  }
		          
		          }
		          
		       }
		    }       
		} 
	 
	 
	public static void main(String[] args) {
		// TODO  Auto-generated method stub
          Bodlogo17_9 b1= new Bodlogo17_9();
          b1.setSize(500, 400);
          b1.setLocationRelativeTo(null);
          b1.setVisible(true);
          b1.setTitle("Grapes");
          b1.setDefaultCloseOperation(b1.EXIT_ON_CLOSE);
          
	}

}
