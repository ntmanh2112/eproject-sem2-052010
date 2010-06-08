/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package common;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

/**
 *
 * @author USER12
 */
public class ConnectionDB {
    // Declare local variables
	private Connection conn = null;
    private String source = null;
    private String uid = null;
    private String pwd = null;

    public ConnectionDB(){
    	this.source = "jdbc:sqlserver://STEVEN-PC;Databasename = LeaveManagementSystem";
    	this.uid = "sa";
    	this.pwd = "123456";
    }
    // Method connect to database
    public void connect() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            this.conn = DriverManager.getConnection(this.source, this.uid, this.pwd);
        } catch (Exception e){
            e.printStackTrace();
             
            
        }
    }
    
    public void disconnect() {
        try {
            if(conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public Connection getConn() {
		return conn;
	}
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}

