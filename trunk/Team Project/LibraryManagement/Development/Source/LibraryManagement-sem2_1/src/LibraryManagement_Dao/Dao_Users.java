package LibraryManagement_Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


import LibraryManagement_Common.Common_Constant;
import LibraryManagement_Util.Util_DataUtil;

public class Dao_Users {
	public static boolean connectUsing(String username,String password){
		boolean result = false;
		try{
			PreparedStatement preparedStatement = Util_DataUtil
			.getConnection()
			.prepareStatement(
					Common_Constant.SQL_RES
							.getString("connectUsing"));
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next()){
				result = true;
			}
		} catch(Exception ex){
			ex.printStackTrace();
			
		}
		return result;
	}
}
