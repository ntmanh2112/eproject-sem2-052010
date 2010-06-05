package LibraryManagement_Util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

import LibraryManagement_Common.Common_Constant;

public class Util_DataUtil {

	/**
	 * Containing methods to manipulate database.
	 * @author ThienVD
	 *
	 */
		static Connection conn = null;
		private static final Logger logger = Logger.getLogger(Util_DataUtil.class.getName());	
		
		public static String URL = Common_Constant.SETTING_RES.getString("URL");
		public static String USER_NAME = Common_Constant.SETTING_RES.getString("USER_NAME");
		public static String PASSWORD = Common_Constant.SETTING_RES.getString("PASSWORD");;

		/**
		 * Create connection to database.
		 */
		public static void connect() {
			try {
				Class.forName(Common_Constant.SETTING_RES.getString("DB_DRIVER"));
				conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			} catch (Exception e) {
				e.printStackTrace();
				Util_LogUtil.logError(e, logger);			
			}
		}

		/**
		 * Disconnect sql connection.
		 */
		public static void disconnected() {
			try {
				if (conn != null) {
					conn.close();
					conn = null;
				}

			} catch (Exception e) {
				e.printStackTrace();
				Util_LogUtil.logError(e, logger);
			}
		}

		/**
		 * Get connection.
		 * @return Connection
		 */
		public static Connection getConnection() {
			if (conn == null)
				connect();
			return conn;
		}

		/**
		 * Check connection.
		 * @return int
		 */
		public static int checkConnection() {
			try {
				if (conn != null) {
					return 0;
				}
			} catch (Exception e) {
				e.printStackTrace();
				Util_LogUtil.logError(e, logger);
			}
			return 1;
		}

		/**
		 *
		 * @param sql
		 * @return ResultSet
		 */
		public static ResultSet executeQuery(String sql) {
			try {
				connect();
				Statement statement = conn.createStatement();
				ResultSet rs = statement.executeQuery(sql);
				return rs;
			} catch (Exception e) {
				e.printStackTrace();
				Util_LogUtil.logError(e, logger);
				return null;
			}
		}

		/**
		 *
		 * @param sql
		 * @return int
		 */
		public static int executeUpdate(String sql) {
			try {
				connect();
				Statement statement = conn.createStatement();
				int rsUpdate = statement.executeUpdate(sql);
				return rsUpdate;
			} catch (Exception e) {
				e.printStackTrace();
				Util_LogUtil.logError(e, logger);
				return 0;
			}
		}

		/**
		 *
		 * @param csmt
		 * @return ResultSet
		 */
		public static ResultSet executeStore(CallableStatement csmt) {
			try {
				connect();
				return csmt.executeQuery();
			} catch (Exception e) {
				e.printStackTrace();
				Util_LogUtil.logError(e, logger);
			}
			return null;
		}

		/**
		 *
		 * @param csmt
		 * @return int
		 */
		public static Boolean executeNonStore(CallableStatement csmt) {
			try {
				connect();
				csmt.execute();
				return true;
			} catch (SQLException e) {
				e.printStackTrace();
				Util_LogUtil.logError(e, logger);
				return false;
			}				
		}


}
