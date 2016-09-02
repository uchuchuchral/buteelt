package appletAndGame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyApplet extends JApplet {
    String []s= new String[5];
	Random rn;
    int r=0;
	JLabel ja;
    
	public MyApplet(){
	 s[0]="Adilgui";	
	 s[1]="Wow";
	 s[2]="Bitch";
	 s[3]="Take me....";
	 s[4]="Iii iii ";
	 
	 setLayout(new BorderLayout());
	 
	 rn= new Random();
	 r=rn.nextInt(4); // 4hurtelh int too 
	 
	// System.out.println("r="+r);
	 ja=new JLabel("This is my fucking Applet",JLabel.CENTER);
	 
	 add(ja,BorderLayout.CENTER);
	 init();
	  
	}
	
	public void init(){
	 JButton j= new JButton("Fuck");
	 add(j,BorderLayout.SOUTH);
	 
	 j.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		 r=rn.nextInt(4); // 4hurtelh int too 
		ja.setText(s[r]); 
		add(ja,BorderLayout.CENTER);
	}	 
	 });
	 
	 
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		JFrame frame= new JFrame("Applet jframe dotor bn ");
		
		MyApplet applet= new MyApplet();
		
		frame.add(applet);
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);  // tuwd
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
	}

}
