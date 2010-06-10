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
	//APPROVE 
	public void approveLeaveApp(Leaveapp leaveapp)throws Exception{
		dao.approveLeave(leaveapp);
	}
	//REJECT 
	public void rejectLeaveApp(Leaveapp leaveapp)throws Exception{
		dao.rejectLeave(leaveapp);
	}
	//FINISH 
	public void finishLeaveApp(Leaveapp leaveapp)throws Exception{
		dao.finishLeave(leaveapp);
	}
	//LOAD History 
	public String[][] History(int month,int year,int id_user)throws Exception{
		ArrayList<Leaveapp> list = new ArrayList<Leaveapp>();
		ResultSet rs = dao.history(month, year, id_user);
		while (rs.next()){
			Leaveapp leaveapp = new Leaveapp();
			leaveapp.setFullname(rs.getString("FULLNAME"));
			leaveapp.setDatefrom(rs.getDate("DATEFROM"));
			leaveapp.setDateto(rs.getDate("DATETO"));
			leaveapp.setReason(rs.getString("REASON"));
			leaveapp.setStatusleave(rs.getString("STATUSLEAVE"));
			leaveapp.setAddress(rs.getString("ADDRESS"));
			leaveapp.setPhone(rs.getString("PHONE"));
			list.add(leaveapp);
		}
		String[][] datah = new String[list.size()][7];
		int i = 0;
		for(Leaveapp leaveapp : list){
			datah[i][0] = leaveapp.getFullname();
			datah[i][1] = leaveapp.getDatefrom().toString();
			datah[i][2] = leaveapp.getDateto().toString();
			datah[i][3] = leaveapp.getReason();
			datah[i][4] = leaveapp.getStatusleave();
			datah[i][5] = leaveapp.getAddress();
			datah[i][6] = leaveapp.getPhone();			
			i++;
		}
		return datah;
	}
	//LOAD REPORT
	public String[][] report(int month,int year,int id_position)throws Exception{
		ArrayList<Leaveapp> list = new ArrayList<Leaveapp>();
		ResultSet rs = dao.report(month, year, id_position);
		while (rs.next()){ 
			Leaveapp leaveapp = new Leaveapp();
			leaveapp.setUsername(rs.getString("USERNAME"));
			leaveapp.setFullname(rs.getString("FULLNAME"));
			leaveapp.setDatefrom(rs.getDate("DATEFROM"));
			leaveapp.setDateto(rs.getDate("DATETO"));
			leaveapp.setReason(rs.getString("REASON"));
			leaveapp.setAddress(rs.getString("ADDRESS"));
			leaveapp.setPhone(rs.getString("PHONE"));
			list.add(leaveapp);
		}
		String[][] datarp = new String[list.size()][7];
		int i = 0;
		for(Leaveapp leaveapp : list){
			datarp[i][0] = leaveapp.getUsername();
			datarp[i][1] = leaveapp.getFullname();
			datarp[i][2] = leaveapp.getDatefrom().toString();
			datarp[i][3] = leaveapp.getDateto().toString();
			datarp[i][4] = leaveapp.getReason();
			datarp[i][5] = leaveapp.getAddress();
			datarp[i][6] = leaveapp.getPhone();			
			i++;
		}
		return datarp;
	}

	//MANAGING DIRECTOR VIEW LEAVE APP VALID
	public String[][] selectLeaveappMDvalid()throws Exception{
		ArrayList<Leaveapp> list = new ArrayList<Leaveapp>();
		ResultSet rs = dao.selectAllLeaveappMDValid();
		while (rs.next()){
			Leaveapp leaveapp = new Leaveapp();
			leaveapp.setId_leaveapp(rs.getInt("ID_LEAVEAPP"));
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
			data1[i][0] = String.valueOf(leaveapp.getId_leaveapp());
			data1[i][1] = leaveapp.getFullname().toString();
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
	//MANAGING DIRECTOR VIEW LEAVE APP APPROVE
	public String[][] selectLeaveappMDapprove()throws Exception{
		ArrayList<Leaveapp> list = new ArrayList<Leaveapp>();
		ResultSet rs = dao.selectAllLeaveappMDApprove();
		while (rs.next()){
			Leaveapp leaveapp = new Leaveapp();
			leaveapp.setId_leaveapp(rs.getInt("ID_LEAVEAPP"));
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
			data1[i][0] = String.valueOf(leaveapp.getId_leaveapp());
			data1[i][1] = leaveapp.getFullname().toString();
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
	//MANAGING DIRECTOR VIEW LEAVE APP REJECT
	public String[][] selectLeaveappMDreject()throws Exception{
		ArrayList<Leaveapp> list = new ArrayList<Leaveapp>();
		ResultSet rs = dao.selectAllLeaveappMDReject();
		while (rs.next()){
			Leaveapp leaveapp = new Leaveapp();
			leaveapp.setId_leaveapp(rs.getInt("ID_LEAVEAPP"));
		
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
			data1[i][0] = String.valueOf(leaveapp.getId_leaveapp());
			data1[i][1] = leaveapp.getFullname().toString();
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
	//MANAGING DIRECTOR VIEW LEAVE APP FINISH
	public String[][] selectLeaveappMDfinish()throws Exception{
		ArrayList<Leaveapp> list = new ArrayList<Leaveapp>();
		ResultSet rs = dao.selectAllLeaveappMDFinish();
		while (rs.next()){
			Leaveapp leaveapp = new Leaveapp();
			leaveapp.setId_leaveapp(rs.getInt("ID_LEAVEAPP"));
			
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
	//BUSINESSMANAGER VIEW LEAVE APP VALID
	public String[][] selectLeaveappBMvalid()throws Exception{
		ArrayList<Leaveapp> list = new ArrayList<Leaveapp>();
		ResultSet rs = dao.selectAllLeaveappBMValid();
		while (rs.next()){
			Leaveapp leaveapp = new Leaveapp();
			leaveapp.setId_leaveapp(rs.getInt("ID_LEAVEAPP"));
			
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
			data1[i][0] = String.valueOf(leaveapp.getId_leaveapp());
			data1[i][1] = leaveapp.getFullname().toString();
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
	//BUSINESSMANAGER VIEW LEAVE APP APPROVE
	public String[][] selectLeaveappBMapprove()throws Exception{
		ArrayList<Leaveapp> list = new ArrayList<Leaveapp>();
		ResultSet rs = dao.selectAllLeaveappBMApprove();
		while (rs.next()){
			Leaveapp leaveapp = new Leaveapp();
			leaveapp.setId_leaveapp(rs.getInt("ID_LEAVEAPP"));
			
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
			data1[i][0] = String.valueOf(leaveapp.getId_leaveapp());
			data1[i][1] = leaveapp.getFullname().toString();
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
	//BUSINESSMANAGER VIEW LEAVE APP REJECT
	public String[][] selectLeaveappBMreject()throws Exception{
		ArrayList<Leaveapp> list = new ArrayList<Leaveapp>();
		ResultSet rs = dao.selectAllLeaveappBMReject();
		while (rs.next()){
			Leaveapp leaveapp = new Leaveapp();
			leaveapp.setId_leaveapp(rs.getInt("ID_LEAVEAPP"));
			
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
			data1[i][0] = String.valueOf(leaveapp.getId_leaveapp());
			data1[i][1] = leaveapp.getFullname().toString();
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
	//BUSINESSMANAGER VIEW LEAVE APP FINISH
	public String[][] selectLeaveappBMfinish()throws Exception{
		ArrayList<Leaveapp> list = new ArrayList<Leaveapp>();
		ResultSet rs = dao.selectAllLeaveappBMFinish();
		while (rs.next()){
			Leaveapp leaveapp = new Leaveapp();
			leaveapp.setId_leaveapp(rs.getInt("ID_LEAVEAPP"));
			
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
			data1[i][0] = String.valueOf(leaveapp.getId_leaveapp());
			data1[i][1] = leaveapp.getFullname().toString();
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
	//MANAGER VIEW LEAVE APP VALID
	public String[][] selectLeaveappMvalid()throws Exception{
		ArrayList<Leaveapp> list = new ArrayList<Leaveapp>();
		ResultSet rs = dao.selectAllLeaveappMValid();
		while (rs.next()){
			Leaveapp leaveapp = new Leaveapp();
			leaveapp.setId_leaveapp(rs.getInt("ID_LEAVEAPP"));
			
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
			data1[i][0] = String.valueOf(leaveapp.getId_leaveapp());
			data1[i][1] = leaveapp.getFullname().toString();
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
	//MANAGER VIEW LEAVE APP APPROVE
	public String[][] selectLeaveappMapprove()throws Exception{
		ArrayList<Leaveapp> list = new ArrayList<Leaveapp>();
		ResultSet rs = dao.selectAllLeaveappMApprove();
		while (rs.next()){
			Leaveapp leaveapp = new Leaveapp();
			leaveapp.setId_leaveapp(rs.getInt("ID_LEAVEAPP"));
		
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
			data1[i][0] = String.valueOf(leaveapp.getId_leaveapp());
			data1[i][1] = leaveapp.getFullname().toString();
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
	//MANAGER VIEW LEAVE APP REJECT
	public String[][] selectLeaveappMreject()throws Exception{
		ArrayList<Leaveapp> list = new ArrayList<Leaveapp>();
		ResultSet rs = dao.selectAllLeaveappMReject();
		while (rs.next()){
			Leaveapp leaveapp = new Leaveapp();
			leaveapp.setId_leaveapp(rs.getInt("ID_LEAVEAPP"));
			
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
			data1[i][0] = String.valueOf(leaveapp.getId_leaveapp());
			data1[i][1] = leaveapp.getFullname().toString();
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
	//MANAGER VIEW LEAVE APP VALID
	public String[][] selectLeaveappMfinish()throws Exception{
		ArrayList<Leaveapp> list = new ArrayList<Leaveapp>();
		ResultSet rs = dao.selectAllLeaveappMFinish();
		while (rs.next()){
			Leaveapp leaveapp = new Leaveapp();
			leaveapp.setId_leaveapp(rs.getInt("ID_LEAVEAPP"));
			
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
			data1[i][0] = String.valueOf(leaveapp.getId_leaveapp());
			data1[i][1] = leaveapp.getFullname().toString();
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
