package eventHeseg;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class HandleEvent extends JFrame{
    JButton jbtEnLarge, jbtShrink ;
	JPanel panel;
	//drawPanel panel1;
    JButton left, right, down, up;
    
    drawPanel panel1 = new drawPanel();
    
	public HandleEvent(){
		jbtEnLarge= new JButton("EnLarge");
	    jbtShrink=new JButton("Shrink");
	    left= new JButton("left");
	    right= new JButton("right");
	    down= new JButton("down");    
	    up= new JButton("up");
	    
	    panel = new JPanel();
	    panel.setBorder(new TitledBorder("Buttons"));
	    panel.setLayout(new GridLayout(2,3));
	    panel.add(jbtEnLarge);
	    panel.add(jbtShrink);
	    panel.add(left);
        panel.add(right);
        panel.add(down);
        panel.add(up);
	    

	    this.add(panel1,BorderLayout.CENTER);
	    this.add(panel, BorderLayout.SOUTH);
	    
	    
        jbtEnLarge.addActionListener(new ButtonListener());	    
	    jbtShrink.addActionListener(new ButtonListener());
	    left.addActionListener(new ButtonListener());
	    right.addActionListener(new ButtonListener());
	    down.addActionListener(new ButtonListener());
	    up.addActionListener(new ButtonListener());
	    
	}
 
	public void setPanel(int x, int y){
		 panel1.setPanel1(x, y);
	}
	
	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==jbtEnLarge){
			    panel1.enLarge();	
			}
			if(e.getSource()==jbtShrink){
				panel1.shrink();	
			}
			if(e.getSource()==left){
				panel1.left();	
			}
			if(e.getSource()==right){
				panel1.right();	
			}
			if(e.getSource()==down){
				panel1.down();	
			}
			if(e.getSource()==up){
				panel1.up();	
			}
			
		}
	}
	
	
	
	class drawPanel extends JPanel{
		  int radius=10;
		   int x,y;
		  
		  
		  public void setPanel1(int x, int y){
			  this.x=x/2;
			   this.y=y/2;
			   
		  }
		  
		  public void enLarge(){
			if(radius<50){  
			  radius+=2;
		 	  repaint();
			}
		  }
		  
		  public void shrink(){
			   if(radius>0){
				radius-=2;
				repaint();
			   }
			  }
		  
		  public void up(){
			  if(y>0){
			  y-=5;
			  repaint();
			  }
		  }
		  
          public void down(){
        	  if(y<300){
			  y+=5;
			  repaint();
        	  }
		  }
          
          public void right(){
        	  if(x<300){
			  x+=5;
			  repaint();
        	  }
		  }
           
          public void left(){
        	  if(x>0){
			  x-=5;
			  repaint();
          }
		  } 
          
		  public void paintComponent(Graphics g){
			 super.paintComponent(g); // eh classin funktsiig duudna
			 g.drawOval(x, y,2*radius , 2*radius);
			 
		  }
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HandleEvent frame = new HandleEvent();
        frame.setSize(300,300);
        frame.setPanel(frame.getWidth(), frame.getHeight());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
	}

}
