package bodlogo11_2;


public class Faculty extends Employee {
      

	private int officeHours; //ajliin tsag
    private String rank; // zereg
    
    
   	public Faculty(String name, String address, int phoneNumber, String email,
			String office, double salary, MyDate dateHired, int officeHours, String rank) {
	    	super(name, address, phoneNumber, email, office, salary, dateHired);
		    setOfficeHours(officeHours);
		    setRank(rank);
	    	// TODO Auto-generated constructor stub
	}
    
       
	public int getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
       
	
	public String toString(){
	     String output="The faculty class";
	     output+="\nname :"+name;
	     output+="\naddress :"+address;
	     output+="\nphoneNumber :"+phoneNumber;
	     output+="\nemail :"+email;
	     output+="\noffice :"+office;
	     output+="\nsalary :"+salary;
	     output+="\ndate hired :"+dateHired.toString();
	     output+="\noffice hours :"+officeHours;
	     output+="\nrank :"+rank;
	     
	     return output;
	    }
}
