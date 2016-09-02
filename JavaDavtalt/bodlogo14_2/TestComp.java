package bodlogo14_2;

public class TestComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ComparableCircle c1 = new ComparableCircle(6,"dugui2");
        ComparableCircle c2= new ComparableCircle(5,"dugui");
        // 
        //obekt massiv uusgeed hamgiin tom 2 instance iig oloh bsan bj magadgui
        
        int n=c2.compareTo(c1);
        
        if(n==1){
        	System.out.println("c2 tom ");
        	c2.toString();
        }
        else if(n==-1){
        	System.out.println("c1 tom ");
        	c1.toString();
        }
        
        else {
        	System.out.println("tentsuu ");
    	     c1.toString();
             c2.toString();
        }
	}

}
