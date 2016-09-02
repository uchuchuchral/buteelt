package pro_dadlaga;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JCalendar;

public class Delgerengui {
	JFrame frame;  
	JButton butsah;
	JPanel pUp, pDown,pCenter;
	JLabel on;
	//	JTextField onf, sarf, udurf;
	JTextArea jta;
	connectSQLDiary csd1;
	//	JCalendar cal;
	int zurag; /// songogdson emoticon ii zurgiin dugaariig hadgalna 
	JButton i1; // emoticon ii buttonuud 


	public Delgerengui(String onSar,String temdeglel, int image){ // onsar ,emoticon text 3iig parametreeree awna
		frame = new JFrame();
		frame.setTitle("Delgerengui unshih");
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setSize(700, 500);
		frame.setLayout(new BorderLayout());

		// i1= new JButton();
		zurag=image;


		String res="image/"+image+".jpg";
		ImageIcon one = new ImageIcon(getClass().getResource(res));
		//Check this
		i1 = new JButton(one);
		i1.setPreferredSize( new Dimension(110, 100));



		csd1= new connectSQLDiary();

		butsah= new JButton("¡Ûˆ‡ı");

		on=new JLabel(onSar);


		jta= new JTextArea(20,60);
		jta.setEditable(false);
		jta.setForeground(Color.blue);
		jta.setText(temdeglel);
		JScrollPane scrollPane = new JScrollPane(jta); 


		pUp= new JPanel(new FlowLayout());
		// pUp.add(on); pUp.add(onf); pUp.add(sar); pUp.add(sarf); pUp.add(udur); pUp.add(udurf); 
		//pUp.add(cal);
		pUp.add(on);
		pUp.add(i1); 

		pCenter= new JPanel(new FlowLayout());
		pCenter.add(scrollPane);
		// pCenter.add(cal);


		pDown= new JPanel(new FlowLayout());
		pDown.add(butsah);

		frame.add(pUp, BorderLayout.NORTH);
		frame.add(pCenter, BorderLayout.CENTER);
		frame.add(pDown, BorderLayout.SOUTH);

		Listener();


	}


	public void Listener(){ // sonsoh uzegdliig bichih heseg 

		butsah.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				try {
					new Unshih();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});

	}



}
