package sunbookstore.Manager.domain;

public class Manager {
	private int mid;
	private String mname;
	private String mpassword;
	public Manager(String mname, String mpassword) {
		this.mname = mname;
		this.mpassword = mpassword;
	}
	
	public Manager() {
	
	}

	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMpassword() {
		return mpassword;
	}
	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}
	
	

}
