package hicheelJava5;

public class TestTriangle {
     static  Triangle tri;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        tri = new Triangle(1,1.5, 1,"yellow", true);
       
        String output;
        output=tri.toString();
        output+="\nTriangle: side1 = " + tri.getSide1() + " side2 = " + tri.getSide1() +
				" side3 = " + tri.getSide3();
        output+="\tarea = "+tri.getArea();
        output+="\tperimetr = "+tri.getPerimetr();
        System.out.println(output);
        
        
        
        Triangle tr1= new Triangle(2,3.5,2, "yellow", true);
        
        getMax(tri, tr1);    
	}
	
	
	
	public static void getMax(Triangle t1, Triangle t2){
		String output;
		if(t1.getArea()>t2.getArea()){
			output="the max = 1-р гурвалжин";
		}
		else {
			output="the max = 2-р гурвалжин";
		}
		
		
		if(t1.getColor().equals(t2.getColor())){
			output+="\n өнгө тэнцүү  ";
		}
		else{
			output+="\n өнгө өөр байна ";
		}
		System.out.println(output);
	}
	
	
	

}
