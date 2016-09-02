package Timer;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AnimationDemo extends JFrame{
    public AnimationDemo(){
    	
     add(new MovingMessagePanel("Welcome fucking eclipse"));
    }
	  
	public static void main(String[] args) {
	  AnimationDemo frame = new AnimationDemo();
	  frame.setSize(300,200);
	  frame.setVisible(true);
	  frame.setLocationRelativeTo(null);
	  frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

	}
	
	static class MovingMessagePanel extends JPanel{
		String message="Welcome to java";
		int x=0;
		int y=20;
		
		
		public MovingMessagePanel(String message){
			this.message=message;
			
			Timer timer= new Timer(1000,new TimerListener());
			timer.start();
		}
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			
			if(x>this.getWidth()){
				x=x-20;
			}
			x+=5;
			g.drawString(message, x, y);
			
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
