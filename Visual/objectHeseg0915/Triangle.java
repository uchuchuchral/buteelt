package objectHeseg0915;

import java1.IllegalTriangleException;



public class Triangle extends GeometricObject1 {
	double side1, side2, side3; 

	public Triangle() throws IllegalTriangleException{
		this(1.0, 1.0, 1.0);
	}
    
	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
		setSide(side1,side2,side3);   
	}

	public void setSide(double side1, double side2, double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
    
	public Triangle(double side1, double side2, double side3, String color, boolean filled){  
		super(color, filled);
	//	if(isTriangle(side1,side2,side3)!=true){
	//		System.out.println(side1+","+side2+","+side3+" \n taluudtai gurvaljin orshin bhgui");
	//	    System.exit(0);  // shuud programm duusna
	//	}
		
	//	else{
		setSide(side1,side2,side3);
	//	}
		
	}
	
	
	public boolean isTriangle(double side1, double side2, double side3){
		return (side1+side2>side3 && side1+side3 >side2 && side2+side3>side1);
		
	}
      
	public double getArea(){
		double p=getPerimetr()/2;
		double area=Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		return area;
	}

    public double  getSide1(){
    	return side1;
    }
    
    public double  getSide2(){
    	return side2;
    }
    
    public double  getSide3(){
    	return side3;
    }
    
	public double getPerimetr(){
		return (side1+side2+side3);
	}

	public String toString(){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				" side3 = " + side3+" area=" +getArea()+" perimetr= "+ getPerimetr()+"\n"+super.toString();
	}

}
