package LibraryManagement_Model;

public class Model_Book {
	private String id;
	private String callnumber;
	private String iSBN;
	private String title;
	private String authorID;
	private String status;
	private String last_updated_date;
	private String typeID;
	private String producersID;
	private String address;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCallnumber() {
		return callnumber;
	}
	public void setCallnumber(String callnumber) {
		this.callnumber = callnumber;
	}
	public String getISBN() {
		return iSBN;
	}
	public void setISBN(String isbn) {
		iSBN = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthorID() {
		return authorID;
	}
	public void setAuthorID(String authorID) {
		this.authorID = authorID;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLast_updated_date() {
		return last_updated_date;
	}
	public void setLast_updated_date(String last_updated_date) {
		this.last_updated_date = last_updated_date;
	}
	public String getTypeID() {
		return typeID;
	}
	public void setTypeID(String typeID) {
		this.typeID = typeID;
	}
	public String getProducersID() {
		return producersID;
	}
	public void setProducersID(String producersID) {
		this.producersID = producersID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
