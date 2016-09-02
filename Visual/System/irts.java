package System;

import java.awt.BorderLayout;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

import JTable.MyTableModel;


public class irts {
      JFrame frame;
      String []ColumnNames={"Нэр", "Монгол-Хэл"," Математик", "Биеийн-Тамир","Дуу-Хөгжим", "Хөдөлмөр"};
      Object[][]data= {
    		  {"Сугараа","Тасалсан","Тасалсан","Тасалсан","Тасалсан","Тасалсан"},
    		  {"Мөөгий","Тасалсан","Тасалсан","Тасалсан","Тасалсан","Тасалсан"},
    		  {"Амраа","Тасалсан","Тасалсан","Тасалсан","Тасалсан","Тасалсан"},
    		  {"Давка","Тасалсан","Тасалсан","Тасалсан","Тасалсан","Тасалсан"},
    		  {"Баагий","Тасалсан","Тасалсан","Тасалсан","Тасалсан","Тасалсан"},
             };
      
        MyTableModel tableModel= new MyTableModel(data, ColumnNames);
		JTable table= new JTable(tableModel); 
   
		public irts(){
			  frame =new JFrame();
			  frame.setTitle("Ирц");
			  frame.setVisible(true);
			  frame.setLocationRelativeTo(null);
			  frame.setSize(700, 500);
			  
			  JComboBox jcboPublishers = new JComboBox();
			  jcboPublishers.addItem("Ирсэн");
			  jcboPublishers.addItem("Чөлөөтөй");
			  jcboPublishers.addItem("Өвчтөй");
			  jcboPublishers.addItem("Тасалсан");
			  
	
			    TableColumn statusColumn1= table.getColumn( "Монгол-Хэл");
			    statusColumn1.setCellEditor(new DefaultCellEditor(jcboPublishers));
			    TableColumn statusColumn2= table.getColumn(" Математик");
			    statusColumn2.setCellEditor(new DefaultCellEditor(jcboPublishers));
			    TableColumn statusColumn3= table.getColumn("Биеийн-Тамир");
			    statusColumn3.setCellEditor(new DefaultCellEditor(jcboPublishers));
			    TableColumn statusColumn4= table.getColumn("Дуу-Хөгжим");
			    statusColumn4.setCellEditor(new DefaultCellEditor(jcboPublishers));
			    TableColumn statusColumn5= table.getColumn("Хөдөлмөр");
			    statusColumn5.setCellEditor(new DefaultCellEditor(jcboPublishers));
			  
		    	  table.setRowHeight(40);
		    	  
		    	frame.add(new JScrollPane(table),BorderLayout.CENTER);  
      }
      
	
}
