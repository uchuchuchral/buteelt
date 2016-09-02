package javaCollectionDaalgavar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Bodlogo22_8 {
	String text;
	
	/*
 WordOccurrence nertei class uusgene dotroo word ba count 2 talbartai 
 tgd compareTo method ni ug her olon davtagdsnaar ni eremblene

 Wordoccurence iin object uusgeed Arraylisted hadgalna.
 tgd Collections.sort() iig ashiglaad eremblene
	 */
	
	public Bodlogo22_8(String s1){
	    text=s1;
		int key=1;
		String []words=text.split("[:,. !?-]");

		Map<String, Integer> map1= new TreeMap<String, Integer>();
		
	
		for(int i=0; i<words.length ; i++){

			if(map1.get(words[i])==null){ //ug element mapd bhgui bwal
				map1.put(words[i], key);	
			}

			else{
				int oc= map1.get(words[i]).intValue();  // tuhain elementiin tulhuuriin utgiig nemegduulne
				oc++;
				map1.put(words[i], oc);
			}	
		}

		System.out.println("Map iin utga");

		int count=map1.size();
		WordOccurrence []w1= new WordOccurrence[count];
		int i=0;

		for(Map.Entry<String, Integer> m1: map1.entrySet()){
			System.out.println(m1.getValue()+"  :  "+m1.getKey());
			w1[i]=new WordOccurrence(m1.getKey(),m1.getValue());
			i++;
		}
		
		List<WordOccurrence> list1= new ArrayList<WordOccurrence>();
        for(int j=0; j<count; j++){
        	list1.add(w1[j]);
        }
        
        Collections.sort(list1);
        System.out.println("Eremblesnii daraa ");
       
        ListIterator lt= list1.listIterator();
        
        while(lt.hasNext()){
        	WordOccurrence wor1= new WordOccurrence();
        	wor1=(WordOccurrence) lt.next();
        	wor1.print();
        }
	}

	
	public static void main(String[] args) {
		new Bodlogo22_8("baahan ?-bishee baahan bid, ug ,uzeg- uzeg , amraa ,mc ,amraa ");	
	}

}
