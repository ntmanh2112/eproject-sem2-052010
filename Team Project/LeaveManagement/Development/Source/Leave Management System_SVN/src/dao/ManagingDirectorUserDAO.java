
package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import model.LeaveDirector;
import model.User;

import common.ConnectionDB;
import common.AddUser.addResult;
import common.ChangeUser.changeResult;
import common.Enumeration.loginResult;


//ADD GROUP
public class ManagingDirectorUserDAO {
	//ADD USER
	public void createleavedirector(LeaveDirector leavedirector){
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
	
	public User selectidposition(User user){
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
	
	
	//EDIT PROFILE
	public void updateUser(User user)throws Exception{
		ConnectionDB connectionDB = new ConnectionDB();
		connectionDB.connect();
		String update = " UPDATE TBL_USER SET FULLNAME = ?, BIRTHDAY = ?, GENDER = ? ,ADDRESS = ? ,EMAIL = ?, PHONE = ?  WHERE ID_USER = "+user.getId_user();
		PreparedStatement psmt = connectionDB.getConn().prepareStatement(update);
		psmt.setString(1, user.getFullname());
		psmt.setDate(2, user.getBirthday());
		psmt.setString(3, user.getGender());
		psmt.setString(4, user.getAddress());
		psmt.setString(5, user.getEmail());
		psmt.setString(6, user.getPhone());
		
		psmt.executeUpdate();
		
	}
	//LOCK USER
	public void  lockUser(User user)throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String lock = "UPDATE TBl_USER SET STATUS = '0' WHERE ID_USER = "+user.getId_user();
		Statement st = connection.getConn().createStatement();
		st.executeUpdate(lock);
		
	}
	//UNLIOCK USER
	public void  unlockUser(User user)throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String unlock = "UPDATE TBl_USER SET STATUS = '1' WHERE ID_USER = "+user.getId_user();
		Statement st = connection.getConn().createStatement();
		st.executeUpdate(unlock);
		
		
	}
	//ADD LEAVE DIRECTOR
	
	//ADD USER
	public addResult addUser(User  user){
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
	public User loadUser(int id){
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
	//LOGIN
	public loginResult loginUser(String username,String password){
		loginResult result = null;
		try{
			int idposition = 0;
			int status = 0;
			ConnectionDB connection = new ConnectionDB();
			connection.connect();
			String sql = "SELECT USERNAME,PASSWORD,STATUS,ID_POSITION FROM TBL_USER  WHERE USERNAME = ? AND PASSWORD = ?";
			PreparedStatement psmt = connection.getConn().prepareStatement(sql);
			psmt.setString(1, username);
			psmt.setString(2, password);
			ResultSet rs = psmt.executeQuery();
			int i = 0;
			while(rs.next()){
				i++;
				idposition = rs.getInt("ID_POSITION");
				status = rs.getInt("STATUS");
			}
			if( i!= 0 && idposition == 3 && status == 1 ){
				result = loginResult.managerbusiness;
			}
			else if (i!= 0 && idposition == 4 && status == 1) {
				result = loginResult.boss;
				
			}
			else if(i!= 0 && idposition == 2 && status == 1){
				result = loginResult.manager;
			}
			else if (i!= 0 && status == 0 ) {
				result = loginResult.lock;
			}
			else if(i==0){
				result = loginResult.fail;
			}
			return result;
		}catch(Exception ex){
			ex.printStackTrace();
			return result;
		}
		
	}
	//CHANGE PASSWORD
	public changeResult changePass(String oldpass,String newpass,String confirmpass ){
		changeResult cpresult = null;
		try {
			ConnectionDB conn = new ConnectionDB();
			conn.connect();
			String sql = "update Users set PASSWORD = ? where USERNAME =?";
			String sql1 = "SELECT PASSWORD FROM USER WHERE ID = ?";
			PreparedStatement psmt = conn.getConn().prepareStatement(sql1);
			psmt.setString(1, oldpass);
			psmt.setString(2, newpass);
			psmt.setString(3,confirmpass);
			ResultSet rs =psmt.executeQuery();
			String pass = null;
			while(rs.next()){
				 pass = rs.getString("PASSWORD");
			}
			if(oldpass.isEmpty()||newpass.isEmpty()||confirmpass.isEmpty()){
				 JOptionPane.showMessageDialog(null,"Please input all of column!");
			}
			else {
				if(pass.equalsIgnoreCase(oldpass)){
					if(newpass.equalsIgnoreCase(oldpass)){
						psmt = conn.getConn().prepareStatement(sql);
	   				 	cpresult = changeResult.sucessful;
	   				}
					else {
						 cpresult = changeResult.fail;
					}
				}
				else{
					 cpresult = changeResult.incorrect;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return cpresult;
		}
		return cpresult;
	}
	
	//SELECT USER
	public ResultSet selectAllUserBM() throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "select tbl_user.id_user,tbl_user.username,tbl_user.status,tbl_user.fullname,tbl_user.birthday,tbl_user.address,tbl_user.gender,tbl_user.phone,tbl_user.email,tbl_position.position_name from tbl_user INNER JOIN tbl_position on tbl_position.id_position=tbl_user.id_position where tbl_user.id_position='3' and tbl_user.status = '1'" ;
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	public ResultSet selectAllUserM() throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "select tbl_user.id_user,tbl_user.username,tbl_user.status,tbl_user.fullname,tbl_user.birthday,tbl_user.address,tbl_user.gender,tbl_user.phone,tbl_user.email,tbl_position.position_name from tbl_user INNER JOIN tbl_position on tbl_position.id_position=tbl_user.id_position where tbl_user.id_position='2'and tbl_user.status = '1'";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	public ResultSet selectAllUserE() throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "select tbl_user.id_user,tbl_user.username,tbl_user.status,tbl_user.fullname,tbl_user.birthday,tbl_user.address,tbl_user.gender,tbl_user.phone,tbl_user.email,tbl_position.position_name from tbl_user INNER JOIN tbl_position on tbl_position.id_position=tbl_user.id_position where tbl_user.id_position='1'and tbl_user.status = '1'";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	public ResultSet selectAllUserLock() throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "select tbl_user.id_user,tbl_user.username,tbl_user.status,tbl_user.fullname,tbl_user.birthday,tbl_user.address,tbl_user.gender,tbl_user.phone,tbl_user.email,tbl_position.position_name from tbl_user INNER JOIN tbl_position on tbl_position.id_position=tbl_user.id_position where  tbl_user.status = '0'";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	
	public int selectIdUser(String username) throws Exception{
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

