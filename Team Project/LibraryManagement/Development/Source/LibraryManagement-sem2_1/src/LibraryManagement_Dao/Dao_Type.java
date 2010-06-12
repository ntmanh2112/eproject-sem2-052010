package LibraryManagement_Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import LibraryManagement_Model.Model_Type;
import LibraryManagement_Util.Util_DataUtil;

import LibraryManagement_Common.Common_Constant;

public class Dao_Type {
	public static ArrayList<Model_Type> searchAllType() {
		ArrayList<Model_Type> listType = new ArrayList<Model_Type>();
		try {
			PreparedStatement preparedStatement = Util_DataUtil
					.getConnection()
					.prepareStatement(
							Common_Constant.SQL_RES
									.getString("getAllType"));					
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Model_Type obj = new Model_Type();
				
				obj.setId(rs.getString("ID"));
				obj.setName(rs.getNString("Name"));
				
				listType.add(obj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listType;
	}
}
