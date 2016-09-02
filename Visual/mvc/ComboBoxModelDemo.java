package mvc;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class ComboBoxModelDemo extends JFrame{
	 ComboBoxCellRenderer cboCellRenderer= new  ComboBoxCellRenderer();
	 
	 public  ComboBoxModelDemo(){
		  this.getContentPane().add(cboCellRenderer, BorderLayout.CENTER);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComboBoxModelDemo frame= new ComboBoxModelDemo();
        frame.setSize(400,300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setTitle("Hutga");
	}

}
