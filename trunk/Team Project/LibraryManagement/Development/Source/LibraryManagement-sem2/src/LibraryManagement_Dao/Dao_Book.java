package LibraryManagement_Dao;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import LibraryManagement_Common.Common_Constant;
import LibraryManagement_Model.Model_Book;
import LibraryManagement_Model.Model_Employee;
import LibraryManagement_Util.Util_DataUtil;

public class Dao_Book {
	public static ArrayList<Model_Book> searchAllBook() {
		ArrayList<Model_Book> listNhanVien = new ArrayList<Model_Book>();
		try {
			PreparedStatement preparedStatement = Util_DataUtil
					.getConnection()
					.prepareStatement(
							Common_Constant.SQL_RES
									.getString("getAllBook"));					
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Model_Book obj = new Model_Book();
				
				obj.setId(rs.getString("ID"));
				obj.setCallnumber(rs.getString("CallNumber"));
				obj.setISBN(rs.getString("ISBN"));
				obj.setTitle(rs.getString("Title"));
				obj.setAuthorID(rs.getString("AuthorID"));
				obj.setStatus(rs.getString("Status"));
				obj.setLast_updated_date(rs.getString("Last_updated_date"));
				obj.setTypeID(rs.getString("TypeID"));
				obj.setProducersID(rs.getString("ProducersID"));
				obj.setAddress(rs.getString("Address"));
				listNhanVien.add(obj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listNhanVien;
	}
	public static ArrayList<Model_Book> searchBookByDieuKien(String maPhong, String hoTen) {
		ArrayList<Model_Book> listNhanVien = new ArrayList<Model_Book>();
		try {
			CallableStatement csmt = Util_DataUtil
				.getConnection()
				.prepareCall("{call QLNV_GetNhanVienByDieuKien(?,?)}");
			csmt.setString("phg", maPhong);
			csmt.setString("hoten", hoTen);
			ResultSet rs = csmt.executeQuery();
			while (rs.next()) {
				Model_Book obj = new Model_Book();
			
				obj.setId(rs.getString("ID"));
				obj.setCallnumber(rs.getString("CallNumber"));
				obj.setISBN(rs.getString("ISBN"));
				obj.setTitle(rs.getString("Title"));
				obj.setAuthorID(rs.getString("AuthorID"));
				obj.setStatus(rs.getString("Status"));
				obj.setLast_updated_date(rs.getString("Last_updated_date"));
				obj.setTypeID(rs.getString("TypeID"));
				obj.setProducersID(rs.getString("ProducersID"));
				obj.setAddress(rs.getString("Address"));
				listNhanVien.add(obj);
				
				listNhanVien.add(obj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listNhanVien;
	}
}
