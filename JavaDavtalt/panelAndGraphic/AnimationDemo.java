package panelAndGraphic;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AnimationDemo extends JFrame {

	public AnimationDemo(){
        setLayout(new BorderLayout());
        Moving m1= new Moving("haha",20);
        Moving m2= new Moving("uuhaha",20);
        Moving m3= new Moving("blabla",20);
        
        JPanel p1=new JPanel(new GridLayout(3,1));
        p1.add(m1);
        p1.add(m2);
        p1.add(m3);
        
        add(p1,BorderLayout.CENTER);
        
        Thread thread1= new Thread(m1);
        Thread thread2= new Thread(m2);
        Thread thread3= new Thread(m3);
        
        thread1.start();
        thread2.start();
        thread3.start();
        
        setSize(300,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    AnimationDemo d= new AnimationDemo();
   
    		
	}
	
	static class Moving extends JPanel implements Runnable{
	 private String message="We love java";
	 int xcoor=0;
	 int ycoor=20;
	 Timer timer;
	 
	 public Moving(String message, int ycoor){
	 this.message=message;	 
	 this.ycoor=ycoor;
	
	 
	  timer= new Timer(1000,new TimerListener()); //end burtguulsen classd burtgeltei paintuudiig duudaal bn gsn ug
	
	 
	 }
	 
	 public void paint(Graphics g){
//		 if(xcoor>getWidth()){
	//		xcoor=-20; 
		// }
		 xcoor=xcoor+10;
		 g.drawString(message, xcoor, ycoor);
		 
	 }
	 
	 
	 
	

	class TimerListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			repaint();
		}
	}





	@Override
	public void run() {
		// TODO Auto-generated method stub
		 timer.start();
	}
  }
}
