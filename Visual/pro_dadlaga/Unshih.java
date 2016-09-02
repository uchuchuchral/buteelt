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
import java.util.List;

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

public class Unshih {
	JFrame frame;  
	JButton  butsah;
	JPanel pUp, pDown,pCenter;
	connectSQLDiary csd1;
	int zurag; /// songogdson emoticon ii zurgiin dugaariig hadgalna 
	JButton next, previous; // emoticon ii buttonuud 
	JLabel listNote;
	//  List listDate; // date iig list eer awah 

	int listToo; // ene huwisagch neg nuurend heden temdeglel bhiig zaana
	int PanelToo;  /// heden nuur bh ter hemjeenii panel uusgene 
    int pageCount; // heddugeer huudasan deer yvj bgaag tooloh tooluur
	ArrayList<String> listDate = new ArrayList<String>();


	public Unshih() throws SQLException{
		pageCount=0;
		frame = new JFrame();
		frame.setTitle("Temdeglel Unshih ");
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setSize(700, 500);
		frame.setLayout(new BorderLayout());
		zurag=0;   


		csd1= new connectSQLDiary();
		listToo=Integer.parseInt(csd1.getPagePieceTemdeglel());
        System.out.println("listToo="+listToo);

		listDate=csd1.getTemdeglelDate();
		System.out.println("listdate hemjee = "+listDate.size());



		JPanel panels[]= new JPanel[howManyPanel(listDate.size(),listToo)]; 
		JButton buttons[] = new JButton[listDate.size()];
 
		String names[] = new String[listDate.size()];
		JScrollPane scrollPane = new JScrollPane();
       
		System.out.println("panel too="+panels.length);
		System.out.println("button too="+buttons.length);
     

		for(int i=0; i<buttons.length; i++){	   
			JButton btn = new JButton(listDate.get(i)); // on sariin nertei buttonuud uusgene 
			btn.addActionListener(new ButtonListener());
			//add(btn);
			buttons[i] = btn;

		}

		int blen=0;
		
		for (int i = 0; i < panels.length; i++)
		{ 
			panels[i]= new JPanel(new GridLayout(listToo,1));
			panels[i].add(new JScrollPane());
			
			
			while(blen<listToo*(i+1) && blen<buttons.length){
				panels[i].add(buttons[blen]);
				blen++;
		
			}

		} 	   

		System.out.println("While iin gadaa :");
     
		butsah= new JButton("Буцах");
		listNote =new JLabel("Тэмдэглэлүүдийн жагсаалт:");
		next= new JButton("Дараагынх");
		previous= new JButton("Өмнөх");


		pUp= new JPanel(new FlowLayout());
		// pUp.add(on); pUp.add(onf); pUp.add(sar); pUp.add(sarf); pUp.add(udur); pUp.add(udurf); 
		pUp.add(listNote); pUp.add(butsah);  


		pDown= new JPanel(new GridLayout(1,2));
		pDown.add(previous); pDown.add(next);

		frame.add(pUp, BorderLayout.NORTH);
		frame.add(panels[0], BorderLayout.CENTER);
		frame.add(pDown, BorderLayout.SOUTH);

		
		System.out.println("Sonsoh uzegdeliin urd");
		next.addActionListener(new ActionListener(){ // next darah ued daraagiin panel ruu orj bh yostoi 

			@Override
			public void actionPerformed(ActionEvent e) {
				
                if(pageCount+1<panels.length && panels.length!=1){
                	pageCount=pageCount+1;
                	System.out.println("next daragdsan ");   
    				frame.remove(panels[(pageCount-1)]);  
    				frame.add(panels[pageCount],BorderLayout.CENTER);
    				//frame.pack();
    				frame.revalidate();
    				System.out.println("pageCount="+pageCount);
                }
				// create a calenda

			}

		});
		
		

		previous.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				  if(pageCount>0 && panels.length!=1){
	                	pageCount=pageCount-1;
	                	System.out.println("previous daragdsan ");   
	    				frame.remove(panels[(pageCount+1)]);  
	    				frame.add(panels[pageCount],BorderLayout.CENTER);
	    				//frame.pack();
	    				frame.revalidate();
	    				System.out.println("pageCount="+pageCount);
	                }

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


	public int howManyPanel(int datePiece, int listToo){
		int ret=0;
		int ret1=0; // butarhai heseg
		ret=datePiece/listToo; 
		ret1= datePiece%listToo;
		if(ret1>0){
			ret++;
		}
          
		return ret;
	}



	class ButtonListener implements ActionListener{  // delgerengui daragdah towch

		
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
            
			for(int i=0; i<listDate.size(); i++){
				if (e.getActionCommand().equals(listDate.get(i))) {
					System.out.println(listDate.get(i)+"daragdsan");
                    try {
						csd1.getDateText(listDate.get(i));
						csd1.getDateEmoticon(listDate.get(i));
						new Delgerengui(listDate.get(i),csd1.getDateText(listDate.get(i))
								,csd1.getDateEmoticon(listDate.get(i)));
						
						frame.setVisible(false);
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}               
				}
			}
		}
	}
}
