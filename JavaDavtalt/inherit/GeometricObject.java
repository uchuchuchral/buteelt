package inherit;

import hicheelJava5.Triangle;

public abstract class GeometricObject implements Comparable{
	private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;  // uusgesen on sar udur 
    
    public GeometricObject(){
    	dateCreated= new java.util.Date();
    }
	
    public GeometricObject(String color, boolean filled) {
    	dateCreated = new java.util.Date();
    	 this.color = color;
    	 this.filled = filled;
    }
    
    public String getColor() {
    	 return color;
    	 }
    
    public void setColor(String color) {
    	 this.color = color;
    	 }
    	
    	 /** Return filled. Since filled is boolean,
    	30 its get method is named isFilled */
    	 public boolean isFilled() {
    	 return filled;
    	 }
    	
    	 /** Set a new filled */
    	 public void setFilled(boolean filled) {
    	 this.filled = filled;
    	 }
    	
    	 /** Get dateCreated */
    	 public java.util.Date getDateCreated() {
    	return dateCreated;
    	 }

  
    	 
    	 public String toString() {
    		  return "created on " + dateCreated + "\ncolor: " + color +
    		  " and filled: " + filled;
    		 }
    	 
    	 
 		public static int max(GeometricObject gob1, GeometricObject gob2){
 			int result=0; 
 			if((gob1 instanceof Triangle) && (gob2 instanceof Triangle)){
 				 
 				 if(((Triangle)gob1).getArea()>((Triangle)gob2).getArea())  // gob1 iig triangle ruu hurvuulelt hj bn
 					 result=1;
 			
 				 else if(((Triangle)gob1).getArea()<((Triangle)gob2).getArea())
 					 result=-1;
 				 
 			 }
 			
 			return result;
 			
 			
 		}

		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return max(this, (GeometricObject) o);  //geometricobject ruu object turliig hurvuulj bn
		}
 	
		public abstract double getArea();
        public abstract double getPerimetr();
    	 
}
