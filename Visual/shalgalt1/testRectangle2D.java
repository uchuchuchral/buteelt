package shalgalt1;

public class testRectangle2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyRectangle2D r= new MyRectangle2D(2, 2 , 5.5, 4.9);
       System.out.println("area ="+r.getArea());
       System.out.println("area ="+r.getPerimetr());
   
       
       
       if(r.contains(new MyRectangle2D(2, 2, 1, 1))==true){
    	   System.out.println("bagtana");
       }
       
       else{
    	   System.out.println("bagtahgui");
       }
       
       if( r.contains(3, 3)==true){
    	   System.out.println("bagtana");
       }
       else{
    	   System.out.println("bagtahgui");
       }
       
       
      
	} 

}
