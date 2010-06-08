package dao;

import java.sql.ResultSet;
import java.sql.Statement;

import common.ConnectionDB;

public class ManagerUserDAO {
	
	
	
	
	
	
	
	
	//SELECT USER
	public ResultSet MselectAllUserE() throws Exception{
		ConnectionDB connection = new ConnectionDB();
		connection.connect();
		String sql = "select tbl_user.id_user,tbl_user.username,tbl_user.status,tbl_user.fullname,tbl_user.birthday,tbl_user.address,tbl_user.gender,tbl_user.phone,tbl_user.email,tbl_position.position_name from tbl_user INNER JOIN tbl_position on tbl_position.id_position=tbl_user.id_position where tbl_user.id_position='3' and tbl_user.status = '1'" ;
		Statement st = connection.getConn().createStatement();
		ResultSet rs = st.executeQuery(sql);
		return rs;
	}
	
	
	
}
