package clientServerDaalgavar;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StudentClient extends JFrame{
	  JTextField jtfName = new JTextField(32);
	  JTextField jtfId = new JTextField(32);
	  JTextField jtfAge = new JTextField(20);
	  JTextField jtfGrade = new JTextField(2);
	
	  JButton jbtRegister = new JButton("Сервер лүү илгээх");
	   
	  
	  public StudentClient(){
		   this.setTitle("StudentClient ");
		   this.setVisible(true);
		   this.setLocationRelativeTo(null);
		   this.setSize(400, 400);
		   
		   JPanel p1 = new JPanel();
		   p1.setLayout(new GridLayout(4, 2));
		   p1.add(new JLabel("Нэр"));
		   p1.add(jtfName);
		   p1.add(new JLabel("ID"));
		   p1.add(jtfId);
		   p1.add(new JLabel("Нас"));
		   p1.add(jtfAge);
		   p1.add(new JLabel("Дүн"));
		   p1.add(jtfGrade);
		   
		   add(p1,BorderLayout.CENTER);
		   add(jbtRegister, BorderLayout.SOUTH);
           
		   jbtRegister.addActionListener(new ButtonListener());   
	  }
	  
	
	public class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
	      try {
			Socket socket= new Socket("LocalHost",8000);
		    ObjectOutputStream toServer= new ObjectOutputStream(socket.getOutputStream());
		    
		    String name=jtfName.getText().trim();
		    String id= jtfId.getText().trim();
		    String age=jtfAge.getText().trim();
		    String grade=jtfGrade.getText().trim();
		    int age1=Integer.parseInt(age);
		    int grade1=Integer.parseInt(grade);
		    
		    Student s1=new Student(name, id, age1, grade1);
		    toServer.writeObject(s1);
		    
	      }
	      
	      catch (UnknownHostException e1) {
			e1.printStackTrace();
		    } 
	      
	      catch (IOException e1) {
			e1.printStackTrace();
		}
	      
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new StudentClient();
	}

}
