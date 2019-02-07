package login.submit.register;

public interface CustomerDao {
	
	public int isertCustomer(Customer c);
	public Customer getCustomer(String firstname, String pass);

}
