package bodlogo14_7_14_8_14_9;

import bodlogo14_2.Circle;
import bodlogo14_2.Rectangle;
import inherit.GeometricObject;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     GeometricObject[] Ge= {new Rectangle(2,4),new Rectangle(), new Circle(5), new Circle()};
     
     
     System.out.println("Rectangle1(area) = "+Ge[0].getArea());
     System.out.println("Rectangle2(area) = "+Ge[1].getArea());
     System.out.println("Circle1(area) = "+Ge[2].getArea());
     System.out.println("Circle2(area) = "+Ge[3].getArea());
     System.out.println("sum = "+sumArea(Ge));
     
	}

	public static double sumArea(GeometricObject[] a){
		double sum=0;
		for(int i=0; i<4; i++){
		    sum+=a[i].getArea();
			
		    }
		return sum; 
		}
		
	
}

