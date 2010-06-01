package business;

import common.Enumeration.loginResult;
import dao.UserDAO;

public class UserService {
	public loginResult loginUser(String username,String password){
		UserDAO dao = new UserDAO();
		loginResult result = dao.loginUser(username, password);
		
		return result;
	}
}
