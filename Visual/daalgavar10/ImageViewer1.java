package daalgavar10;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class ImageViewer1 extends JPanel{
       Image image;
       boolean stretched;
       int xCoordinate, yCoordinate;
       String description;
       
       public ImageViewer1(){
    	   
       }
       
       public ImageViewer1(Image image){
    	     this.image=image;
       }
       
       public void paintComponent(Graphics g){
    	   if(image !=null){
    		   if(isStretched())
    			   g.drawImage(image, xCoordinate, yCoordinate, getWidth(), getHeight(),this);
    		   else
    		      g.drawImage(image, xCoordinate, yCoordinate, this);
    		      g.drawString(description, xCoordinate-40, yCoordinate+40);
    		      g.drawRect(xCoordinate-45, yCoordinate+20, 160, 30);
    	   }
       }
       
       public void setImage(Image image){
    	   this.image=image;
    	   repaint();
       }
       
       public void setDescription(String description){
    	   this.description=description;
    	   repaint();
       }
       
       public Image getImage(){
    	   return image;
       }
       
       public boolean isStretched(){
    	   return stretched;
       }
       
       public void setStretched(boolean stretched){
    	   this.stretched=stretched;
    	   repaint();
       }
       
       public void setXcoordinate(int x){
    	   this.xCoordinate=x;
    	   repaint();
       }
       
       public void setYcoordinate(int y){
    	   this.yCoordinate=y;
    	   repaint();
       }
       
       public int getXcoordinate(){
    	   return xCoordinate;
       }
       
       public int getYcoordinate(){
    	   return yCoordinate;
       }
}
