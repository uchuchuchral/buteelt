package clientServerDaalgavar;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ServerDaalgavar2 extends JFrame{
    JTextArea jta=new JTextArea();
    DataInputStream fromClient;
    DataOutputStream toClient;
	int sanasanToo, irsenToo;
    ServerSocket serverSocket;
    Socket connection;
	
    
	public ServerDaalgavar2(){
		 this.getContentPane().add(new JScrollPane(jta)); // scroll pane guilgeh mur
		 this.setSize(350, 250);
	     this.setLocationRelativeTo(null);
	     this.setTitle("Server");
	     this.setVisible(true);
	     this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	     
	     sanasanToo=(int)(Math.random()*100);
	     
	     toConnect();
	}
 
       void toConnect(){
	    
	   try{
		   serverSocket= new ServerSocket(8000);  // 8000port deer
		   jta.append("Server uuslee\n");
		   jta.append("Sanasan too = "+sanasanToo+"\n");
		   
		   connection= serverSocket.accept();   // clientees holbogdhiig huleene
		   fromClient=new DataInputStream(connection.getInputStream());
		   toClient=new DataOutputStream(connection.getOutputStream());
		   
		   while(true){
			   irsenToo=fromClient.readInt();	 	   
	           jta.append("Clientees huleej awsan too = "+irsenToo+"\t");
	           
	           jta.append("Client ruu ilgeesen medeelel = "+compareTo(irsenToo)+"\t");
	           toClient.writeInt(compareTo(irsenToo));
	           
		        }
	       }
	   
	   catch(IOException e){
		 jta.append(e.getMessage()); 
		 
	   }
   }
   
       
   public int compareTo(int number){
	    int ret=0;  // herveee 0 butsaaval taachihsaan gsn ug
	    if(sanasanToo>number){
	    	ret=1;
	    }
	    if(sanasanToo<number){
	    	ret=-1;
	    }
	    
	    return ret;
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new ServerDaalgavar2();
	}

}
