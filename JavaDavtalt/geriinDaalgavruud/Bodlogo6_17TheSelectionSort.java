package geriinDaalgavruud;

import java.util.Scanner;

/*
 Selectionsort iig arai uuruur oloh 
 hamgiin max elementiig olj hamgiin hoino tawih zamaar 
 */
public class Bodlogo6_17TheSelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("n=");
		int n=input.nextInt();
		int []arr=new int[n];
		inputArr(arr);
		ReSelectionSort(arr);
		Show(arr);

	}

	public static void inputArr(int []arr){
		Scanner input = new Scanner(System.in);
		System.out.println("arr[10]=");
		for(int i=0; i<arr.length; i++){
			arr[i]=input.nextInt();
		}
	}

	public static void Show(int []arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"  ");
		}
	}


	public static void ReSelectionSort(int []arr){
		int max;
		for(int i=arr.length-1; i>=0; i--){
			max=arr[i];  

			for(int j=i-1; j>=0; j-- ){
				if(arr[j]>max){
					// max=arr[j];

					int temp=arr[j];
					arr[j]=max;
					max=temp;

				}

			}
			arr[i]=max;
		}

	}

}
