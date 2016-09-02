package objectHeseg0915;

import java.util.Scanner;

public class TestLocation {
   
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input= new Scanner(System.in);
      int n,m;
      System.out.println("n,m :");
      n=input.nextInt();
      m=input.nextInt();
      
      double arr[][]= new double[n][m];
      
       toRandom(arr,n,m);
       showArr(arr,n,m);
       locateLargest(arr, n, m).showInfo();;
      
	}
	
	public static void toRandom(double arr[][], int n, int m){
		 
		for(int i=0; i<n;i++){
    		for(int j=0; j<m; j++){
    			arr[i][j]=Math.random()*100;
    		}
    	}
		
	}
	
    public static void showArr(double arr[][], int n, int m){
    	for(int i=0; i<n;i++){
    		for(int j=0; j<m; j++){
    			System.out.print(arr[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
	
    
	public static Location locateLargest(double[][] arr, int n, int m){
		 int r,c;
		 double max;
		 max=arr[0][0];
		 r=0;
		 c=0;
		 
		 for(int i=0; i<n; i++){	  
			 for(int j=0; j<m; j++){
				 if(max<arr[i][j]){
					 max=arr[i][j];
					 r=i;
					 c=j;
				 }
			 }
		 }
		 
		 return new Location(r,c,max);
		 
	}
	
}
