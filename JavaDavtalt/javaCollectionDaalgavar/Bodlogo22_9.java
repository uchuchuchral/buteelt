package javaCollectionDaalgavar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/*
 Text file aas unshij ug bur hed bgaag tooloh mun delgetsend hevlehdee tsagaan tolgoin daraallaar hevleh 
 tom jijig ugsiig ijil ug bolgoj awna 
  */

public class Bodlogo22_9 {
      File f;
      Map<String, Integer> map1= new TreeMap<String, Integer>();
      String[] list=null;
	  BufferedReader bf;
      
      public Bodlogo22_9(String s) throws Exception{
       f=new File(s);
       if(f.isFile()){
    	  Reading();
    	  bf.close();
       }
       else{
    	  System.out.println("Iim file alga bn! "); 
       }
      
      }
      
      
      public void Reading() throws Exception{
         String line;	
         String word;
         int c1=1;
      
      try{
         bf= new BufferedReader(new FileReader(f));  // mur muruur unshihiin tuld bufferedReaderiin obekt uusgej bn 	  
    	 while((line=bf.readLine())!=null){ // text file iin tugsguliin null bolson eseheer medne
    	       list=line.split("[!,:;.?' ]"); // daraah temdegtuudeer taslaj ugsiig list massivd hiine 	 
    	       
    	       System.out.println("list iin elementuud : ");
    	           for(int i=0; i<list.length; i++){
    	        	   System.out.print(list[i]+" , ");
    	           }
    	       
    	       
    	       for(int i=0; i<list.length; i++){
    	    	   list[i]=list[i].toLowerCase();  // ug bolgoniig jijig usegtei bolgono
    	           word=list[i];
    	           
    	            if(word.length()!=0){
    	              if(map1.get(word)==null){//mapd word tai ijil ug bnuu bhgui bol shineer uusgene
    	            	 map1.put(word, c1);
    	            	 //c1++;
    	            	 
    	              }
    	              else{  // bwal 
    	            	int oc=map1.get(word).intValue();  
    	            //	System.out.println("oc- int value ->"+oc);
    	            	oc++;
    	            	map1.put(word, oc);
    	            	
    	              }
    	            	
    	            }
    	            
    	       }
    	       
    	 }
         
      }
      
      catch(Exception e){
    	  
      }
      for(String item: map1.keySet()){
    	  int rep=map1.get(item).intValue();  //item mapd bwal tuunii utgiig buyu toog butsaana
    	  System.out.printf(item+" : "+rep+"\n");
      }
      
      }
      
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       String s=System.getProperty("user.dir");
       System.out.println(s);
       Bodlogo22_9 b= new Bodlogo22_9("CountWord.txt");
	}

}
