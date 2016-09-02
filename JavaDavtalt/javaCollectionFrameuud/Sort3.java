package javaCollectionFrameuud;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort3 {

	
	public void printElement(){
		List<Time2> list= new ArrayList<Time2>();
		
		list.add(new Time2(6, 24, 39));
		list.add(new Time2(10, 14, 55));
		list.add(new Time2(6, 05, 34));
		list.add(new Time2(12, 14, 56));
		list.add(new Time2(6, 24, 22));
		
		
		System.out.printf("Eremblegdeegui ueiin list : \n"); // printf ashiglaj list hevlesen bdal
	    //System.out.println(list);
	    for(int i=0; i<list.size(); i++){
		list.get(i).printing();
	    }
	    
		Collections.sort(list, new TimeComparator());  // ingeel eremblene
		System.out.println();
		System.out.printf("Eremblegdsen ueiin list : \n", list);
		 for(int i=0; i<list.size(); i++){
				list.get(i).printing();
			    }
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Sort3 sort= new Sort3();
       sort.printElement();
	}

}
