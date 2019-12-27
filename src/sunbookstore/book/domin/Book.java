package sunbookstore.book.domin;

public class Book {
   private  int  bid;
   private String bname;
   private String bauthor;
   private double bprice;
   private String bdesc;
   private String bimage;
   private String bpub;
   private int bsum;
   private double bdiscount;
   private int cgid;
   private double brp;
public double getBrp() {
	return brp;
}
public void setBrp(double brp) {
	this.brp = brp;
}

public Book(int bid, String bname, String bauthor, double bprice, String bdesc, String bimage, String bpub, int bsum,
		double bdiscount) {
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
	this.brp=brp;
	
}
public Book(String bname, String bauthor, double bprice, String bdesc, String bimage, String bpub, int bsum,
		double bdiscount,int cgid) {
	super();
	
	this.bname = bname;
	this.bauthor = bauthor;
	this.bprice = bprice;
	this.bdesc = bdesc;
	this.bimage = bimage;
	this.bpub = bpub;
	this.bsum = bsum;
	this.bdiscount = bdiscount;
	this.cgid=cgid;
	
}
public Book(String bname, String bauthor, double bprice, String bdesc, String bimage, String bpub, int bsum,
		double bdiscount,int cgid,double brp){
	super();
	
	this.bname = bname;
	this.bauthor = bauthor;
	this.bprice = bprice;
	this.bdesc = bdesc;
	this.bimage = bimage;
	this.bpub = bpub;
	this.bsum = bsum;
	this.bdiscount = bdiscount;
	this.cgid=cgid;
	this.brp=brp;

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
public int getBsum() {
	return bsum;
}
public void setBsum(int bsum) {
	this.bsum = bsum;
}
public double getBdiscount() {
	return bdiscount;
}
public void setBdiscount(double bdiscount) {
	this.bdiscount = bdiscount;
}
public int getCgid() {
	return cgid;
}
public void setCgid(int cgid) {
	this.cgid = cgid;
}
  
}
