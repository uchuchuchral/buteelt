package bodlogo11_2;

public class Person {
     protected String name;
     protected String address;
     protected int phoneNumber;
     protected String email;
    
    
     public Person(String name, String address, int phoneNumber, String email){
      setName(name);
      setAddress(address);
      setPhoneNumber(phoneNumber);
      setEmail(email);
      
     }
     public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	
	public void setAddress(String address) {
		this.address = address;
	}

	
	public int getPhoneNumber() {
		return phoneNumber;
	}

	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString(){
     String output="The Person class";
     output+="\nname :"+name;
     output+="\naddress :"+address;
     output+="\nphoneNumber :"+phoneNumber;
     output+="\nemail :"+email;
     return output;
    }

}
