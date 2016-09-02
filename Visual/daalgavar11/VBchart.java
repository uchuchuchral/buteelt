package daalgavar11;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;

import JTable.MyTableModel;

public class VBchart extends JFrame{
       
	  MyTableModel m1;
      ArrayList<String> list1 = new ArrayList(); // neriig ni hadgalna
      ArrayList<Integer> list2= new ArrayList(); // toon utgiin hadgalna
      ArrayList<Integer> list3= new ArrayList();  /// gradusiin huwichlagdsan utgiin hadgalna
      
      Color []color={Color.green,Color.blue,Color.GRAY, Color.CYAN, Color.RED,Color.MAGENTA,Color.yellow, Color.pink};
      
      public VBchart(MyTableModel m2){
     	 m1=m2;
     	 this.setTitle("View Pie chart");
    	     this.setVisible(true);
    	     this.setSize(300, 300);
    	     this.setLocationRelativeTo(null);
    	     this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    	     calculatePercent();
      }
      
      
      
      
      public void calculatePercent(){
     	 int max=0;
     	 // 250 aar awchii deed unduriiig 
     	 for(int i=0; i<m1.getDataVector().size(); i++){
     		   //  System.out.println(m1.getValueAt(i, 1));
     		     list1.add((String) m1.getValueAt(i, 0));
     		     list2.add((Integer) m1.getValueAt(i, 1));
     	         
     		     if(max<(Integer)m1.getValueAt(i, 1)){
     		    	 max=(Integer)m1.getValueAt(i, 1);  // max ni hadgalagadana
     		     }
     		     
     	         
     	 }
     	 

     	 int x;
     	 for(int i=0; i<m1.getDataVector().size(); i++){
     	    x= (list2.get(i)*250)/max; 
     	    list3.add(x);
     	    
     	 }
      }
      
      public void paint(Graphics g){
    	    int x=20;
    	    int y=300;
    	  
    	    int width=300/(list3.size()*2+1);  // urgun togtmol bn 
    	    
    		 
          	 for(int i=0; i<list3.size(); i++){
           	     	 
           	    g.setColor(color[i]);
                g.fillRect(x,y-list3.get(i),width, list3.get(i));
                x=x+width+width;
                
           	 }
          	 
           x=20;
          	 g.setColor(Color.BLACK);
          	 //zasvartai!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        	 for(int i=0; i<list3.size(); i++){
                g.drawString(list1.get(i), x, y-list3.get(i)-5);
                x=x+width+width;
           	 }
      }
}
