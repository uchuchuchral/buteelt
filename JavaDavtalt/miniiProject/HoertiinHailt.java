package miniiProject;

import java.util.Scanner;

public class HoertiinHailt {
	// eremblegdsen husnegted uilchilne
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] list= new int[13];
		int key=11;
		System.out.println(list.length);  // 13 garch irne
		inputArr(list);
		System.out.println("oldson elementiin dugaar= "+binarySearch(list, key));

	}

	public static void inputArr(int []list){
		Scanner input=new Scanner(System.in);
		System.out.println("Massiv el oruul :");
		for(int i=0; i<list.length; i++){
			list[i]=input.nextInt();
		}
	}

	public static int binarySearch(int []list, int key){
		int low=0; // ehnii elementiin tooluur
		int high=list.length-1;

		while(high>=low){
			int mid= (low+high)/2; // dundajiig ni mid huwisagchid awna.
			if(key<list[mid]){
				high=mid-1;
			}

			else if(key==list[mid])
				return mid;
			else 
				low=mid+1;



		}
		return -1;
	}
}

