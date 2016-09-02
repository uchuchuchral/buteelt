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

public class Bichih {
	JFrame frame;  
	JButton hadgalah, butsah;
	JPanel pUp, pDown,pCenter;
	JLabel on, sar, udur, note;
	JTextField onf, sarf, udurf;
	JTextArea jta;
	connectSQLDiary csd1;
	JCalendar cal;
    int zurag; /// songogdson emoticon ii zurgiin dugaariig hadgalna 
	JButton i1,i2,i3,i4; // emoticon ii buttonuud 


	public Bichih(){
		frame = new JFrame();
		frame.setTitle("Temdeglel bichih ");
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setSize(700, 500);
		frame.setLayout(new BorderLayout());

		// i1= new JButton();
        zurag=0;
        
		ButtonListener listener= new ButtonListener();
		ImageIcon one = new ImageIcon(getClass().getResource("image/1.jpg"));
		//Check this
		i1 = new JButton(one);
		i1.setPreferredSize( new Dimension(110, 100));
		ImageIcon two = new ImageIcon(getClass().getResource("image/2.jpg"));
		//Check this
		i2 = new JButton(two);
		i2.setPreferredSize( new Dimension(110, 100));
		ImageIcon three = new ImageIcon(getClass().getResource("image/3.jpg"));
		//Check this
		i3 = new JButton(three);
		i3.setPreferredSize( new Dimension(110, 100));
		ImageIcon four = new ImageIcon(getClass().getResource("image/4.jpg"));
		//Check this
		i4 = new JButton(four);
		i4.setPreferredSize( new Dimension(110, 100));
		
		
        // sonsoh uzegdeld burtguuleh heseg 
		i1.addActionListener(listener);
        i2.addActionListener(listener);
        i3.addActionListener(listener);
        i4.addActionListener(listener);
     

		csd1= new connectSQLDiary();

		// cal= new JCalendar();
		cal = new JCalendar();

		hadgalah= new JButton("Хадгалах");
		butsah= new JButton("Буцах");

		on = new JLabel("он:");
		onf= new JTextField(4);
		sar = new JLabel("сар:");
		sarf = new JTextField(2);
		udur = new JLabel("өдөр:");
		udurf= new JTextField(2);

		note= new JLabel("Тэмдэглэл:");
		jta= new JTextArea(20,60);
		jta.setForeground(Color.blue);
		JScrollPane scrollPane = new JScrollPane(jta); 


		pUp= new JPanel(new FlowLayout());
		// pUp.add(on); pUp.add(onf); pUp.add(sar); pUp.add(sarf); pUp.add(udur); pUp.add(udurf); 
		pUp.add(cal);
		pUp.add(i1); pUp.add(i2); pUp.add(i3); pUp.add(i4);  

		pCenter= new JPanel(new FlowLayout());
		pCenter.add(note);
		pCenter.add(scrollPane);
		// pCenter.add(cal);


		pDown= new JPanel(new GridLayout(1,2));
		pDown.add(hadgalah); pDown.add(butsah);

		frame.add(pUp, BorderLayout.NORTH);
		frame.add(pCenter, BorderLayout.CENTER);
		frame.add(pDown, BorderLayout.SOUTH);

		Listener();


	}

	public void Listener(){ // sonsoh uzegdliig bichih heseg 
		hadgalah.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				// create a calendar


				// get the value of all the calendar date fields.
				int year=(cal.getYearChooser().getYear());
				int month= cal.getMonthChooser().getMonth();
				int day = cal.getDayChooser().getDay();

				month+=1;
				System.out.println(year+":"+month+":"+day);
				String y1= String.valueOf(year);
				String m1= String.valueOf(month);
				String d1= String.valueOf(day);



				try {
					csd1.setTemdeglel(y1, m1, d1
							, jta.getText(),zurag);
					JOptionPane.showMessageDialog(frame, "Aмжилттай хадгалагдлаа.");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				frame.setVisible(false);
				new Menu();
			}

		});

		butsah.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				new Menu();
			}

		});

	}

	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==i1){
				 i1.setBorder(new LineBorder(Color.RED, 8));
				 i2.setBorder(new LineBorder(Color.WHITE, 0));
				 i3.setBorder(new LineBorder(Color.WHITE, 0));
				 i4.setBorder(new LineBorder(Color.WHITE, 0));
				 
				 zurag=1;
		         
			}
			if(e.getSource()==i2){
				 i2.setBorder(new LineBorder(Color.RED, 8));
				 i1.setBorder(new LineBorder(Color.WHITE, 0));
				 i3.setBorder(new LineBorder(Color.WHITE, 0));
				 i4.setBorder(new LineBorder(Color.WHITE, 0));
				 
				 zurag=2;
				 
			}
			if(e.getSource()==i3){
				 i3.setBorder(new LineBorder(Color.RED, 8));
				 i2.setBorder(new LineBorder(Color.WHITE, 0));
				 i1.setBorder(new LineBorder(Color.WHITE, 0));
				 i4.setBorder(new LineBorder(Color.WHITE, 0));
				 
				 zurag=3;
			}
			if(e.getSource()==i4){
				 i4.setBorder(new LineBorder(Color.RED, 8));
				 i2.setBorder(new LineBorder(Color.WHITE, 0));
				 i3.setBorder(new LineBorder(Color.WHITE, 0));
				 i1.setBorder(new LineBorder(Color.WHITE, 0));
				 
				 zurag=4;
			}
			
		}

	}

}
