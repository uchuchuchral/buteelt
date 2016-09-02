package mvc;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComboBoxCellRenderer extends JPanel{
          private final static int NUMBER_OF_NATIONS=5;
          private String[] nations={"US","UK","China","Denmark","Germany"};
          private ImageIcon[] icons=new ImageIcon[NUMBER_OF_NATIONS];
          private ImageIcon[] bigIcons=new ImageIcon[NUMBER_OF_NATIONS];
          
          private DefaultComboBoxModel model = new DefaultComboBoxModel();
	      private JLabel jlblImage= new JLabel("",JLabel.CENTER); // label dotroo golloj bairlana
	      
	      private JComboBox jcboCountries= new JComboBox(model);
	      MyListCellRenderer renderer= new MyListCellRenderer();
	      
	      public ComboBoxCellRenderer(){
	    	  this.setLayout(new BorderLayout());
	    	  icons[0]=new ImageIcon(getClass().getResource("image/flag icon1.gif"));
	    	  icons[1]=new ImageIcon(getClass().getResource("image/flag icon2.jpg"));
	    	  icons[2]=new ImageIcon(getClass().getResource("image/flag icon3.png"));
	    	  icons[3]=new ImageIcon(getClass().getResource("image/flag icon5.png"));
	    	  icons[4]=new ImageIcon(getClass().getResource("image/flag icon4.png"));
	    	  
	    	  bigIcons[0]=new ImageIcon(getClass().getResource("image/US icon1.gif"));
	    	  bigIcons[1]=new ImageIcon(getClass().getResource("image/uk icon1.jpg"));
	    	  bigIcons[2]=new ImageIcon(getClass().getResource("image/china.png"));
	    	  bigIcons[3]=new ImageIcon(getClass().getResource("image/denmark icon1.png"));
	    	  bigIcons[4]=new ImageIcon(getClass().getResource("image/germany icon1.png"));
	    	  
	    	  
	    	  for(int i=0; i<NUMBER_OF_NATIONS; i++){
	    		  
	    		  model.addElement(new Object[]{icons[i],nations[i]});
	    	  }
	    	  
	    	  jcboCountries.setRenderer(renderer);
	    	  add(jcboCountries,BorderLayout.NORTH);
	    	  add(jlblImage, BorderLayout.CENTER);
	    	  
	    	  
	    	  jcboCountries.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Object item=model.getSelectedItem();
					jlblImage.setIcon(bigIcons[jcboCountries.getSelectedIndex()]);
				}
	    		  
	    	  });
	      }
}
