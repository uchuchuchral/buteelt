package bodlogo11_2;



public class Employee extends Person {

	protected String office;  //ajil
	protected double salary;
	protected MyDate dateHired;  //ajild orson ognoo

	public Employee(String name, String address, int phoneNumber, String email, String office, double salary, MyDate dateHired) {
		super(name, address, phoneNumber, email);
		// TODO Auto-generated constructor stub
		setOffice(office);
		setSalary(salary);
		
		this.dateHired=dateHired;
	   /* this.dateHired.setDay(dateHired.getDay());
	    this.dateHired.setMonth(dateHired.getMonth());
	    this.dateHired.setYear(dateHired.getYear());
	    */
		
		
	}
	
	
	
   	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


	
	public String toString(){
	     String output="The Employee class";
	     output+="\nname :"+name;
	     output+="\naddress :"+address;
	     output+="\nphoneNumber :"+phoneNumber;
	     output+="\nemail :"+email;
	     output+="\noffice :"+office;
	     output+="\nsalary :"+salary;
	     output+="\ndate hired :"+dateHired.toString();
	     
	     return output;
	    }

	
}
