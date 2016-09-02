package GUI1;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultiSelection extends JFrame{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel left, right, center,panel1;
    JButton copyButton;
	JList colorList, copyList;
    
	String []colorNames ={"Black","Blue","Cyan", "Dark Gray","Gray","Green","Light Gray","Magenta","Orange","Pink","Red","White","Yellow"};
    
	
    public MultiSelection(){
    	    setLayout(new FlowLayout());
    	    left= new JPanel();
    	    right= new JPanel();
    	    center= new JPanel();
    	    panel1= new JPanel();
    	    copyButton= new JButton("copy>>>");
    	    
    	    colorList=new JList(colorNames);
    	    colorList.setVisibleRowCount(5);  // 5n mur haragdana
    	    colorList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // 1l element songodog bhaar 
    	    copyList=new JList();
    	    copyList.setVisibleRowCount(5);  // 5n mur haragdana
    	    copyList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // zavsraar songono 
    	    
    	    left.add(new JScrollPane(colorList));
    	    right.add(new JScrollPane(copyList));
    	    center.add(copyButton);
    	    
    	    
    	    this.add(left);
    	    this.add(center);
    	    this.add(right);
    	    
    	    
    	    copyButton.addActionListener(new ActionListener(){
				
    	    	@SuppressWarnings("deprecation")
    	    	public void actionPerformed(ActionEvent e) {
			
				 	int []in =colorList.getSelectedIndices();
    	 //   		for(int i=0; i<in.length; i++){
    	    			copyList.setListData(colorList.getSelectedValues());
    	    			
    	   // 		}
				 	
				}
    	    	
    	    	
    	    	
    	    });
    	    
    }
    
	public static void main(String[] args) {
		 MultiSelection frame= new MultiSelection();
		 frame.setSize(500, 150);
		 frame.setTitle("List");
		 frame.setVisible(true);
		 frame.setLocationRelativeTo(null);
		 frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		 

	}

}
