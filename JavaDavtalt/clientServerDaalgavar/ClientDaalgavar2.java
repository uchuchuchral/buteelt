package clientServerDaalgavar;

import hicheelJava10.Client.ButtonListener;

import java.awt.BorderLayout;
import java.awt.GridLayout;
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

public class ClientDaalgavar2 extends JFrame{
	  JLabel label= new JLabel("Toogoo oruul :");
	  JTextField input= new JTextField(10);
   	  JTextArea jta=new JTextArea();
      JPanel panel= new JPanel();
      DataOutputStream toServer;
	  DataInputStream fromServer;
	  JButton button= new JButton("Enter"); 
	  Socket socket;
	  
	  public ClientDaalgavar2(){
		   this.setLayout(new BorderLayout());  
		   panel.setLayout(new GridLayout());
		   panel.add(label);
		   panel.add(input);
		   panel.add(button);
		   input.setText("0.0");
		   JScrollPane scroll = new JScrollPane(jta);
		   
		  // this.add(new JScrollPane(jta));
		   this.add(panel, BorderLayout.NORTH);
		   this.add(scroll, BorderLayout.CENTER);
		   this.setTitle("Client");
		   this.setSize(350,250);
		   this.setVisible(true);
		   this.setLocationRelativeTo(null);
		   this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		   
		   toConnect();
	  }
	  
	  void toConnect(){
		  try{
			socket=new Socket("LocalHost",8000);
		    toServer= new DataOutputStream(socket.getOutputStream());
		    fromServer=new DataInputStream(socket.getInputStream());
		     
			
		  }
		  catch(IOException e){
			 jta.append(e.getMessage()); 
		  }
		  
		  button.addActionListener(new ButtonListener());
		  
	  }
	  
	public static void main(String[] args) {
		new ClientDaalgavar2();

	}
	
	public String hariu(int hariu){
		 String s=""; 
		if(hariu==-1){
		    s="Tanii ilgeesen too ih baina "; 	 
		 }
		if(hariu==1){
			s="Tanii ilgeesen too baga baina ";
		}
		if(hariu==0){
			s="Taalaa";
		}
		return s;
	}
	
	class ButtonListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			jta.append("client uuslee "+"\n");// text talbar luu bichih 
			
			int too=Integer.parseInt(input.getText());
			try {
				toServer.writeInt(too);
				toServer.flush();  
				jta.append("sanasan toog servert ilgeelee "+"\n");
				int hariu=fromServer.readInt();
				jta.append(""+hariu(hariu)+"\n");
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// buffer duureegui bsan ch shuud yvuulah 
			
			
			
		}
		
		
	}

}
