package obekt_and_class;

import javax.swing.JOptionPane;

public class TemdegSolidogFunkts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=Integer.parseInt(JOptionPane.showInputDialog("toog oruul"));
      JOptionPane.showMessageDialog(null, "solisnii daraa = "+sign(a));
      
	}
public static int sign (int n){
      return n*-1;	 
 
}
	
}
