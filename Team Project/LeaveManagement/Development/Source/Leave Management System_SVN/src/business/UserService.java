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
		UserDAO dao = new UserDAO();
		loginResult result = dao.loginUser(username, password);
		
		return result;
	}
	public changeResult changePass(String oldpass,String newpass,String confirmpass){
		UserDAO dao = new UserDAO();
		changeResult result = dao.changePass(oldpass, newpass, confirmpass);
		return result;
	}
	public addResult addUser(User user){
		UserDAO dao = new UserDAO();
		addResult result = dao.addUser(user);
		return result;
	}
	public void blockUser(User user)throws Exception{
		UserDAO dao = new UserDAO();
		dao.blockUser(user);
		
	}
	public User selectPositon(User user){
		UserDAO dao = new UserDAO();
		dao.selectidposition(user);
		return user;
	}
	public void addPositon(User user){
		UserDAO dao = new UserDAO();
		dao.addpostion(user);
	}
	public User loadUser(int id){
		UserDAO dao = new UserDAO();
		User user = new User();
		user = dao.loadUser(id);
		return user;
	}
	public void updateUser(User user)throws Exception{
		UserDAO dao = new UserDAO();
		dao.updateUser(user);
	}
	
	public String[][] selectAllUser()throws Exception{
		UserDAO dao = new UserDAO();
		ArrayList<User> list = new ArrayList<User>();
		ResultSet rs = dao.selectAllUser();
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
