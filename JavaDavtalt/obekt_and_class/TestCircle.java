package obekt_and_class;

public class TestCircle {
	private double radius=1;
	private static int numberOfObjects=0;

	public TestCircle(){
		numberOfObjects++;  //  obekt uuseh burt baiguulagch duudagdaj numberofobject negeer nemegdene    	
	}
	public TestCircle(double newradius){
		radius=newradius;
		numberOfObjects++;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double newradius){
		radius= (newradius>=0)? newradius :0; // hervee shineer uguh radius 0ees ih yumuu tentsuu bwal radiusd ugch esreg tohioldold 0 iig ugch baina
	}

	public static int getNumberOfObject(){  // static ugugduliin utgiig awhiin tuld static funkts ashiglana
		return numberOfObjects;
	}

	public double getArea(){  // talbai olj utga butsaah funkts
		return radius*radius*Math.PI;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCircle myCircle= new TestCircle(5);
		System.out.println("Tuhain toirgiin radius "+myCircle.getRadius()+"bol talbai ni"+myCircle.getArea()+"baina");

		// radiusiig 10 huwiar nemegduulii 
		myCircle.setRadius(myCircle.getRadius()*1.1);
		System.out.println("Tuhain toirgiin radius "+myCircle.getRadius()+"bol talbai ni"+myCircle.getArea()+"baina");

		//heden obekt uusseniig olii 
		System.out.println("Uussen obektiin too : "+TestCircle.getNumberOfObject()); // static funktsed classiihaa nereer damjin handaj baina
	}

}

