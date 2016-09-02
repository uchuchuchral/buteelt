package objectHeseg0915;

public class Location {
	 public int row , column;
	 public double maxValue;
	 
	 
	 
	 public Location(){
	  this(0,0,0);
	  
	 }
	 
	 public Location(int row , int column, double maxValue){
		 this.row=row;
		 this.column=column;
		 this.maxValue=maxValue;
	 }
	 
	 public void showInfo(){
		 System.out.println("The location of the largest element is "+maxValue+" at ("+row+", "+column+")"); 
	 }
}
