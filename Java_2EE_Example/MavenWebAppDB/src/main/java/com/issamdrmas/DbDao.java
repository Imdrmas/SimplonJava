package com.issamdrmas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
	public static Connection connectDb() {

		try {

			Class.forName(JDBC_DRIVER);

			connObj = DriverManager.getConnection(DB_URL, USER, PASS);

		} catch (Exception exObj) {

			exObj.printStackTrace();

		}

		return connObj;

	}
	/*****
	 * Method #2 :: This Method Is Used To Save The Records From The Database
	 *****/
	public static int save(StudentInfo s) {
		int st = 0;
		Connection con = DbDao.connectDb();
		
		String sqlInsert = "INSERT INTO `StudentInfo` (`name`, `last_name`, `age`, `city`, `birthDate`) VALUES(?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sqlInsert);
			ps.setString(1, s.getName());
			ps.setString(2, s.getLast_name());
			ps.setInt(3, s.getAge());
			ps.setString(4, s.getCity());
			ps.setDate(5, s.getBirthDate());
			
			st = ps.executeUpdate();
			con.close();
			
;		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return st;
	}
	
	/*****
	 * Method #2 :: This Method Is Used To Update The Records From The Database
	 *****/
	
	public static int update(StudentInfo s) {
		int st = 0;
		Connection con = DbDao.connectDb();
		String sqlUpdate = "UPDATE `StudentInfo` SET `first_name=?`, `last_name=?`, `age=?`, `city=?`, `date=?` WHERE id=?";
			
		try {
			PreparedStatement ps = con.prepareStatement(sqlUpdate);
			
			ps.setString(1, s.getName());
			ps.setString(2, s.getLast_name());
			ps.setString(3, s.getAge());
			ps.setString(4, s.getCity());
			ps.setString(5, s.getDate());
			ps.setInt(6, s.getId());
			
			st = ps.executeUpdate();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return st;
	}
	
	/*****
	 * Method #2 :: This Method Is Used To Delete The Records From The Database
	 *****/
	
	public static int delete(int id) {
		int st = 0;
		Connection con = DbDao.connectDb();
		String sqlDelete = "DELETE FROM `StudentInfo` WHERE id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sqlDelete);
			ps.setInt(6, id);
			st = ps.executeUpdate();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return st;
	}
	
	/*****
	 * Method #2 :: This Method Is Used To Retrieve Student By ID The Records From The Database
	 *****/
	
	public static StudentInfo getStudentByID(int id) {
		StudentInfo s = new StudentInfo();
		Connection con = DbDao.connectDb();
		
		String sqlSelect = "SELECT `id` `first_name=?`, `last_name=?`, `age=?`, `city=?`, `date=?` FROM `StudentInfo` WHERE id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sqlSelect);
			ps.setInt(1, id);
			ResultSet result = ps.executeQuery();
			if(result.next()) {
				s.setId(result.getInt(1));
				s.setName(result.getString(2));
				s.setLast_name(result.getString(3));
				s.setAge(result.getString(4));
				s.setCity(result.getString(5));
				s.setDate(result.getString(6));
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return s;
	}
	
	/*****
	 * Method #2 :: This Method Is Used To Get List Of Students The Records From The Database
	 *****/
	
	public static List<StudentInfo> getStudents(){
		List<StudentInfo> list = new ArrayList<StudentInfo>();
		Connection con = DbDao.connectDb();
		try {
			String sqlSelect = "SELECT * FROM `StudentInfo`";
			PreparedStatement ps = con.prepareStatement(sqlSelect);
			ResultSet result = ps.executeQuery();
			
			while(result.next()) {
				StudentInfo s = new StudentInfo();
				s.setId(result.getInt(1));
				s.setName(result.getString(2));
				s.setLast_name(result.getString(3));
				s.setAge(result.getString(4));
				s.setCity(result.getString(5));
				s.setDate(result.getString(6));
				list.add(s);
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	/*****
	 * Method #2 :: This Method Is Used To Retrieve The Records From The Database
	 *****/
	public static ResultSet getEmployeeList() {
		try {

			stmtObj = connectDb().createStatement();

			String sql = "SELECT * FROM ServletDB.StudentInfo";

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
