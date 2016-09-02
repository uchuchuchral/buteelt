package hicheelJava10;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client extends JFrame{
    JLabel label= new JLabel("enter radius :");
    JTextField input= new JTextField(10);
	JTextArea jta=new JTextArea();
    JPanel panel= new JPanel();
    DataOutputStream toServer;
    DataInputStream fromServer;
	JButton button= new JButton("Enter");
    
	
	public Client(){
		 this.setLayout(new BorderLayout());  
		  panel.setLayout(new FlowLayout());
		  panel.add(label);
		  input.setText("0.0");
		  panel.add(button);
	      panel.add(input);
	      this.add(panel, BorderLayout.NORTH);
	      this.add(new JScrollPane (jta),BorderLayout.CENTER);
		  this.setSize(300, 200);
		  this.setLocationRelativeTo(null);
		  this.setTitle("Client");
		  this.setVisible(true);
		  this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		  
		  try{
		     Socket socket=new Socket("LocalHost",8000);

		     toServer= new DataOutputStream(socket.getOutputStream());
		     fromServer=new DataInputStream(socket.getInputStream());
			
		  }
		  catch(IOException e){
		  jta.append(e.getMessage());
		   
		  }
		  button.addActionListener(new ButtonListener());
		  		  
	}
	
	public static void main(String[] args) {
	 new Client();
	}
	
	
	public class ButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {			
			  try{
				  
				
				jta.append("client socket uuslee "+"\n");// text talbar luu bichih 
				
				double radius=Double.parseDouble(input.getText());
				toServer.writeDouble(radius);
				toServer.flush();  // buffer duureegui bsan ch shuud yvuulah 
				
				jta.append("radiusiin utgiig servert ilgeelee "+"\n");
				double area=fromServer.readDouble();
				jta.append("Serverees huleen awsan talbain utga :"+area+"\n");
				
				//10.0.31.186
			  }
			  catch(IOException e){
				  jta.append(e.getMessage());
				  
				  
			  }
			  
		}
		
	}
}
