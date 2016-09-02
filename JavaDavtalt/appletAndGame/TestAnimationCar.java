package appletAndGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestAnimationCar extends JFrame{
	// CarOption c1;
	AnimationCarBody []a1 = new AnimationCarBody[3];
	private JLabel []m1 = new JLabel[3];
	private JTextField [] t1= new JTextField[3];
	JButton []jb= new JButton[3];
	Thread thread1, thread2, thread3;
	JPanel p3;
    int hurd[]=new int[3]; 
	
	public TestAnimationCar(){
		BorderLayout bo= new BorderLayout();
		setLayout(bo);
		CarOption();
		BaseCar();
	}

	public void CarOption(){
		p3=new JPanel();
		p3.setLayout(new GridLayout(2,3));

		m1[0]=new JLabel("M1:");
		m1[1]=new JLabel("M2:");
		m1[2]=new JLabel("M3:");

		t1[0]=new JTextField(4);
		t1[1]=new JTextField(4);
		t1[2]=new JTextField(4);

		for(int i=0; i<=2; i++){
			p3.add(m1[i]);
		}
		for(int i=0; i<=2; i++){
			p3.add(t1[i]);
		}
	}

	public void BaseCar(){
		jb[0]=new JButton("Start");
		jb[1]=new JButton("Restart");
		jb[2]=new JButton("Stop");

		a1[0]= new AnimationCarBody (550, 20); //ijilhen parametrtei bgaa uchir ni gridlayout iin uur uur heseg deer bga uchir ter hesgiinhee huwid 550, 20 bairlal deer bn gsn ug
		a1[1]= new AnimationCarBody (550,20);
		a1[2]= new AnimationCarBody (550,20);

		JPanel p1=new JPanel(new GridLayout(3,1));  
		JPanel p2=new JPanel(new GridLayout(1,3));

		for(int i=0; i<3; i++){
			p2.add(jb[i]);
		}

		p1.add(a1[0]);
		p1.add(a1[1]);
		p1.add(a1[2]);

		add(p1, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);
		add(p2, BorderLayout.NORTH);	 

		thread1=new Thread(a1[0]);
		thread2=new Thread(a1[1]);
		thread3=new Thread(a1[2]);

		jb[0].addActionListener(new ButtonListener());
		jb[2].addActionListener(new ButtonListener1()); 
	}

	public void paintComponent(Graphics g){
		super.paintComponents(g);
		g.setColor(Color.DARK_GRAY);
		g.drawLine(20, 160, 650, 160);
		g.fillRect(100, 100, 40, 40);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAnimationCar c1=new TestAnimationCar();
		// AnimationCarBody b2= new AnimationCarBody(400,0);
		c1.setTitle("Car moving"); 
		c1.setSize(700, 500);
		c1.setVisible(true);
		c1.setDefaultCloseOperation(c1.EXIT_ON_CLOSE);
		c1.setLocationRelativeTo(null);
	}


	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		for(int i=0; i<3; i++){
				hurd[i]=Integer.parseInt(t1[i].getText());
				a1[i].setDelay(hurd[i]);
			}
		
			thread1.start();
			thread2.start();
			thread3.start();  		
		}
	}

	class ButtonListener1 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			thread1.stop();
			thread2.stop();
			thread3.stop();
			a1[0].setRunning(false);
			a1[1].setRunning(false);
			a1[2].setRunning(false);
		}
	}
}
