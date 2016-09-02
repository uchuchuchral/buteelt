package Games;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class StickmanPanel extends JPanel{
	 Image img;
	 int x,y; // zuragnii bairlal
	 String imgName; // zurgiin ner 
	 int even,even1;  // eeljlen uur zurag oruulahiin tuld zarlasan huwisagch 
	 
	 public StickmanPanel(){
		 imgName="1.png";
		 img = Toolkit.getDefaultToolkit().getImage(imgName);
	     x=10;
	     y=350;
	     even=even1=0;
	     
	 }
	 
	 
	 
	  public void paint(Graphics g){
	    	super.paint(g);
	    	//g.drawImage(img, 10, 10, this);
	   // 	img = Toolkit.getDefaultToolkit().getImage(imgName);
	    	g.drawLine(0, 450, 800, 450);
	    	g.drawImage(img, x,y, 80, 100, this);
	    	
	    //	g.drawRect(10, 10, 50, 50);
	    	
	    }
     
	  public void setImage(String name){ // zurgiin neriig ugch solih method 
		  imgName=name;
		  img = Toolkit.getDefaultToolkit().getImage(imgName);
	  }
	  
	  
	 public void left(){  // 1darah bolgond alhaltiin uur uuruur oruulii 
        
		 if(x>0){
          
          if(even <8){
        	  setImage("w1.png");
        	  
        	  even++;  
          }
          else{
        	  even++;
        	  setImage("w3.png");
        	  if(even==15) even=0;
          }
	
		  x=x-2;
		  repaint();
          }
	 }
	 
	 public void right(){
		 if(x<800){
			   if(even1 <8){
		        	  setImage("1.png");
		        	  
		        	  even1++;  
		          }
		          else{
		        	  even1++;
		        	  setImage("3.png");
		        	  if(even1==15) even1=0;
		          }
			
				  x=x+2;
				  repaint();
		 }
	 }
	 
}
