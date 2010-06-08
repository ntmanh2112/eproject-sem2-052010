package model;

import java.sql.Date;

public class LeaveDirector {
	int id_leavedirector;
	Date datefrom;
	Date dateto;
	String reason;
	public int getId_leavedirector() {
		return id_leavedirector;
	}
	public void setId_leavedirector(int idLeavedirector) {
		id_leavedirector = idLeavedirector;
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
}
