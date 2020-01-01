package sunbookstore.order.domin;

import java.sql.Date;

public class Book_Order {
	private double oid;
	private int bid;
	private Date otime;
	private int osubtotal;
	private int onum;
	public Book_Order() {
		
	}
	public Book_Order(double oid, int bid, int osubtotal, int onum) {
		this.oid = oid;
		this.bid = bid;
		this.osubtotal = osubtotal;
		this.onum = onum;
	}
	public Book_Order(double oid, int bid, Date otime, int osubtotal, int onum) {
		this.oid = oid;
		this.bid = bid;
		this.otime = otime;
		this.osubtotal = osubtotal;
		this.onum = onum;
	}
	public double getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public Date getOtime() {
		return otime;
	}
	public void setOtime(Date otime) {
		this.otime = otime;
	}
	public int getOsubtotal() {
		return osubtotal;
	}
	public void setOsubtotal(int osubtotal) {
		this.osubtotal = osubtotal;
	}
	public int getOnum() {
		return onum;
	}
	public void setOnum(int onum) {
		this.onum = onum;
	}
	
}
