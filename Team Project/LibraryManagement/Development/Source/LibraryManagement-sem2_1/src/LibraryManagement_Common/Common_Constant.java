package LibraryManagement_Common;

import java.util.ResourceBundle;

import javax.swing.JFrame;

public class Common_Constant {
	public static int LANGUAGE = 0; // 0: English; 1: Vietnammes
	
	public static ResourceBundle SETTING_RES = null;
	public static ResourceBundle PATH_RES = null;
	public static ResourceBundle SQL_RES = null;
	public static ResourceBundle MESSAGE = null;
		
	public static void initResourceBundle() {
		Common_Constant.SETTING_RES = ResourceBundle.getBundle("setting");
		Common_Constant.PATH_RES = ResourceBundle.getBundle("path");
		Common_Constant.SQL_RES = ResourceBundle.getBundle("sql");
		
		if (Common_Constant.LANGUAGE == 0) {
			Common_Constant.MESSAGE = ResourceBundle.getBundle("message");
		} else if(Common_Constant.LANGUAGE == 1){
			Common_Constant.MESSAGE = ResourceBundle.getBundle("message_VI");
		}
	}
	
	public static void exitPreviousForm(){
		int i = 0;
		i = JFrame.getFrames().length;
		if (i > 1)
		{
			for (int j = 0; j < i-1;j++)
			{
				JFrame.getFrames()[j].setVisible(false);
				JFrame.getFrames()[j].dispose();
			}			
		}
	}
}
