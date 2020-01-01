package sunbookstore.book.domin;

import com.sun.jndi.url.dns.dnsURLContext;
import com.sun.xml.internal.ws.message.StringHeader;

public class Book {
	/*
	 * 2. 书籍表（book）(书籍编号（bid）， 书籍名字（bname）, 
	 * 书籍作者（bauthor）, 书籍价格（bprice），书籍简介（bdesc），
	 * 书籍封面（bimage），出版社（bpub），分类编号（cgid）)
	 */
	private int bid;
	private String bname;
	private  int bcount;
	private String bauthor;
	private int bprice;
	private String bdesc;
	private String bimage;
	private String bpub;
	private int cgid;
	private double bdiscount;
	public Book() {
		
	}
	
	public Book(int bid, String bname, int bcount, String bauthor, int bprice, String bdesc, String bimage, String bpub,
			int cgid,double bdiscount) {
		this.bid = bid;
		this.bname = bname;
		this.bcount = bcount;
		this.bauthor = bauthor;
		this.bprice = bprice;
		this.bdesc = bdesc;
		this.bimage = bimage;
		this.bpub = bpub;
		this.cgid = cgid;
		this.bdiscount = bdiscount;
	}
	public Book(int bid, String bname, int bcount, int bprice, String bimage,int bdiscount) {
		this.bid = bid;
		this.bname = bname;
		this.bcount = bcount;
		this.bprice = bprice;
		this.bimage = bimage;
		this.bdiscount = bdiscount;
	}
	public Book( String bname, int bcount, int bprice, String bimage,int bdiscount) {
		
		this.bname = bname;
		this.bcount = bcount;
		this.bprice = bprice;
		this.bimage = bimage;
		this.bdiscount = bdiscount;
	}
	public double getBdiscount() {
		return bdiscount;
	}
	public void setBdiscount(double bdiscount) {
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
	public int getBcount() {
		return bcount;
	}
	public void setBcount(int bcount) {
		this.bcount = bcount;
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
}
