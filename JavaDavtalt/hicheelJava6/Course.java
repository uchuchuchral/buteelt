package hicheelJava6;

import java.util.ArrayList;

public class Course {
     private String courseName;
     private ArrayList students;
     private int numberOfStudents;
     
     public Course(String courseName){
    	 this.courseName=courseName;
         students= new ArrayList<Object>();
         //students=new ArrayList();
     }
     
     
    public void addStudent(String student){
    	 students.add(student);
         numberOfStudents++;    	
    }
     
	
	public String getCourseName() {
		return courseName;
	}

	public ArrayList getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void dropStudents(String student){
	   students.remove(student);
	   numberOfStudents--;
	   
	}
}
