package javaCollectionFrameuud;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionTest {
    public static final String[] colors= {"Magenta", "Red", "Green", "White", "Blue"};
    public static final String[] removeColors= {"Red", "White", "Blue"};
	
    public CollectionTest(){
    List<String> list= new ArrayList<String>();
    List<String> removeList= new ArrayList<String>();
    List<String> linkedList= new LinkedList<>();
    
    for(String s: colors){
       list.add(s);	
    }
    
    for(String s: removeColors){
       removeList.add(s);	
    }
    System.out.println("Array list :");
    
    for(int count=0; count<list.size(); count++){
    	System.out.printf("%s", list.get(count));  
    	
    }
    
  
    
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
