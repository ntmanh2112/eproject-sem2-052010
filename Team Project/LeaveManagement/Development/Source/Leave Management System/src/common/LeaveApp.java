package common;

import java.sql.Date;

public class LeaveApp {
	String id_la;
	String id_user;
	Date datefrom;
	String reason;
	String status;
	String address;
	String phone;
	String sumdayoff;
	public String getId_la() {
		return id_la;
	}
	public void setId_la(String idLa) {
		id_la = idLa;
	}
	public String getId_user() {
		return id_user;
	}
	public void setId_user(String idUser) {
		id_user = idUser;
	}
	public Date getDatefrom() {
		return datefrom;
	}
	public void setDatefrom(Date datefrom) {
		this.datefrom = datefrom;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSumdayoff() {
		return sumdayoff;
	}
	public void setSumdayoff(String sumdayoff) {
		this.sumdayoff = sumdayoff;
	}
	

}
