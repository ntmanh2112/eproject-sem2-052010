
package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import model.User;

import common.ConnectionDB;
import common.Enumeration;
import common.AddUser.addResult;
import common.ChangeUser.changeResult;

import common.Enumeration.loginResult;


public class UserDAO {
	public void addPosition(User user)throws Exception{
		ConnectionDB conn = new ConnectionDB();
		conn.connect();
		String addP = "UPDATE TBL_EMPLOYEE ID_POSITION WHRE USERNAME =  "+ user.getId_user();
		Statement st = conn.getConn().createStatement();
		st.execute(addP);
	}
	public void  blockUser(User user)throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String lock = "UPDATE TBl_USER SET STATUS = 0 WHERE ID_USER = "+user.getId_user();
		String unlock = "UPDATE TBl_USER SET STATUS = 1 WHERE ID_USER = "+user.getId_user();
		
		if (user.getStatus() == "0"){
			Statement st = connection.getConn().createStatement();
			st.executeUpdate(unlock);
		}else{
				Statement st = connection.getConn().createStatement();
				st.executeUpdate(lock);
		}
		
	}
	public addResult addUser(User  user){
		addResult addresult = null;
		try {
			ConnectionDB conn = new ConnectionDB();
			conn.connect();
			String sql = "SELECT USERNAME FROM  TBL_USER  WHERE TBL_USER.USERNAME = ?";
			String sql1 = " INSERT INTO TBL_USER (USERNAME ,PASSWORD,STATUS) VALUES (? ,? ,1)";
			String sql2 = "INSERT INTO TBL_EMPLOYEE (FULLNAME,BIRTHDAY,ADDRESS,GENDER,PHONE,EMAIL,ID_POSITION) VALUES(?,?,?,?,?,?,1)";
			PreparedStatement psmt = conn.getConn().prepareStatement(sql);
			PreparedStatement psmt1 = conn.getConn().prepareStatement(sql1);
			PreparedStatement psmt2 = conn.getConn().prepareStatement(sql2);
			psmt.setString(1, user.getUsername());
			
			psmt1.setString(1, user.getUsername());
			psmt1.setString(2,user.getPassword());
			
			
			psmt2.setString(1, user.getFullname());
			psmt2.setDate(2, user.getBirthday());
			psmt2.setString(3, user.getAddress());
			psmt2.setString(4, user.getGender());
			psmt2.setString(5, user.getPhone());
			psmt2.setString(6, user.getEmail());
			
			ResultSet rs = psmt.executeQuery();
			if (rs.wasNull()){
				addresult = addResult.incorrect;
			}
			
			else {
					
					psmt1.executeUpdate();
					psmt2.executeUpdate();
					addresult = addResult.sucessful;
				}
		} catch (Exception e) {
			e.printStackTrace();
			return addresult;
		}
		return addresult;
	}
	public User loadUser(int id){
		User user = new User();
		try{
			ConnectionDB conn = new ConnectionDB();
			conn.connect();
			String sql = "SELECT FULLNAME,ADDRESS,EMAIL,PHONE FROM TBL_EMPLOYEE WHERE ID_USER  = " + id;
			Statement st = conn.getConn().createStatement();
			ResultSet rs= st.executeQuery(sql);
			
			while(rs.next()){
				user.setFullname(rs.getString("FULLNAME"));
				user.setAddress(rs.getString("ADDRESS"));
				user.setEmail(rs.getString("EMAIL"));
				user.setPhone(rs.getString("PHONE"));
			
			}
			return user;
		}catch (Exception e) {
			e.printStackTrace();
			return user;
		}
		
	}
	
	public loginResult loginUser(String username,String password){
		loginResult result = null;
		try{
			int id = 0;
			int status = 0;
			ConnectionDB connection = new ConnectionDB();
			connection.connect();
			String sql = "SELECT TBL_USER.USERNAME,PASSWORD,STATUS,ID_POSITION FROM TBL_EMPLOYEE INNER JOIN TBL_USER ON TBL_EMPLOYEE.ID_USER = TBL_USER.ID_USER WHERE TBL_USER.USERNAME = ? AND TBL_USER.PASSWORD = ?";
			PreparedStatement psmt = connection.getConn().prepareStatement(sql);
			psmt.setString(1, username);
			psmt.setString(2, password);
			ResultSet rs = psmt.executeQuery();
			
			int i = 0;
			while(rs.next()){
				i++;
				id = rs.getInt("ID_POSITION");
				status = rs.getInt("STATUS");
			}
			if( i> 0 && id == 3 && status == 1 ){
				result = loginResult.managerbusiness;
			}
			else if (i> 0 && id == 4 && status == 1) {
				result = loginResult.boss;
				
			}
			else if(i> 0 && id == 2 && status == 1){
				result = loginResult.manager;
			}
			else if (i> 0 && status == 0 ) {
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

	public ResultSet selectAllUser() throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "SELECT * FROM viewUser";
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}

}
