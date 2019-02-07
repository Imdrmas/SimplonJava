package marketControle;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.Statement;

public class DbDao {

	static ResultSet rsObj = null;
	static Statement stmtObj = null;
	static Connection connObj = null;

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/ServletDB";

	static final String USER = "";
	static final String PASS = "";

	/*****
	 * Method #1 :: This Method Is Used To Create A Connection With The Database
	 *****/
	private static Connection connectDb() {

		try {

			Class.forName(JDBC_DRIVER);

			connObj = DriverManager.getConnection(DB_URL, USER, PASS);

		} catch (Exception exObj) {

			exObj.printStackTrace();

		}

		return connObj;

	}

	/*****
	 * Method #2 :: This Method Is Used To Retrieve The Records From The Database
	 *****/
	public static ResultSet getEmployeeList() {
		try {

			stmtObj = connectDb().createStatement();

			String sql = "SELECT * FROM ServletDB.EmployeeTbl";

			rsObj = stmtObj.executeQuery(sql);

		} catch (Exception exObj) {

			exObj.printStackTrace();

		}

		return rsObj;

	}

	/*****
	 * Method #3 :: This Method Is Used To Close The Connection With The Database
	 *****/

	public static void disconnectDb() {
		try {
			rsObj.close();

			stmtObj.close();

			connObj.close();

		} catch (Exception exObj) {

			exObj.printStackTrace();

		}

	}
}
