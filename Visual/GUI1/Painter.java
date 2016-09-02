package GUI1;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Painter extends JFrame {
      int xValue=10, yValue=10; // hulganii ehlel bairlal
      
      
      public Painter(){
    	  super("simple Painter"); // garchig 
    	 this.addMouseMotionListener(new MouseMotionListener(){

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				xValue=e.getX();
				yValue=e.getY();
				repaint();
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			} 
    	 });
    	  
      }
	
      
     public void paint(Graphics g){  // frame deer paint
    	 // super.paint(g);
    	  
    	  g.fillOval(xValue, yValue, 4, 4);
      }
      
      
      
      
  	public static void main(String[] args) {
		 Painter frame= new Painter();
		 frame.setSize(500, 400);
		 frame.setVisible(true);
		 frame.setLocationRelativeTo(null);
		 frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		 

	}
}
