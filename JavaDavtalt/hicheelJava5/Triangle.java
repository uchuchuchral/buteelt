package hicheelJava5;

import inherit.GeometricObject;

public class Triangle extends GeometricObject {
      private double side1;
      private double side2;
      private double side3;
      
      
      public Triangle(){
    	  this.side1=1;
    	  this.side2=1;
    	  this.side3=1;
      }
      
      public Triangle(double side1, double side2, double side3){
    	  if(isValid(side1,side2,side3)){
    	  this.side1=side1;
    	  this.side2=side2;
    	  this.side3=side3;
    	  
    	  }
    	  else
    		  System.out.println(side1+","+side2+","+side3+"Iim gurvaljin bhgui");
    	  
      }
      
	 public boolean isValid(double s1, double s2, double s3){
		 if(s1+s2>s3 && s1+s3>s2 && s2+s3>s1)
			 return true;
		 else 
			 return false;
		 
	 }
      
      public Triangle(double side1, double side2, double side3 ,String color, boolean fill){
    	  super(color,fill);
    	  //super();
    	  this.side1=side1;
    	  this.side2=side2;
    	  this.side3=side3;
    	  
    	  
    	  
      }
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public double getSide1() {
		return side1;
	}


	public double getSide2() {
		return side2;
	}

	

	public double getSide3() {
		return side3;
	}
    
	
	
	public String ToString(){
		
		return super.toString()+"\nTriangle: side1 = " + side1 + " side2 = " + side2 +
				" side3 = " + side3;
	}
	
	
	public double getArea(){
	   	double p=getPerimetr()/2;
	   	return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		
	}

	public double getPerimetr(){
		double p=(side1+side2+side3);
		return p;
	}
}
