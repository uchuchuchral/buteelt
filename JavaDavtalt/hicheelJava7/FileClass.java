package hicheelJava7;

import java.io.File;

public class FileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       File myFile= new File("D:/yeah.txt");
       System.out.println("Iiim file bnuu? "+myFile.exists());
	   System.out.println("Zaagdsan zam deeree bnuu?"+myFile.isFile());	 
	   System.out.println("Ug file iin ner "+myFile.getName());
	   System.out.println("Ug file iin zam "+myFile.getPath());
	}

}
