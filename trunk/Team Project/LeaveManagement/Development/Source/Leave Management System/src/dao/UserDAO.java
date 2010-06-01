
package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import common.ConnectionDB;
import common.Emloyee;
import common.Positions;
import common.User;
import common.Enumeration.loginResult;

public class UserDAO {
	
	public loginResult loginUser(String username,String password){
		loginResult result = null;
		try{
			int id = 0;
			ConnectionDB connection = new ConnectionDB();
			connection.connect();
			String sql = "SELECT * FROM TBL_USER WHERE USERNAME = ? AND PASSWORD = ?";
			PreparedStatement psmt = connection.getConn().prepareStatement(sql);
			psmt.setString(1, username);
			psmt.setString(2, password);
			ResultSet rs =  psmt.executeQuery();
			int i = 0;
			while(rs.next()){
				i++;
				id = rs.getInt("ID_POSITION");
			}
			if( i > 0&& id==2 ){
				result = loginResult.managerbusiness;
			}
			else if (i> 0 && id == 1) {
				result = loginResult.boss;
				
			}
			else if(i> 0 && id == 3){
				result = loginResult.manager;
			}
			else if (i> 0 && id ==4 ) {
				result = loginResult.enginerr;
			}
			else{
				result = loginResult.fail;
			}
			return result;
		}catch(Exception ex){
			ex.printStackTrace();
			return result;
		}
	}
	public static User loadUser(String username){
		User user = new User();
		try{
			String sql = "SELECT * FROM USER WHERE USERNAME = ?";
			ConnectionDB conn = new ConnectionDB();
			conn.connect();
			PreparedStatement psmt = conn.getConn().prepareStatement(sql);
			psmt.setString(1, username);
			ResultSet rs = psmt.executeQuery();
			conn.disconnect();
			while(rs.next()){
				user.setusername(rs.getString("USERNAME"));
				user.setPass(rs.getString("PASSWORD"));
				user.setID_position(rs.getString("ID_POSITION"));
			}
		}catch ( Exception e){
		
		}
		
		return user;
		
	}
	
	public static Emloyee loadEmloyee(String id_user){
		Emloyee emloyee = new Emloyee(); 
		try{
			String sql = " SELECT * FROM EMLOYEE WHERE ID_USER = ?";
			ConnectionDB conn = new ConnectionDB();
			conn.connect();
			PreparedStatement psmt = conn.getConn().prepareStatement(sql);
			psmt.setString(1, id_user);
			ResultSet rs = psmt.executeQuery();
			conn.disconnect();
			while(rs.next()){
				emloyee.setId_user(rs.getString("ID_USER"));
				emloyee.setFullname(rs.getString("FULLNAME"));
				emloyee.setBirthday(rs.getDate("BIRTHDAY"));
				emloyee.setAddress(rs.getString("ADDRESS"));
				emloyee.setSex(rs.getString("SEX"));
				emloyee.setPhone(rs.getString("PHONE"));
				emloyee.setEmail(rs.getString("EMAIL"));
				
				
			}
			
			
		}
		catch ( Exception e){
			
		}
		return emloyee;
	}
	public static Positions loadPostion(String id_position){
		Positions position = new Positions();
		try{
		String sql = "SELECT * FROM POSITION WHERE ID_POSITION + ?";
			ConnectionDB conn = new ConnectionDB();
			conn.connect();
			PreparedStatement psmt = conn.getConn().prepareStatement(sql);
			psmt.setString(1, id_position);
			ResultSet rs = psmt.executeQuery();
			conn.disconnect();
			while(rs.next()){
				position.setId_position(rs.getString("ID_POSITION"));
				position.setName_position(rs.getString("NAMEPOSITION"));
			}
		}catch(Exception e){
			
		}
		return position;
		
	}
	

}
