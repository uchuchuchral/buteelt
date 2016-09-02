package daalgavar8;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bodlogo16_8b extends JFrame  {
         drawPanel p1;
         
         public Bodlogo16_8b(){
           p1= new drawPanel();
           add(p1);
           p1.addMouseListener(new CustomMouseListener());
         }
     
         
    class CustomMouseListener implements MouseListener{     
	public void mouseClicked(MouseEvent e) {
	
		
	}

	public void mouseEntered(MouseEvent arg0) {

	}

	public void mouseExited(MouseEvent arg0) {

	}

	public void mousePressed(MouseEvent arg0) {

	}


	public void mouseReleased(MouseEvent e) {
		System.out.println("mouse released");
		System.out.println("x:"+e.getX());
		System.out.println("y:"+e.getY());
		p1.drow(e.getX(), e.getY());
	}
	
    }
    
    
    class drawPanel extends JPanel{
		   int x,y;
	
		  
		  public void drow(int x, int y){
		  	 this.x=x;
		  	 this.y=y;
		  	 repaint();
		  } 
        
		  public void paintComponent(Graphics g){
			 super.paintComponent(g); // eh classin funktsiig duudna
			 g.setColor(Color.BLACK);
			 g.drawString("("+x+","+y+")",x,y);
			 
		  }
	}
    
	public static void main(String[] args) {
		  Bodlogo16_8b b1= new Bodlogo16_8b();
	        b1.setTitle("MouseListener");
	        b1.setSize(600, 600);
	        b1.setLocationRelativeTo(null);
	        b1.setDefaultCloseOperation(b1.EXIT_ON_CLOSE);
	        b1.setVisible(true);
         
	}

}
