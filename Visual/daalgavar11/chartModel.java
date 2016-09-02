package daalgavar11;

import java.awt.BorderLayout;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import JTable.MyTableModel;

public class chartModel{
	
	  String []ColumnNames1={"DataName","Data"};
      Object [][]data1={
    		  {"CS",200},
    		  {"Math",40}
    		  ,{"Chem",50}
    		  ,{"Biu",100}
    		  ,{"Phys",40},
    		  {"BUSS",10}
      };     
      
      MyTableModel model;
      
      public chartModel(){
    	model= new MyTableModel(data1,ColumnNames1);

      }
   
     
      public void removeRow(int rowIndex){  //
    	   
      }
      
      public void setModel(MyTableModel model1){
    	  model=model1;
      }
      
      public void showData(){
    	for(int i=0; i<model.getColumnCount(); i++){  
    	   System.out.println(model.getColumnName(i));
    	
    	   for(int j=0; j<model.getRowCount(); j++){
    		  System.out.println(model.getValueAt(j, i)); 
    	      }
    	   }
    	}
      
      
      
      public MyTableModel getModel(){  // model oo butsaah funkts
    	  return model;
      }
      
   
      
}
