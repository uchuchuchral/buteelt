package obekt_and_class;

public class ThisZaagch {
   private int a = 5;
    private static double k = 0;
    
   public void setA(int A){
	  this.a=A; // ene tohioldold this.a bas a 2 adilhan yum.
   }
   
   public static void setK(double K){
	   ThisZaagch.k = K;
   }
   public void show(){
	   System.out.println("a="+a);
	   System.out.println("k="+k);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ThisZaagch ptr= new ThisZaagch();
      ptr.setA(10);
      ptr.setK(2);
	  ptr.show();	
  	
	}
	

}
