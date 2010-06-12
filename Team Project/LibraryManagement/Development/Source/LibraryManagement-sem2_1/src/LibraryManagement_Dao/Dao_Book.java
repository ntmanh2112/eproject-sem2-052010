package LibraryManagement_Dao;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import LibraryManagement_Common.Common_Constant;
import LibraryManagement_Model.Model_Book;
import LibraryManagement_Util.Util_DataUtil;

public class Dao_Book {
	public static ArrayList<Model_Book> searchBookByID(String ID) {
		ArrayList<Model_Book> listBook = new ArrayList<Model_Book>();
		try {
			PreparedStatement preparedStatement = Util_DataUtil
					.getConnection()
					.prepareStatement(
							Common_Constant.SQL_RES
									.getString("getBookByID"));
			preparedStatement.setString(1, ID);			
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Model_Book obj = new Model_Book();
				
				obj.setId(rs.getString("ID"));
				obj.setCallnumber(rs.getNString("CallNumber"));
				obj.setISBN(rs.getNString("ISBN"));
				obj.setTitle(rs.getNString("Title"));
				obj.setAuthorID(rs.getString("Author"));
				obj.setStatus(rs.getString("Statuts"));
				obj.setLast_updated_date(rs.getString("Last_updated_date"));
				obj.setTypeID(rs.getString("Type"));
				obj.setProducersID(rs.getString("Producers"));
				obj.setAddress(rs.getNString("Address"));
				
				listBook.add(obj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listBook;
	}
	
	public static ArrayList<Model_Book> searchAllBook() {
		ArrayList<Model_Book> listBook = new ArrayList<Model_Book>();
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
				obj.setCallnumber(rs.getNString("CallNumber"));
				obj.setISBN(rs.getNString("ISBN"));
				obj.setTitle(rs.getNString("Title"));
				obj.setAuthorID(rs.getString("Author"));
				obj.setStatus(rs.getString("Statuts"));
				obj.setLast_updated_date(rs.getString("Last_updated_date"));
				obj.setTypeID(rs.getString("Type"));
				obj.setProducersID(rs.getString("Producers"));
				obj.setAddress(rs.getNString("Address"));
				listBook.add(obj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listBook;
	}
	public static ArrayList<Model_Book> searchBookByDieuKien(String ID, String Name) {
		ArrayList<Model_Book> listBook = new ArrayList<Model_Book>();
		try {
			CallableStatement csmt = Util_DataUtil
				.getConnection()
				.prepareCall("{call searchBookByDieuKien(?,?)}");
			csmt.setString("TypeID", ID);
			csmt.setString("Title", Name);
			ResultSet rs = csmt.executeQuery();
			while (rs.next()) {
				Model_Book obj = new Model_Book();
			
				obj.setId(rs.getString("ID"));
				obj.setCallnumber(rs.getNString("CallNumber"));
				obj.setISBN(rs.getNString("ISBN"));
				obj.setTitle(rs.getNString("Title"));
				obj.setAuthorID(rs.getString("Author"));
				obj.setStatus(rs.getString("Statuts"));
				obj.setLast_updated_date(rs.getString("Last_updated_date"));
				obj.setTypeID(rs.getString("Type"));
				obj.setProducersID(rs.getString("Producers"));
				obj.setAddress(rs.getNString("Address"));
				listBook.add(obj);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listBook;
	}
	public static Boolean deleteBookByID(String maNhanVien) {
		Boolean result = true;
		try {
			PreparedStatement preparedStatement = Util_DataUtil
					.getConnection()
					.prepareStatement(
							Common_Constant.SQL_RES
									.getString("deleteBookByID"));
			preparedStatement.setString(1, maNhanVien);
			preparedStatement.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
			result = false;
		}
		return result;
	}
	
	public static Boolean updateBookByID(Model_Book model) {
		Boolean result = true;
		try {
			PreparedStatement preparedStatement = Util_DataUtil
					.getConnection()
					.prepareStatement(
							Common_Constant.SQL_RES
									.getString("updateBookByID"));
			preparedStatement.setString(1, model.getId());
			preparedStatement.setNString(2, model.getCallnumber());
			preparedStatement.setNString(3, model.getISBN());
			preparedStatement.setNString(4, model.getTitle());
			preparedStatement.setString(5, model.getAuthorID());
			preparedStatement.setString(6, model.getStatus());
			preparedStatement.setString(7, model.getLast_updated_date());
			preparedStatement.setString(8, model.getTypeID());
			preparedStatement.setString(9, model.getProducersID());
			preparedStatement.setNString(10, model.getAddress());
			
			preparedStatement.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
			result = false;
		}
		return result;
	}
	public static Boolean chitietBookByID(String ID) {
		Boolean result = true;
		try {
			PreparedStatement preparedStatement = Util_DataUtil
					.getConnection()
					.prepareStatement(
							Common_Constant.SQL_RES
									.getString("chitietBookByID"));
			preparedStatement.setString(1, ID);
			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next()) {
				Model_Book obj = new Model_Book();
				obj.setId(rs.getString("ID"));
				obj.setCallnumber(rs.getNString("CallNumber"));
				obj.setISBN(rs.getNString("ISBN"));
				obj.setTitle(rs.getNString("Title"));
				obj.setAuthorID(rs.getString("Author"));
				obj.setStatus(rs.getString("Statuts"));
				obj.setLast_updated_date(rs.getString("Last_updated_date"));
				obj.setTypeID(rs.getString("Type"));
				obj.setProducersID(rs.getString("Producers"));
				obj.setAddress(rs.getNString("Address"));
				obj.getModelAuthor().setFullname(rs.getNString("FullName"));
				obj.getModelAuthor().setAddress(rs.getNString("address"));
				obj.getModelAuthor().setBirday(rs.getNString("birday"));
				obj.getModelType().setName(rs.getNString("TypeName of book"));
				obj.getModelProducers().setName(rs.getNString("Name of Producers"));
				obj.getModelProducers().setBirthdate(rs.getNString("Address of Producers"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			result = false;
		}
		return result;
	}
	
}
