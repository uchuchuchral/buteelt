package clientServerDaalgavar;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ServerDaalgavar1 extends JFrame{
        List<Student> list1= new ArrayList<Student>();
        ObjectOutputStream output1;
        ObjectInputStream  input1;
        File file1;
        ServerSocket serverSocket;
        Socket socket;  
        JTextArea jta= new JTextArea();
        
        public ServerDaalgavar1(){
        
        this.add(new JScrollPane(jta));
        this.setTitle("Server Student");
        this.setSize(400, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        
        try{
          create();
          }
        
        catch(IOException e){
        	
        }
        
        
        }
        
        
	 void create() throws IOException{
		 
	  serverSocket=new ServerSocket(8000);
	  jta.append("ServerSocket uuslee \n");
	  socket=serverSocket.accept();
	  
	  
	 }
         
	 public static void main(String[] args) {
		new ServerDaalgavar1();

	  }

}
 