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
	public String[][] selectLeaveapp()throws Exception{
		ArrayList<Leaveapp> list = new ArrayList<Leaveapp>();
		ResultSet rs = dao.selectLeaveAppValid();
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
		String[][] data1 = new String[list.size()][8];
		int i = 0;
		for(Leaveapp leaveapp : list){
			data1[i][0] = String.valueOf(leaveapp.getId_user());
			data1[i][1] = leaveapp.getFullname();
			data1[i][2] = leaveapp.getDatefrom().toString();
			data1[i][3] = leaveapp.getDateto().toString();
			data1[i][4] = leaveapp.getReason();
			data1[i][5] = leaveapp.getStatusleave();
			data1[i][6] = leaveapp.getAddress();
			data1[i][7] = leaveapp.getPhone();
			i++;
		}
		return data1;
	}

}
