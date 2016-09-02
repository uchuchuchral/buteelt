package dambii;

public class Square extends TwoDimensionShape {
     private double side;

     
     public Square(){
    	 super();
    	 side=Math.random()*100;
         name="Square";
         
     }
     
     public Square(double side, int xcoor, int ycoor){
    	 super(xcoor,ycoor);
         setSide(side);	
    	 name="Square";
    	 
     }
     
     void setSide(double side){
    	 this.side=side;
     }
     
 
     
     
    double getArea(){
    		   	return side*side;
    			
    		}
     
     double getPerimetr(){
    	 return 4*side;
     }
     
     public String toString(){
    	 String output= new String();
    	 output+="Square class : ";
    	 output+="\nname->"+name;
    	 output+="\narea->"+getArea();
    	 output+="\nperimetr->"+getPerimetr();
    	 return output;
     }
}