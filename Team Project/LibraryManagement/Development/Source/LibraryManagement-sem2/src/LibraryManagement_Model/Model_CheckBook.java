package LibraryManagement_Model;

public class Model_CheckBook {
	private String username;
	private String bookId;
	private String datecheckout;
	private String datecheckin;
	private String delatedate;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getDatecheckout() {
		return datecheckout;
	}
	public void setDatecheckout(String datecheckout) {
		this.datecheckout = datecheckout;
	}
	public String getDatecheckin() {
		return datecheckin;
	}
	public void setDatecheckin(String datecheckin) {
		this.datecheckin = datecheckin;
	}
	public String getDelatedate() {
		return delatedate;
	}
	public void setDelatedate(String delatedate) {
		this.delatedate = delatedate;
	}
	
}
