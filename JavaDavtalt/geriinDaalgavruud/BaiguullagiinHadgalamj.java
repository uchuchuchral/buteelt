package geriinDaalgavruud;

import javax.swing.JOptionPane;

public class BaiguullagiinHadgalamj extends Hadgalamj{

	public BaiguullagiinHadgalamj(){
		super();
		s1.setUridchilsan(false);
		Taniltsuulga();
		MedeelelOruulah();



		medeelelHarah();
	}

	public void MedeelelOruulah(){
		String ret="";
		ner=JOptionPane.showInputDialog("Байгууллагын нэр :");
		ret=JOptionPane.showInputDialog("Хадгалуулах сарын хэмжээ :");
		s1.setSariinToo(Integer.parseInt(ret));
		ret=JOptionPane.showInputDialog("Дансанд хийх мөнгөний хэмжээ :");
		dansniiUldegdel=Double.parseDouble(ret);

		if(s1.getHuwi()==0 || dansniiUldegdel<5000000){
			if(dansniiUldegdel<5000000){
				String out="Уучлаарай Дансанд байрлах мөнгөний доод хэмжээ хүрэлцэхгүй байна дахин оруулна уу!";
				JOptionPane.showMessageDialog (null,  out,"" ,JOptionPane.INFORMATION_MESSAGE);
			}
			else{
				String out="Уучлаарай Буруу сар оруулсан байна хадгуулах сарын хэмжээг дахин сонгоно уу!";
				JOptionPane.showMessageDialog (null,  out,"", JOptionPane.INFORMATION_MESSAGE);
			}

			MedeelelOruulah();
		}
	}

	public void Taniltsuulga(){
		String output="";
		output+="Байгууллагын хадгаламж :"+"\n";
		output+="Хадгаламжийн хүү  :"+"\n";
		output+="3сар - 0,75% , 6сар - 1% , 9сар - 1,05%,  12сар - 1,1% "+"\n";	 
		output+="Данс нээх доод хэмжээ - 5000000  :"+"\n";
		output+="Данс хаах шимтгэл - 3000  :"+"\n";
		output+="Зарлага гарахгүй :"+"\n";
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
		//	output+= " Хүү бодолт :"+"\n";
		//    output+=calculateAll();
		calculateAll();
		output+="Дансны нийт үлдэгдэл :"+ dansniiUldegdel+"\n";

		JOptionPane.showMessageDialog (null,  output,"", JOptionPane.INFORMATION_MESSAGE);
	}
}
