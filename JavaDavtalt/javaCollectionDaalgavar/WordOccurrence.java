package javaCollectionDaalgavar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// bodlogo22_8
public class WordOccurrence implements Comparable {
	int count;
	String word;
    
	public WordOccurrence(){
	 word="";
	 count=1;
	}
	
    public WordOccurrence(String word, int count){
	this.word=word;	
	this.count=count;
	
    }
    
	public int getWord(){
		return count;
	}
	
	public void setWord(String word){
		this.word=word;
	}
	
	public int getCount(){
		return count;
	}
	


	
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
	    int ret=0;
		if(count>((WordOccurrence) o).getCount()){
		   ret=1;	
		}
		if(count<((WordOccurrence) o).getCount()){
			   ret=-1;	
			}
		
		return ret;
	}

	
	
	public void print(){
		System.out.println(count+" : "+word);
	}
	
}
