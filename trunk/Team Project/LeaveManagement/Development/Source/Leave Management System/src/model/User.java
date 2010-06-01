package model;

public class User {
	int id_user;
	String username;
	String password;
	String status;
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int idUser) {
		id_user = idUser;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
