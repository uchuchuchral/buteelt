package daalgavar11;

import hicheelJava7.Loan;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

import JTable.TestTable;

// huudas 1268
// huudas 547
public class Bodlogo36_1 extends JFrame{
      JPanel p1,p2,p3;
      JSpinner amountSpinner, yearsSpinner, rateSpinner;
      JLabel loanLabel, yearsLabel, rateLabel, upLabel;
      JButton display;
      JTable table;
      DefaultTableModel tableModel;  // tsaanaasaa bdag table model ashiglay 
      
      
	public Bodlogo36_1(){
		
		p1= new JPanel(new GridLayout(3,2));
		loanLabel= new JLabel("Loan Amount");
		yearsLabel= new JLabel("Number of years");
		rateLabel= new JLabel("Annual interest Rate");
		amountSpinner= new JSpinner(new SpinnerNumberModel(100000, 1000, 500000, 500));
		yearsSpinner= new JSpinner(new SpinnerNumberModel(15, 1, 40, 1));
		rateSpinner= new JSpinner(new SpinnerNumberModel(5, 1, 100, 0.125));
		
		p1.add(loanLabel);
		p1.add(amountSpinner);
		p1.add(yearsLabel);
        p1.add(yearsSpinner);
        p1.add(rateLabel);
        p1.add(rateSpinner);
        
        p2= new JPanel(new BorderLayout());
        p2.add(p1, BorderLayout.CENTER);
        upLabel= new JLabel("Enter Loan amount, Number of years and Annual interest rate");
        p2.add(upLabel, BorderLayout.NORTH);
        display = new JButton("Display loan schedule");
        p2.add(display,BorderLayout.EAST);
        
        this.setLayout(new BorderLayout());
        this.add(p2, BorderLayout.NORTH);
		
        
        table = new JTable();
		tableModel= new DefaultTableModel();
		 
        defaultTabling();
        this.add(new JScrollPane(table), BorderLayout.CENTER);
        
        display.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
			   defaultTabling();
				
			}
        	
        });
	}
	
	
	public void defaultTabling(){
		
		 
		 String []columnNames={"Payment","Interest","Principal","Balance"};
		 Object [][]data=new Object[1000][4];
		 
		 double amount= Double.parseDouble(amountSpinner.getValue().toString());
		 System.out.println("amount ="+amount);
		 int years= Integer.parseInt(yearsSpinner.getValue().toString());
		 System.out.println("years ="+years);
		 double rate = Double.parseDouble(rateSpinner.getValue().toString());
		 System.out.println("rate ="+rate);
		 
		 Loan l1= new Loan(rate, years, amount);
		 for(int i=0; i<years*12; i++){
			 
	//		 System.out.println("sard tuluh hemjee ="+l1.getMonthlyPayment());
			 double p=l1.getLoanAmount()/100;
			 p=p*rate;  // p ni jild tuluh huugiin hemjee
			 p=p/12; // sard tuluh huugiin hemjee
			 double p1=l1.getMonthlyPaymentNew()-p;
			 p=Math.round(p*100.0)/100.0;
		//	 System.out.println("sard tuluh zeeliin huugiin hemjee = "+p);
		 
			 p1=Math.round(p1*100.0)/100.0;
		//	 System.out.println("sard tuluh undsen zeeliin hemjee = "+p1);
		//	 System.out.println("niit tuluh hemjee ="+l1.getTotalPayment());
		     l1.setLoanAmount(l1.getLoanAmount()-p1);
		     l1.setNumberOfMonths(l1.getNumberOfMonths()-1);
		     
		     data[i][0]=i+1;
		     data[i][1]=p;
		     data[i][2]=p1;
		     data[i][3]=l1.getLoanAmount();
		     
		 }
		 
		 tableModel.setDataVector(data, columnNames);
		 table.setModel(tableModel);
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Bodlogo36_1 frame= new Bodlogo36_1();
		 frame.setSize(new Dimension(400,150));
      // frame.setSize(400,300); 
		 frame.pack();
		 frame.setVisible(true);
		 frame.setLocationRelativeTo(null);
		 frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
}
