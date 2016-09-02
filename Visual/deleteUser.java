import java.sql.*;

import java.util.Scanner;

public class deleteUser {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   	static final String DB_URL = "jdbc:mysql://localhost/sisi";

   	static final String USER = "root";
   	static final String PASS = "on";

	public static void main(String []args){
	 	Connection conn = null;
	   	Statement stmt = null;
	   	try{
	   	 	Class.forName("com.mysql.jdbc.Driver");
	      	        conn = DriverManager.getConnection(DB_URL,USER,PASS);

	      		stmt = conn.createStatement();
	      		String sql;
	      		sql = "SELECT * FROM user_lab5";
	      		ResultSet rs = stmt.executeQuery(sql);

			System.out.println();
			System.out.println();
			System.out.println();

	      		while(rs.next()){
		 		int id  = rs.getInt("id");
		 		String name = rs.getString("name");
		 		String email = rs.getString("email");
		 		String birthday = rs.getString("birthday");

		 		System.out.print("ID: " + id);
		 		System.out.print(", Нэр: " + name);
		 		System.out.print(", Имейл: " + email);
		 		System.out.println(", Төрсөн өдөр: " + birthday);
	     		}					

			System.out.println();
		        System.out.println();
		        System.out.println();
			
			Scanner input = new Scanner(System.in);	
	
			String user_name = "";

			System.out.println();
			System.out.println();
			System.out.print("Устгах хэрэглэгчийн нэр : ");

			user_name = input.next();

			try{
				String usql = "DELETE FROM Post_lab5 WHERE user_id = (SELECT id FROM user_lab5 WHERE name = '"+user_name+"' LIMIT 1)";			int deleted_post = stmt.executeUpdate(usql);
				System.out.println("");
				System.out.println("Устгасан постуудын тоо: " + deleted_post);
				System.out.println("");
				sql = "DELETE FROM user_lab5 WHERE name = '"+user_name+"' LIMIT 1";
				int x = stmt.executeUpdate(sql);
				if(x != 0){
					System.out.println();
					System.out.println("Амжилттай устгалаа!");
					System.out.println();		
				}
				else System.out.println("Устгах явцад алдаа гарлаа!");
			} catch(SQLException pe){
				System.out.println();
				System.out.println("Устгах явцад алдаа гарлаа!");
				System.out.println();
				pe.printStackTrace();
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
