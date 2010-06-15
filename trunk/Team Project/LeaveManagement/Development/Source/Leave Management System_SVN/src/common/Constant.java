package common;

import java.util.ResourceBundle;

import javax.swing.JFrame;

public class Constant {
	public static Integer LANGUAGE = 0; // 0 = EN , 1 =VN
	public static ResourceBundle MESSAGE = null;
	public static ResourceBundle SETTING= null;
	public static ResourceBundle SQL= null;
	
	public static void initResourceBundle(){
		Constant.SETTING = ResourceBundle.getBundle("setting");
		Constant.SQL = ResourceBundle.getBundle("sql");
		if(Constant.LANGUAGE==0){
			Constant.MESSAGE = ResourceBundle.getBundle("message");
		}else{
			Constant.MESSAGE = ResourceBundle.getBundle("message_VI");
		}			
	}
	
	//Ham thoat cua loginFrame
	public static void exit(){
		int count = JFrame.getFrames().length;
		for(int i=0;i<count-1;i++){
			JFrame.getFrames()[i].setVisible(true);
			JFrame.getFrames()[i].dispose();
		}
	}
	
	



}

