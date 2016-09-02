package geriinDaalgavruud;

import javax.swing.JOptionPane;

public class MainTest {
       static Hadgalamj h1;
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ret="";
		ret=JOptionPane.showInputDialog("Урьдчилсан хүүт хадгаламж бол 1 \n "
				+ "Байгууллагын хадгаламж бол 2 : \n");
		int hadgal=Integer.parseInt(ret);
		
		
		if(hadgal==1){
		   	h1= new UridchilsanHadgalamj();
			
		}
		if(hadgal==2){
			h1=new BaiguullagiinHadgalamj();
			
		}
	}

}
