package model;

import java.sql.Date;

public class Leave_app {
	int id_leaveapp;
	String creat_id;
	String datefrom;
	String dateto;
	String reason;
	String reviewer_id;
	String reject_msg;
	Date lasteupdate;
	public int getId_leaveapp() {
		return id_leaveapp;
	}
	public void setId_leaveapp(int idLeaveapp) {
		id_leaveapp = idLeaveapp;
	}
	public String getCreat_id() {
		return creat_id;
	}
	public void setCreat_id(String creatId) {
		creat_id = creatId;
	}
	public String getDatefrom() {
		return datefrom;
	}
	public void setDatefrom(String datefrom) {
		this.datefrom = datefrom;
	}
	public String getDateto() {
		return dateto;
	}
	public void setDateto(String dateto) {
		this.dateto = dateto;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReviewer_id() {
		return reviewer_id;
	}
	public void setReviewer_id(String reviewerId) {
		reviewer_id = reviewerId;
	}
	public String getReject_msg() {
		return reject_msg;
	}
	public void setReject_msg(String rejectMsg) {
		reject_msg = rejectMsg;
	}
	public Date getLasteupdate() {
		return lasteupdate;
	}
	public void setLasteupdate(Date lasteupdate) {
		this.lasteupdate = lasteupdate;
	}

}
