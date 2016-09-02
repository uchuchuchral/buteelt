package daalgavar11;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import JTable.MyTableModel;

public class chartView extends JFrame{
      JButton Insert, Delete, Update, VPchart, VBchart;
      JPanel up, down;
      JTable table;
      chartModel CHmodel;
      MyTableModel model;
      
      public chartView(){
    	  this.setTitle("ChartModel");
    	  this.setVisible(true);
    	  this.setSize(300, 300);
    	  this.setLocationRelativeTo(null);
    	  this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    	  
    	  Insert= new JButton("Insert");
    	  Delete= new JButton("Delete");
    	  Update= new JButton("Update");
    	  VPchart= new JButton("View pie chart");
    	  VBchart= new JButton("View bar chart");
    	  
    	  up= new JPanel();
    	  down= new JPanel();
    	  
    	  up.add(Insert);
    	  up.add(Delete);
    	  up.add(Update);
    	  down.add(VPchart);
    	  down.add(VBchart);
    	
    	  
    	  Display();
    	  handlingActions();
    	  add(up,BorderLayout.NORTH);
    	  add(down,BorderLayout.SOUTH);
    	  add(new JScrollPane(table),BorderLayout.CENTER);
          
      }
      
      
      public void handlingActions(){
    	  model.addTableModelListener(new TableModelListener(){

			@Override
			public void tableChanged(TableModelEvent e) {
				
		          JOptionPane.showMessageDialog(null, "table changed "+e.getFirstRow()+" row"
		          		+ e.getColumn()+" column");
				
			}
    		  
    	  });
    	  
    	  
    	  Delete.addActionListener(new ActionListener() {
    		  
    		  public void actionPerformed(ActionEvent e) {
    		    if (table.getSelectedRow() >= 0) {
    		    	((DefaultTableModel)table.getModel()).removeRow(table.getSelectedRow());
    		   
    		 //   	System.out.println("undsen model deerh uurchlult :");
    		 //   	
    		    }
    		   } 
    		  });
    	  
    	  
	  Insert.addActionListener(new ActionListener() {
    		  
    		  public void actionPerformed(ActionEvent e) {
    		    if (table.getSelectedRow() >= 0) {
    		      
    		    	((DefaultTableModel)table.getModel()).addRow(new Object[]{"",""});
    		    	
    		    //	System.out.println("undsen model deerh uurchlult :");
    		    	
    		    }
    		   } 
    		  });
	  
	  
	  Update.addActionListener(new ActionListener() {
		  // update hiih ued table deerh uurchlultiig model ruu shidne 
		  // uuniig dagaad pie chart ntr bas uurchlugduh yostoi 
		  
		  public void actionPerformed(ActionEvent e) {
		        
			    CHmodel.setModel(model);
			    CHmodel.showData();
			    
		   //   	System.out.println("undsen model deerh uurchlult :");
		    	 JOptionPane.showMessageDialog(null, "Updated");
		    }
		
		  });
	  
	    VPchart.addActionListener(new ActionListener() {
		  // update hiih ued table deerh uurchlultiig model ruu shidne 
		  // uuniig dagaad pie chart ntr bas uurchlugduh yostoi 
		  
		  public void actionPerformed(ActionEvent e) {
		        VPchart v2= new VPchart(model);
	
			    
		    }
		
		  });
	    
	    
	    VBchart.addActionListener(new ActionListener() {
			  // update hiih ued table deerh uurchlultiig model ruu shidne 
			  // uuniig dagaad pie chart ntr bas uurchlugduh yostoi 
			  
			  public void actionPerformed(ActionEvent e) {
			        VBchart v2= new VBchart(model);
		
				    
			    }
			
			  });
	  
      }
      
      public void Display(){
    	 
    	  CHmodel= new chartModel();
    	  model=CHmodel.getModel();
          table= new JTable(model);
          
      }
}