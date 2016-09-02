package panelAndGraphic;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FigurePanel extends JPanel{
    public static final int LINE=1;
    public static final int RECTANGLE=2;
    public static final int ROUND_RECTANGLE=3;
    public static final int OVAL=4;
    
    public int type=1;
    private boolean filled=false;
	
    
    public FigurePanel(){
     //default bguulagch
    repaint();
    }
    
    public FigurePanel(int type){
    	this.type=type;
    }
    
    public FigurePanel(int type, boolean filled){
    	this.type=type;
    	this.filled=filled;
    }
    
    
    
    public void paint(Graphics g){
    	super.paint(g);
    	int height=getHeight();
    	System.out.println("heigth="+height);
    	
    	int width=getWidth();
    	System.out.println("width="+width);
    	
    	switch(type){
    	
    	case LINE:
    		g.setColor(Color.black);
    		g.drawLine(10, 10, width-10, height-10);
    		g.drawLine(width-10,10,10, height-10);
    		break;
    	
    	case RECTANGLE: // Display a rectangle
    		 g.setColor(Color.BLUE);
    		if(filled)
    		 g.fillRect((int)(0.1 * width), (int)(0.1 * height),(int)(0.8 * width), (int)(0.8 * height));
    		 else
    		 g.drawRect((int)(0.1 * width), (int)(0.1 * height),
    		(int)(0.8 * width), (int)(0.8 * height));
    		 break;	
    		 
    	case ROUND_RECTANGLE: // Display a round-cornered rectangle
    		 g.setColor(Color.RED);
    		if(filled)
    		 g.fillRoundRect((int)(0.1 * width), (int)(0.1 * height),
    	     (int)(0.8 * width), (int)(0.8 * height), 20, 20);
    		 else
    		 g.drawRoundRect((int)(0.1 * width), (int)(0.1 * height),
    		 (int)(0.8 * width), (int)(0.8 * height), 20, 20);
    		 break;		 
    		 
    	case OVAL: // Display an oval
    		  g.setColor(Color.BLACK);
    		 if(filled)
    		  g.fillOval((int)(0.1 * width), (int)(0.1 * height),	 
    				  (int)(0.8 * width), (int)(0.8 * height));
    		   else
    		   g.drawOval((int)(0.1 * width), (int)(0.1 * height),
    		   (int)(0.8 * width), (int)(0.8 * height));
    
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     FigurePanel p= new FigurePanel();
     p.setSize(300,300);
     p.setVisible(true);
     p.setLocation(null);
     
     
	}

}
