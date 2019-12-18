package sunbookstore.book.domin;

public class Book {
	private int bid;
	private String bname;
	private String bauthor;
	private double bprice;
	private String bdesc;
	private String bimage;
	private String bpub;
	private int cgid;
	private int bcount;
	private double bdiscount;
	public Book(int bid, String bname, String bauthor, double bprice, String bdesc, String bimage, String bpub,
			int cgid, int bcount) {
	
		this.bid = bid;
		this.bname = bname;
		this.bauthor = bauthor;
		this.bprice = bprice;
		this.bdesc = bdesc;
		this.bimage = bimage;
		this.bpub = bpub;
		this.cgid = cgid;
		this.bcount = bcount;
	}
	public Book() {
		
	}
	public Book(String bname, String bauthor, double bprice, String bdesc, String bimage, String bpub,
			int bcount,double bdiscount,int bid) {
		
		this.bname = bname;
		this.bauthor = bauthor;
		this.bprice = bprice;
		this.bdesc = bdesc;
		this.bimage = bimage;
		this.bpub = bpub;
		this.cgid = cgid;
		this.bcount = bcount;
		this.bdiscount = bdiscount;
		this.bid= bid;
	}
	public Book(String bname, String bauthor, double bprice, String bdesc, String bimage, String bpub, int cgid,
			int bcount,double bdiscount) {
		
		this.bname = bname;
		this.bauthor = bauthor;
		this.bprice = bprice;
		this.bdesc = bdesc;
		this.bimage = bimage;
		this.bpub = bpub;
		this.cgid = cgid;
		this.bcount = bcount;
		this.bdiscount = bdiscount;
		
	}
	public Book(String bname, String bauthor, double bprice, String bdesc, String bimage, String bpub,
			int bcount,double bdiscount) {
		
		this.bname = bname;
		this.bauthor = bauthor;
		this.bprice = bprice;
		this.bdesc = bdesc;
		this.bimage = bimage;
		this.bpub = bpub;
	
		this.bcount = bcount;
		this.bdiscount = bdiscount;
	}
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public double getBprice() {
		return bprice;
	}
	public void setBprice(double bprice) {
		this.bprice = bprice;
	}
	public String getBdesc() {
		return bdesc;
	}
	public void setBdesc(String bdesc) {
		this.bdesc = bdesc;
	}
	public String getBimage() {
		return bimage;
	}
	public void setBimage(String bimage) {
		this.bimage = bimage;
	}
	public String getBpub() {
		return bpub;
	}
	public void setBpub(String bpub) {
		this.bpub = bpub;
	}
	public int getCgid() {
		return cgid;
	}
	public void setCgid(int cgid) {
		this.cgid = cgid;
	}
	public int getBcount() {
		return bcount;
	}
	public void setBcount(int bcount) {
		this.bcount = bcount;
	}
	public double getBdiscount() {
		return bdiscount;
	}
	public void setBdiscount(double bdiscount) {
		this.bdiscount = bdiscount;
	}
	
	
}
