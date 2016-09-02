package hicheelJava4;

public class RegularPolygon {
   private int n;
   private double side;
   private double xcoor;
   private double ycoor;
   
   RegularPolygon(){
	   setN(3);
	   setSide(1.0);
	   setXcoor(0);
	   setYcoor(0);
	   
   }
	
	RegularPolygon(int n1, double s1){
	 setN(n1);
	 setSide(s1);
	 setXcoor(0);
	 setYcoor(0);

	}

	
	RegularPolygon(int n1, double s1, double x, double y){
	setN(n1);
	setSide(s1);
	setXcoor(x);
	setYcoor(y);
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getXcoor() {
		return xcoor;
	}

	public void setXcoor(double xcoor) {
		this.xcoor = xcoor;
	}

	public double getYcoor() {
		return ycoor;
	}

	public void setYcoor(double ycoor) {
		this.ycoor = ycoor;
	}
	
	public double getPerimetr(){
		double p=0;
		p=side*n;
		return p;
	}
	
	
	public double getArea(){
		double area;
		area=n*Math.pow(side, 2);
		area=area/(4*Math.tan(getPerimetr()/n));
	    return area;
	}
	
	public String toString(){
		String output;
		  output="\nThe Perimetr =  "+getPerimetr(); 
		  output+="\n The Area = "+getArea();// gej bas bolno
		return output;
		
	}
	
	
}

