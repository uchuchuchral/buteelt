package layoutheseg;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class NoGridBagLayout {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    JFrame frame= new JFrame("NOGridBag");
    frame.setVisible(true);
    frame.setSize(500, 500);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JButton saveAs= new JButton("Save as");
    JButton ok= new JButton("ok");
    JButton exit= new JButton("exit");
    JTextField jt= new JTextField();
    
    
    JPanel panel1= new JPanel();
    panel1.setLayout(new BorderLayout());
    
    JTextArea ar1= new JTextArea(12,40);
    panel1.add(ar1, BorderLayout.CENTER);
    //panel1.add(new JButton("haha"), BorderLayout.NORTH);
    
    JPanel panel2= new JPanel();
    panel2.setLayout(new GridLayout(2,1));
    
    
    JPanel panel3= new JPanel();
    JPanel panel4= new JPanel();
    panel3.setLayout(new BorderLayout());
    panel3.add(saveAs, BorderLayout.WEST);
    panel3.add(jt, BorderLayout.CENTER);
    panel4.setLayout(new FlowLayout(FlowLayout.RIGHT));
    panel4.add(ok);
    panel4.add(exit);
    
    panel2.add(panel3);
    panel2.add(panel4);
    
    panel1.add(panel2, BorderLayout.SOUTH);
    
    frame.setLayout(new BorderLayout());
    frame.add(panel1,BorderLayout.CENTER);
	}

}
