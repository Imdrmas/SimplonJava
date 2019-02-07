package login.submit.register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnecterProvider {
	
	static ResultSet rsObj = null;
	static Statement stmtObj = null;
	static Connection connObj = null;

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/ServletDB";

	static final String USER = "";
	static final String PASS = "";

     public static Connection getConnection() {

 		try {

			Class.forName(JDBC_DRIVER);

			connObj = DriverManager.getConnection(DB_URL, USER, PASS);

		} catch (Exception exObj) {

			exObj.printStackTrace();

		}

		return connObj;
     }
}
