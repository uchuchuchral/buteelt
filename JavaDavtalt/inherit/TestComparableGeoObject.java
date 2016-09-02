package inherit;

import hicheelJava5.Triangle;

public class TestComparableGeoObject  {
   static Triangle t1, t2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       t1= new Triangle(5,5,5);
       t2=new Triangle(3,3,3,"White",true);
       // classiin statik methodiig duudahdaa classiinh ni neriig bichej duudna
       int temp=t1.compareTo(t2);
       if(temp==1){
    	   System.out.println("ehnii Gurvaljin tom");
       }
       else if(temp==-1){
    	   System.out.println("2dahi Gurvaljin tom");
       }
       else
    	   System.out.println("Tentsuu");
		
	}

}
