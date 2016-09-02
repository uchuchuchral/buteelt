package appletAndGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.timer.Timer;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class XO extends JFrame {
   private int [][] arr= new int[100][100];
   private PaintXO arguu = new PaintXO();
	
	public XO(){
	setLayout(new BorderLayout()); 	
	add(arguu, BorderLayout.CENTER);
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     XO f= new XO();
     f.setTitle("XO");
     f.setSize(515, 540);
	 f.setLocationRelativeTo(null);
	 f.setVisible(true);		
	}
	

	
class PaintXO extends JPanel {
	public PaintXO(){
		Timer timer= new Timer();
		timer.start();
		
	}
	
 public void paint(Graphics g){
	 //super.paintComponent(g);
	 g.setColor(Color.orange);
	 
     g.fillRect(0, 0, 600, 600);	
     g.setColor(Color.BLACK);
     
     int a=0, b=0;
     for(int i=0; i<10; i++){
    	 b=0; 
    	 for(int j=0; j<10; j++){
    		 
         g.drawRect(a, b, 50, 50);
    	 b=b+50;
    	 }
    	 a=a+50;
    	 
     }
     
 }
	
	
		
}
class TimerListener implements ActionListener {
	public void actionPerformed(ActionEvent e){
		 repaint();
	}
	
}



}




