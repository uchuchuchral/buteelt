package math.programm;

import java.util.Scanner;

public class Gaus1 {
    private double[] x = new double[10];
    private double[] y = new double[10];
    private double[] c= new double[10];
    private double[][] arr= new double[10][10];
    private double[][] arr1= new double[10][10];
    private double[][] arr2= new double[10][10];
	Scanner input= new Scanner(System.in);
   
	
    public Gaus1 (int a, int b){
    	for(int i=0; i<a; i++){
    		for(int j=0; j<b; j++){
                arr[i][j] = 0; 			
                arr1[i][j]= 0;
    		}
    	}
        
    }
    
    public void getArr(int a, int b){
    	System.out.print("Arr["+a+"]["+b+"]"+"= \n");
    	for(int i=0; i<a; i++){
    		for(int j=0; j<b ; j++){
    			
                arr[i][j] = input.nextDouble();
                System.out.print(" ");
                arr2[i][j]= arr[i][j];
                
    		}
    		System.out.println("");
    	}
    	
    	System.out.println("y sul gishuudiin utgiig oruul ");
    	for(int i=0; i<b; i++){
    		System.out.print("y["+i+"]=");
    		y[i] = input.nextDouble();
    		x[i] = 0;
    		c[i] = 0;
    		System.out.println("");
    	}
    	
    }
    
    public void showArr(int a, int b){
    	for(int i=0; i<a; i++){
    		for(int j=0; j<b; j++){
    			System.out.print("arr["+i+"]["+j+"] = "+arr[i][j]+"\t"); 			
    		}
    		System.out.println("");
    	}
    }
    
    public void huwirgalt(int a, int b ){
    	double gol;
    	int i1, j1;
    	for(int i=0; i<a; i++){
    		   
    		System.out.println(i+"deh huwirgalt");
    			gol=arr[i][i];	
    			i1=i;
    			j1=i;
    //			System.out.println("gol="+gol);
    			
    			
    		for(int k=0 ; k<a; k++){	
    	    	
    			for(int j=0; j<b; j++){
    		    	if(k==i1 && j==j1){
    			    	arr1[k][j]=1/gol; 
    			    //	System.out.println("gol daraa ni "+arr1[k][j]);
    			     }
    		    	
    			    else{
    			         if(i1==k){
    			        	arr1[k][j]=(arr[k][j]/gol)*-1;
    			  //      	System.out.println("ylgagch muriin element "+arr1[k][j]);
    				   
    			          }
    			          
    			         
    			         else{
    			        	 if(j1==j){
    			        		arr1[k][j]=arr[k][j]/gol;
    			//        		System.out.println("ylgagch baganiin element  "+arr1[k][j]);	 
    			        	 }
    			        	 else {
    			        	   arr1[k][j]=((arr[k][j]*gol)-(arr[k][j1]*arr[i1][j]))/gol;
    		//	        	   System.out.println("busad element ni "+arr1[k][j]);
    			        	 }
    			        	 
    			         }
    				
    			     }
    		      }
    		
    	     }	
    		for(int n=0; n<a; n++){
    			for(int n1=0; n1<b; n1++){
    				arr[n][n1]=arr1[n][n1];
    				System.out.print(arr[n][n1]+"\t");
    			}
    			System.out.println("");
    			
    		}
    		
    	 }
    }
    
    public void shiidOloh(int a){
    
    	
    	    for(int i=0 ; i<a; i++){
    	        
    		    for(int j=0 ;j<a; j++){
    			       x[i]=x[i]+arr[i][j]*y[j];  
    		     } 
    		
    	    }
       
    	
 
    }
    
    public void shiidShow(int a){
          for(int i=0; i<a; i++){
        	  System.out.println("x["+i+"] = "+x[i]);
          }
    	
    }
    
    public void Check(int a){
    for(int i=0; i<a; i++){
    	for(int j=0; j<a; j++){
            c[i]=c[i]+arr2[i][j]*x[j];		 
    	}
    	System.out.println("Ehnii muriin sul gishuun "+c[i]);
    }
    
    
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	 System.out.println("hemjees oruul = ");
	 int g= input.nextInt();
     Gaus1 ga= new Gaus1(g,g);
     ga.getArr(g, g);
     ga.showArr(g, g);
     ga.huwirgalt(g, g);
     //ga.showArr(g, g);
     ga.shiidOloh(g);
     ga.shiidShow(g);
	 ga.Check(g);
	}

}
