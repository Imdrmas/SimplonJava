package login.submit.register;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerDaoImpl implements CustomerDao {
	
	static Connection con;
	static PreparedStatement ps;
	

	@Override
	public int isertCustomer(Customer c) {
		int status=0;
		try {
			con = ConnecterProvider.getConnection();
			String sqlInsert = "INSERT INTO `customer` (`customer`, `password`, `name`) VALUES(?,?,?)";
			ps=con.prepareStatement(sqlInsert);
			ps.setString(1, c.getName());
			ps.setString(2, c.getUsername());
			ps.setNString(3, c.getPassword());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}

	@Override
	public Customer getCustomer(String userid, String pass) {
		Customer c = new Customer();
	try {
			con = ConnecterProvider.getConnection();
			ps = con.prepareStatement("select * from customer where userid=? and password=?");
			ps.setString(1, userid);
			ps.setString(2, pass);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				c.setName(rs.getString(1));
				c.setUsername(rs.getString(2));
				c.setPassword(rs.getString(3));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return c;
	}

}
