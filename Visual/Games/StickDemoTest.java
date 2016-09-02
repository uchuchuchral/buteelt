package Games;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class StickDemoTest extends JFrame{
    StickmanPanel panel1; // zurag garah panel 
    
    
    public StickDemoTest(){
    	panel1=new StickmanPanel();
    	this.add(panel1);
    	this.addKeyListener(new KListener());
    	
    }
	
    class KListener implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_RIGHT){
				panel1.right();
				System.out.println("Baruun tiishee");
			}
			if(e.getKeyCode()==KeyEvent.VK_LEFT){
				System.out.println("zuun tiishee");
				panel1.left();
			}
			if(e.getKeyCode()==KeyEvent.VK_UP){
				System.out.println("deeshee");
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN){
				System.out.println("dooshoo");
			}
			
			if(e.getKeyCode()==KeyEvent.VK_SPACE){
				System.out.println("space darsan");
			}
			
		}

		
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
    	
    }
    
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StickDemoTest frame= new StickDemoTest();
       frame.setSize(800,600);
       frame.setVisible(true);
       frame.setLocationRelativeTo(null);
       frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
       
	}

}
