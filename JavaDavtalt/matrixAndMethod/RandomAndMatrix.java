package matrixAndMethod;
/*
 code by uchral 
 2015.09.15
 Randomoor 100n too massivd awaad tuuniigee selectionSort ashiglan erembley
 */
public class RandomAndMatrix {

	public static void showArr(int arr[]){
		for(int i=0; i<arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void SelectionSort(int arr[]){
		int min;
		int minIndex;
		int tmp;
		
		for(int i=0; i<arr.length; i++){
			min=arr[i];
			minIndex=i;
			
			for(int j=i+1; j<arr.length; j++){
				if(min>arr[j]){
				   min=arr[j];
				   minIndex=j;
				}
			}
		   	
			tmp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=tmp;
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] myList= new int[100];
     for(int i=0; i<myList.length; i++){
    	 myList[i]=(int)(Math.random()*100);
     }
      showArr(myList);
      System.out.println("Eremblesnii daraa :");
      SelectionSort(myList);
      showArr(myList);
	}

}
