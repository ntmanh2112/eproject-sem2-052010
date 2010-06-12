package LibraryManagement_Common;


public class Common_KeyValue {
	String key;
	String value;
	 
	public Common_KeyValue(String key, String value) {
		this.key = key;
		this.value = value;
	}
 
	public String getValue() { return value; }
	public String getKey() { return key; }
 
	@Override
	public String toString() { return value; }
 
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Common_KeyValue) {
			Common_KeyValue kv = (Common_KeyValue) obj;
			return (kv.value.equals(this.value));
		}
		return false;
	}
 
	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + (this.value != null ? this.value.hashCode() : 0);
		return hash;
	}
}
