package inherit;

import hicheelJava5.Triangle;



public class ComparableGeometricObject {
	private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;  // uusgesen on sar udur 
    
    public ComparableGeometricObject(){
    	dateCreated= new java.util.Date();
    }
	
    public ComparableGeometricObject(String color, boolean filled) {
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

    	 
    	 
    	 
		/*public static int max(ComparableGeometricObject gob1, ComparableGeometricObject gob2){
			 if(gob1 instanceof Triangle && gob2 instanceof Triangle){
				 if(((Triangle)gob1).getArea()<((Triangle)gob2).getArea()
			 }
			
			return 0;
			
			
		}*/
	
}
