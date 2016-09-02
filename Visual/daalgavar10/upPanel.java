package daalgavar10;

import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class upPanel extends JPanel{
	   JToolBar toolbar;
	    JButton rectangle, oval, line ,character;
    
	    
	    public  upPanel(){
	    	line = new JButton(new ImageIcon(getClass().getResource("image/paintLine.jpg")));
	    	oval = new JButton(new ImageIcon(getClass().getResource("image/paintRect.jpg")));
	   	    rectangle = new JButton(new ImageIcon(getClass().getResource("image/paintOval.jpg")));
	     	character = new JButton(new ImageIcon(getClass().getResource("image/paint2.jpg")));

	    	toolbar = new JToolBar("my Toolbar");
	    	toolbar.add(line);
	        toolbar.add(rectangle);
	        toolbar.add(oval);
	    	toolbar.add(character);
	    	
	    	
	    	add(toolbar, FlowLayout.LEFT);	
	    	
	    	
	    }
	    
	    
	
}
