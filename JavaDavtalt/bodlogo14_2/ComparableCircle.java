package bodlogo14_2;

public class ComparableCircle extends Circle implements Comparable{
        
	public ComparableCircle(){
		super();
	}
	
	public ComparableCircle(double radius, String name){
		super(radius);
	}

	@Override
	public int compareTo(Object o) {
		int result=0;
		if(o instanceof ComparableCircle){
		   if( ((ComparableCircle)o).getArea()< this.getArea() ){
			   result=1;
		   }
		   else if( ((ComparableCircle)o).getArea()>this.getArea() ){
			   result=-1;
		   }
		   
		}
		
		
		return result;
	}
	
}
