package obekt_and_class;

public class C {
	public boolean x;
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        C c= new C();
        System.out.println(c.x);
        System.out.println(c.convert());
        
	}
int convert(){
	return x ? 1 : -1;  // hervee unen bol 1iig hudal bol -1 iig butsaanaa.
}
	
}

