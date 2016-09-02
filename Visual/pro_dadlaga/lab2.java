package pro_dadlaga;

import java.sql.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class lab2 {
         static Connection conn;
       static  Statement stmt;
         
	public static void main(String []args){
		    conn = null;
		    stmt = null;
		
		   try{

            conn=DriverManager.getConnection("jdbc:mysql://localhost/sisi?useUnicode=yes&characterEncoding=UTF-8", "root", "");
			 
			stmt = conn.createStatement();
			String sql = "SELECT * FROM user";
			ResultSet rs = stmt.executeQuery(sql);

			System.out.println();
		
			while(rs.next()){
				
				int id  = Integer.parseInt(rs.getString("id"));
				String name = rs.getString("name");
				String email = rs.getString("email");
				String birthday = rs.getString("birthday");

				System.out.println("ID: " + id);
				System.out.println("Нэр: " + name);
				System.out.println("Имейл: " + email);
				System.out.println("Төрсөн өдөр: " + birthday);
			}					


			  String userName = JOptionPane.showInputDialog( "Устгах нэр оруул :");
			  
		


			try{
				
				String usql = "DELETE FROM Post WHERE user_id = (SELECT id FROM user WHERE name = '"+userName+"' LIMIT 1)"; //oruulsan nertei hereglegchiin id g awaad postiin ustgah 	
				int deletedPost = stmt.executeUpdate(usql);
			//	System.out.println("Устгагдсан постын тоо: " + deleted_post);
				
				sql = "DELETE FROM user WHERE name = '"+userName+"' LIMIT 1";  // oruulsan nertei hereglegchiig ustgah 
				int rowInserted = stmt.executeUpdate(sql);
				if(rowInserted != 0){
					JOptionPane.showMessageDialog(null," устгагдлаа!", "",0);
				}
				
				
				else JOptionPane.showMessageDialog(null,"Ийм нэртэй хэрэглэгч алга!", "",0);
				
			} catch(SQLException e){
				JOptionPane.showMessageDialog(null, "Алдаа!","",0);
		
				e.printStackTrace();
			}

			rs.close();
			stmt.close();
			conn.close();

		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
