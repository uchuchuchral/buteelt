package JTable;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TestTable extends JFrame{
	private String[] columnNames={"Country", "Capital", "Population in Millions", "Democracy"};  // bagana buriin deer bairlah neriig 
    private Object[][] data={  // husnegted garah ugugdlvvdiig data massivd hadgalna
    		{"USA", "Washington DC", 280, true},
    		{"Canada", "Ottawa", 32, true},
    		{"United Kingdom", "London", 60, true},
    	    {"Germany", "Berlin", 83, true},
    	    {"France", "Paris", 60, true},
    	    {"Norway", "Oslo", 4.5, true},
    		{"India", "New Delhi", 1046, true}	
    };
	
    private JTable table1 = new JTable(data, columnNames);
    
    
    public TestTable(){
    	this.add(new JScrollPane(table1));
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	TestTable frame= new TestTable();
		 frame.setSize(new Dimension(400,150));
      // frame.setSize(400,300); 
		 frame.pack();
		 frame.setVisible(true);
		 frame.setLocationRelativeTo(null);
		 frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

}
