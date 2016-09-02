package hicheelJava10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Server extends JFrame{
     JTextArea jta =new JTextArea(); 
	 DataInputStream inputFromClient;
	 DataOutputStream outputInClient;
     
	public Server() throws Exception{
	   this.getContentPane().add(new JScrollPane(jta)); // scroll pane guilgeh mur

	   this.setSize(300, 200);
	   this.setLocationRelativeTo(null);
  	  this.setTitle("Server");
	  this.setVisible(true);
	  this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	  
	  
	  try{
	   ServerSocket serverSocket=new ServerSocket(8000); //8000 port deer neelee 
	   jta.append("Server socket uuslee.\n");  
	
	   
	   Socket socket=serverSocket.accept(); //hereglegchees irsen huseltiig socket obektod hadgalna
	   
	   //while(true){
		//Socket socket=serverSocket.accept();
		//Thread thread = new Threader(socket);
		
	  // }
	   
	   inputFromClient=new DataInputStream(socket.getInputStream());

	    outputInClient=new DataOutputStream(socket.getOutputStream());
	  
	   
	   while(true){
		double radius=inputFromClient.readDouble();
		
		jta.append("clientees huleen awsan utga = "+String.valueOf(radius)+"\n");//double turliin radius utgiig valueof methodoor string ruu hurvuulj harj bn
		double area=radius*radius*Math.PI;
		
		jta.append("Client ruu ilgeesen talbain utga = "+String.valueOf(area)+"\n");
		
		outputInClient.writeDouble(area);
	   }
	   
	   
	  }
	  catch(IOException e){
	     jta.append(e.getMessage());
	  }
	  
	  finally{
	   inputFromClient.close();
		outputInClient.close();
	  }
	}
	
	
	public static void main(String[] args) throws Exception {
	 new Server();	

	}
	
   public class Threader implements Runnable{

	@Override
	public void run() {
		
		
	}
	   
   }
}
