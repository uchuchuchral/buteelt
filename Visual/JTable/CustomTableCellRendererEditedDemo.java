package JTable;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

import daalgavar11.Bodlogo36_1;

public class CustomTableCellRendererEditedDemo extends JFrame {
   
	private String[] columnNames =
		    {"Name", "Birthday", "class status",
			 "In-state", "Photo"};
   
	 JFormattedTextField tft3 = 
			    new JFormattedTextField(new SimpleDateFormat("yyyy-MM-dd"));
			    
	      //      tft3.setValue(new Date());
          //   System.out.println(tft3.getText());
			//    Date date = (Date) tft3.getValue();
			    
	private ImageIcon intro1eImageIcon = new ImageIcon(getClass().getResource("image/man1.jpg"));
	private ImageIcon intro2eImageIcon = new ImageIcon(getClass().getResource("image/man2.jpg"));
	private ImageIcon intro3eImageIcon = new ImageIcon(getClass().getResource("image/man3.jpg"));
	private ImageIcon intro4eImageIcon = new ImageIcon(getClass().getResource("image/woman1.jpg"));
	private ImageIcon intro5eImageIcon = new ImageIcon(getClass().getResource("image/woman2.jpg"));
	
	
	private Object[][] rowData = {
			 {"John", new Date(24,4,1995), "Junior",false, intro1eImageIcon},
			 {"Carter",new Date(1990,9,12), "Junior",false, intro2eImageIcon},
			 {"Elton john", new Date(1990,9,12), "Graduate", true, intro3eImageIcon},
			 {"Angelina",new Date(1990,9,12), "Graduate", false, intro4eImageIcon},
			 {"Rosa", new Date(1990,9,12), "Graduate", true, intro5eImageIcon},
			 
	};
	
	MyTableModel tableModel= new MyTableModel(rowData, columnNames);
	JTable table= new JTable(tableModel);
	
	
	public CustomTableCellRendererEditedDemo() {
		 TableColumn photoColumn = table.getColumn("Photo"); // book photo nertei baganiig awch bn 
		 photoColumn.setCellRenderer(new MyImageCellRenderer()); // custom renderer ee bookcover baganii rendereer uusgelee
		 
		 // combobox talbariig ni uusgii 
		 JComboBox jcboPublishers = new JComboBox();
		  jcboPublishers.addItem("Heshmen");
		  jcboPublishers.addItem("junior");
		  jcboPublishers.addItem("Graduate");
		  
		  TableColumn statusColumn= table.getColumn("class status");
		  statusColumn.setCellEditor(new DefaultCellEditor(jcboPublishers));
		  
		  TableColumn BirthdayColumn= table.getColumn("Birthday");
		  BirthdayColumn.setCellEditor(new DefaultCellEditor(new JTextField()));
		  
		  table.setRowHeight(80);
		  
		  add(new JScrollPane(table),BorderLayout.CENTER);
		   handlingActions();
		   
		  
	}
 
	public void handlingActions(){
		  tableModel.addTableModelListener(new TableModelListener(){

			@Override
			public void tableChanged(TableModelEvent e) {
				// TODO Auto-generated method stub
				 
				 int row= e.getFirstRow();
				 int column=e.getColumn();
		    	 System.out.println(row+" : mur " +column+": bagana ");
			     TableModel model1= (TableModel)e.getSource();
			     String columnName=model1.getColumnName(column);
				 Object Data =model1.getValueAt(row, column); 
				 System.out.println("undsen model deer ="+Data.toString()); // ene ni undsen model deer hiisen uurchlult bish yum
				// model1.setValueAt(Data, row, column); 
			      rowData[row][column]=Data;
			      
				 System.out.println("undsen ugugdul deer ="+rowData[row][column]);
					
					// odoo harin jinhene modeld uurchlult uu oruulii
			//	 model.setValueAt(Data, row, column);
		
			}
			  
		  });
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CustomTableCellRendererEditedDemo frame= new CustomTableCellRendererEditedDemo();
		 frame.setSize(new Dimension(400,150));
      // frame.setSize(400,300); 
		 frame.pack();
		 frame.setVisible(true);
		 frame.setLocationRelativeTo(null);
		 frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
	
	

}
