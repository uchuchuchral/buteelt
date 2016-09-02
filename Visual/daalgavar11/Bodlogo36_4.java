package daalgavar11;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import JTable.MyTableModel;
import JTable.TableDemo;



public class Bodlogo36_4 extends JFrame{
    JTable table1;
	DefaultTableModel model;
	
	Object [][]data= new Object[10][4];
	String []ColumnNames= new String[4];
	
    public Bodlogo36_4() throws IOException{
    	int count=0;
    	int i=0, k=0;
    	int j=0;
    	
    	for (String line : Files.readAllLines(Paths.get("C:/Users/home/workspace/Java/table.txt"))) {
    	    // ...
    		for (String part : line.split(",")) { // part ad ug bolgon yvj bgaa
    	         if(count==0){
    	        	ColumnNames[i]=part;
    	        //	System.out.println(ColumnNames[i]);
    	        	i++;
    	         }
    	         
    	         else{ 
    	        	data[k][j]=(Object)part;
    	        	j++;
    	         }
    	    }
    		k++;
    		j=0;
    		count++;
    	}
    	
    	
    	table1= new JTable(data,ColumnNames);
    	add(table1,BorderLayout.CENTER);
        
    	toFile();	
    	
    }
    
   // uurchlult 
    public void toFile (){
    	
    try {
     //   File file = new File("table2.txt");
      //  PrintWriter os = new PrintWriter(file);
        PrintWriter os = new PrintWriter(new FileWriter("table.txt")); 
         
        
        for (int col = 0; col < table1.getColumnCount(); col++) {
        	if(col==table1.getColumnCount()-1){
        		  os.print(table1.getColumnName(col)+"");	
            
        	}
        	else{
        		 os.print(table1.getColumnName(col)+",");
                  }
            System.out.print(table1.getColumnName(col) +",");
        }

     //   os.println("");
        System.out.println();

        for (int i = 0; i < table1.getRowCount(); i++) {
            for (int j = 0; j < table1.getColumnCount(); j++) {
            	if(null!=table1.getValueAt(i, j)){
               	   if(j==table1.getColumnCount()-1){
               		 os.print(table1.getValueAt(i, j) + ""); 
                   
               	   }
               	   else{
               		 os.print(table1.getValueAt(i, j) + ",");
               	   }
            	}
               System.out.print(table1.getValueAt(i, j) + "\t");
               
            }
            os.println("");
            System.out.println();
        }
        os.close();
        System.out.println("Done!");
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
    
    }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Bodlogo36_4 frame= new Bodlogo36_4();
		 frame.setSize(new Dimension(400,150));
      // frame.setSize(400,300); 
		 frame.pack();
		 frame.setVisible(true);
		 frame.setLocationRelativeTo(null);
		 frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

}
