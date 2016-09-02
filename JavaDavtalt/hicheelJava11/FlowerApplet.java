package hicheelJava11;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowerApplet extends JApplet{
    
	
	public void init(){
	  setBackground(Color.WHITE);
	  this.setForeground(Color.BLACK);
	  
	}
	
	public void paint(Graphics g){
		Graphics2D g2= (Graphics2D)g;
	
		g2.setStroke(new BasicStroke(2.0f));
		g2.setColor(Color.GREEN);
		g2.draw(new Line2D.Double(113, 100, 113, 180));
		
		g2.setPaint(Color.RED);
		//	g2.fill(new Rectangle2D.Double(20.0, 30.0, 60.0, 100.0));
			g2.fill(new Ellipse2D.Double(80.0, 100.0 , 65, 25));
			g2.fill(new Ellipse2D.Double(100.0, 80.0, 25, 65));
			
	   g2.setColor(Color.BLUE);
	       g2.fill(new Ellipse2D.Double(100,100,25,25));
	
	    g2.setColor(Color.YELLOW);
	       g2.fill(new Ellipse2D.Double(0,0,40,40));
	       g2.drawLine(45, 45, 60, 65);
	       g2.drawLine(55, 25, 75, 35);
	       g2.drawLine(20, 50, 20, 70);
	       g2.drawLine(55, 5, 75, 5);
	   
	   g2.setColor(Color.GRAY);    
	   g2.fill(new Ellipse2D.Double(130,10,40,25));
	   g2.fill(new Ellipse2D.Double(160,10,40,25));
	   g2.fill(new Ellipse2D.Double(90,10,35,20));
	   
	   
	}
	
	
	public static void main(String[] args) {
      JFrame frame = new JFrame();
      JApplet flower= new FlowerApplet();
      JApplet flower1=new JApplet();
      
      frame.getContentPane().add(flower, BorderLayout.CENTER);  // getcontent geheer yg aguulagch hesgiig butsaaj awch bn 
      flower.init();
      
      frame.setTitle("Flower");
      frame.setSize(400, 300);
      frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true); 
     
	}

}
