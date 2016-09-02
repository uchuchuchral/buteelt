package hicheelJava6;

public class TestCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Course course1= new Course("Data structures");
      Course course2= new Course("Database system");
      
      course1.addStudent("Peter jones");
      course1.addStudent("Brian smith");
      course1.addStudent("Anna Kennedy");
      
      course2.addStudent("Peter jones");
      course2.addStudent("Steve smith");
      
      
      System.out.println("Number of students in course1: "
    		  +course1.getNumberOfStudents()+"\n"+course1.getStudents().toString());
      
      System.out.println("Number of students in course1: "
    		  +course2.getNumberOfStudents()+"\n"+course2.getStudents().toString());
    		  
	}

}
