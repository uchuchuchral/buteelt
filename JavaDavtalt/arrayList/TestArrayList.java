package arrayList;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ArrayList cityList= new ArrayList();
		
		cityList.add("London"); // london gedeg element nemeh
		cityList.add(88);
		
        cityList.add("Paris");
        cityList.add("Seoul");
        
		
        System.out.println("The List size = "+cityList.size());
        //cityList.clear();  // elementuudiig ustgah 
       // System.out.println("The List size = "+cityList.size());
        
        System.out.println(cityList.indexOf("Paris"));
        
        System.out.println("London ene listed bnuu ? "+cityList.contains("London"));
        
        cityList.add(2,"Lagaa");
        System.out.println("Lagaa giin index = "+cityList.indexOf("Lagaa"));
        System.out.println("Seoul iin index= "+cityList.indexOf("Seoul"));
        
        System.out.println("List size = "+cityList.size());
        
        
        cityList.set(2, "Lagaa duussan");
        System.out.println("Lagaa  element bnuu = "+cityList.contains("Lagaa"));
        System.out.println("Lagaa duussan heddeh element we="+cityList.indexOf("Lagaa duussan"));
	
	}

}
