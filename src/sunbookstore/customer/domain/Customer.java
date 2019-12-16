package sunbookstore.customer.domain;

public class Customer {
	private int cid;
	private String cname;
	private String csex;
	private String cpassword;
	private String ctel;
	private String caddress;
	public Customer(String cname, String csex, String cpassword, String ctel, String caddress) {
		 
		this.cname = cname;
		this.csex = csex;
		this.cpassword = cpassword;
		this.ctel = ctel;
		this.caddress = caddress;
	}
	
	public Customer(String cname, String csex, String ctel, String caddress) {
	
		this.cname = cname;
		this.csex = csex;
		this.ctel = ctel;
		this.caddress = caddress;
	}

	public Customer(int cid, String cname, String csex, String ctel, String caddress) {
	
		this.cid = cid;
		this.cname = cname;
		this.csex = csex;
		this.ctel = ctel;
		this.caddress = caddress;
	}

	public Customer() {
		
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCsex() {
		return csex;
	}
	public void setCsex(String csex) {
		this.csex = csex;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public String getCtel() {
		return ctel;
	}
	public void setCtel(String ctel) {
		this.ctel = ctel;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	
}
