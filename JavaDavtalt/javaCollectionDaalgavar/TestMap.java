package javaCollectionDaalgavar;

import java.util.Map;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Map<String, Integer> map1= new TreeMap<String, Integer>();
     map1.put("uur", 1);
     
     System.out.println("map1.keySet()->"+map1.keySet());
     System.out.println("map1.get(key)->"+map1.get("uur"));
     System.out.println("map1.get(key).intValue()->"+map1.get("uur").intValue());
	
	
	}
}
