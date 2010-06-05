package LibraryManagement_Util;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.log4j.Logger;

public class Util_LogUtil {
	public static void logError(Exception ex, Logger loggerError) {
		StringWriter sw = new StringWriter();
		ex.printStackTrace(new PrintWriter(sw));
		String stacktrace = sw.toString();
		loggerError.error(stacktrace);		
	}
	
	public static void logInfo(Logger loggerInfo, String msg) {
		loggerInfo.info(msg);
	}
}
