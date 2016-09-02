package obekt_and_class;

import javax.swing.JOptionPane;

public class DungUsgeerIlerhiilehVoidFunks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double dun =Double.parseDouble(JOptionPane.showInputDialog("Dungee huwiar oruul"));
        printDun(dun);
	}
public static void printDun(double dun1){
	String k;
	if(dun1 >= 90)
       k="A";
	else if(dun1 >= 80)
		k="B";
	else if(dun1 >= 70)
		k="C";
	else if(dun1 >= 60)
		k="D";
	else
		k="F";
	JOptionPane.showMessageDialog(null, k);
}
	
}
