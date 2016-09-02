package hicheelJavaShalgalt2;
/*
 Programm hangamj 3- B.Ulzii uchral  
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Shalgalt {
	List<String> list1=new ArrayList<String>();
	File f1;
  //  FileReader input;
    BufferedReader in;
    String l;
    char []sym1=new char[3];
    char []sym2=new char[3];
    int count =0;
    
	public Shalgalt(String s) throws IOException{  // file iin ner parametreer awna
		f1=new File(s);
		if(f1.isFile()){
			System.out.println("file bn");
		}
		else{
			System.out.println("iim file alga bn Shalgaad ahin uusgene uu!"); 
		}
    
		
    if(f1.isFile()){
    	sym1[0]='(';
    	sym2[0]=')';
    	
    	sym1[1]='{';
    	sym2[1]='}';
    	
    	sym1[2]='[';
    	sym2[2]=']';
    	
    	try{
    	 
    	 in=new BufferedReader(new FileReader(f1));
    	 while((l=in.readLine())!=null){
    		 list1.add(l);
    	 }
    	 
    	}
    	
    	catch(IOException e){
    		
    	}
     	
       finally{
    	   Searching();
    	   in.close();
       }
   	
     }
	}
	
	
	public void Searching() throws IOException{
	 System.out.println(list1);
	 Iterator<String> iterator=list1.iterator();  
	 
	 while(iterator.hasNext()){
		 l=iterator.next();
		// System.out.println("mur->"+l);
		// System.out.println("muriin urt->"+l.length());
		 count++;
		 
          Symbols(l);		 //tuhain muruus haalt shalgah method 
		//  Stackeer(l);    stackeer shalgasan method 
	 }

	}

	
	public void Symbols(String l1){
		int m,n;
		
		for(int i=0; i<l1.length(); i++){
			 if(l1.charAt(i)==sym1[0] || l1.charAt(i)==sym1[1]  || l1.charAt(i)==sym1[2]){
			//	System.out.println(l1.charAt(i)+"oldloo "+i+"index deer");
				for( n=0; n<3; n++){
		    		if(l1.charAt(i)==sym1[n]){
		    		   break;	
		    		}
		    	} 
				
				for(int j=i; j<l1.length(); j++){
				    if(l1.charAt(j)==sym2[0] || l1.charAt(j)==sym2[1] || l1.charAt(j)==sym2[2]){
				       //oldson ehnii haalt ni neesenteigee ijil haalt bnuu shalgana ijil bish bwal aldaa
				    	//System.out.println("iim haalt oldson "+l1.charAt(j));
				    	for( m=0; m<3; m++){ // oldson haaltaa ali temdegt gedgiig ni togtoono
				    		if(l1.charAt(j)==sym2[m]){
				    		   break;	
				    		}
				    	}
				    	
				    	if(n==m){ //hargalzan ijil haalt munv  shalgana 
				    	//	System.out.println("Ijil haalt bn aldaagui ");
				    		break;
				    	}
				    	else{
				    		System.out.println();
				    		System.out.println(count+" muriin ");
				    		System.out.println(i+" index deer bgaa ");
				    		
				    		System.out.println(l1.charAt(i)+" haalt bolon "+l1.charAt(j)+" haalt ni uur uchir aldaa");
				    		break;
				    	}
				    } 
				}
			 }
		 }
	}
	
	
	public void Stackeer(String l1){
	    int m;
		Stack<Character>st= new Stack<Character>();
	    
	    
		for(int i=0; i<l1.length(); i++){
		 	 if(l1.charAt(i)==sym1[0] || l1.charAt(i)==sym1[1]  || l1.charAt(i)==sym1[2]){
		     st.push(l1.charAt(i));
		     System.out.println(l1.charAt(i)+"Stackd hiisen");
		 	 }
		 	 
	   	 
	 }
		
       for(int i=0; i<l1.length(); i++){
    	   if(l1.charAt(i)==sym2[0] || l1.charAt(i)==sym2[1]  || l1.charAt(i)==sym2[2]){
    	      for( m=0; m<3; m++){
    	    	  if(l1.charAt(i)==sym2[m]){
    	    		break;  
    	    	  }
    	     
    	      if(sym1[m]==st.pop()){
    	    	  
    	      }
    	      else{
    	    	  System.out.println("Aldaatai haalt bn "+count+ "mur ");
    	    	  System.out.println(i+"deh index");
    	      }
    	      }
    		   
	        }
       }
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s= System.getProperty("user.dir");
		System.out.println("Odoo bgaa zam ->"+s);
      
		Shalgalt sh1= new Shalgalt("file1.txt");   //herveee odoo bgaa direktort file bhgui bol zamiig ni zaaj uguh heregtei 
        
		
	}

}
