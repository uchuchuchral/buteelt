package geriinDaalgavruud;

import javax.swing.JOptionPane;

public class UridchilsanHadgalamj extends Hadgalamj{


	public UridchilsanHadgalamj(){
		super();
		s1.setUridchilsan(true);
		Taniltsuulga();
		MedeelelOruulah();




		medeelelHarah();
	}

	public void Restart(){
		dansniiUldegdel=0;
		ner="";
		s1.setSariinToo(0);
	}

	public void MedeelelOruulah(){
		String ret="";
		ner=JOptionPane.showInputDialog("Харилцагчийн нэр :");
		ret=JOptionPane.showInputDialog("Хадгалуулах сарын хэмжээ :");
		s1.setSariinToo(Integer.parseInt(ret));
		ret=JOptionPane.showInputDialog("Дансанд хийх мөнгөний хэмжээ :");
		dansniiUldegdel=Double.parseDouble(ret);

		if(s1.getHuwi()==0 || dansniiUldegdel<1000000){

			if(dansniiUldegdel<1000000){
				String out="Уучлаарай Дансанд байрлах мөнгөний доод хэмжээ хүрэлцэхгүй байна дахин оруулна уу!";
				JOptionPane.showMessageDialog (null,  out,"" ,JOptionPane.INFORMATION_MESSAGE);
			}
			else{
				String out="Уучлаарай Буруу сар оруулсан байна хадгуулах сарын хэмжээг дахин сонгоно уу!";
				JOptionPane.showMessageDialog (null,  out,"", JOptionPane.INFORMATION_MESSAGE);

			}

			Restart();
			MedeelelOruulah();
		}

	}

	public void Taniltsuulga(){
		String output="";
		output+="Урьдчилсан хүүт хадгаламж :"+"\n";
		output+="Хадгаламжийн хүү  :"+"\n";
		output+="3сар - 0,75% , 6сар - 1% , 12сар - 1,1% "+"\n";	 
		output+="Данс нээх доод хэмжээ - 1000000  :"+"\n";
		output+="Данс хаах шимтгэл - 1000  :"+"\n";
		output+="Сар бүр хүүгээ урьдчилан авах боломжтой :"+"\n";
		JOptionPane.showMessageDialog (null, output, "Танилцуулга", JOptionPane.INFORMATION_MESSAGE);
	}

	public double calculateHuu(){  // sariin huug tootsooloh funkts 
		double sHuu=(dansniiUldegdel/100)*s1.getHuwi();
		return sHuu;
	}

	public String calculateAll(){  // niit awah mungunii hemjee
		String output="";

		for(int i=1; i<=s1.getSariinToo(); i++){
			output+=i+"сарын хүү = "+calculateHuu()+"\n";



			dansniiUldegdel+=calculateHuu();
		}

		//	JOptionPane.showMessageDialog (null, output,"", JOptionPane.INFORMATION_MESSAGE);

		return output;
	}


	public void medeelelHarah(){
		String output="";
		output+= " Харилцагчийн нэр :"+ner+"\n";
		output+= " Хадгалуулсан сар :"+s1.getSariinToo()+"\n";
		output+= " Хадгалуулсан мөнгө :"+dansniiUldegdel+"\n";	
		output+= " Хүү бодолт :"+"\n";
		output+=calculateAll();
		output+="Дансны нийт үлдэгдэл :"+ dansniiUldegdel+"\n";

		JOptionPane.showMessageDialog (null,  output,"", JOptionPane.INFORMATION_MESSAGE);
	}




}
