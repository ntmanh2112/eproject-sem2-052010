package LibraryManagement_Util;

import java.util.Date;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import LibraryManagement_Common.Common_Constant;

public class Util_MailUtil {
	public static void sendEmail(String mailTo, String mailCC, 
			String subject, String content){

		Properties props = System.getProperties();

		props.setProperty("mail.transport.protocol", 
				Common_Constant.SETTING_RES.getString("MAIL_TRANSPORT_PROTOCOL"));				
		props.setProperty("mail.host",
				Common_Constant.SETTING_RES.getString("MAIL_HOST"));				
		props.put("mail.smtp.socketFactory.port",
				Common_Constant.SETTING_RES.getString("MAIL_SMTP_SOCKET_FACTORY_PORT"));								

		props.put("mail.smtp.auth", "true");	
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.socketFactory.fallback", "false");
		props.setProperty("mail.smtp.quitwait", "false");

		try{
			Session session = Session.getInstance(props, new Authenticator(){
				protected PasswordAuthentication getPasswordAuthentication() { 
					return new PasswordAuthentication(
							Common_Constant.SETTING_RES.getString("MAIL_FROM"),
							Common_Constant.SETTING_RES.getString("MAIL_PASS"));	
				}
			});
			Message message = new MimeMessage(session);			
			Address fromAdd = new InternetAddress(
					Common_Constant.SETTING_RES.getString("MAIL_FROM"));			
			Address toAdd = new InternetAddress(mailTo);						
			Address ccAdd = new InternetAddress(mailCC);
	
			message.setFrom(fromAdd);			
			message.setRecipient(Message.RecipientType.TO,toAdd);			
			message.setRecipient(Message.RecipientType.CC,ccAdd);
			message.setSubject(subject);
	
			MimeBodyPart messagePart = new MimeBodyPart();			 
			MimeMultipart multipart = new MimeMultipart();
	
			multipart.addBodyPart(messagePart);  // adding message part	
			//Setting the Email Encoding	
			messagePart.setText(content,"utf-8");			
			messagePart.setHeader("Content-Type","text/html; charset=\"utf-8\"");
			messagePart.setHeader("Content-Transfer-Encoding", "quoted-printable");
	
			message.setContent(multipart);
			message.setSentDate(new Date());
		
			Transport.send(message);
		}
		catch(Exception e){
			e.printStackTrace();			
		}		
	}
}
