package JTable;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import GUI1.Painter;

public class TableDemo extends JFrame {
    
	JTable table;
	MyTableModel model;
	
	
	public TableDemo(String Title){
		super(Title);
		
		addControls();
	}
	
	public void addControls(){
		model= new MyTableModel();
		table= new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(400,80));
    	table.setFillsViewportHeight(true);
    	
			
	      
		
		TableColumn column= null;
		for(int i=0; i<5; i++){
			column=table.getColumnModel().getColumn(i);  // 0 deh bagana iin objectiig columnd hadgalii 
			if(i==2){
			   column.setPreferredWidth(100);	// 2dahi baganiin hemjeeg urgusguluu . 
			}
			else{
			   column.setPreferredWidth(50);	
			}
		}
		
	 	table.setColumnSelectionAllowed(true);
	//	table.setCellSelectionEnabled(true);
		
		model.addTableModelListener(new TableModelListener(){
			public void tableChanged(TableModelEvent e) {
			 int row= e.getFirstRow();
			 int column=e.getColumn();
	//		 System.out.println(row+" : mur " +column+": bagana ");
	//	     TableModel model1= (TableModel)e.getSource();
	//	     String columnName=model1.getColumnName(column);
	//		 Object Data =model1.getValueAt(row, column); 
	//		 System.out.println(Data.toString()); // ene ni undsen model deer hiisen uurchlult bish yum
			 
				
				// odoo harin jinhene modeld uurchlult uu oruulii
		//	 model.setValueAt(Data, row, column);
			// model.fireTableStructureChanged();
			}
		 
		
			
		});
		
		this.add(new JScrollPane(table),BorderLayout.CENTER); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     createAndShowGUI();
	}

	public static void createAndShowGUI(){
		TableDemo frame= new TableDemo("Table Demo");
		 frame.setSize(new Dimension(400,150));
       // frame.setSize(400,300); 
		 frame.pack();
		 frame.setVisible(true);
		 frame.setLocationRelativeTo(null);
		 frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
 
	
	class MyTableModel extends AbstractTableModel{
		String [] columnNames= {"First Name", "Last Name","Sport", "# of Years","Vegetarian"};
		Object[][] data={
				{"Mary","Campione","SnowBoarding",new Integer(5),new Boolean(false)},
				{"Alison","Huml","Rowing",new Integer(3),new Boolean(true)},
				{"Kathy","Walrath","Knitting",new Integer(2),new Boolean(false)},
				{"Sharon","Zakhour","Speed reading",new Integer(20),new Boolean(true)},
				{"Philip","Milne","Pool",new Integer(10),new Boolean(false)},
				};
		
		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return columnNames.length;
		}

		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return data.length;
		}

		@Override
		public Object getValueAt(int row, int column) {
			// TODO Auto-generated method stub
			return data[row][column];
		}
		
		public Class getColumnClass(int c){
			return getValueAt(0,c).getClass();
		}
		
		public boolean isCellEditable(int row, int column){
			if(column<2){
				return false;
			}
			else{
				return true;
			}
		}
		
		public void setValueAt(Object value, int row , int col){
			data[row][col]=value;
			fireTableCellUpdated(row,col);
			//System.out.println(model.getValueAt(row, col));
		}
	}

}
