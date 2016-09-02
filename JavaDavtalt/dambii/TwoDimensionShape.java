package dambii;

import hicheelJava5.Triangle;
import inherit.ComparableGeometricObject;

import java.util.Random;

public class TwoDimensionShape {
   protected String name;
   protected int xcoor;
   protected int ycoor;
   
   
   public TwoDimensionShape(){
  
   xcoor=(int) (Math.random()*100);
   ycoor=(int)(Math.random()*100);
   name="TwoDimensionShape";
   
   }
   
   
   public TwoDimensionShape(int xcoor, int ycoor){
	this.xcoor=xcoor;
	this.ycoor=ycoor;
	name="TwoDimensionShape";
	
   }
   
   void setXcoor(int xcoor ){
	   this.xcoor=xcoor;
   }
   
   void setYcoor(int ycoor ){
       this.ycoor=ycoor;
	   }
   
   public String toString(){
	    String output= new String();
	    output+="TwoDimensionShape class : ";
	    output+="\nname->"+name;
	    output+="\nxcoor->"+xcoor;
	    output+="\nycoor->"+ycoor;
	    return output;
	    
   }
   /*
	public static int max(ComparableGeometricObject gob1, ComparableGeometricObject gob2){
			int result=0; 
			if((gob1 instanceof Triangle) && (gob2 instanceof Triangle)){
				 
				 if(((Triangle)gob1).getArea()<((Triangle)gob2).getArea())
					 result=1;
				 else if
				 if(((Triangle)gob1).getArea()>((Triangle)gob2).getArea())
					 result=-1;
				 
			 }
			
			return result;
			
			
		}
	
*/   
}
