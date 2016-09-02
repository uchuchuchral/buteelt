package bodlogo14_7_14_8_14_9;

import bodlogo14_4.House;
import inherit.GeometricObject;

public class Octagon extends GeometricObject implements Cloneable, Comparable {
	private double side;

	Octagon(){
		
	}
	
	Octagon(double side){
		setSide(side);

	}

	public Object clone() throws CloneNotSupportedException{
	     //
		   Octagon o= new Octagon();
		   o.setSide(getSide());
		   
		   return o;    
		}
	
	
	public double getArea() {
		// TODO Auto-generated method stub
		double area=(2+4/Math.sqrt(2))*side*side;
		return area;

	}

	@Override
	public double getPerimetr() {
		// TODO Auto-generated method stub
		return side*8;

	}


	public double getSide() {
		return side;
	}


	public void setSide(double side) {
		this.side = side;
	}

	public String toString(){
		String output="";
		output+="side = "+side;
		output+="\nperimetr = "+getPerimetr();
		output+="\narea = "+getArea();
		return output;
	}
	
	
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int result=0;
		
		if(getArea() >((Octagon)o).getArea()){
			result=1;
		}
		else if(getArea() < ((Octagon)o).getArea()){
			result=-1;
		}
	
		return result;
	}
}
