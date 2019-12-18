package sunbookstore.book.domin;

public class Book {
   private  int  bid;
   private String bname;
   private String bauthor;
   private int bprice;
   private String bdesc;
   private String bimage;
   private String bpub;
   private int bsum;
   private int bdiscount;
   private int bcid;
public Book() {
	// TODO Auto-generated constructor stub
}
public Book(int bid, String bname, String bauthor, int bprice, String bdesc, String bimage, String bpub, int bsum,
		int bdiscount) {
	super();
	this.bid = bid;
	this.bname = bname;
	this.bauthor = bauthor;
	this.bprice = bprice;
	this.bdesc = bdesc;
	this.bimage = bimage;
	this.bpub = bpub;
	this.bsum = bsum;
	this.bdiscount = bdiscount;
	this.bcid = bcid;
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
public int getBsum() {
	return bsum;
}
public void setBsum(int bsum) {
	this.bsum = bsum;
}
public int getBdiscount() {
	return bdiscount;
}
public void setBdiscount(int bdiscount) {
	this.bdiscount = bdiscount;
}
public int getBcid() {
	return bcid;
}
public void setBcid(int bcid) {
	this.bcid = bcid;
}
   
}
