package Timer;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Ball extends JFrame{
    public Ball(){
    	
     add(new MovingBallPanel());
     
    }
	  
	public static void main(String[] args) {
	 Ball frame = new Ball();
	  frame.setSize(500,400);
	  frame.setVisible(true);
	  frame.setLocationRelativeTo(null);
	  frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

	}
	
	static class MovingBallPanel extends JPanel{
		int x=200;
		int y=100;
		int m=10;
	    int angle=20;	 // 20 oos 40 hurtel 
		int angle1=0;
	    
		public MovingBallPanel(){
		
			Timer timer= new Timer(200,new TimerListener());
			timer.start();
		}
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			
			if(x>this.getWidth()){
				x=x-20;
			}
            int endX, endY;
			
			if(angle <=40){
		    angle++;
		    int second=angle;
	          endX   = (int) (x + 100 * Math.sin(second*((Math.PI*2)/60)));
	          endY   = (int) (y - 100 * Math.cos(second*((Math.PI*2)/60)));
	          g.drawLine(x, y, endX, endY);
	          g.fillOval(endX-10, endY-10, 20, 20);
	         
	      	  angle1=angle;
			}
		
			
			if(angle>40 && angle <=60){
				 
				      angle++;
				      int second=angle1;
			          endX   = (int) (x + 100 * Math.sin(second*((Math.PI*2)/60)));
			          endY   = (int) (y - 100 * Math.cos(second*((Math.PI*2)/60)));
			          g.drawLine(x, y, endX, endY);
			          g.fillOval(endX-10, endY-10, 20, 20);
			          angle1--;
			          if(angle==60){
			        	  angle=20;
			          }
			}
			
		 	
		   
		}
		
		
		class TimerListener implements ActionListener{ // movingMessagePanel classiin dotood class

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				repaint();
			}
			
		}
	}
	
	
	

}
