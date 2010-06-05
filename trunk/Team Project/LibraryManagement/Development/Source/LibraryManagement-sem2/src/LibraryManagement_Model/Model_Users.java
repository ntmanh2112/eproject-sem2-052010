package LibraryManagement_Model;

public class Model_Users {
	private String id;
	private String username;
	private String password;
	private String last_updated_date;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLast_updated_date() {
		return last_updated_date;
	}
	public void setLast_updated_date(String last_updated_date) {
		this.last_updated_date = last_updated_date;
	}
	
}
