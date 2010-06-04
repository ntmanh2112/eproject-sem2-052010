package model;

import java.sql.Date;

public class Leave_app {
	int id_user;
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int idUser) {
		id_user = idUser;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public Date getDatefrom() {
		return datefrom;
	}
	public void setDatefrom(Date datefrom) {
		this.datefrom = datefrom;
	}
	public Date getDateto() {
		return dateto;
	}
	public void setDateto(Date dateto) {
		this.dateto = dateto;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	String fullname;
	Date datefrom;
	Date  dateto;
	String reason;
	String status;
	

}
