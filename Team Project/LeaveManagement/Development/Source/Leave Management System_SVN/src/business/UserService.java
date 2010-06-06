package business;

import java.sql.ResultSet;
import java.util.ArrayList;

import model.User;


import common.AddUser.addResult;
import common.ChangeUser.changeResult;
import common.Enumeration.loginResult;

import dao.UserDAO;

public class UserService {
	UserDAO dao = new UserDAO();
	public loginResult loginUser(String username,String password){
		loginResult result = dao.loginUser(username, password);
		return result;
	}
	
	public changeResult changePass(String oldpass,String newpass,String confirmpass){
		changeResult result = dao.changePass(oldpass, newpass, confirmpass);
		return result;
	}
	//ADD USER
	public addResult addUser(User user){
		addResult result = dao.addUser(user);
		return result;
	}
	//LOCK USER
	public void lockUser(User user)throws Exception{
		dao.lockUser(user);
	}
	//UNLOCK USER
	public void unlockUser(User user)throws Exception{
		dao.unlockUser(user);
	}
	public User selectPositon(User user){
		dao.selectidposition(user);
		return user;
	}
	
	//LOAD USER
	public User loadUser(int id){
		User user = new User();
		user = dao.loadUser(id);
		return user;
	}
	public void updateUser(User user)throws Exception{
		dao.updateUser(user);
	}
	
	//LOAD BUSINESS MANAGER
	public String[][] selectAllUserBM()throws Exception{
		ArrayList<User> list = new ArrayList<User>();
		ResultSet rs = dao.selectAllUserBM();
		while (rs.next()){
			User user = new User();
			user.setId_user(rs.getInt("ID_USER"));
			user.setUsername(rs.getString("USERNAME"));
			user.setStatus(rs.getString("STATUS"));
			user.setPosition_name(rs.getString("POSITION_NAME"));
			user.setFullname(rs.getString("FULLNAME"));
			user.setBirthday(rs.getDate("BIRTHDAY"));
			user.setAddress(rs.getString("ADDRESS"));
			user.setGender(rs.getString("GENDER"));
			user.setPhone(rs.getString("PHONE"));
			user.setEmail(rs.getString("EMAIL"));
			
			list.add(user);
		}
		
		String[][] data = new String[list.size()][10];
		int i = 0;
		for(User user : list){
			data[i][0] = String.valueOf(user.getId_user());
			data[i][1] = user.getUsername();
			data[i][2] = user.getStatus();
			data[i][3] = user.getPosition_name();
			data[i][4] = user.getFullname();
			data[i][5] = user.getBirthday().toString();
			data[i][6] = user.getAddress();
			data[i][7] = user.getGender();
			data[i][8] = user.getPhone();
			data[i][9] = user.getEmail();
			i++;
		}
		return data;
	}
	//LOAD USERLOCK
	public String[][] selectAllUserlock() throws Exception{
		ArrayList<User> list = new ArrayList<User>();
		ResultSet rs = dao.selectAllUserLock();
		while (rs.next()){
			User user = new User();
			user.setId_user(rs.getInt("ID_USER"));
			user.setUsername(rs.getString("USERNAME"));
			user.setStatus(rs.getString("STATUS"));
			user.setPosition_name(rs.getString("POSITION_NAME"));
			user.setFullname(rs.getString("FULLNAME"));
			user.setBirthday(rs.getDate("BIRTHDAY"));
			user.setAddress(rs.getString("ADDRESS"));
			user.setGender(rs.getString("GENDER"));
			user.setPhone(rs.getString("PHONE"));
			user.setEmail(rs.getString("EMAIL"));
			
			list.add(user);
		}
		
		String[][] data = new String[list.size()][10];
		int i = 0;
		for(User user : list){
			data[i][0] = String.valueOf(user.getId_user());
			data[i][1] = user.getUsername();
			data[i][2] = user.getStatus();
			data[i][3] = user.getPosition_name();
			data[i][4] = user.getFullname();
			data[i][5] = user.getBirthday().toString();
			data[i][6] = user.getAddress();
			data[i][7] = user.getGender();
			data[i][8] = user.getPhone();
			data[i][9] = user.getEmail();
			i++;
		}
		return data;
	}
	//LOAD MANAGER
	public String[][] selectAllUserM()throws Exception{
		ArrayList<User> list = new ArrayList<User>();
		ResultSet rs = dao.selectAllUserM();
		while (rs.next()){
			User user = new User();
			user.setId_user(rs.getInt("ID_USER"));
			user.setUsername(rs.getString("USERNAME"));
			user.setStatus(rs.getString("STATUS"));
			user.setPosition_name(rs.getString("POSITION_NAME"));
			user.setFullname(rs.getString("FULLNAME"));
			user.setBirthday(rs.getDate("BIRTHDAY"));
			user.setAddress(rs.getString("ADDRESS"));
			user.setGender(rs.getString("GENDER"));
			user.setPhone(rs.getString("PHONE"));
			user.setEmail(rs.getString("EMAIL"));
			
			list.add(user);
		}
		
		String[][] data = new String[list.size()][10];
		int i = 0;
		for(User user : list){
			data[i][0] = String.valueOf(user.getId_user());
			data[i][1] = user.getUsername();
			data[i][2] = user.getStatus();
			data[i][3] = user.getPosition_name();
			data[i][4] = user.getFullname();
			data[i][5] = user.getBirthday().toString();
			data[i][6] = user.getAddress();
			data[i][7] = user.getGender();
			data[i][8] = user.getPhone();
			data[i][9] = user.getEmail();
			i++;
		}
		return data;
	}
	//LOAD ENGINEER
	public String[][] selectAllUserE()throws Exception{
		ArrayList<User> list = new ArrayList<User>();
		ResultSet rs = dao.selectAllUserE();
		while (rs.next()){
			User user = new User();
			user.setId_user(rs.getInt("ID_USER"));
			user.setUsername(rs.getString("USERNAME"));
			user.setStatus(rs.getString("STATUS"));
			user.setPosition_name(rs.getString("POSITION_NAME"));
			user.setFullname(rs.getString("FULLNAME"));
			user.setBirthday(rs.getDate("BIRTHDAY"));
			user.setAddress(rs.getString("ADDRESS"));
			user.setGender(rs.getString("GENDER"));
			user.setPhone(rs.getString("PHONE"));
			user.setEmail(rs.getString("EMAIL"));
			
			list.add(user);
		}
		
		String[][] data = new String[list.size()][10];
		int i = 0;
		for(User user : list){
			data[i][0] = String.valueOf(user.getId_user());
			data[i][1] = user.getUsername();
			data[i][2] = user.getStatus();
			data[i][3] = user.getPosition_name();
			data[i][4] = user.getFullname();
			data[i][5] = user.getBirthday().toString();
			data[i][6] = user.getAddress();
			data[i][7] = user.getGender();
			data[i][8] = user.getPhone();
			data[i][9] = user.getEmail();
			i++;
		}
		return data;
	}
	public int selectIdUser(String username) throws Exception{
		return dao.selectIdUser(username);
	}
}
