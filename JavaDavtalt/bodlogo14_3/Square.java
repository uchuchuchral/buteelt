package bodlogo14_3;

import inherit.GeometricObject;

public class Square extends GeometricObject implements Colorable{
    private double side;
	
    
    public Square(){
    	setSide(1);
    }
    
    public Square(double side){
    	this.setSide(side);
    }
    
	@Override
	public void howToColor() {
	System.out.println("Color all four side");
		
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public double getPerimetr() {
		// TODO Auto-generated method stub
		return 4*side;
	}
     
}
