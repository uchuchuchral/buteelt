package obekt_and_class;

import javax.swing.JOptionPane;

public class GishuunFunkts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=5;
        int j=2;
        int k= sum(i,j);
        JOptionPane.showMessageDialog(null, "max="+k); 
	}
	public static int  sum(int num1, int num2){
		int result;
		if(num1 > num2){
			result= num1;
		}
		else 
			result =num2;
	
	return result;
	}

}
