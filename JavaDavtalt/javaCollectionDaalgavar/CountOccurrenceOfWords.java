package javaCollectionDaalgavar;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CountOccurrenceOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    String text="wooohooo man man. Good morning ! shut up and listen "+"have a nice day!!";
    
    TreeMap<String, Integer> map= new TreeMap<String, Integer>();
    
    String[] words=text.split("[\n\t\r .,;:!?(){]");  //ene temdegtuudeer ugiig taslaj words massivt hiine 
    
    for(int i=0; i<words.length; i++){
       String key=words[i].toLowerCase();
       
       if(key.length()>0){
    	//   System.out.println("map.get(key )->"+map.get(key));
    	  if(map.get(key)==null){ //yg tuhain ugiin tulhuur mapd bnuu neg ugeer mapd hiisnvv shalgana hiigeegui bwal hiine
    		  map.put(key, 1);
    	  }
    	  else{
    		  int value=map.get(key).intValue();
    //		  System.out.println("value=>"+value);
    		  value++; //ahin orj irj bgaa uchraas hargalzah utgiig ni negeer nemegduulne
    		  map.put(key, value);
    	  }
    	   
       }
      
    }
    
    
    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
    for (Map.Entry<String, Integer> entry: entrySet)
    	System.out.println(entry.getValue()+"\t"+entry.getKey());
    
	}

}
