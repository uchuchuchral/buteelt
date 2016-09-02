package hicheelJava9;

import java.util.HashSet;
import java.util.Set;

public class Bodlogo22_1 {
	HashSet<String> hashSet1;
	HashSet<String> hashSet2;
	HashSet<String> unionSet;
	HashSet<String> diff;
	
	public Bodlogo22_1(){
		hashSet1= new HashSet<String>();
	    hashSet2= new HashSet<String>();
	    

	    unionSet= new HashSet<String>(); 
	    unionSet=hashSet1;
	    unionSet.addAll(hashSet2);
	    
	    diff= new HashSet<String>(); 
	    diff=hashSet1;
	    diff.removeAll(hashSet2);
	       
	    hashSet1.add("George");
	    hashSet1.add("Jim");
	    hashSet1.add("John");
	    hashSet1.add("Blake");
	    hashSet1.add("Kevin");
	    hashSet1.add("Michael");
	   
	    
	    hashSet2.add("George");
	    hashSet2.add("Katie");
	    hashSet2.add("Kevin");
	    hashSet2.add("Michelle");
	    hashSet2.add("Ryan");
	    
	   
	}
	public Set<String> getHash1(){
		return this.hashSet1;
	}
	
	public Set<String> getHash2(){
		return this.hashSet2;
	}
	
	public Set<String> getUnionSet(){
		return this.unionSet;
	}
	
	public Set<String> getDiff(){
		return this.diff;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Bodlogo22_1 hash= new Bodlogo22_1();
       System.out.println("hash 1:"+hash.getHash1());
       System.out.println("hash 2:"+hash.getHash2());
       
     /*  HashSet<String> unionSet=(HashSet<String>) hash.getHash1();
       unionSet.addAll(hash.getHash2());
       
       System.out.println("Negdel :"+unionSet);
       */
       
       System.out.println("Negdel :"+hash.getUnionSet());
       
       
    /* 
       HashSet<String> diffset=(HashSet<String>) hash.getHash1();
       diffset.removeAll(hash.getHash2());
      */
       
       System.out.println("difference :"+hash.getDiff());
       

       HashSet<String> intersection=(HashSet<String>) hash.getHash1();
      // HashSet<String> 
       System.out.println("Ogtloltsol :");
       for(String object:intersection){
    	   if(hash.getHash2().contains(object)){
    		   System.out.println(object);
    	   }
       }
       
    //   System.out.println("intersection :"+intersection);
	}
	
	

}
