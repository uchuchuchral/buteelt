package hicheelJava4;

public class TestRegularPolygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RegularPolygon r1, r2, r3;
		r1= new RegularPolygon();
		System.out.println(r1.toString());
		
		r2= new RegularPolygon(6,4);
		System.out.println(r2.toString());
		
		r3= new RegularPolygon(10, 4, 5.6 , 7.8);
		System.out.println(r3.toString());
	}

}
