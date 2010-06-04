/**
 * 
 */
package business;

import model.Leave_app;
import model.User;

import common.AddLeaveApp.addLeaveApp;
import common.AddUser.addResult;

import dao.LeaveDAO;
import dao.UserDAO;

/**
 * @author HIEU
 *
 */
public class Leave_appService {
	public addLeaveApp addLeaveApp(Leave_app leave_app){
		LeaveDAO dao = new LeaveDAO();
		addLeaveApp leaveapp = dao.addLeaveapp(leave_app);
		return leaveapp;
	}
}
