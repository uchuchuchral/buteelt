package pro_dadlaga;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
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

public class hailt {
	JFrame frame;  
	JButton haih, butsah;
	JPanel pUp, pDown,pCenter,pCen, pUp1, pUp2, pUp3;
	JLabel note, aguulga,emoticon,onTsag, ehlel,tugsgul; // hailt hiih turlvvd 

	JTextField jtAguulga;
	JTextArea jta;
	connectSQLDiary csd1;
	JCalendar cal1, cal2; // ehlel tugsgul daragdah calendaruud 
	int zurag; /// songogdson emoticon ii zurgiin dugaariig hadgalna 
	JButton i1,i2,i3,i4; // emoticon ii buttonuud 
	ArrayList<String> listDate = new ArrayList<String>();
	int []zurags= new int[5]; // emoticonuudig hadgalah massiv


	public hailt(){
		frame = new JFrame();
		frame.setTitle("Temdeglel haih ");
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setSize(900, 700);
		frame.setLayout(new BorderLayout());

		// i1= new JButton();
		zurag=0;

		for(int i=0; i<5; i++){
			zurags[i]=5;  // ehleed bugdiin 5 aar duurgene
		}


		ButtonListener listener= new ButtonListener();
		ImageIcon one = new ImageIcon(getClass().getResource("image/1.jpg"));
		//Check this
		i1 = new JButton(one);
		i1.setPreferredSize( new Dimension(60, 50));
		ImageIcon two = new ImageIcon(getClass().getResource("image/2.jpg"));
		//Check this
		i2 = new JButton(two);
		i2.setPreferredSize( new Dimension(60, 50));
		ImageIcon three = new ImageIcon(getClass().getResource("image/3.jpg"));
		//Check this
		i3 = new JButton(three);
		i3.setPreferredSize( new Dimension(60, 50));
		ImageIcon four = new ImageIcon(getClass().getResource("image/4.jpg"));
		//Check this
		i4 = new JButton(four);
		i4.setPreferredSize( new Dimension(60, 50));


		// sonsoh uzegdeld burtguuleh heseg 
		i1.addActionListener(listener);
		i2.addActionListener(listener);
		i3.addActionListener(listener);
		i4.addActionListener(listener);


		csd1= new connectSQLDiary();

		// cal= new JCalendar();
		cal1 = new JCalendar();
		cal2 = new JCalendar();


		haih= new JButton("Хайх");
		butsah= new JButton("Буцах");

		pUp1= new JPanel(new GridLayout(1,5)); // calendaraar hailt hiih panel 
		pUp2= new JPanel(new GridLayout(2,1)); // aguulgaar hailt hiih panel
		pUp3= new JPanel(new GridLayout(1,5));// emoticonoor hailt hiih panel 

		aguulga= new JLabel("Агуулгаар хайх:");
		emoticon= new JLabel("emoticon оор хайх:");
		onTsag= new JLabel("он сар завсараар хайх:");
		ehlel= new JLabel("эхлэл");
		tugsgul= new JLabel("төгсгөл");

		jtAguulga= new JTextField("");

		pUp1.add(onTsag); pUp1.add(ehlel); pUp1.add(cal1); pUp1.add(tugsgul); pUp1.add(cal2);
		pUp2.add(aguulga); pUp2.add(jtAguulga);
		pUp3.add(emoticon); pUp3.add(i1); pUp3.add(i2); pUp3.add(i3); pUp3.add(i4);  
		// pUp3.setAlignmentX(2);

		note= new JLabel("Тэмдэглэл:");
		jta= new JTextArea(20,60);
		jta.setForeground(Color.blue);
		JScrollPane scrollPane = new JScrollPane(jta); 


		pUp= new JPanel(new BorderLayout());
		// pUp.add(on); pUp.add(onf); pUp.add(sar); pUp.add(sarf); pUp.add(udur); pUp.add(udurf); 
		pUp.add(pUp1,BorderLayout.CENTER); pUp.add(pUp2,BorderLayout.NORTH); pUp.add(pUp3,BorderLayout.SOUTH);




		pCenter= new JPanel(new BorderLayout());
		pCen= new JPanel();
		//JScrollPane scrollPane1 = new JScrollPane(pCen); 
		//	pCenter.add(note);
		//		pCenter.add(scrollPane);
		// pCenter.add(cal);
		pCenter.add(pCen, BorderLayout.CENTER);

		pDown= new JPanel(new GridLayout(1,2));
		pDown.add(haih); pDown.add(butsah);

		frame.add(pUp, BorderLayout.NORTH);
		frame.add(pCenter, BorderLayout.CENTER);
		frame.add(pDown, BorderLayout.SOUTH);

		Listener();


	}

	public void Listener(){ // haih towch darah ued songogdson medeelluudiig awaad uur class ruu shideh yostoi
		haih.addActionListener(new ActionListener(){

			boolean hmm=true; // true bwal on sariin zavsariig zuw oruulsan gsn ug 

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			//	pCen.removeAll();
				listDate.clear();
				pCenter.removeAll();
			    pCenter.repaint();
				frame.revalidate();
				int songolt=0;  // 1 bol aguulga 2 bol date 3 bol emoticon 4 bol bugd 



				int year1=(cal1.getYearChooser().getYear());
				int month1= (cal1.getMonthChooser().getMonth());
				int day1 =( cal1.getDayChooser().getDay());

				month1+=1;

				String y1= String.valueOf(year1);
				String m1= String.valueOf(month1);
				String d1= String.valueOf(day1);

				int year2=(cal2.getYearChooser().getYear());
				int month2=( cal2.getMonthChooser().getMonth());
				int day2 = (cal2.getDayChooser().getDay());

				month2+=1;

				String y2= String.valueOf(year2);
				String m2= String.valueOf(month2);
				String d2= String.valueOf(day2);

				String date1=y1+"-"+m1+"-"+d1;
				String date2=y2+"-"+m2+"-"+d2;

				System.out.println("date1"+date1);
				System.out.println("date2"+date2);

				if(year1<=year2){
					if(year1==year2){
						if(month1<=month2){
							if(month1==month2){
								if(day1<=day2){
									if(day1==day2){
										//			hmm=false; 
									}

								}
								else{
									hmm=false;
								}

							}
						}
						else{
							hmm=false;
						}
					}
				}
				else{
					hmm=false; //bolohgui gsn ug
				}

				if(!hmm){ // buruu oruulsan bwal 
					JOptionPane.showMessageDialog(frame,"Уучлаарай он сарын завсарыг зөв оруулна уу!");

				}
				else{


					if(isEmptyDate(year1, year2, month1, month2, day1, day2)==false && 
							isEmptyAguulga()==false && isEmptyArray()==false){


						songolt=0;
						JOptionPane.showMessageDialog(frame,"Уучлаарай 1юм оруулна уу!");

					}

					else if(isEmptyDate(year1, year2, month1, month2, day1, day2)==true && 
							isEmptyAguulga()==true && isEmptyArray()==true){
						songolt=4;

					}

					else if(isEmptyDate(year1, year2, month1, month2, day1, day2)==true && 
							isEmptyAguulga()==false && isEmptyArray()==false){
						songolt=2;

					}

					else	 if(isEmptyDate(year1, year2, month1, month2, day1, day2)==false && 
							isEmptyAguulga()==true && isEmptyArray()==false){
						songolt=1;

					}

					else if(isEmptyDate(year1, year2, month1, month2, day1, day2)==false && 
							isEmptyAguulga()==false && isEmptyArray()==true){
						songolt=3;

					}

					else if(isEmptyDate(year1, year2, month1, month2, day1, day2)==true && 
							isEmptyAguulga()==true && isEmptyArray()==false){
						songolt=5;

					}

					else if(isEmptyDate(year1, year2, month1, month2, day1, day2)==false && 
							isEmptyAguulga()==true && isEmptyArray()==true){
						songolt=6;

					}

					else if(isEmptyDate(year1, year2, month1, month2, day1, day2)==true && 
							isEmptyAguulga()==false && isEmptyArray()==true){
						songolt=7;

					}

			//		JOptionPane.showMessageDialog(frame,songolt+" Songogdson");

					String query="SELECT * FROM diary JOIN text ON diary.id=text.diary_id";
					String temdeglel=jtAguulga.getText();
					//zurag gedeg huwisagchid emoticonii utga bgaa 
					// text gedeg ni aguulga shd
					switch(songolt){
					case 1:  //zuwhun texteer 
						query+=" WHERE text.text LIKE ";
						query+="'%"+temdeglel+"%'";
						JOptionPane.showMessageDialog(frame,"Зөвхөн текстээр");
						break;

					case 2:
						query+=" WHERE diary.create_date BETWEEN ";
						query+="'"+date1+"'";
						query+=" AND ";
						query+="'"+date2+"'";
						JOptionPane.showMessageDialog(frame,"Date ээр");
						break;

					case 3://
						query+=" WHERE image IN (";
						query+=zurags[0];
						for(int i=1; i<5; i++){
							query+=","+zurags[i];
						}
						query+=")";	
						JOptionPane.showMessageDialog(frame,"Emoticon oop");
						break;

					case 4:

						query+=" WHERE text.text LIKE ";
						query+="'%"+temdeglel+"%'";
						query+=" AND diary.create_date BETWEEN ";
						query+="'"+date1+"'";
						query+=" AND ";
						query+="'"+date2+"'";
						query+=" AND image IN (";
						query+=zurags[0];
						for(int i=1; i<5; i++){
							query+=","+zurags[i];
						}
						query+=")";	
						
						JOptionPane.showMessageDialog(frame,"Текст ,Date, emoticon оор");
						break;

					case 5:  // text and date
						query+=" WHERE text.text LIKE ";
						query+="'%"+temdeglel+"%'";
						query+=" AND diary.create_date BETWEEN ";
						query+="'"+date1+"'";
						query+=" AND ";
						query+="'"+date2+"'";
						JOptionPane.showMessageDialog(frame,"Текст ,Date eep");
						break;

					case 6: // text and emoticon
						query+=" WHERE text.text LIKE ";
						query+="'%"+temdeglel+"%'";
						query+=" AND image IN (";
						query+=zurags[0];
						for(int i=1; i<5; i++){
							query+=","+zurags[i];
						}
						query+=")";	 
					JOptionPane.showMessageDialog(frame,"Текст , emoticon оор");
						break;

					case 7: // date and emoticon
						query+=" WHERE diary.create_date BETWEEN ";
						query+="'"+date1+"'";
						query+=" AND ";
						query+="'"+date2+"'";
						query+=" AND image IN (";
						query+=zurags[0];
						for(int i=1; i<5; i++){
							query+=","+zurags[i];
						}
						query+=")";	 
						JOptionPane.showMessageDialog(frame,"Date, emoticon оор");
						break;

					default:
						break;
					}

					//	for(int i=1; i<5; i++){
					//	query+=","+zurags[i];
					//	}
					//	query+=")";	   

					System.out.println("Query ni :"+query);

					try {
						listDate=csd1.getTemdeglelDateHailt(query); 
						if(listDate.size()==0){
							JOptionPane.showMessageDialog(frame,"Үр дүн олдсонгүй");
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
           //        JPanel Pcen1= new JPanel(new GridLayout(listDate.size(),1));
                   
					pCenter.setLayout(new GridLayout(listDate.size(),1));
					for(int i=0; i<listDate.size(); i++){
						System.out.println(listDate.get(i));
			//			JButton b1= new JButton(listDate.get(i));
						JButton b1 = null;
						try {
							b1 = new JButton(listDate.get(i)+" : "+csd1.getDateText(listDate.get(i)));
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						b1.addActionListener(new ButtonListener1());
						pCenter.add(b1);
             //           Pcen1.add(b1);
                        
					}
					frame.revalidate();
			//		pCenter.removeAll();
				//	pCenter.add(Pcen1);
					
					frame.revalidate();
					frame.pack();
					
				}

				hmm=true;
			} // else haalt

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
				if(zurags[1]==5){
					zurags[1]=1;
					i1.setBorder(new LineBorder(Color.RED, 8));
				}
				else{
					zurags[1]=5;
					i1.setBorder(new LineBorder(Color.WHITE, 0));
				}

				zurag=1;


			}
			if(e.getSource()==i2){
				if(zurags[2]==5){
					zurags[2]=2;
					i2.setBorder(new LineBorder(Color.RED, 8));
				}
				else{
					zurags[2]=5;
					i2.setBorder(new LineBorder(Color.WHITE, 0));
				}


				zurag=2;

			}
			if(e.getSource()==i3){
				if(zurags[3]==5){
					zurags[3]=3;
					i3.setBorder(new LineBorder(Color.RED, 8));
				}
				else{
					zurags[3]=5;
					i3.setBorder(new LineBorder(Color.WHITE, 0));
				}

				zurag=3;
			}
			if(e.getSource()==i4){
				if(zurags[4]==5){
					zurags[4]=4;
					i4.setBorder(new LineBorder(Color.RED, 8));
				}
				else{
					zurags[4]=5;
					i4.setBorder(new LineBorder(Color.WHITE, 0));
				}

				zurag=4;
			}

		}

	}

	class ButtonListener1 implements ActionListener{  // delgerengui daragdah towch


		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			for(int i=0; i<listDate.size(); i++){
				try {
					if (e.getActionCommand().equals(listDate.get(i)+" : "+csd1.getDateText(listDate.get(i)))) {
						System.out.println(listDate.get(i)+"daragdsan");
						try {
							csd1.getDateText(listDate.get(i));
							csd1.getDateEmoticon(listDate.get(i));
							new Delgerengui(listDate.get(i),csd1.getDateText(listDate.get(i))
									,csd1.getDateEmoticon(listDate.get(i)));

							//frame.setVisible(false);

						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}               
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}

	public boolean isEmptyArray(){
		boolean hoo=false;

		for(int i=0; i<5; i++){
			if(zurags[i]!=5){ // 0 ees ylgaatai element bwal emoticon songogdson gsn ug
				hoo=true;  
			}
		}
		System.out.println("emptyArray ="+hoo);
		return hoo;// false butswal emoticon songogdoogui gsn ug 
	}

	public boolean isEmptyDate(int year1, int year2, int month1, int month2, int day1, int day2){
		boolean hoo=true;  //  bwal date eroosoo songogdoogui gsn ug 
		if(year1==year2 && month1==month2 && day1==day2 ){
			hoo=false;
		}
		System.out.println("emptyDate ="+hoo);
		return hoo;  // false butswal date songogdoogui gsn ug 
	}

	public boolean isEmptyAguulga(){
		boolean hoo=true;
		if(jtAguulga.getText().equals("")){
			hoo=false;
		}
		System.out.println("emptyAguulga ="+hoo);
		return hoo; // false butswal songogdoogui gsn ug 
	}

}
