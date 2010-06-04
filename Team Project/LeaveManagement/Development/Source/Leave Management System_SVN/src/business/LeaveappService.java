/**
 * 
 */
package business;

import java.sql.ResultSet;
import java.util.ArrayList;

import model.Leaveapp;
import dao.LeaveDAO;

/**
 * @author HIEU
 *
 */
public class LeaveappService {
	LeaveDAO dao = new LeaveDAO();
	public void addLeaveApp(Leaveapp leave_app){
		dao.addLeaveapp(leave_app);
		
	}
	public String[][] selectAllUser()throws Exception{
		ArrayList<Leaveapp> list = new ArrayList<Leaveapp>();
		ResultSet rs = dao.selectLeaveApp();
		while (rs.next()){
			Leaveapp leaveapp = new Leaveapp();
			leaveapp.setId_user(rs.getInt("ID_USER"));
			leaveapp.setFullname(rs.getString("FULLNAME"));
			leaveapp.setDatefrom(rs.getDate("DATEFROM"));
			leaveapp.setDateto(rs.getDate("DATETO"));
			leaveapp.setReason(rs.getString("REASON"));
			leaveapp.setStatusleave(rs.getString("STATUSLEAVE"));
			leaveapp.setAddress(rs.getString("ADDRESS"));
			leaveapp.setPhone(rs.getString("PHONE"));
			list.add(leaveapp);
		}
		String[][] data = new String[list.size()][8];
		int i = 0;
		for(Leaveapp leaveapp : list){
			data[i][0] = String.valueOf(leaveapp.getId_user());
			data[i][1] = leaveapp.getFullname();
			data[i][2] = leaveapp.getDatefrom().toString();
			data[i][3] = leaveapp.getDateto().toString();
			data[i][4] = leaveapp.getReason();
			data[i][5] = leaveapp.getStatusleave();
			data[i][6] = leaveapp.getAddress();
			data[i][7] = leaveapp.getPhone();
			i++;
		}
		return data;
	}

}
