package clientServerDaalgavar;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class StudentServer extends JFrame{
    ObjectOutputStream toFile; // file ruu hadgalah 
    ObjectInputStream fromClient;
	JTextArea jta= new JTextArea();
    Socket connection;
    ServerSocket serverSocket;
	
    
    public StudentServer() throws IOException{
       add(new JScrollPane(jta));
       this.setTitle("Student Server");
       this.setSize(400,400);
       this.setVisible(true);
       this.setLocationRelativeTo(null);
       this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
     
       
       try{
    	  toConnect(); 
       }
       catch(IOException e){
    	   
       } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
    
    public void toConnect() throws IOException, ClassNotFoundException{
       serverSocket= new ServerSocket(8000);
       jta.append("Сервер үүслээ");
       toFile=new ObjectOutputStream(new FileOutputStream("Student.dat"));	
       
       while(true){
    	   connection=serverSocket.accept();
    	   fromClient= new ObjectInputStream(connection.getInputStream());
    	   
    	   Object object= fromClient.readObject();
    	   
    	   toFile.writeObject(object);
    	   jta.append("Мэдээлэл хадгалагдлаа \n");
       }
    }
    
	public static void main(String[] args) throws IOException {
		new StudentServer();
	}

}
