package pro_dadlaga;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class connectSQLDiary {  // ene class sql tei holbogdoj datanuudiig butsaaj bas datanuudiig oruuldag baiy
	String password;
	Date1 date;
	Connection conn;
	Statement stmt;
	ResultSet rs;
	String query;
	ArrayList<String> listDate = new ArrayList<String>();

	public connectSQLDiary(){
		try{
			conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/test?useUnicode=yes&characterEncoding=UTF-8", "root", "");
			System.out.println("Succes connection "); 



		}
		catch(Exception e){
			System.err.print(e);   
		}    

	}

	public String getPass() throws SQLException{ // u/sangaas pass awah 
		String pass="";
		query= "SELECT * FROM password";
		stmt = (Statement) conn.createStatement();
		rs=stmt.executeQuery(query);
		while(rs.next()){  // hamgiin suuld bgaa field iig awna . 
			pass=rs.getString("pass");
		}

		return pass;
	}

	public String getPagePieceTemdeglel() throws SQLException{ // u/sangaas 1nuurend bh temdegleliin toog awah 
		String pass="";
		query= "SELECT * FROM pagePieceTemdeglel";
		stmt = (Statement) conn.createStatement();
		rs=stmt.executeQuery(query);
		while(rs.next()){  // hamgiin suuld bgaa field iig awna . 
			pass=rs.getString("ppt");
		}

		return pass;
	}



	public ArrayList getTemdeglelDate() throws SQLException{ // temdegleliin ognoog awah method list eer butsaay 
		String date="";
		query= "SELECT * FROM diary ORDER BY diary.create_date DESC"; // on oor ni suuld orsonoor ni erembelj harah 
		stmt = (Statement) conn.createStatement();
		rs=stmt.executeQuery(query);
		while(rs.next()){  // hamgiin suuld bgaa field iig awna . 
			date=rs.getString("create_date");
			//     System.out.println(date);
			listDate.add(date);    
		}

		return listDate;
	}

	public ArrayList getTemdeglelDateHailt(String query) throws SQLException{ // hailtaar oldson temdegleliin ognoog awah method list eer butsaay 
		String date="";
		//	query= "SELECT * FROM diary ORDER BY diary.create_date DESC"; // on oor ni suuld orsonoor ni erembelj harah 
		stmt = (Statement) conn.createStatement();
		rs=stmt.executeQuery(query);
//		System.out.println("Result :");
		while(rs.next()){  // hamgiin suuld bgaa field iig awna . 
			date=rs.getString("create_date");
	//		System.out.println(date);
			listDate.add(date); 
//			System.out.println("while dotor");
		}

		return listDate;
	}


	public void setPass(String pass) throws SQLException{
		String sql = "INSERT INTO password (pass) VALUES (?)";

		PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
		statement.setString(1, pass);


		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
			System.out.println("A new user was inserted successfully!");

		}




	}


	public void setPagePieceTemdeglel (String pass) throws SQLException{
		String sql = "INSERT INTO pagePieceTemdeglel (ppt) VALUES (?)";

		PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
		statement.setString(1, pass);


		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
			System.out.println("A new user was inserted successfully!");

		}




	}


	public void setTemdeglel(String on, String sar, String udur, String temdeglel, int image) throws SQLException{ // u/san ruu temdeglelee hadgalah heseg
		String sql = "INSERT INTO diary (create_date,image) VALUES (?,?)";
		String sql1="INSERT INTO text (id, diary_id, text) VALUES (?,?,?)";

		PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
		String date=on+"-"+sar+"-"+udur;


		statement.setString(1, date);
		statement.setString(2, String.valueOf(image));

		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
			System.out.println("A new user was inserted successfully!");
		}

		PreparedStatement statement1 = (PreparedStatement) conn.prepareStatement(sql1);
		//		String date=on+"-"+sar+"-"+udur;
		//(SELECT id FROM diary WHERE create_date='2015-05-05' LIMIT 1),
		String getDiaryId="(SELECT id FROM diary WHERE create_date='"+date+"' LIMIT 1)";

		statement1.setString(1, null);
		statement1.setInt(2, getDiaryId(getDiaryId));
		statement1.setString(3, temdeglel);

		int rowsInserted1 = statement1.executeUpdate();
		if (rowsInserted1 > 0) {
			System.out.println("A new user was inserted successfully!");
		}
	  
	

	}

	public int getDiaryId(String query) throws SQLException{
		int ret=0;

		stmt = (Statement) conn.createStatement();
		rs=stmt.executeQuery(query);
		while(rs.next()){  // hamgiin suuld bgaa field iig awna . 

			ret=rs.getInt("id");

		}
		return ret;
		
	}
	
	public String getDateText(String date) throws SQLException{// parametreer awah on sariin textiig butsaana  
		String date1="'"+date+"'";
		String query="SELECT id FROM diary WHERE create_date="+date1;
		// System.out.println("query= "+query);

		int ret=0; // id ig ni awna

		stmt = (Statement) conn.createStatement();
		rs=stmt.executeQuery(query);
		while(rs.next()){  // hamgiin suuld bgaa field iig awna . 
			ret=rs.getInt("id");
		}
		
		String ret1="";
        query="SELECT text FROM text WHERE diary_id="+ret;
		rs=stmt.executeQuery(query);
		while(rs.next()){  // hamgiin suuld bgaa field iig awna . 
			ret1=rs.getString("text");
		}
		
		return ret1;

		/// 

	}

	public int getDateEmoticon(String date) throws SQLException{// parametreer awah text iinhee on sariig awna 
		String date1="'"+date+"'";
		String query="SELECT image FROM diary WHERE create_date="+date1;
		// System.out.println("query= "+query);

		int ret=0;

		stmt = (Statement) conn.createStatement();
		rs=stmt.executeQuery(query);
		while(rs.next()){  // hamgiin suuld bgaa field iig awna . 

			ret=rs.getInt("image");

		}
		return ret;

	}

	// Select text, emoticon FROM dairy WHERE date = '2016-05-01'; 


}
