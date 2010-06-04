
/**
 * 
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import model.Leaveapp;
import common.ConnectionDB;



/**
 * @author HIEU
 *
 */
public class LeaveDAO {
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
	public ResultSet selectLeaveApp() throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "SELECT * FROM viewLeaveApp";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}	
	public ResultSet selectLeaveAppValid()throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "SELECT * FROM viewLeaveAppValid";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	public ResultSet selectLeaveAppApprove()throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "SELECT * FROM viewLeaveAppApprove";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	public ResultSet selectLeaveAppReject()throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "SELECT * FROM viewLeaveAppReject";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	public ResultSet selectLeaveAppFinish()throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "SELECT * FROM viewLeaveAppFinish";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	

}


