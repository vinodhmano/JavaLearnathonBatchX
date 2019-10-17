package learnathon.batch15.day11;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class EmployeeDBO {
	
	static Connection conn = null;
	static Statement statement = null;
	
	public static void createNewDatabase(String dbname) {
		String url = "jdbc:sqlite:C:/sqlite/" + dbname;
		
		
		try {
			conn = DriverManager.getConnection(url);
			if(conn != null) {
				DatabaseMetaData meta = conn.getMetaData();
				System.out.println("The driver name is " + meta.getDriverName());
				
				System.out.println("Database created successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	public static void createTable() {
		StringBuilder query = new StringBuilder("CREATE TABLE IF NOT EXISTS EMPLOYEES "
				+ "(ID INTEGER PRIMARY KEY, NAME TEXT NOT NULL, DEPARTMENT TEXT, SALARY INTEGER);");
		
		System.out.println("Query = " + query.toString());
		
		try {
			
			//Step 1 - Create Connection
			conn = SQLiteConnector.getConnection();
			
			//Step 2 - Create Statement
			statement = conn.createStatement();
			
			//Step 3 - execute query
			statement.execute(query.toString());
			
			System.out.println("EMPLOYEE table created successfully");
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(conn != null)
				try {
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
			
	
	}
	                                 
	
	public static void saveEmploye(Employee e){
		StringBuilder query = new StringBuilder("INSERT INTO EMPLOYEES VALUES(");
		query.append(e.getId());
		query.append(", '" + e.getName() + "'");
		query.append(", '" + e.getDept() + "'");
		query.append(", " + e.getSalary() + ");");
		
		System.out.println("Query = " + query.toString());
		
		try {
			
			//Step 1 - Create Connection
			conn = SQLiteConnector.getConnection();
			
			//Step 2 - Create Statement
			statement = conn.createStatement();
			
			//Step 3 - execute query
			statement.execute(query.toString());
			
			System.out.println("Employee saved successfully");
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(conn != null)
				try {
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
			
	}
	
	public static void getEmployeeById(int id) {
		try {
			String query = "SELECT * FROM EMPLOYEES WHERE ID = " + id +";";
			conn = SQLiteConnector.getConnection();
			statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			
			while(rs.next()) {
				Employee e = new Employee(rs.getInt("ID"),
						rs.getString("NAME"),
						rs.getString("DEPARTMENT"),
						rs.getInt("SALARY"));
				e.printEmployee();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	public static void getAllEmployees() {
		try {
			String query = "SELECT * FROM EMPLOYEES;";
			conn = SQLiteConnector.getConnection();
			statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			
			while(rs.next()) {
				Employee e = new Employee(rs.getInt("ID"),
						rs.getString("NAME"),
						rs.getString("DEPARTMENT"),
						rs.getInt("SALARY"));
				e.printEmployee();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
