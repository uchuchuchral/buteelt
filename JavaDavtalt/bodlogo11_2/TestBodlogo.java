package bodlogo11_2;

public class TestBodlogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Person per = new Person("Dambii", "Bayngol",99445655, "Dook@yahoo.com");
    System.out.println(per.toString());
    
    Student stu= new Student("Dambii", "Bayngol",99445655, "Dook@yahoo.com", "3r kurs");
    System.out.println(stu.toString());
    
    MyDate n= new MyDate(24,03,2010);
    Employee emp= new Employee("Dambii", "Bayngol",99445655, "Dook@yahoo.com","Manaach", 100000, n);
    System.out.println(emp.toString());
    
    Faculty fac= new Faculty("Dambii", "Bayngol",99445655, "Dook@yahoo.com","Manaach", 100000,
    		new MyDate(10,12,2012),8, "Doctor");
    System.out.println(fac.toString());
	
    
    Staff s= new Staff("Dambii", "Bayngol",99445655, "Dook@yahoo.com","Manaach", 100000,
    		new MyDate(10,12,2012), "Haruuliin ahlah");
    System.out.println(s.toString());
	}

}
