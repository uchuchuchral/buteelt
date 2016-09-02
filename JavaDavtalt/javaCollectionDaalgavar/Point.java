package javaCollectionDaalgavar;

import java.util.Comparator;

public class Point implements Comparable{
    int x;
    int y;
    
    public Point(int x, int y){
       this.x=x;
       this.y=y;
    }
    
    public int getXcoor(){
    	return x;
    }
    
    public int getYcoor(){
    	return y;
    }
    
    public int getSum(){
    	return x+y;
    }
    
    public void print(){
        System.out.print("["+x+","+y+"]  ");	
    }
    
	public int compareTo(Object o) {
		int ret=0;
		
	  if(x>((Point)o).getXcoor() && y>((Point)o).getYcoor()){
		   ret=1;	
	 	}
	
	  if(x<((Point)o).getXcoor() && y<((Point)o).getYcoor()){
		   ret=-1; 
		 }
		
      if(x<((Point)o).getXcoor() && y>((Point)o).getYcoor()){
		  ret=-1;	
		 }
        
      if(x>((Point)o).getXcoor() && y<((Point)o).getYcoor()){
		  ret=1;	
		}
        
      if(x==((Point)o).getXcoor() && y<((Point)o).getYcoor()){
  		  ret=-1;	
  		}
        
      if(x==((Point)o).getXcoor() && y>((Point)o).getYcoor()){
    	  ret=1;	
    	}
        
      if(x==((Point)o).getXcoor() && y==((Point)o).getYcoor()){
    	   ret=0;	
    	}
      
	  return ret;		
	
	}


	}


