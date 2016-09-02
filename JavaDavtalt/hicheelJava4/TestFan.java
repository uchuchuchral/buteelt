package hicheelJava4;

public class TestFan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  TheFan f1,f2;
		    f1=new TheFan();
		    f2=new TheFan();
				
		    f1.setRadius(10.0);
		    f1.setColor("yellow");
		    f1.setSpeed(TheFan.FAST);
		
		    f1.setON(true);
		    System.out.println(f1.toString());
		    
		    f2.setSpeed(TheFan.MEDIUM);
		    
		    System.out.println(f2.toString());
	}

}
