
/**
 * 
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Leave_app;

import common.ConnectionDB;
import common.AddLeaveApp.addLeaveApp;

/**
 * @author HIEU
 *
 */
public class LeaveDAO {
	public addLeaveApp addLeaveapp(Leave_app leave_app){
		addLeaveApp addLeaveApp = null;
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
			psmt.setString(6, leave_app.getAdress());
			ResultSet rs = psmt.executeQuery();
			if (rs.wasNull()){
				addLeaveApp = addLeaveApp.incorrect;
			}else {
				addLeaveApp = addLeaveApp.sucessful;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return addLeaveApp;
		}
		return addLeaveApp;
	
}
}


