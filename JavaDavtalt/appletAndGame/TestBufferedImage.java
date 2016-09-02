package appletAndGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import bodlogo11_3.Test;

public class TestBufferedImage extends JPanel{
    
	
	public void paint(Graphics g){
		Image img= CreateImageWithText();
	      g.drawImage(img, 20,20, this);
	      BufferedImage img2 = (BufferedImage)img;
	      
	    		  File f = new File("MyFile.jpg");
	    		  try {
					ImageIO.write((RenderedImage) img, "JPEG", f);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	
	private Image CreateImageWithText(){
		  BufferedImage bufferedImage = new BufferedImage(80,40,BufferedImage.TYPE_INT_RGB);
	      Graphics g = bufferedImage.getGraphics(); // tuhain delgetsend bgaa grapich deer zurna 
         
	      g.drawString("Ene bol zurag", 100, 100);
	      g.setColor(Color.GREEN);
	      g.fillRect(0, 0, 80, 40);
	      return bufferedImage;
	      
	}
	
	public static void main(String[] args) {
		  JFrame frame = new JFrame();
	      frame.getContentPane().add(new TestBufferedImage());

	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setSize(300, 300);
	      frame.setVisible(true);

	}

}
