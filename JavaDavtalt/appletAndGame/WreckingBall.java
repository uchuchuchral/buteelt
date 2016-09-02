package appletAndGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class WreckingBall extends JPanel {
     int xcoor=0;
     int ycoor=0;
     int radius=10;
     int delay=10;
	 int dx=2, dy=2; // x ba y coordinate daguu usuh negj hemjee 
     Timer timer= new Timer(delay, new TimerListener());
     
     public WreckingBall(){
        timer.start();   	 
     }
     
     public void paintComponent(Graphics g){
    	super.paintComponent(g); 
    	g.setColor(Color.GREEN);
    	
    	if(xcoor<radius){
    	  dx=Math.abs(dx);	
    	}
    	if(xcoor>getWidth()-radius){
      	  dx=-Math.abs(dx);	
      	}
    	if(ycoor<radius){
      	  dy=Math.abs(dy);	
      	}
    	if(ycoor>getHeight()-radius){
      	  dy=-Math.abs(dy);	
      	}
    	
    	System.out.println("repaint");
    	xcoor=xcoor+dx;
    	ycoor=ycoor+dy;
    	
    	g.fillOval(xcoor-radius, ycoor-radius, radius*2, radius*2);
    	
     }
     
 
     
	public static void main(String[] args) {
	    WreckingBall b1= new WreckingBall();
		JFrame frame = new JFrame();
	    frame.add(b1);
	    
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
	}
    
	public class TimerListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			repaint();
			
		}
 
	}
	
	public void setDelay(int delay){
		this.delay=delay;
		timer.setDelay(delay);
	}
	
	public void resume(){
		timer.start();
	}
	
	public void suspend(){
		timer.stop();
	}
}