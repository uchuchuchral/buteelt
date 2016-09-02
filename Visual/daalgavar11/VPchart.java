package daalgavar11;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;

import JTable.MyTableModel;

public class VPchart extends JFrame{
         MyTableModel m1;
         ArrayList<String> list1 = new ArrayList(); // neriig ni hadgalna
         ArrayList<Integer> list2= new ArrayList(); // toon utgiin hadgalna
         ArrayList<Integer> list3= new ArrayList();  /// gradusiin huwichlagdsan utgiin hadgalna
         
         Color []color={Color.green,Color.blue,Color.GRAY, Color.CYAN, Color.RED,Color.MAGENTA,Color.yellow, Color.pink};
         
         public VPchart(MyTableModel m2){
        	 m1=m2;
        	 this.setTitle("View Pie chart");
       	     this.setVisible(true);
       	     this.setSize(300, 300);
       	     this.setLocationRelativeTo(null);
       	     this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
       	     calculatePercent();
         }
         
         
         public void calculatePercent(){
        	 int sum=0;
        	 
        	 for(int i=0; i<m1.getDataVector().size(); i++){
        		   //  System.out.println(m1.getValueAt(i, 1));
        		     list1.add((String) m1.getValueAt(i, 0));
        		     list2.add((Integer) m1.getValueAt(i, 1));
        	         sum=sum+(Integer)m1.getValueAt(i,1);  // niilber ni irne 
        	         
        	 }
        	 
       // 	 System.out.println(list1);
      //  	 System.out.println(list2);
        	 
        	 //sum bol 100 huwi gsn ug 
        	 int x;
        	 for(int i=0; i<m1.getDataVector().size(); i++){
        	    x=(list2.get(i)*100)/sum; 
        	    x=(x*360)/100;
        	    list3.add(x);
        //	    System.out.println("x="+x);
        	    
        	 }
        	 
        	 
        	 
        	 
         }
         
         public void paint(Graphics g){
        	 int x=150;
        	 int y=150;
        	 int endX,endY;
       // 	 g.setColor(Color.BLACK);
        	
     //   	 g.fillArc(50, 50, 200, 200, 163, 360-163);
        	 g.drawArc(50, 50, 200, 200, 0, 360);
        	 
        	 int startAngle=0;
        	 int endAngle=0;
        	 
       // 	 g.drawLine(x, y, 250, 150);
        	 System.out.println(list3.size()+"  == hemjeee");
        	 
       	 for(int i=0; i<list3.size(); i++){
        	 endAngle=list3.get(i)+endAngle;	 
	            
        	 g.setColor(color[i]);
             g.fillArc(50, 50, 200, 200, startAngle, endAngle-startAngle);
          //   System.out.println("startAngle ="+startAngle+" , endAngle ="+endAngle);
         
             startAngle=endAngle;
        	 }
       	 
       	 endAngle=0;
       	 g.setColor(Color.BLACK);
       	 //zasvartai!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     	 for(int i=0; i<list3.size(); i++){
        	 endAngle=list3.get(i)+endAngle;	 
        	// System.out.println(endAngle+" hoho"); 
        	 
             endX   = (int) (x + 110 * Math.sin(endAngle*((Math.PI*2)/60)));
	         endY   = (int) (y - 110 * Math.cos(endAngle*((Math.PI*2)/60)));
	         g.drawString(list1.get(i), endX, endY); 
	         
           //  startAngle=endAngle;
        	 }
     	 
         }
         
}
