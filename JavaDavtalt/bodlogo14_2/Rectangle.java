package bodlogo14_2;

import inherit.GeometricObject;

public class Rectangle extends GeometricObject {

	 private double side1;
	 private double side2;
     
     public Rectangle (){
    	 super();
    	 setSide1(1);
    	 setSide2(1);
         
     }
     
     public Rectangle (double side1, double side2 ){
         setSide1(side1);
         setSide2(side2);
    	
     }
     
   
     
     
     public double getArea(){
    	   double Area;
    	   Area=side1*side2;
    	   return Area;
     }
     
     
     public double getPerimetr(){
    	 double perimetr;
    	 perimetr=(side1+side2)*2;
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

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}
}