package java1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Calc43 extends JFrame{   // belen bdag class
	private static JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btn11, btn12, btn13, btn14, btn15, btn16;  //JButton belen funkts zarlalt
	private JPanel p1=new JPanel(new GridLayout(1,0));   // panel belen bdag funkts 
	private JPanel p2=new JPanel(new GridLayout(5,8));
	private JPanel p3=new JPanel(new GridLayout(2,2));
	private JTextArea txt=new JTextArea(4,14);
		

	private Calc43(){
		setLayout(new BorderLayout());

		btn();
		btnA();

		add(txt,BorderLayout.NORTH); // bairlal deed tald zaaj ugch bn 
		add(p2,BorderLayout.CENTER); // tuwd zaaj ugch bn 
		add(p1,BorderLayout.AFTER_LAST_LINE);
	}
	private void Uildel(){
		
	}

	private void btn(){

		btn1=new JButton("1");
		btn2=new JButton("2");
		btn3=new JButton("3");
		btn4=new JButton("4");
		btn5=new JButton("5");
		btn6=new JButton("6");
		btn7=new JButton("7");
		btn8=new JButton("8");
		btn9=new JButton("9");
		btn0=new JButton("0");
		btn11=new JButton("+");
		btn12=new JButton("*");
		btn13=new JButton("C");
		btn14=new JButton("-");
		btn15=new JButton("/");
		btn16=new JButton("=");

		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		p2.add(btn4);
		p2.add(btn5);
		p2.add(btn6);
		p2.add(btn7);
		p2.add(btn8);
		p2.add(btn9);
		p2.add(btn0);
		p2.add(btn11);
		p2.add(btn12);
		p2.add(btn13);
		p2.add(btn14);
		p2.add(btn15);
		p1.add(btn16);

	}

	private <string> void btnA(){
		btn1.addActionListener(new ActionListener(){  // sonsoh uzegdel
			public void actionPerformed(ActionEvent e){ // tsug bichih shaardlagatai
				txt.append("1");// btn1 iig darhad 1 iig haruulna; append zalguulj bichne
				//double interest=Double.parseDouble(btn1.getText());
			//	System.out.println("za= "+interest);
			//	String s1=JOptionPane.showInputDialog(1);
				
			}
		}
		);
		btn2.addActionListener(new ActionListener(){  // sonsoh uzegdel
		 	public void actionPerformed(ActionEvent e){ // tsug bichih shaardlagatai
				txt.append("2"); // btn1 iig darhad 1 iig haruulna; append zalguulj bichne
				int a2= Integer.parseInt(btn2.getText());
			//	btn2.setText(" "+a2);
			}
		}
		);
		btn3.addActionListener(new ActionListener(){  // sonsoh uzegdel
		 	public void actionPerformed(ActionEvent e){ // tsug bichih shaardlagatai
				txt.append("3"); // btn1 iig darhad 1 iig haruulna; append zalguulj bichne 
			}
		}
		);
		btn4.addActionListener(new ActionListener(){  // sonsoh uzegdel
			public void actionPerformed(ActionEvent e){ // tsug bichih shaardlagatai
				txt.append("4"); // btn1 iig darhad 1 iig haruulna; append zalguulj bichne 
			}
		}
		);
		btn5.addActionListener(new ActionListener(){  // sonsoh uzegdel
			public void actionPerformed(ActionEvent e){ // tsug bichih shaardlagatai
				txt.append("5"); // btn1 iig darhad 1 iig haruulna; append zalguulj bichne 
			}
		}
		);
		btn6.addActionListener(new ActionListener(){  // sonsoh uzegdel
			public void actionPerformed(ActionEvent e){ // tsug bichih shaardlagatai
				txt.append("6"); // btn1 iig darhad 1 iig haruulna; append zalguulj bichne 
			}
		}
		);
		btn7.addActionListener(new ActionListener(){  // sonsoh uzegdel
			public void actionPerformed(ActionEvent e){ // tsug bichih shaardlagatai
				txt.append("7"); // btn1 iig darhad 1 iig haruulna; append zalguulj bichne 
			}
		}
		);
		btn8.addActionListener(new ActionListener(){  // sonsoh uzegdel
			public void actionPerformed(ActionEvent e){ // tsug bichih shaardlagatai
				txt.append("8"); // btn1 iig darhad 1 iig haruulna; append zalguulj bichne 
			}
		}
		);
		btn9.addActionListener(new ActionListener(){  // sonsoh uzegdel
			public void actionPerformed(ActionEvent e){ // tsug bichih shaardlagatai
				txt.append("9"); // btn1 iig darhad 1 iig haruulna; append zalguulj bichne 
			}
		}
		);
		btn0.addActionListener(new ActionListener(){  // sonsoh uzegdel
			public void actionPerformed(ActionEvent e){ // tsug bichih shaardlagatai
				txt.append("0"); // btn1 iig darhad 1 iig haruulna; append zalguulj bichne 
			}
		}
		);
		btn11.addActionListener(new ActionListener(){  // sonsoh uzegdel
			public void actionPerformed(ActionEvent e){ // tsug bichih shaardlagatai
				txt.append("+"); // btn1 iig darhad 1 iig haruulna; append zalguulj bichne 
			}
		}
		);
		btn12.addActionListener(new ActionListener(){  // sonsoh uzegdel
			public void actionPerformed(ActionEvent e){ // tsug bichih shaardlagatai
				txt.append("*"); // btn1 iig darhad 1 iig haruulna; append zalguulj bichne 
			}
		}
		);
		btn14.addActionListener(new ActionListener(){  // sonsoh uzegdel
			public void actionPerformed(ActionEvent e){ // tsug bichih shaardlagatai
				txt.append("-"); // btn1 iig darhad 1 iig haruulna; append zalguulj bichne 
			}
		}
		);
		btn15.addActionListener(new ActionListener(){  // sonsoh uzegdel
			public void actionPerformed(ActionEvent e){ // tsug bichih shaardlagatai
				txt.append("/"); // btn1 iig darhad 1 iig haruulna; append zalguulj bichne 
			}
		}
		);
		btn16.addActionListener(new ActionListener(){  // sonsoh uzegdel
			public void actionPerformed(ActionEvent e){ // tsug bichih shaardlagatai
				txt.append("="); // btn1 iig darhad 1 iig haruulna; append zalguulj bichne 
				double interest=Double.parseDouble(txt.getText());
				System.out.println("za = "+interest);
			}
		}
		);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc43 frame= new Calc43();
		frame.setTitle("UCalculator");  // garchig frame iin
		frame.setSize(300,350);  // hemjee frame iin 
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);    // frame uusgehdee ene 5n muriig copy hiine.
	}

}
