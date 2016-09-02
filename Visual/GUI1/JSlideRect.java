package GUI1;

import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSlideRect extends JFrame {
       JSlider slide1, slide2;
	   RectanglePanel panel1=new RectanglePanel();;
	
	   public JSlideRect(){
		 setLayout(new BorderLayout());
		  
		 
		 slide1= new JSlider(JSlider.HORIZONTAL);
		 slide1.setMaximum(150);
		 slide1.setMajorTickSpacing(10);
		 slide1.setMinorTickSpacing(2);
		 slide1.setPaintLabels(true);
		 slide1.setPaintTicks(true);
		 slide1.setValue(panel1.getWidth());
		 
		 slide2= new JSlider(JSlider.VERTICAL);
		 slide2.setMaximum(150);
	//	 slide2.setMajorTickSpacing(100);
	//	 slide2.setMinorTickSpacing(20);
	//	 slide2.setPaintLabels(true);
	//	 slide2.setPaintTicks(true);
		 slide2.setValue(panel1.getHeight());
		 
		 this.add(slide1,BorderLayout.SOUTH);
		 this.add(slide2,BorderLayout.EAST);
		 this.add(panel1,BorderLayout.CENTER);
		 slide1.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				panel1.setWidth(slide1.getValue());
				repaint();
			}
			 
			 
		 });
		 
		 
	   }
	   
	   
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  JSlideRect frame= new JSlideRect();
		 frame.setSize(500, 300);
		 frame.setVisible(true);
		 frame.setLocationRelativeTo(null);
		 frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		 
	}

}
