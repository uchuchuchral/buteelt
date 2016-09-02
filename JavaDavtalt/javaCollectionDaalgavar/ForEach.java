package javaCollectionDaalgavar;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<String> someList= new ArrayList<String>();
    someList.add("Monkey");
    someList.add("Donkey");
    someList.add("Skeleton key");
    
    for(String item: someList){   // guilgeh elementteigee ijil turul awaad ter ni duustal ni guidiin bn 
    	System.out.println(item);  // 
       }
    
    someList.sort(null);
    for(String item: someList){   // guilgeh elementteigee ijil turul awaad ter ni duustal ni guidiin bn 
    	System.out.println(item);  // 
       }
	}

}
 