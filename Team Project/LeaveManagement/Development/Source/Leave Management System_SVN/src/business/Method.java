package business;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Method {
	//Method check email
	public static boolean checkEmail(String mail) {
		String expression = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
		Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(mail);
		return matcher.matches();
	}
	
	//function check Special character
	public static boolean CheckSpecialCharacter (String data) {
		try {
		String invalids="`~!#$%^&*();:<>?/|=+-[]{},\'";
		for (int i=0;i<data.length();i++) {
			if (invalids.indexOf(String.valueOf(data.charAt(i)))!=-1) {
				return true;
			}}
			} catch (Exception e) {
			// TODO: handle exception
			return false;
			}
		return false;
	}
	//function check number
	public static boolean checkNumber(String budget) {
	    try {
	        Integer.parseInt(budget);
	        return true;
	    } catch (Exception e) {
	        return false;
	    }
	}
	
	//function check character blank
	public static boolean CheckBlankCharacter(String data) {
		try {
		String invalids="  ";
		for (int i=0;i<data.length();i++) {
			if (invalids.indexOf(String.valueOf(data.charAt(i)))!=-1) {
				return true;
			}}
			} catch (Exception e) {
			// TODO: handle exception
			return false;
			}
		return false;
	}
	
}
