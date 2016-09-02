package bodlogo11_2;



public class Staff extends Employee{
    

	private String title;  //ajliin zereg
	 
	public Staff(String name, String address, int phoneNumber, String email,
			String office, double salary, MyDate dateHired, String title) {
		super(name, address, phoneNumber, email, office, salary, dateHired);
		// TODO Auto-generated constructor stub
		setTitle(title);
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString(){
	     String output="The Staff class";
	     output+="\nname :"+name;
	     output+="\naddress :"+address;
	     output+="\nphoneNumber :"+phoneNumber;
	     output+="\nemail :"+email;
	     output+="\noffice :"+office;
	     output+="\nsalary :"+salary;
	     output+="\ndate hired :"+dateHired.toString();
	     output+="\ntitle :"+title;
	     
	     return output;
	    }
}
