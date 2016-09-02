package bodlogo14_7_14_8_14_9;

public class TestOctagon {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
     Octagon oc= new Octagon(5.0);
     System.out.println(oc.toString());
     Octagon oc1= (Octagon) oc.clone();
     System.out.println(oc1.toString());
     
     if(oc.compareTo(oc1)==1){
    	 System.out.println("Ehnii octagon tom");
     }
     if(oc.compareTo(oc1)==-1){
    	 System.out.println("2dahi octagon tom"); 
     }
     
     else{
    	 System.out.println("2 octagon tentsuu");
     }
	}

}
