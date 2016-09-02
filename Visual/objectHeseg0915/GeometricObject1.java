package objectHeseg0915;

public class GeometricObject1 {

	protected String color = "white";
    protected boolean filled;
    protected java.util.Date dateCreated;  // uusgesen on sar udur 
    
    public GeometricObject1(){
    	dateCreated= new java.util.Date();
    }
	
    public GeometricObject1(String color, boolean filled) {
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
    	 
}
