/**
 * 
 */
package business;

import model.Leave_app;

import common.AddLeaveApp.addLeaveApp;

import dao.LeaveDAO;

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
