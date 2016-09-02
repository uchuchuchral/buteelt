package panelAndGraphic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnimationDugui extends JPanel{
    int xcoor;
    int ycoor;
    int radius;
    JButton []j=new JButton[7];
    JPanel pad;
    JPanel pad1;
    Timer t;
    
	public AnimationDugui(){
		  
	 xcoor=50;
	 ycoor=50;
	 radius=30;
	 
	 j[0]=new JButton("Zoom+");
	 j[1]=new JButton("Zoom-");
	 j[2]=new JButton("Left");
	 j[3]=new JButton("Right");
	 j[4]=new JButton("Down");
	 j[5]=new JButton("Up");
	 j[6]=new JButton("Start");
	 
	 
	 pad= new JPanel();
	 pad.setLayout(new GridLayout(1,3));
	 j[0].setBackground(Color.GREEN);
	 j[1].setBackground(Color.GREEN);
	 j[2].setBackground(Color.GREEN);
	 
	 pad1= new JPanel();
	 pad1.setLayout(new GridLayout(1,3));
	 j[3].setBackground(Color.BLUE);
	 j[4].setBackground(Color.BLUE);
	 j[5].setBackground(Color.BLUE);
	 
	 

	
	
	 
	 init();
	}
	
	public void init(){
	 
		
	 pad.add(j[0]);
	 pad.add(j[1]);
	 pad.add(j[2]);
	 pad1.add(j[3]);
	 pad1.add(j[4]);
	 pad1.add(j[5]);
	 
	 setLayout(new BorderLayout());
	 add(pad,BorderLayout.NORTH);
     add(pad1, BorderLayout.SOUTH);	 
	 add(j[6],BorderLayout.EAST);
	 
	 j[0].addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent e) {	
		 radius=radius+10;
		 repaint();
		} 
	 });
	 
	 j[1].addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {	
			 radius=radius-10;
			 repaint();
			} 
		 });
	 
	 j[2].addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {	
			 xcoor=xcoor-5;
			 repaint();
			} 
		 });
	 
	 j[3].addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {	
			 xcoor=xcoor+5;
			 repaint();
			} 
		 });
	 
	 j[4].addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {	
			 ycoor=ycoor+5;
			 repaint();
			} 
		 });
	 
	 j[5].addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {	
			 ycoor=ycoor-5;
			 repaint();
			 
			} 
		 });
	 
	 
	 j[6].addActionListener(new TimerListener1());
	 
	  
	}
	
	
	public void setXcoor(int xcoor){
	this.xcoor=xcoor;	
	}
	public void setYcoor(int ycoor){
	this.ycoor=ycoor;	
	}
	
	public int getYcoor(){
	      return ycoor;	
	}
	
	public int getXcoor(){
 	      return xcoor;	
	}
	
	
	public void  paint(Graphics g){
	 super.paint(g);
	 g.setColor(Color.DARK_GRAY);
	 g.fillArc(xcoor, ycoor, radius*2, radius*2, 0, 30);
	 g.fillArc(xcoor, ycoor, radius*2, radius*2, 45, 30);
	 g.fillArc(xcoor, ycoor, radius*2, radius*2, 90, 30);
	 g.fillArc(xcoor, ycoor, radius*2, radius*2, 135, 30);
	 g.fillArc(xcoor, ycoor, radius*2, radius*2, 180, 30);
	 g.fillArc(xcoor, ycoor, radius*2, radius*2, 225, 30);
	 g.fillArc(xcoor, ycoor, radius*2, radius*2, 270, 30);
	 g.fillArc(xcoor, ycoor, radius*2, radius*2, 315, 30);
	 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AnimationDugui d= new AnimationDugui();
     
     JFrame frame =new JFrame();
     frame.add(d);
     frame.setTitle("Dugui");
     frame.setSize(300, 300);
     frame.setVisible(true);
     frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
     frame.setLocationRelativeTo(null);
     frame.pack();
     
     
	}
	
	class TimerListener1 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			repaint();
		}
	}



}
