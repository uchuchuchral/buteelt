package daalgavar10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class Bodlogo34_3 extends JFrame{
      // JPanel upPanel1 , downPanel1;     // up ni north hesegt bairlana 
	 //  upPanel panel1;
	 //  JPanel p1;
       upPanel1 p11 = new upPanel1();
       downPanel p22= new downPanel();
       
       public Bodlogo34_3(){
    	//   p1= new JPanel();
    	  
    	   p11.setBackground(Color.GRAY);
    	  
    	   this.setLayout(new BorderLayout());
    	   this.add(p11,BorderLayout.NORTH);
    	   this.add(p22, BorderLayout.CENTER);
       }
       
        // 1160 toolbar about 
        class upPanel1 extends JPanel{
        	  JToolBar toolbar;
      	      JButton rectangle, oval, line ,character;
          
      	    
      	    public  upPanel1(){
      	    	line = new JButton(new ImageIcon(getClass().getResource("image/paintLine.jpg")));
      	    	oval = new JButton(new ImageIcon(getClass().getResource("image/paintOval.jpg")));
      	   	    rectangle = new JButton(new ImageIcon(getClass().getResource("image/paintRect.jpg")));
      	     	character = new JButton(new ImageIcon(getClass().getResource("image/paint2.jpg")));

      	    	toolbar = new JToolBar("my Toolbar");
      	    	toolbar.add(line);
      	        toolbar.add(rectangle);
      	        toolbar.add(oval);
      	    	toolbar.add(character);
      	    	
      	    	
      	    	add(toolbar, FlowLayout.LEFT);	
      	    	line.addActionListener(new ButtonListener());
      	    	rectangle.addActionListener(new ButtonListener());
      	    	oval.addActionListener(new ButtonListener());
      	    	character.addActionListener(new ButtonListener());
      	    
      	    }
      	    
      		class ButtonListener implements ActionListener{

				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==line){
					   System.out.println("Line");
					   line.setBackground(Color.gray);
					   rectangle.setBackground(Color.white);
					   oval.setBackground(Color.white);
					   character.setBackground(Color.white);
					   
					   p22.setShape(1);
					}
					
					if(e.getSource()==rectangle){
						   System.out.println("Rectangle");
						   line.setBackground(Color.white);
						   rectangle.setBackground(Color.gray);
						   oval.setBackground(Color.white);
						   character.setBackground(Color.white);
						   p22.setShape(2);
						}
						
					if(e.getSource()==oval){
						   System.out.println("oval");
						   line.setBackground(Color.white);
						   rectangle.setBackground(Color.white);
						   oval.setBackground(Color.gray);
						   character.setBackground(Color.white);
						   p22.setShape(3);
						}
						
					if(e.getSource()==character){
						   System.out.println("Characters");
						   line.setBackground(Color.white);
						   rectangle.setBackground(Color.white);
						   oval.setBackground(Color.white);
						   character.setBackground(Color.gray);
						   
						   p22.setShape(4);
						}
						
					
				}
  	    		
  	    	}
      
      		//537 mouseListener
      public void line(){
    	//   addMouseMotionListener(new MouseMotionAdapter(){
    	      
    		   
    	  // });
      }
      	
    	    
       } /// up panel classiin haalt
       
        
    //   class downPanel extends JPanel{
    	   
   //    }
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bodlogo34_3 frame= new Bodlogo34_3();
			frame.setTitle("exercises 34_3");
			frame.setSize(500,300);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

}
