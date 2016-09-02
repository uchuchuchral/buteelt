package bodlogo14_3;


import hicheelJava5.Triangle;
import inherit.GeometricObject;

public class TestSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        GeometricObject[] a= new GeometricObject[5];
	    a[0]= new Square();
	    a[1]=new Triangle();
	    
	    m(a);
        
	}

	public static void m(GeometricObject[] o){
		for(int i=0; i<o.length ; i++){
			if(o[i] instanceof Colorable){
				((Colorable)o[i]).howToColor();  // hervee Colorablein instance bol ene method duudagdana
			}
		}
	}
}
