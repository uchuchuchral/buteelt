package appletAndGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Polygon;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AnimationCarBody extends JPanel implements Runnable{
	 int delayHurd; //hurdiig awah huwisagch
	 
	 int []xValues={30, 45, 50, 70, 76, 86, 86, 82, 79, 70, 68, 50, 48, 39, 37,30 ,30};
	 int []yValues={50 ,50, 44, 44, 50, 50 ,60 ,60, 56, 56, 60, 60, 56, 56, 60, 60, 50};
	 int []xValues1={47,50, 70, 72, 47};  
	 int []yValues1={50, 46, 46, 50, 50};
	 int []Dugui1={39, 56, 9, 9, 0, -360};  
	 int []Dugui2={70 ,56, 9, 9, 0, -360};
	  
	 int xcoor, ycoor;
	 int xcoor1,ycoor1;
	 Timer timer;
	 boolean running=true;
	 
     public AnimationCarBody(){
    	
     }
     
     public void setDelay(int delay){
    	this.delayHurd=delay; 
     }
     
     public AnimationCarBody(int x, int y){  // x ba y coor luu hedeer shiljuulj zurah bguulagch funkts
         delayHurd=50;
    	 setCar(x,y);
    	 xcoor=x;
    	 ycoor=y;
    	 xcoor1=x;
    	 ycoor1=y;
    
    	 
     }
	
     public void setRunning(boolean b1){
    	 running=b1;
     }
     
	public void paintComponent(Graphics g){
         super.paintComponent(g);
		// System.out.println("paint ruu orson");
	     
          if(xcoor<2){
           timer.stop();	 
           System.out.println("Zogs");
           }
		
		 Polygon p1= new Polygon(xValues, yValues,xValues.length);
         Polygon p2= new Polygon(xValues1, yValues1, xValues1.length);
               
         g.setColor(Color.blue);
         g.fillPolygon(p1);
         g.setColor(Color.GRAY);
         g.fillPolygon(p2);
         g.setColor(Color.BLUE);
       
         g.drawArc(Dugui1[0],Dugui1[1],Dugui1[2],Dugui1[3],Dugui1[4],Dugui1[5]);
         g.drawArc(Dugui2[0],Dugui2[1],Dugui2[2],Dugui2[3],Dugui2[4],Dugui2[5]);
         
         g.setColor(Color.DARK_GRAY);
		 g.drawLine(20, (ycoor1+70), (xcoor1+100), (ycoor1+70));
		 g.drawLine(20, (ycoor1+45), (xcoor1+100), (ycoor1+45));
             
	  
	}
	
	public void setCar(int x, int y){
		 for(int i=0; i<xValues.length; i++){
        	 xValues[i]+=x;
        	 yValues[i]+=y;
          }
     
         for(int i=0; i<xValues1.length; i++){
        	 xValues1[i]+=x;
        	 yValues1[i]+=y;
         }
         
          Dugui1[0]+=x;
          Dugui2[0]+=x;
          Dugui1[1]+=y;
          Dugui2[1]+=y;	
	}
  
	
	class TimerListener implements ActionListener{// class dotorh class buyu dotood class

		@Override
		public void actionPerformed(ActionEvent e) {
	         setCar(-3,0);
	         xcoor=xcoor-3;
	         repaint();
			
		}  
		
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		 timer = new Timer(delayHurd, new TimerListener());
		  if(running){
	         timer.start();
		    }
		  else{
			 timer.stop(); 
		  }
	      
	}
	
}
