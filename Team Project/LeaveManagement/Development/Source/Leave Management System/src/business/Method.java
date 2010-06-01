package business;

public class Method {
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
	
}
