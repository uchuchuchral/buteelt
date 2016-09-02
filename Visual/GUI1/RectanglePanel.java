package GUI1;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class RectanglePanel extends JPanel {
           int width, height;
	   
	     public RectanglePanel(){
	    	width=100;
	    	height=100;
	     }
	     
	     public void setWidth(int w){
	    	 width=w;
	    	 System.out.println("uurchlugdsun widht:"+width);
	    	 repaint();
	     }
	     
	     public void setHeight(int h){
	    	 height=h;
	    	 repaint();
	     }
	     
	     public int getHeight(){
	    	 return height;
	     }
	     public int getWidth(){
	    	 return width;
	     }
	
	public void paintComponent(Graphics g){
		
		 super.paintComponent(g); // eh classin funktsiig duudna
		 g.setColor(Color.WHITE);
	
		 g.fillRect(0, 0, width, height);
		 g.setColor(Color.BLACK);
		 g.fillRect(0, 0, width, height);
	 	     
	}
	
}
