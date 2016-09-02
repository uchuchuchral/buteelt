package hicheelJava4;

public class TheFan {
 final static int SLOW=1;
 final static int MEDIUM=2;
 final static int FAST=3;
    
    private int speed;
    private boolean on;
    private double radius;
    String color;
   
	
    TheFan(){
    	speed=SLOW;
    	on=false;
    	radius=5.0;
    	color="blue";
    }
    
    void setSpeed(int speed1){
    	speed=speed1;
    }
    
    int getSpeed(){
    	return speed;
    }
    
    void setON(boolean on1){
    	on=on1;
    }
    
    boolean getON(){
    	return on;
    }
    
    void setRadius(double r1){
    	radius=r1;
    }
    
    double getRadius(){
    	return radius;
    }
    
    void setColor(String color1){
    	color=color1;
    }
    
    String getColor(){
    	return color;
    }
	
    
    public String  toString(){
	   String output;
	   if(on==true){
		  output="\nThe Fan is on "; 
		  output+="\n speed = "+this.getSpeed();// gej bas bolno
		  output+="\n color = "+color;
		  output+="\n radius = "+radius;
		  
	   }
	   else {
			  output="\nThe Fan is off"; 
			  output+="\n speed = "+speed;
			  output+="\n color = "+color;
			  output+="\n radius = "+radius;
	   }
	   
	   return output;
   }
    
    
    


 	 
	
}
