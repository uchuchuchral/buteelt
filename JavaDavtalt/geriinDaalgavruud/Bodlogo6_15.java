package geriinDaalgavruud;

//1 toog 1l hevleh programm
public class Bodlogo6_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int []arr={1,1,1,1,2,5,3,6,6,7,0};
     int []arr1=new int[arr.length];
     int i=0,j=0;
     
     
     
     System.out.print("  "+arr[i]);// ehnii eliig shuud hevlej ehlene
	 arr1[i]=arr[i];// hevlesen elementee arr1 massivd hiine
	 
     do{
    	 j=0;
    	 for(int s=0; s<arr.length; s++){
    		 if(arr[i]==arr1[s]){ // arr1 massivd orson element dahij orjuu shalgana
    			 j=1; // dahij bwal j=1 ugnu 
    		 }
    	 }
    	 
    	 
    	 if(j==0){//hervee dahij bhgui bwal hevlene
    	 System.out.print("  "+arr[i]);
    	 arr1[i]=arr[i];
    	 
    	 }
    	i++;
    	 
     }
     while(i<arr.length);
		
	}

}
