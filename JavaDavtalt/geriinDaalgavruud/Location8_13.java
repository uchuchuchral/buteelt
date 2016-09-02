package geriinDaalgavruud;

import java.util.Scanner;

public class Location8_13 {
     public double max;
     public double [][]arr;
     public int row, column;
 
    public Location8_13(){
    	row=0;
    	column=0;
    	
    }
    
    public void inputValue(){
    	Scanner input= new Scanner(System.in);
    
    }
     
    public void show(){
    	System.out.println("The location of the Largest element is "+max+" at ("+row+","+column+")");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n,m;
     Scanner input= new Scanner(System.in);
		
     System.out.print("Mur :");
     n=input.nextInt();
     System.out.print("Bagana :");
     m=input.nextInt();
     double[][]arr= new double[n][m];
     
     for(int i=0; i<n; i++){
    	 for(int j=0; j<m; j++){
    		 arr[i][j]=input.nextDouble();
    	 }
     }
     
     
     Location8_13 Lo= new Location8_13();
	 Lo=LocateLargest(arr, n, m);	
	 Lo.show();
	 
	}

	
	public static Location8_13 LocateLargest(double[][] a, int n, int m){
        Location8_13 l= new Location8_13();
		
        double max1=a[0][0];
        int column=0, row=0;
		for(int i=0; i<n; i++){
        	for(int j=0; j<m; j++){
        		if(max1<a[i][j]){
        			max1=a[i][j];
        			column=j;
        			row=i;
        		}
        	}
        }
	    
	  l.arr=a;
	  l.max=max1;
	  l.row=row;
	  l.column=column;
		
	 
	  return l;
	}
}
