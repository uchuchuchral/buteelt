package JTable;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;

public class Example {
	
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.getContentPane().setLayout(new BorderLayout());

    MyTableModel1 model = new MyTableModel1();

    JTable table = new JTable(model);
    table.setRowHeight(80);
    table.getColumnModel().getColumn(0).setCellRenderer(new ImageRenderer());
    JScrollPane pane = new JScrollPane(table);
    
    frame.getContentPane().add(BorderLayout.CENTER, pane);
    frame.setSize(500, 400);
    frame.setVisible(true);
  }
}

class MyTableModel1 extends AbstractTableModel {
	public MyTableModel1(){
		
	}
  public Object getValueAt(int row, int column) {
    return "" + (row * column);
  }

  public int getColumnCount() {
    return 4;
  }

  public int getRowCount() {
    return 5;
  }
}

class ImageRenderer extends DefaultTableCellRenderer {
  JLabel lbl = new JLabel();

  ImageIcon icon = new ImageIcon(getClass().getResource("image/man1.jpg"));

  public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
      boolean hasFocus, int row, int column) {
    lbl.setText((String) value);
    lbl.setIcon(icon);
    return lbl;
  }
}