package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;

import model.Leaveapp;

import common.ConnectionDB;

public class BusinessManagerLeaveappDAO {
	
//VIEW REPORT MONTH 
public ResultSet BMreportMonth() throws Exception{
	 ConnectionDB connection = new ConnectionDB();
	 connection.connect();
	 int year = Calendar.getInstance().get(Calendar.YEAR);
	 int month = Calendar.getInstance().get(Calendar.MONTH);
	 String sql = "SELECT TBL_USER.FULLNAME,TBL_LEAVEAPP.DATEFROM,TBL_LEAVEAPP.DATETO,TBL_LEAVEAPP.REASON FROM TBL_USER INNER JOIN TBL_LEAVEAPP ON TBL_USER.ID_USER = TBL_LEAVEAPP.ID_USER WHERE  DATEPART(YEAR,TBL_LEAVEAPP.DATEFROM)= '"+ year +"' AND DATEPART(MONTH,TBL_LEAVEAPP.DATEFROM)= '"+ month+ "' ORDER BY DATEFROM" ;
	 Statement st = connection.getConn().createStatement();
	 ResultSet rs = st.executeQuery(sql);
	 return rs;
}

//SELECT LEAVEAPP OF BUSINESSMANAGER = VALID
public ResultSet BMselectAllLeaveappValid() throws Exception{
	ConnectionDB connection = new ConnectionDB();
	connection.connect();
	String sql = "SELECT TBL_LEAVEAPP.ID_LEAVEAPP,TBL_LEAVEAPP.ID_USER,TBL_USER.FULLNAME,TBL_LEAVEAPP.DATEFROM,TBL_LEAVEAPP.DATETO,TBL_LEAVEAPP.REASON,TBL_LEAVEAPP.STATUSLEAVE,TBL_LEAVEAPP.ADDRESS,TBL_LEAVEAPP.PHONE FROM TBL_LEAVEAPP INNER JOIN TBL_USER ON TBL_USER.ID_USER=TBL_LEAVEAPP.ID_USER WHERE TBL_LEAVEAPP.STATUSLEAVE='valid'AND TBL_USER.ID_POSITION = '2'";
	Statement st = connection.getConn().createStatement();
	ResultSet rs = st.executeQuery(sql);
	return rs;
}
//SELECT LEAVEAPP OF BUSINESSMANAGER = APPROVE
public ResultSet BMselectAllLeaveappApprove() throws Exception{
	ConnectionDB connection = new ConnectionDB();
	connection.connect();
	String sql = "SELECT TBL_LEAVEAPP.ID_LEAVEAPP,TBL_LEAVEAPP.ID_USER,TBL_USER.FULLNAME,TBL_LEAVEAPP.DATEFROM,TBL_LEAVEAPP.DATETO,TBL_LEAVEAPP.REASON,TBL_LEAVEAPP.STATUSLEAVE,TBL_LEAVEAPP.ADDRESS,TBL_LEAVEAPP.PHONE FROM TBL_LEAVEAPP INNER JOIN TBL_USER ON TBL_USER.ID_USER=TBL_LEAVEAPP.ID_USER WHERE TBL_LEAVEAPP.STATUSLEAVE='approve'AND TBL_USER.ID_POSITION = '2'";
	Statement st = connection.getConn().createStatement();
	ResultSet rs = st.executeQuery(sql);
	return rs;
}
//SELECT LEAVEAPP OF BUSINESSMANAGER = REJECT
public ResultSet BMselectAllLeaveappReject() throws Exception{
	ConnectionDB connection = new ConnectionDB();
	connection.connect();
	String sql = "SELECT TBL_LEAVEAPP.ID_LEAVEAPP,TBL_LEAVEAPP.ID_USER,TBL_USER.FULLNAME,TBL_LEAVEAPP.DATEFROM,TBL_LEAVEAPP.DATETO,TBL_LEAVEAPP.REASON,TBL_LEAVEAPP.STATUSLEAVE,TBL_LEAVEAPP.ADDRESS,TBL_LEAVEAPP.PHONE FROM TBL_LEAVEAPP INNER JOIN TBL_USER ON TBL_USER.ID_USER=TBL_LEAVEAPP.ID_USER WHERE TBL_LEAVEAPP.STATUSLEAVE='reject'AND TBL_USER.ID_POSITION = '2'";
	Statement st = connection.getConn().createStatement();
	ResultSet rs = st.executeQuery(sql);
	return rs;
}
//SELECT LEAVEAPP OF BUSINESSMANAGER = FINISH
public ResultSet BMselectAllLeaveappFinish() throws Exception{
	ConnectionDB connection = new ConnectionDB();
	connection.connect();
	String sql = "SELECT TBL_LEAVEAPP.ID_LEAVEAPP,TBL_LEAVEAPP.ID_USER,TBL_USER.FULLNAME,TBL_LEAVEAPP.DATEFROM,TBL_LEAVEAPP.DATETO,TBL_LEAVEAPP.REASON,TBL_LEAVEAPP.STATUSLEAVE,TBL_LEAVEAPP.ADDRESS,TBL_LEAVEAPP.PHONE FROM TBL_LEAVEAPP INNER JOIN TBL_USER ON TBL_USER.ID_USER=TBL_LEAVEAPP.ID_USER WHERE TBL_LEAVEAPP.STATUSLEAVE='finish' AND TBL_USER.ID_POSITION = '2'";
	Statement st = connection.getConn().createStatement();
	ResultSet rs = st.executeQuery(sql);
	return rs;
}


public void BMaddLeaveapp(Leaveapp leave_app){
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
