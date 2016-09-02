package eventHeseg;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class keyEventDemo extends JFrame{
     KeyBoardPanel kb= new KeyBoardPanel();
	
     public keyEventDemo(){
    	 add(kb);
    	 kb.setFocusable(true);
     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        keyEventDemo frame= new keyEventDemo();
    	frame.setTitle("Demo");
		frame.setSize(500,300);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
	
	static class KeyBoardPanel extends JPanel{
		 int x=100;
		 int y=100;
		 char keyChar='A';
		 
		 public KeyBoardPanel(){
			 this.addKeyListener(new KeyAdapter(){
				 public void KeyPressed(KeyEvent e){
					 switch(e.getKeyCode()){
					 case KeyEvent.VK_DOWN: y+=10; break;
					 case KeyEvent.VK_UP: y-=10; break;
					 case KeyEvent.VK_RIGHT: x+=10; break;
					 case KeyEvent.VK_LEFT: x-=10; break;
					 default: keyChar=e.getKeyChar();   
					 }
					 repaint();
				 }
			 });
		 }
		 
		 public void paintComponent(Graphics g){
			 super.paintComponent(g);
			 g.drawString(String.valueOf(keyChar), x, y);
		 }
	}

}
