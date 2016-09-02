package pro_dadlaga;

import java.util.Date;

import javax.swing.JOptionPane;

public class Diary {
	Date1 onSar;  // tuhain temdegleliin on sar 
	String note;  // temdeglel uuruu 
	static int Huudas=0; // huudas buyu temdegleliin too 


	public Diary(){
		onSar= new Date1();
		note="";
	}

	public void setNote(String note){
		this.note=note;
	}


	public String getNote(){
		return note;
	}

	public void showDiary(){
		String output="On sar:";
		//  output+="On sar : "+onSar.toString() +"\n";
		//  output+=onSar.getDay()+":"+onSar.getMonth()+":"+onSar.getYear()+"\n";
		output+=onSar.getDate()+"\n";         
		output+=note;
		JOptionPane.showMessageDialog (null,  output,"" ,JOptionPane.INFORMATION_MESSAGE);

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diary d1= new Diary();
		d1.showDiary();
	}

}
