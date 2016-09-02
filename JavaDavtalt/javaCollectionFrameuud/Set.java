package javaCollectionFrameuud;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;


//hashset ashiglan jagsaaltaas davhardaagui elementuudiig hevleh

public class Set {
   public static final String colors[]={"red","white","blue", "green","orange", "cyan","white","dark","orange", "grey"};
	
   public Set(){
	 List<String> list= Arrays.asList(colors); // listruu massiviig hurvuulej bn massiv bolon list ed hiisen uurchlult ali aliniig ni hamrana 
	 printNoDuplicate(list);
	 
   }
   
   private void printNoDuplicate(Collection <String> collection){
	 
	   HashSet<String> set= new HashSet<String>(collection); // hashSet elementuud davhardaagui bh uchir davhardsan listiin elementuudiig arilgaj uusgedeg  
       for(String s: set){
    	   System.out.printf("%s\t",s);
       }
       System.out.println();
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new Set();
      
	}

}
