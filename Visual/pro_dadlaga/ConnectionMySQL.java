package pro_dadlaga;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class ConnectionMySQL {  // ene class sql tei holbogdoj datanuudiig butsaaj bas datanuudiig oruuldag baiy
   
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
       
       try{
    	   Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/test?useUnicode=yes&characterEncoding=UTF-8", "root", "");
           System.out.println("Succes connection "); 
           
           String query= "SELECT * FROM diary";
           Statement stmt = (Statement) conn.createStatement();
         //  stmt.executeUpdate("INSERT INTO diary " + "VALUES ('2020-2-14', 'goy udur')");
           
           ResultSet rs=stmt.executeQuery(query);
     
           
           
          
          // TO_DATE('06/06/2006', 'mm/dd/yyyy')
           
         
    
              
              System.out.println("id    |  create_date         |  temdeglel ");
           while(rs.next()){
        	   System.out.print(rs.getString("id"));
        	   System.out.print("      "+rs.getString("create_date")+"   ");
        	   System.out.println("          "+rs.getString("temdeglel"));
           }
           
           rs.close();
           stmt.close();
           
       }
       catch(Exception e){
    	  System.err.print(e);   
       }
       
      
       
	}
}
