package dambii;

public class Circle extends TwoDimensionShape {
     private double radius;
	
     
     public Circle(){
    	 super();
    	 radius=Math.random()*10;
         name="Circle";
         
     }
     
     public Circle(double radius, int xcoor, int ycoor ){
    	 super(xcoor,ycoor);
         setRadius(radius);	 
    	 name="Circle";
     }
     
     double getRadius(){
    	 return radius;
     }
     
     void setRadius(double radius){
    	 this.radius=radius;
     }
     
     double getArea(){
    	   double Area;
    	   Area=Math.PI*radius*radius;
    	   return Area;
     }
     
     double getPerimetr(){
    	 double perimetr;
    	 perimetr=2*Math.PI*radius;
    	 return perimetr;
     }
     
     public String toString(){
    	 String output= new String();
    	 output+="Circle class : ";
    	 output+="\nname->"+name;
    	 output+="\narea->"+getArea();
    	 output+="\nperimetr->"+getPerimetr();
    	 return output;
     }
}
