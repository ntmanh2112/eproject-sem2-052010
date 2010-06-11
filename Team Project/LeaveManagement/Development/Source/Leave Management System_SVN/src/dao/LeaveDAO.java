
/**
 * 
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import model.Leaveapp;
import model.User;

import common.ConnectionDB;



/**
 * @author HIEU
 *
 */
public class LeaveDAO {
	
	//History User
	public ResultSet history(int month,int year,int id_user) throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "SELECT TBL_USER.FULLNAME,TBL_LEAVEAPP.DATEFROM,TBL_LEAVEAPP.DATETO,TBL_LEAVEAPP.REASON,TBL_LEAVEAPP.STATUSLEAVE,TBL_LEAVEAPP.ADDRESS,TBL_LEAVEAPP.PHONE FROM TBL_LEAVEAPP INNER JOIN TBL_USER ON TBL_USER.ID_USER=TBL_LEAVEAPP.ID_USER WHERE DATEPART(MONTH,TBL_LEAVEAPP.DATEFROM)= '"+ month+"' AND DATEPART(YEAR,TBL_LEAVEAPP.DATEFROM)='"+ year + "' AND TBL_USER.ID_USER = "+ id_user;
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	//REPORT
	public ResultSet report(int month,int year,int id_position) throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "SELECT USERNAME ,FULLNAME,DATEFROM,DATETO,REASON,TBL_LEAVEAPP.ADDRESS,TBL_LEAVEAPP.PHONE  FROM TBL_LEAVEAPP INNER JOIN TBL_USER ON TBL_USER.ID_USER = TBL_LEAVEAPP.ID_USER WHERE DATEPART(MONTH,TBL_LEAVEAPP.DATEFROM)= '" + month+"' AND DATEPART(YEAR,TBL_LEAVEAPP.DATEFROM)= '"+ year + "' AND STATUSLEAVE = 'FINISH' AND ID_POSITION = '" +id_position; 
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	//APPROVE LEAVEAPP
		public void  approveLeave(Leaveapp leaveapp)throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		@SuppressWarnings("unused")
		int i = leaveapp.getId_leaveapp();
		String approve = "UPDATE TBL_LEAVEAPP SET STATUSLEAVE = 'approve' WHERE ID_LEAVEAPP = "+leaveapp.getId_leaveapp();
		Statement st = connection.getConn().createStatement();
		st.executeUpdate(approve);
		
	}
		//REJECT LEAVEAPP
		public void  rejectLeave(Leaveapp leaveapp)throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		
		String reject =  "UPDATE TBL_LEAVEAPP SET STATUSLEAVE = 'reject' WHERE ID_LEAVEAPP = "+leaveapp.getId_leaveapp();
		Statement st = connection.getConn().createStatement();
		st.executeUpdate(reject);
	}
		//finish LEAVEAPP
		public void  finishLeave(Leaveapp leaveapp)throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String finish =  "UPDATE TBL_LEAVEAPP SET STATUSLEAVE = 'finish' WHERE ID_LEAVEAPP = "+leaveapp.getId_leaveapp();
		Statement st = connection.getConn().createStatement();
		st.executeUpdate(finish);
	}

	//SELECT LEAVEAPP OF MANAGING DIRECTOR = VALID
	public ResultSet selectAllLeaveappMDValid() throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "SELECT  TBL_LEAVEAPP.ID_LEAVEAPP,TBL_LEAVEAPP.ID_USER,TBL_USER.FULLNAME,TBL_LEAVEAPP.DATEFROM,TBL_LEAVEAPP.DATETO,TBL_LEAVEAPP.REASON,TBL_LEAVEAPP.STATUSLEAVE,TBL_LEAVEAPP.ADDRESS,TBL_LEAVEAPP.PHONE FROM TBL_LEAVEAPP INNER JOIN TBL_USER ON TBL_USER.ID_USER=TBL_LEAVEAPP.ID_USER WHERE TBL_LEAVEAPP.STATUSLEAVE='valid'";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	//SELECT LEAVEAPP OF MANAGING DIRECTOR = APPROVE
	public ResultSet selectAllLeaveappMDApprove() throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "SELECT  TBL_LEAVEAPP.ID_LEAVEAPP,TBL_LEAVEAPP.ID_USER,TBL_USER.FULLNAME,TBL_LEAVEAPP.DATEFROM,TBL_LEAVEAPP.DATETO,TBL_LEAVEAPP.REASON,TBL_LEAVEAPP.STATUSLEAVE,TBL_LEAVEAPP.ADDRESS,TBL_LEAVEAPP.PHONE FROM TBL_LEAVEAPP INNER JOIN TBL_USER ON TBL_USER.ID_USER=TBL_LEAVEAPP.ID_USER WHERE TBL_LEAVEAPP.STATUSLEAVE='approve'";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	//SELECT LEAVEAPP OF MANAGING DIRECTOR = REJECT
	public ResultSet selectAllLeaveappMDReject() throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "SELECT TBL_LEAVEAPP.ID_LEAVEAPP,TBL_LEAVEAPP.ID_USER,TBL_USER.FULLNAME,TBL_LEAVEAPP.DATEFROM,TBL_LEAVEAPP.DATETO,TBL_LEAVEAPP.REASON,TBL_LEAVEAPP.STATUSLEAVE,TBL_LEAVEAPP.ADDRESS,TBL_LEAVEAPP.PHONE FROM TBL_LEAVEAPP INNER JOIN TBL_USER ON TBL_USER.ID_USER=TBL_LEAVEAPP.ID_USER WHERE TBL_LEAVEAPP.STATUSLEAVE='reject'";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	//SELECT LEAVEAPP OF MANAGING DIRECTOR = FINISH
	public ResultSet selectAllLeaveappMDFinish() throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "SELECT TBL_LEAVEAPP.ID_LEAVEAPP,TBL_LEAVEAPP.ID_USER,TBL_USER.FULLNAME,TBL_LEAVEAPP.DATEFROM,TBL_LEAVEAPP.DATETO,TBL_LEAVEAPP.REASON,TBL_LEAVEAPP.STATUSLEAVE,TBL_LEAVEAPP.ADDRESS,TBL_LEAVEAPP.PHONE FROM TBL_LEAVEAPP INNER JOIN TBL_USER ON TBL_USER.ID_USER=TBL_LEAVEAPP.ID_USER WHERE TBL_LEAVEAPP.STATUSLEAVE='finish'";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	//SELECT LEAVEAPP OF BUSINESSMANAGER = VALID
	public ResultSet selectAllLeaveappBMValid() throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "SELECT TBL_LEAVEAPP.ID_LEAVEAPP,TBL_LEAVEAPP.ID_USER,TBL_USER.FULLNAME,TBL_LEAVEAPP.DATEFROM,TBL_LEAVEAPP.DATETO,TBL_LEAVEAPP.REASON,TBL_LEAVEAPP.STATUSLEAVE,TBL_LEAVEAPP.ADDRESS,TBL_LEAVEAPP.PHONE FROM TBL_LEAVEAPP INNER JOIN TBL_USER ON TBL_USER.ID_USER=TBL_LEAVEAPP.ID_USER WHERE TBL_LEAVEAPP.STATUSLEAVE='valid'AND TBL_USER.ID_POSITION = '2'";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	//SELECT LEAVEAPP OF BUSINESSMANAGER = APPROVE
	public ResultSet selectAllLeaveappBMApprove() throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "SELECT TBL_LEAVEAPP.ID_LEAVEAPP,TBL_LEAVEAPP.ID_USER,TBL_USER.FULLNAME,TBL_LEAVEAPP.DATEFROM,TBL_LEAVEAPP.DATETO,TBL_LEAVEAPP.REASON,TBL_LEAVEAPP.STATUSLEAVE,TBL_LEAVEAPP.ADDRESS,TBL_LEAVEAPP.PHONE FROM TBL_LEAVEAPP INNER JOIN TBL_USER ON TBL_USER.ID_USER=TBL_LEAVEAPP.ID_USER WHERE TBL_LEAVEAPP.STATUSLEAVE='approve'AND TBL_USER.ID_POSITION = '2'";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	//SELECT LEAVEAPP OF BUSINESSMANAGER = REJECT
	public ResultSet selectAllLeaveappBMReject() throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "SELECT TBL_LEAVEAPP.ID_LEAVEAPP,TBL_LEAVEAPP.ID_USER,TBL_USER.FULLNAME,TBL_LEAVEAPP.DATEFROM,TBL_LEAVEAPP.DATETO,TBL_LEAVEAPP.REASON,TBL_LEAVEAPP.STATUSLEAVE,TBL_LEAVEAPP.ADDRESS,TBL_LEAVEAPP.PHONE FROM TBL_LEAVEAPP INNER JOIN TBL_USER ON TBL_USER.ID_USER=TBL_LEAVEAPP.ID_USER WHERE TBL_LEAVEAPP.STATUSLEAVE='reject'AND TBL_USER.ID_POSITION = '2'";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	//SELECT LEAVEAPP OF BUSINESSMANAGER = FINISH
	public ResultSet selectAllLeaveappBMFinish() throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "SELECT TBL_LEAVEAPP.ID_LEAVEAPP,TBL_LEAVEAPP.ID_USER,TBL_USER.FULLNAME,TBL_LEAVEAPP.DATEFROM,TBL_LEAVEAPP.DATETO,TBL_LEAVEAPP.REASON,TBL_LEAVEAPP.STATUSLEAVE,TBL_LEAVEAPP.ADDRESS,TBL_LEAVEAPP.PHONE FROM TBL_LEAVEAPP INNER JOIN TBL_USER ON TBL_USER.ID_USER=TBL_LEAVEAPP.ID_USER WHERE TBL_LEAVEAPP.STATUSLEAVE='finish' AND TBL_USER.ID_POSITION = '2'";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	//SELECT LEAVEAPP OF MANAGER = VALID
	public ResultSet selectAllLeaveappMValid() throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "SELECT TBL_LEAVEAPP.ID_LEAVEAPP,TBL_LEAVEAPP.ID_USER,TBL_USER.FULLNAME,TBL_LEAVEAPP.DATEFROM,TBL_LEAVEAPP.DATETO,TBL_LEAVEAPP.REASON,TBL_LEAVEAPP.STATUSLEAVE,TBL_LEAVEAPP.ADDRESS,TBL_LEAVEAPP.PHONE FROM TBL_LEAVEAPP INNER JOIN TBL_USER ON TBL_USER.ID_USER=TBL_LEAVEAPP.ID_USER WHERE TBL_LEAVEAPP.STATUSLEAVE='valid' AND TBL_USER.ID_POSITION = '1' ";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	//SELECT LEAVEAPP OF MANAGER = APPROVE
	public ResultSet selectAllLeaveappMApprove() throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "SELECT TBL_LEAVEAPP.ID_LEAVEAPP,TBL_LEAVEAPP.ID_USER,TBL_USER.FULLNAME,TBL_LEAVEAPP.DATEFROM,TBL_LEAVEAPP.DATETO,TBL_LEAVEAPP.REASON,TBL_LEAVEAPP.STATUSLEAVE,TBL_LEAVEAPP.ADDRESS,TBL_LEAVEAPP.PHONE FROM TBL_LEAVEAPP INNER JOIN TBL_USER ON TBL_USER.ID_USER=TBL_LEAVEAPP.ID_USER WHERE TBL_LEAVEAPP.STATUSLEAVE='approve' AND TBL_USER.ID_POSITION = '1'";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	//SELECT LEAVEAPP OF MANAGER = REJECT
	public ResultSet selectAllLeaveappMReject() throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "SELECT TBL_LEAVEAPP.ID_LEAVEAPP,TBL_LEAVEAPP.ID_USER,TBL_USER.FULLNAME,TBL_LEAVEAPP.DATEFROM,TBL_LEAVEAPP.DATETO,TBL_LEAVEAPP.REASON,TBL_LEAVEAPP.STATUSLEAVE,TBL_LEAVEAPP.ADDRESS,TBL_LEAVEAPP.PHONE FROM TBL_LEAVEAPP INNER JOIN TBL_USER ON TBL_USER.ID_USER=TBL_LEAVEAPP.ID_USER WHERE TBL_LEAVEAPP.STATUSLEAVE='reject' AND TBL_USER.ID_POSITION = '1' ";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	//SELECT LEAVEAPP OF MANAGER = FINISH
	public ResultSet selectAllLeaveappMFinish() throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "SELECT TBL_LEAVEAPP.ID_LEAVEAPP,TBL_LEAVEAPP.ID_USER,TBL_USER.FULLNAME,TBL_LEAVEAPP.DATEFROM,TBL_LEAVEAPP.DATETO,TBL_LEAVEAPP.REASON,TBL_LEAVEAPP.STATUSLEAVE,TBL_LEAVEAPP.ADDRESS,TBL_LEAVEAPP.PHONE FROM TBL_LEAVEAPP INNER JOIN TBL_USER ON TBL_USER.ID_USER=TBL_LEAVEAPP.ID_USER WHERE TBL_LEAVEAPP.STATUSLEAVE='finish' AND TBL_USER.ID_POSITION = '1'";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	
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
	// LOAD LEAVE APPLICATION MANAGING DIRECTOR***************************hieu*************************
	public ResultSet selectAllDayOff(int month,int year) throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "SELECT DATEFROM,DATETO,REASON FROM TBL_LEAVEDIRECTOR WHERE DATEPART(MONTH,DATEFROM)= '"+ month+"' AND DATEPART(YEAR,DATEFROM)='"+ year+ "' order by dateto";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	// LOAD LEAVE APPLICATION MANAGING DIRECTOR***************************hieu*************************
	public ResultSet selectAllDayApprove(User user,int month,int year) throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "SELECT COUNT(STATUSLEAVE) FROM TBL_LEAVEAPP INNER JOIN TBL_USER ON TBL_USER.ID_USER = TBL_LEAVEAPP.ID_USER WHERE DATEPART(MONTH,DATEFROM)= '"+ month+"' AND DATEPART(YEAR,DATEFROM)='"+ year+ "' AND STATUSLEAVE = 'FINISH' AND USERNAME = '"+user.getUsername()+"' ";
		Statement st = connection.getConn().createStatement();																																																					
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
}


