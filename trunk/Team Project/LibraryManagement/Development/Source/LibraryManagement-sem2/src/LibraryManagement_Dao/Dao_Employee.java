package LibraryManagement_Dao;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import LibraryManagement_Model.Model_Employee;
import LibraryManagement_Util.Util_DataUtil;

import LibraryManagement_Common.Common_Constant;

public class Dao_Employee {
/*	public static ArrayList<Model_Employee> searchNhanVienByPhong(String phong) {
		ArrayList<Model_Employee> listNhanVien = new ArrayList<Model_Employee>();
		try {
			PreparedStatement preparedStatement = Util_DataUtil
					.getConnection()
					.prepareStatement(
							Common_Constant.SQL_RES
									.getString("getNhanVienByPhong"));
			preparedStatement.setString(1, phong);			
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Model_Employee obj = new Model_Employee();
				
				obj.setUsername(rs.getString("UserName"));
				obj.setFullname(rs.getString("FullName"));
				obj.setAddress(rs.getString("Address"));
				obj.setPhonenumber(rs.getString("PhoneNumber"));
				obj.setDepartment(rs.getString("Department"));
				obj.setStatus(rs.getString("Status"));
				listNhanVien.add(obj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listNhanVien;
	}
*/	
	public static ArrayList<Model_Employee> searchAllNhanVien() {
		ArrayList<Model_Employee> listNhanVien = new ArrayList<Model_Employee>();
		try {
			PreparedStatement preparedStatement = Util_DataUtil
					.getConnection()
					.prepareStatement(
							Common_Constant.SQL_RES
									.getString("getAllNhanVien"));					
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Model_Employee obj = new Model_Employee();
				
				obj.setUsername(rs.getString("UserName"));
				obj.setFullname(rs.getString("FullName"));
				obj.setAddress(rs.getString("Address"));
				obj.setPhonenumber(rs.getString("PhoneNumber"));
				obj.setDepartment(rs.getString("Department"));
				obj.setStatus(rs.getString("Status"));
				listNhanVien.add(obj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listNhanVien;
	}
	
	public static ArrayList<Model_Employee> searchNhanVienByDieuKien(String maPhong, String hoTen) {
		ArrayList<Model_Employee> listNhanVien = new ArrayList<Model_Employee>();
		try {
			CallableStatement csmt = Util_DataUtil
				.getConnection()
				.prepareCall("{call QLNV_GetNhanVienByDieuKien(?,?)}");
			csmt.setString("phg", maPhong);
			csmt.setString("hoten", hoTen);
			ResultSet rs = csmt.executeQuery();
			while (rs.next()) {
				Model_Employee obj = new Model_Employee();
			
				obj.setUsername(rs.getString("UserName"));
				obj.setFullname(rs.getString("FullName"));
				obj.setAddress(rs.getString("Address"));
				obj.setPhonenumber(rs.getString("PhoneNumber"));
				obj.setDepartment(rs.getString("Department"));
				obj.setStatus(rs.getString("Status"));
				
				listNhanVien.add(obj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listNhanVien;
	}
	
/*	public static Boolean deleteNhanVienByMaNhanVien(String maNhanVien) {
		Boolean result = true;
		try {
			PreparedStatement preparedStatement = Util_DataUtil
					.getConnection()
					.prepareStatement(
							Common_Constant.SQL_RES
									.getString("deleteNhanVienByMaNhanVien"));
			preparedStatement.setString(1, maNhanVien);
			preparedStatement.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
			result = false;
		}
		return result;
	}
	
	public static Boolean updateNhanVienByMaNhanVien(Model_Employee model) {
		Boolean result = true;
		try {
			PreparedStatement preparedStatement = Util_DataUtil
					.getConnection()
					.prepareStatement(
							Common_Constant.SQL_RES
									.getString("updateNhanVienByMaNhanVien"));
			preparedStatement.setString(1, model.getUsername());
			preparedStatement.setString(2, model.getFullname());
			preparedStatement.setString(3, model.getAddress());
			preparedStatement.setString(4, model.getPhonenumber());
			preparedStatement.setString(5, model.getDepartment());
			preparedStatement.setString(6, model.getStatus());
			preparedStatement.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
			result = false;
		}
		return result;
	}*/
}
