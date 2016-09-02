package dambii;

public class Triangle extends TwoDimensionShape {
     private double side1;
	 private double side2;
	 private double side3;
     
     public Triangle(){
    	 super();
    	 side1=3;
    	 side2=2;
    	 side3=2;
         name="Triangle";
         
     }
     
     public Triangle(double side1, double side2, double side3 , int xcoor, int ycoor){
    	 super(xcoor,ycoor);
         setSide1(side1);
         setSide2(side2);	
         setSide3(side3);	
    	 name="Triangle";
     }
     
     double getSide1(){
    	 return side1;
     }
     
     void setSide1(double side1){
    	 this.side1=side1;
     }
     
     void setSide2(double side2){
    	 this.side2=side2;
     }
     
     void setSide3(double side3){
    	 this.side3=side3;
     }
     
     
     
    	 double getArea(){
    		   	double p=getPerimetr()/2;
    		   	return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    			
    		}
     
     double getPerimetr(){
    	 return side1+side2+side3;
     }
     
     public String toString(){
    	 String output= new String();
    	 output+="Triangle class : ";
    	 output+="\nname->"+name;
    	 output+="\narea->"+getArea();
    	 output+="\nperimetr->"+getPerimetr();
    	 return output;
     }
}