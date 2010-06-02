
package dao;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import common.ConnectionDB;
import common.AddUser.addResult;
import common.ChangeUser.changeResult;
import common.Enumeration.loginResult;

public class UserDAO {
	public addResult addUser(String username, String password ,String fullname , Date birthday ,String address,String gender,String phone,String email){
		addResult addresult = null;
		try {
			ConnectionDB conn = new ConnectionDB();
			conn.connect();
			
			String sql = "INSERT INTO USER VALUES(?,?,?,?,?,?,?,'1','1')";
			String sql1 = "SELECT USERNAME FROM  TBL_USER  WHERE TBL_USER.USERNAME = ?";
			PreparedStatement psmt = conn.getConn().prepareStatement(sql1);
			psmt.setString(1, username);
			psmt.setString(2,password);
			psmt.setString(3, fullname);
			psmt.setDate(4, birthday);
			psmt.setString(5, address);
			psmt.setString(6, gender);
			psmt.setString(7, phone);
			psmt.setString(8, email);
			ResultSet rs1 = psmt.executeQuery();
			int i =0;
			while(rs1.next()){
				i++;
			}
			if(i!=0){
				addresult = addResult.incorrect;
			}
			else {
				if(username.isEmpty()||password.isEmpty()||fullname.isEmpty()||address.isEmpty()||gender.isEmpty()||phone.isEmpty()||email.isEmpty()){
					addresult = addResult.fail;
				}
				else {
					psmt = conn.getConn().prepareStatement(sql);
					psmt.executeUpdate();
					addresult = addResult.sucessful;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return addresult;
		}
		return addresult;
	}
	
	
	public loginResult loginUser(String username,String password){
		loginResult result = null;
		try{
			int id = 0;
			int status = 0;
			ConnectionDB connection = new ConnectionDB();
			connection.connect();
			String sql = "SELECT TBL_USER.USERNAME,PASSWORD,STATUS,ID_POSITION FROM TBL_EMLOYEE INNER JOIN TBL_USER ON TBL_EMPLOYEE.ID_USER = TBL_USER.ID_USER WHERE TBL_USER.USERNAME =? AND TBL_USER.PASSWORD = ?";
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



	
	
	/*public static User loadUser(String username){
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
	
	public static Emloyee1 loadEmloyee(String id_user){
		Emloyee1 emloyee = new Emloyee1();
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
	*/

}
