package JTable;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.File;
import java.util.EventObject;

import javax.accessibility.Accessible;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.CellEditorListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellEditor;

public class CellRenderer extends DefaultTableCellRenderer implements Accessible {
    /** File chooser */
    private JFileChooser fileChooser;

    private String file = "";

    /**
     * Constructor.
     */
    public CellRenderer() {
      
    //    fileChooser = new JFileChooser();
    }

    public Object getCellEditorValue() {
        return file;
    }

    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        file = value.toString();
        JFileChooser chooser = new JFileChooser();
   
       
        return chooser;
    }

}
