package clientServerDaalgavar;

import java.io.Serializable;

public class Student implements Serializable{
	String name;
	String id;
	int age;
	int grade;

	public Student(){
		name="";
		id="";
		age=0;
		grade=0;
	}

	public Student(String name, String id, int age, int grade){
       setName(name);
       setId(id);
       setAge(age);
       setGrade(grade);
	}

	public void setName(String name){
		this.name=name;
	}
	public void setId(String id){
		this.id=id;
	}

	public void setAge(int age){
		this.age=age;
	}

	public void setGrade(int grade){
		this.grade=grade;
	}   

	public String getName(){
		return name;
	}
	public String getId(){
		return id;
	}

	public int getAge(){
		return age;
	}

	public int getGrade(){
		return grade;
	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
