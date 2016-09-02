package miniiProject;

import java.util.Scanner;

public class ShugamanHailt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr= new int [5];
        int a;
        inputArr(arr ,6);
        
        
		
	}

public static void inputArr(int [] list, int key){
    Scanner input = new Scanner(System.in);
    System.out.println("Massiv iig oruul :");
	for(int i=0; i<list.length; i++){
		list[i]=input.nextInt();
	}
	System.out.println("Haih toogoo oruul :");
	key=input.nextInt();
	
	System.out.println(linearSearch(list, key)+"deh index deer baina");
	
}
	
	
public static int linearSearch(int[] list,int key){
	for(int i=0; i<list.length; i++){
		if(list[i]==key){
			return i;
		}
	}
	return -1;
	
}

}
