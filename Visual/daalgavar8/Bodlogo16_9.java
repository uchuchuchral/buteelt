package daalgavar8;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 sumtai towch ashiglan shuluun zurah 
 */

public class Bodlogo16_9 extends JFrame {
      draw p1;
      
      public Bodlogo16_9(){
    	  p1= new draw();
    	  
    	  add(p1);
    	 // p1.addKeyListener(new keyb());
    	  this.addKeyListener(new keyb());
      }
      
      class keyb implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
		//	System.out.println("pressed");
		 
		  
		  
		  
		  if(e.getKeyCode()==KeyEvent.VK_DOWN){
			  System.out.println("dooshoo");
			  p1.down();
		
		  }
		  if(e.getKeyCode()==KeyEvent.VK_UP){
			  System.out.println("deeshee");
			  p1.up();
		  }
		  if(e.getKeyCode()==KeyEvent.VK_LEFT){
			  System.out.println("zuun");
			  p1.left();
		  }
		  if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			  System.out.println("baruun");
			  p1.right();
		  }
		  
		}

		public void keyReleased(KeyEvent arg0) {
//			System.out.println("Released");
		}

		public void keyTyped(KeyEvent arg0) {
	//		System.out.println("Typed");
			
		}
      
      }
      
      class draw extends JPanel{
  		   int x,y,x1,y1;
  		   int arrow;
		 
  		   public draw(){
  			  arrow=0;
  			  x=y=x1=y1=300;
  		   }
		  
  		  public void left(){
  			 //arrow=1;  // left bol 1 
  		   	 x=x1;
  		   	 y=y1;
  			 x1=x1-5;
  		    repaint();
  		  } 
  		  public void right(){
  		//	 arrow=2;
  		 	 x=x1;
  		   	 y=y1;
   		  	 x1=x1+5;
   		  	 repaint();
   		  } 
           
  		  public void up(){
  			// arrow=3; 
  		 	 x=x1;
  		   	 y=y1;
   		  	 y1=y1-5;
   		  	 repaint();
   		  } 
           
  		  public void down(){
  		//	 arrow=4;
  		 	 x=x1;
  		   	 y=y1;
   		  	 y1=y1+5;
   		  	 repaint();
   		  } 
           
  		  public void paintComponent(Graphics g){
  			// super.paintComponent(g); // eh classin funktsiig duudna
  			 g.setColor(Color.BLACK);
  			 g.drawLine(x, y, x1, y1);
  			 
  		  }
  	}
      
      
}
