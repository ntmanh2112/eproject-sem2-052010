package message;

public class LoginMessage {
	private String success;
	private String fail;
	
	public LoginMessage(){
		this.success = "Dang nhap thanh cong";
		this.fail = "Sai username hoac password";
	}
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getFail() {
		return fail;
	}
	public void setFail(String fail) {
		this.fail = fail;
	}
	
}
