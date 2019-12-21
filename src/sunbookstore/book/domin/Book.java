package sunbookstore.book.domin;

<<<<<<< HEAD
public class Book {
	private int bid;
	private String bname;
	private String bauthor;
	private double bprice;
=======
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
	private  int bsum;
	private String bauthor;
	private int bprice;
>>>>>>> fxb
	private String bdesc;
	private String bimage;
	private String bpub;
	private int cgid;
<<<<<<< HEAD
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
=======
	private double bdiscount;
	public Book() {
		
	}
	
	public Book(int bid, String bname, int bsum, String bauthor, int bprice, String bdesc, String bimage, String bpub,
			int cgid,double bdiscount) {
		this.bid = bid;
		this.bname = bname;
		this.bsum = bsum;
>>>>>>> fxb
		this.bauthor = bauthor;
		this.bprice = bprice;
		this.bdesc = bdesc;
		this.bimage = bimage;
		this.bpub = bpub;
		this.cgid = cgid;
<<<<<<< HEAD
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
	
=======
		this.bdiscount = bdiscount;
	}
	public Book(int bid, String bname, int bsum, int bprice, String bimage,int bdiscount) {
		this.bid = bid;
		this.bname = bname;
		this.bsum = bsum;
		this.bprice = bprice;
		this.bimage = bimage;
		this.bdiscount = bdiscount;
	}
	public Book( String bname, int bsum, int bprice, String bimage,int bdiscount) {
		
		this.bname = bname;
		this.bsum = bsum;
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
>>>>>>> fxb
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
<<<<<<< HEAD
=======
	public int getBsum() {
		return bsum;
	}
	public void setBsum(int bsum) {
		this.bsum = bsum;
	}
>>>>>>> fxb
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
<<<<<<< HEAD
	public double getBprice() {
		return bprice;
	}
	public void setBprice(double bprice) {
=======
	public int getBprice() {
		return bprice;
	}
	public void setBprice(int bprice) {
>>>>>>> fxb
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
<<<<<<< HEAD
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
	
	
=======
>>>>>>> fxb
}
