package bodlogo14_2;

import inherit.GeometricObject;

public class Circle extends GeometricObject {
     private double radius;
	
     
     public Circle(){
    	 super();
    	 radius=1;
        
         
     }
     
     public Circle(double radius ){
         setRadius(radius);	 
    	
     }
     

     
     public double getRadius(){
    	 return radius;
     }
     
     public void setRadius(double radius){
    	 this.radius=radius;
     }
     
     public double getArea(){
    	   double Area;
    	   Area=Math.PI*radius*radius;
    	   return Area;
     }
     
     public double getPerimetr(){
    	 double perimetr;
    	 perimetr=2*Math.PI*radius;
    	 return perimetr;
     }
     
     
     public String toString(){
    	 String output= new String();
    	 output+="Circle class : ";
    	 
    	 output+="\narea->"+getArea();
    	 output+="\nperimetr->"+getPerimetr();
    	 System.out.println(output);
    	 return output;
     }
}
