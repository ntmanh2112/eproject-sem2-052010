package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import model.LeaveDirector;
import model.User;

import common.ConnectionDB;
import common.AddUser.addResult;

public class BusinessManagerUserDAO {
	//ADD USER
	public void BMcreateleavedirector(LeaveDirector leavedirector){
		try {
			ConnectionDB conn = new ConnectionDB();
			conn.connect();
			String sql1 = "INSERT INTO TBL_LEAVEDIRECTOR (DATEFROM,DATETO,REASON) VALUES (?,?,?)";
			PreparedStatement psmt1 = conn.getConn().prepareStatement(sql1);
			psmt1.setDate(1, leavedirector.getDatefrom());
			psmt1.setDate(2, leavedirector.getDateto());
			psmt1.setString(3, leavedirector.getReason());
			psmt1.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	public User BMselectidposition(User user){
			try{
			ConnectionDB conn = new ConnectionDB();
			conn.connect();
			String sql = "SELECT ID_POSITON FROM TBL_POSITION WHERE POSITION_NAME = " + user.getPosition_name();
			
			Statement st = conn.getConn().createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				user.setId_position(rs.getInt("ID_POSITION"));
			}
			
			return user;
		}catch(Exception e){
			e.printStackTrace();
		}
		return user;
	}
	//ADD USER
	public addResult BMaddUser(User  user){
		addResult addresult = null;
		try {
			ConnectionDB conn = new ConnectionDB();
			conn.connect();
			String sql = "SELECT USERNAME FROM  TBL_USER  WHERE TBL_USER.USERNAME = ?";
			String sql1 = " INSERT INTO TBL_USER (USERNAME ,PASSWORD,STATUS,FULLNAME,BIRTHDAY,ADDRESS,GENDER,PHONE,EMAIL,ID_POSITION) VALUES (? ,? ,1,?,?,?,?,?,?,1)";
			
			PreparedStatement psmt = conn.getConn().prepareStatement(sql);
			PreparedStatement psmt1 = conn.getConn().prepareStatement(sql1);
			
			psmt.setString(1, user.getUsername());
			
			psmt1.setString(1, user.getUsername());
			psmt1.setString(2,user.getPassword());
			psmt1.setString(3, user.getFullname());
			psmt1.setDate(4, user.getBirthday());
			psmt1.setString(5, user.getAddress());
			psmt1.setString(6, user.getGender());
			psmt1.setString(7, user.getPhone());
			psmt1.setString(8, user.getEmail());
			
			ResultSet rs = psmt.executeQuery();
			
			if (rs.wasNull()){
				addresult = addResult.incorrect;
			}
			
			else {
					psmt1.executeUpdate();
					addresult = addResult.sucessful;
				}
			
		} catch (Exception e) {
			e.printStackTrace();
			return addresult;
		}
		return addresult;
	}
	//LOAD USER
	public User BMloadUser(int id){
		User user = new User();
		try{
			ConnectionDB conn = new ConnectionDB();
			conn.connect();
			String sql = "SELECT USERNAME,FULLNAME,ADDRESS,EMAIL,BIRTHDAY,PHONE,POSITION_NAME,GENDER FROM TBL_USER INNER JOIN TBL_POSITION ON TBL_USER.ID_POSITION = TBL_POSITION.ID_POSITION WHERE ID_USER  = " + id;
			Statement st = conn.getConn().createStatement();
			ResultSet rs= st.executeQuery(sql);
			
			while(rs.next()){
				user.setUsername(rs.getString("USERNAME"));
				user.setFullname(rs.getString("FULLNAME"));
				user.setAddress(rs.getString("ADDRESS"));
				user.setEmail(rs.getString("EMAIL"));
				user.setPhone(rs.getString("PHONE"));
				user.setBirthday(rs.getDate("BIRTHDAY"));
				user.setGender(rs.getString("GENDER"));
				user.setPosition_name(rs.getString("POSITION_NAME"));
			
			}
			return user;
		}catch (Exception e) {
			e.printStackTrace();
			return user;
		}
		
	}
	//SELECT USER
	public ResultSet BMselectAllUserM() throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "select tbl_user.id_user,tbl_user.username,tbl_user.status,tbl_user.fullname,tbl_user.birthday,tbl_user.address,tbl_user.gender,tbl_user.phone,tbl_user.email,tbl_position.position_name from tbl_user INNER JOIN tbl_position on tbl_position.id_position=tbl_user.id_position where tbl_user.id_position='2'and tbl_user.status = '2'";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	public ResultSet BMselectAllUserE() throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "select tbl_user.id_user,tbl_user.username,tbl_user.status,tbl_user.fullname,tbl_user.birthday,tbl_user.address,tbl_user.gender,tbl_user.phone,tbl_user.email,tbl_position.position_name from tbl_user INNER JOIN tbl_position on tbl_position.id_position=tbl_user.id_position where tbl_user.id_position='1'and tbl_user.status = '1'";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	
	public int BMselectIdUser(String username) throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		int id = 0;
		String sql = "SELECT * FROM TBL_USER WHERE USERNAME = '"+username+"'";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()){
			id = rs.getInt("ID_USER");
		}
		return id;
	}

}
