package bodlogo11_2;

public class Student extends Person {
	private String status;  // kurs
	
	Student(String name, String address, int phoneNumber, String email, String status){
		  super(name, address, phoneNumber, email);  // eh angiin baiguulagchiin duudaj bn 
	      this.setStatus(status);
   		
	}
   
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String toString(){
	     String output="The Student class";
	     output+="\nname :"+name;
	     output+="\naddress :"+address;
	     output+="\nphoneNumber :"+phoneNumber;
	     output+="\nemail :"+email;
	     output+="\nstatus :"+status;
	     return output;
	    }
  
}
