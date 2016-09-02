package GUI1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Hutga extends JFrame{
    JButton result;
    JTextField f1, f2;
    JLabel l1,l2;
	
    
    public Hutga(){
    	result= new JButton("result");
    	f1= new JTextField();
    	f2= new JTextField();
    	
    	l1= new JLabel("x");
    	l2= new JLabel("y");
    	
    	this.setLayout(new GridLayout(3,2));
    	add(l1);
    	add(f1);
    	add(l2);
    	add(f2);
    	add(result);
    	
    	
    	result.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double d1=Double.parseDouble(f1.getText());
				
				if(d1>1000){
					d1=Math.pow(d1, 3);
					f2.setText(String.valueOf(d1));
				}
				else{
					f2.setText(String.valueOf(d1));
				}
			}
			
    		
    		
    	});
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Hutga frame = new Hutga();
         frame.setSize(400,400);
         frame.setVisible(true);
         frame.setLocationRelativeTo(null);
         frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
         frame.setTitle("Hutga");
         
	}

}
