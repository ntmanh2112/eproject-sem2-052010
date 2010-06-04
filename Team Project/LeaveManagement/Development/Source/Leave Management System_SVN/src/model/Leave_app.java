package model;

import java.sql.Date;

public class Leave_app {

	
	int id_leaveapp;
	int id_user;
	Date datefrom;
	Date dateto;
	String reason;
	String statusleave;
	String phone;
	String adress;
	public int getId_leaveapp() {
		return id_leaveapp;
	}
	public void setId_leaveapp(int idLeaveapp) {
		id_leaveapp = idLeaveapp;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int idUser) {
		id_user = idUser;
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
	public String getStatusleave() {
		return statusleave;
	}
	public void setStatusleave(String statusleave) {
		this.statusleave = statusleave;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
	
}