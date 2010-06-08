package dao;

import java.sql.PreparedStatement;

import model.Leaveapp;

import common.ConnectionDB;

public class EngineerLeaveappDAO {

public void addLeaveapp(Leaveapp leave_app){
	try {
		ConnectionDB conn = new ConnectionDB();
		conn.connect();
		String sql_addleave = "INSERT INTO TBL_LEAVEAPP (ID_USER,DATEFROM,DATETO,REASON,STATUSLEAVE,PHONE,ADDRESS) VALUES(?,?,?,?,'valid',?,?)";
		PreparedStatement psmt = conn.getConn().prepareStatement(sql_addleave);
		psmt.setInt(1, leave_app.getId_user());
		psmt.setDate(2,leave_app.getDatefrom());
		psmt.setDate(3,leave_app.getDateto());
		psmt.setString(4, leave_app.getReason());
		psmt.setString(5, leave_app.getPhone());
		psmt.setString(6, leave_app.getAddress());
		psmt.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
		
	}
}

}
