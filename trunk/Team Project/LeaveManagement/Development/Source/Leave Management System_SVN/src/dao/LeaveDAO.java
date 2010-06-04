
/**
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Leave_app;

import common.ConnectionDB;
import common.AddLeaveApp.addLeaveApp;
import common.AddUser.addResult;

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
			String sql_addleave = "INSERT INTO TBL_LEAVEAPP VALUES (?,?,?,?,?,?,?,?)";
			PreparedStatement psmt = conn.getConn().prepareStatement(sql_addleave);
			psmt.setString(1,leave_app.getCreat_id());
			//psmt.setDate(2, leave_app.get);
			psmt.setDate(3,leave_app.getDateto() );
			psmt.setString(4,leave_app.getReason() );
			psmt.setString(5, leave_app.getStatus());
			psmt.setString(6, leave_app.getReviewer_id());
			psmt.setString(7, leave_app.getReject_msg());
			psmt.setDate(8, leave_app.getLastupdate());
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


