package business;

import common.ChangeUser.changeResult;
import common.Enumeration.loginResult;
import dao.UserDAO;

public class UserService {
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
}
