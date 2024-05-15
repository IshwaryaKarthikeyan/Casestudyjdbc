package Com.java.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	static Connection conn = null;
	
	public DBUtil(){
 try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
 
           
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Mysqlroot@19");
 
            System.out.println("Connected to the database");
           
 
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
 
	}
 
	public static Connection getDBConn()
	 {
		 DBUtil d1= new DBUtil();
		return conn;
		
	 }
}
 




