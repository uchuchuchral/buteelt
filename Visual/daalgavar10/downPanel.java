package daalgavar10;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class downPanel extends JPanel{
         int x; // 1 gevel 1deh durs zuragdana      
	     int xcoor, ycoor,xcoor1, ycoor1;  // ehlel bas tugsgul coordinat
	     String keyChar="|"; // A daraad useg bichih string 
	     
         public downPanel(){
        	 x=0;
         //   this.addMouseListener(new CustomMouseListener());
            this.addMouseMotionListener(new CustomMouseListener());
            this.addMouseListener(new CustomMouseListener());
            
            
         }
         
      //   class CustomMouseMotionListener implements MouseMotionListener(){
        	 
       //  }
         
        class CustomMouseListener implements MouseListener, MouseMotionListener, KeyListener{     
     	public void mouseClicked(MouseEvent e) {
     		
     		
     	}

     	public void mouseEntered(MouseEvent e) {
     		System.out.println("mouse entered");
     	}

     	public void mouseExited(MouseEvent e) {
     		System.out.println("mouse Exited");
     	}

     	public void mousePressed(MouseEvent e) {
     		System.out.println("mouse pressed");
     		System.out.println("mouse clicked");
     		System.out.println("x:"+e.getX());
     		System.out.println("y:"+e.getY());
     		xcoor=e.getX();
     		ycoor=e.getY();
     	}


     	public void mouseReleased(MouseEvent e) {
     	    	
     	//	p1.drow(e.getX(), e.getY());
     	}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			//System.out.println("mouse dragged");
			xcoor1=e.getX();
            ycoor1=e.getY();
            repaint();
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
		
 		
		//	System.out.println("mouse moved");
		}

		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_A){
				System.out.println("dooshoo");
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

	
         }
       
         public void setShape(int x){
        	 this.x=x;
       // 	 repaint();
         }
         
	    public void paintComponent(Graphics g){
	    	super.paintComponent(g);
	    	
	  //  	if(x==0){
	    		
	    //	}
	    	  switch(x){
		       
	    	   case 0:
		       case 1:
	    	       g.setColor(Color.BLACK);
		    	   g.drawLine(xcoor, ycoor, xcoor1, ycoor1);
		    	   break;
		       
		       case 2:
		    	   g.drawRect(xcoor, ycoor, Math.abs(xcoor1-xcoor), Math.abs(ycoor1-ycoor));
		    	   break;
		       
		       case 3:
		    	   g.drawOval(xcoor, ycoor, xcoor1-xcoor, ycoor1-ycoor);
		    	   break;   
		    	   
		       case 4:
		    	   g.drawString(String.valueOf(keyChar), xcoor, ycoor);
		    	   break;	   
		    }
		    
	     }

	    
}
