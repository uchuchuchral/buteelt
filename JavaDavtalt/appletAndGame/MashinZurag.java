package appletAndGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MashinZurag extends JFrame{
    BufferedImage img;
    File f;
	
    public MashinZurag(){
    	super("Mashin");
    	setSize(400,400);
    	setVisible(true);
    	
    }
    
    public void paint(Graphics g){
     Image img = MyImage();
    
     
     g.drawImage(img, 200, 100, this);
     BufferedImage bf= (BufferedImage)img;
     File f= new File("car.jpg");
   
     
     try{
      ImageIO.write((RenderedImage)bf, "JPEG", f);	 
     }
     catch(IOException e){
    	 e.printStackTrace();
     }
     //end polygon zurah uchraas hargalzah tseguudiin koordinatiig massiv helbereer ugnu
     
     
    }
    

	private Image MyImage(){
		  BufferedImage bufferedImage = new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB);
		  Graphics g = bufferedImage.getGraphics(); // tuhain delgetsend bgaa grapich deer zurna 
	         
	      
	      
	      int xValues[]={30, 45, 50, 70, 76, 86, 86, 82, 79, 70, 68, 50, 48, 39, 37,30 ,30};
	 	  int yValues[]={50 ,50, 44, 44, 50, 50 ,60 ,60, 56, 56, 60, 60, 56, 56, 60, 60, 50};
	      
	 	 int xValues1[]={47,50, 70, 72, 47};  
	 	 int yValues1[]={50, 46, 46, 50, 50};
	 		 
	 	  Polygon p=new Polygon(xValues, yValues,17);
	      g.drawPolygon(p);
	      g.setColor(Color.blue);
	 	  g.fillPolygon(p);
	      
	      Polygon p1=new Polygon(xValues1, yValues1, 5);
	      g.drawPolygon(p1);
	      g.setColor(Color.gray);
	      g.fillPolygon(p1);
	      
	      g.setColor(Color.BLUE);
	      g.drawLine(60, 46, 60, 50);
	      g.drawArc(39, 56, 9, 9, 0, -360);
	      g.drawArc(70, 56, 9, 9, 0, -360);
	 	 
	      g.drawLine(39, 56, 47, 64);
	      g.drawLine(48, 56, 40, 64);
	      g.drawLine(70, 56, 78, 64);
	      g.drawLine(77, 56, 71, 64);
	     
	      return bufferedImage;
	      
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MashinZurag z=new MashinZurag();
     z.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
	}

}
