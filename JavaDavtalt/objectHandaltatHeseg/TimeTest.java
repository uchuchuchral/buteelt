package objectHandaltatHeseg;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TimeClass t1= new TimeClass();
        System.out.println(t1.toUniversalString());
        
        t1.setTime(13, 27, 6);
        System.out.println(t1.toUniversalString());
	}

}
