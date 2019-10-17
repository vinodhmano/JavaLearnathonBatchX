package learnathon.batch15.day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnector {
	
	static Connection con = null;
	
	public static Connection getConnection() {
		String url = "jdbc:sqlite:C://sqlite/EMP.db";
		try {
			con = DriverManager.getConnection(url);
			System.out.println("Connected successfully");
			return con;
		}catch(SQLException e) {
			System.out.println("Connection failed");
			e.printStackTrace();
			return null;
		}
		
	}
}
