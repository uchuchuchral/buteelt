package graphicAngiud;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShowflowLayout extends JFrame{ // jframe ees udamshsan bol 1 yosnii jframeiin instance bolno
	// tiimees frame deerh uildluud bugd hiigdene
    public ShowflowLayout(){
      
    	setLayout(new FlowLayout(FlowLayout.LEFT, 10,20)); // tuhain frame iin layout iig tohiruulj bn
    	// enenii orond ingej bas bolno
    	FlowLayout l1= new FlowLayout(FlowLayout.RIGHT,10,20);
    	setLayout(l1);
    	
    	
    	add(new JLabel("first name ")); // layout deeree first name bichigtei label oruullaa
    	add(new JTextField(10)); // ene baiguulagch ni argumentaaraa textfield iin urtaa awna
    	add(new JLabel("Last name "));
    	add(new JTextField(10));
    }
	
	public static void main(String[] args) {
		
		ShowflowLayout sh= new ShowflowLayout(); // frame iin obekt bolhoor frame uusgeh uildluudiig hj ugnu 
		sh.setTitle("FlowLayout");
		sh.setSize(200,300);
        sh.setLocationRelativeTo(null);
        sh.setVisible(true);
        sh.setDefaultCloseOperation(sh.EXIT_ON_CLOSE);
		
	}

}
