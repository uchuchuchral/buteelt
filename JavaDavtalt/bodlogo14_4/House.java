package bodlogo14_4;

import java.util.Date;

public class House implements Cloneable, Comparable{
     private int id;
     private double area;
     private Date whenBuilt;
     
	
     public House(){
  
     }
     
     
     public House(int id, double area){
    	 this.id=id;
    	 this.area=area;
    	 whenBuilt= new Date();
     }
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int result=0;
		if(area >((House)o).getArea()){
			result=1;
		}
		else if(area < ((House)o).getArea()){
			result=-1;
		}
		
		
		return result;
	}


	public int getId() {
		return id;
	}
	
	public void setId(int id){
		this.id=id;
	}

	public double getArea() {
		return area;
	}
	
    public void setArea(double area){
    	this.area=area;
    }


	public Date getWhenBuilt() {
		return whenBuilt;
	}
	
	
  
	public Object clone() throws CloneNotSupportedException{
     //
		House h= new House();
	    h.setArea(area);
	    h.setId(id);
	    h.setDate(whenBuilt);
		//return super.clone();	
        return h;     
	}
	
	public String toString(){
		String output="House id = "+id;
		output+="\nHouse area = "+area;
		output+="\nHouse builded = "+whenBuilt;
		return output;
		
	}
	
	public void setDate(Date d){
		whenBuilt=(Date)d.clone();
	}
	
 public static void main(String []arg) throws CloneNotSupportedException{
  House house1= new House(1, 1750.50);
  System.out.println(house1.toString());
  
  House house2 = (House) house1.clone(); 
  System.out.println(house2.toString());
  
  house1.setId(14);
  System.out.println(house1.toString());
  
  
}
	
	
}
