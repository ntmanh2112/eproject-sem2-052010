package model;

import java.sql.Date;

public class Leave_app {

	int id_leaveapp;
	String creat_id;
	Date datefrom;
	Date dateto;
	String reason;
	String status;
	String reviewer_id;
	String reject_msg;
	Date lastupdate;
	public int getId_leaveapp() {
		return id_leaveapp;
	}
	public void setId_leaveapp(int id_leaveapp) {
		this.id_leaveapp = id_leaveapp;
	}
	public String getCreat_id() {
		return creat_id;
	}
	public void setCreat_id(String creat_id) {
		this.creat_id = creat_id;
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
	public String getReviewer_id() {
		return reviewer_id;
	}
	public void setReviewer_id(String reviewer_id) {
		this.reviewer_id = reviewer_id;
	}
	public String getReject_msg() {
		return reject_msg;
	}
	public void setReject_msg(String reject_msg) {
		this.reject_msg = reject_msg;
	}
	public Date getLastupdate() {
		return lastupdate;
	}
	public void setLastupdate(Date lastupdate) {
		this.lastupdate = lastupdate;
	}

}