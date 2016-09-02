package obekt_and_class;

public class Circle {

	public static void main(String[] args) {
	SimpleCircle circle1= new SimpleCircle();   // simplecircle turliin circle1 obekt uusgelee
		System.out.println("ug duguin radius ni  "+circle1.radius+" bol talbai ni "+circle1.getArea()+"baina");
    SimpleCircle circle2= new SimpleCircle(25); // anhnii utgaar ni 25iig ugchluu 
        System.out.println("ug duguin radius ni  "+circle2.radius+" bol talbai ni "+circle2.getArea()+"baina");
	
        circle2.radius=100;
   //     circle2.setRadius(15);  /// radius gishuun ugugdul private bwal ingej utga ugnu 	
	    
        System.out.println("ug duguin radius ni  "+circle2.radius+" bol talbai ni "+circle2.getArea()+"baina");
	}

}
//2 baiguulagchtai class uusgelee
class SimpleCircle{
	 
    double radius;
 	
    SimpleCircle(){
    	radius=1;
    }
	
    SimpleCircle(double Sradius){
    	radius=Sradius;
    }
    //radiusaar ni talbaig olj butsaah funkts
	double getArea(){
		return radius*radius*Math.PI;
		
	}
    double getPerimetr(){
    	return 2*radius*Math.PI;
    }
    // private handalttai gishuunii utgiig uurchluh setradius funkts
    void setRadius(double Sradius){
    	radius=Sradius;
    }
	
}
