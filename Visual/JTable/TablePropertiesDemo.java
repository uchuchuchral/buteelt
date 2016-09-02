package JTable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TablePropertiesDemo extends JFrame{
      String [] columnNames={"Country", "Capital", "Population in Millions", "Democracy"};
	  // table iin ugugdulvvdiig uusgeh 
      Object [][] data={
			  {"USA", "Washington DC", 280, true},
			   {"Canada", "Ottawa", 32, true},
			   {"United Kingdom", "London", 60, true},
			   {"Germany", "Berlin", 83, true},
			   {"France", "Paris", 60, true},
			   {"Norway", "Oslo", 4.5, true},
			   {"India", "New Delhi", 1046, true}	  
	  };
	  
      // table ee uusgeh 
      JTable table1= new JTable(data, columnNames);
      // 2spinner uusgii 
      private JSpinner jspiRowHeight = new JSpinner(new SpinnerNumberModel(16, 1, 50, 1));
      // spinerNumberModel ni too guilgeh ued hereglene 
      // spinnert ehleh too ni 16
      // min utga ni 1   max utga ni 50 
      // suuliin 1 gedeg ni step buyu darah ued 1 eer hasagdana 1 eer nemegdene gsn ug 
      
      private JSpinner jspiRowMargin = new JSpinner(new SpinnerNumberModel(1, 1, 50, 1));
      private JCheckBox jchkShowGrid = new JCheckBox("showGrid", true);
      
      private JComboBox jcboAutoResizeMode = new JComboBox(new String[]{
    		   "AUTO_RESIZE_OFF", "AUTO_RESIZE_LAST_COLUMN",
    		   "AUTO_RESIZE_SUBSEQUENT_COLUMNS", "AUTO_RESIZE_NEXT_COLUMN",
    		   "AUTO_RESIZE_ALL_COLUMNS"});
      
      public TablePropertiesDemo(){
    	  JPanel panel1 = new JPanel();
    	   panel1.add(new JLabel("rowHeight"));
    	   panel1.add(jspiRowHeight);
    	   
    	   panel1.add(new JLabel("rowMargin"));
    	    panel1.add(jspiRowMargin);
    	    panel1.add(jchkShowGrid);
    	  
    	    JPanel panel2 = new JPanel();
    	    panel2.add(new JLabel("autoResizeMode"));
    	    panel2.add(jcboAutoResizeMode);
    	   
    	   add(panel1, BorderLayout.SOUTH);
    	   add(panel2, BorderLayout.NORTH);
    	   add(new JScrollPane(table1));
    	   
    	   table1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    	   table1.setSelectionForeground(Color.WHITE);
    	   table1.setSelectionBackground(Color.RED);
    	   table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    	   table1.setGridColor(Color.BLUE);
    	   
    	   
    	   
    	   jspiRowHeight.addChangeListener(new ChangeListener() {
    		    public void stateChanged(ChangeEvent e) {
    		        table1.setRowHeight(
    		        ((Integer)(jspiRowHeight.getValue())).intValue());
    		    }
    		    });
    	   
    	   jspiRowMargin.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				 table1.setRowMargin(
						 ((Integer) (jspiRowMargin.getValue())).intValue());
				
			}
    		   
    		   
    	   });   // spinner sonsoh uzegdel
    	   
    	   jchkShowGrid.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				table1.setShowGrid(jchkShowGrid.isSelected());
			}
    		   
    	   });
    	   
    	   
    	   jcboAutoResizeMode.addActionListener(new ActionListener() {
    		    public void actionPerformed(ActionEvent e) {
    		    String selectedItem =
    		    (String)jcboAutoResizeMode.getSelectedItem();
    		   
    		    if (selectedItem.equals("AUTO_RESIZE_OFF"))
    		    table1.setAutoResizeMode(table1.AUTO_RESIZE_OFF);
    		    else if (selectedItem.equals("AUTO_RESIZE_LAST_COLUMN"))
    		    table1.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
    		    else if (selectedItem.equals
    		    ("AUTO_RESIZE_SUBSEQUENT_COLUMNS"))
    		    table1.setAutoResizeMode(
    		    table1.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
    		    else if (selectedItem.equals("AUTO_RESIZE_NEXT_COLUMN"))
    		    table1.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
    		    else if (selectedItem.equals("AUTO_RESIZE_ALL_COLUMNS"))
    		    table1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    		    }
    		     });
    	   
      }
      
           
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TablePropertiesDemo frame= new TablePropertiesDemo();
		 frame.setSize(new Dimension(400,150));
     // frame.setSize(400,300); 
		 frame.pack();
		 frame.setVisible(true);
		 frame.setLocationRelativeTo(null);
		 frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

}
