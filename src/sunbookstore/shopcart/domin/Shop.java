package sunbookstore.shopcart.domin;

public class Shop {
	private int sid;
	private int bid;
	private int sbnum;
	private String bname;
	private  int bsum;
	private String bauthor;
	private int bprice;
	private String bdesc;
	private String bimage;
	private String bpub;
	private int cgid;
	private double bdiscount;
	public Shop() {
	}
	
	public Shop(int bid, int sbnum, String bname, int bprice, String bimage,double bdiscount) {
		this.bid = bid;
		this.sbnum = sbnum;
		this.bname = bname;
		this.bprice = bprice;
		this.bimage = bimage;
		this.bdiscount = bdiscount;
	}
	
	public Shop(int sid, int bid, int sbnum, String bname, int bprice, String bimage,double bdiscount) {
		this.sid = sid;
		this.bid = bid;
		this.sbnum = sbnum;
		this.bname = bname;
		this.bprice = bprice;
		this.bimage = bimage;
		this.bdiscount = bdiscount;
	}
	
	public Shop(int sid, int bid, int sbnum, String bname, int bsum, String bauthor, int bprice, String bdesc,
			String bimage, String bpub, int cgid, double bdiscount) {
		this.sid = sid;
		this.bid = bid;
		this.sbnum = sbnum;
		this.bname = bname;
		this.bsum = bsum;
		this.bauthor = bauthor;
		this.bprice = bprice;
		this.bdesc = bdesc;
		this.bimage = bimage;
		this.bpub = bpub;
		this.cgid = cgid;
		this.bdiscount = bdiscount;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getSbnum() {
		return sbnum;
	}
	public void setSbnum(int sbnum) {
		this.sbnum = sbnum;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getBsum() {
		return bsum;
	}
	public void setBsum(int bsum) {
		this.bsum = bsum;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public int getBprice() {
		return bprice;
	}
	public void setBprice(int bprice) {
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
	public double getBdiscount() {
		return bdiscount;
	}
	public void setBdiscount(double bdiscount) {
		this.bdiscount = bdiscount;
	}
	
	
	
}
