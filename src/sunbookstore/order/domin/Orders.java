package sunbookstore.order.domin;

import java.sql.Date;

public class Orders {
	private int cid;
	private int bid;
	private int oid;
	private Date otime;
	private String bimage;
	private String bname;
	private int bprice;
	private String cname;
	private String caddress;
	private String ostate;
	private int onum;
	private int osubtotal;
	public Orders() {
	}
	public Orders(int bid, int oid, Date otime, String bimage, String bname, int bprice, String cname,
			String caddress, String ostate,int onum, int osubtotal) {
		this.bid = bid;
		this.oid = oid;
		this.otime = otime;
		this.bimage = bimage;
		this.bname = bname;
		this.bprice = bprice;
		this.cname = cname;
		this.caddress = caddress;
		this.ostate = ostate;
		this.onum = onum;
		this.osubtotal = osubtotal;
	}
	public Orders(int oid, Date otime, String bimage, String bname, int bprice, String cname,
			String caddress,String ostate, int onum, int osubtotal) {
		this.oid = oid;
		this.otime = otime;
		this.bimage = bimage;
		this.bname = bname;
		this.bprice = bprice;
		this.cname = cname;
		this.caddress = caddress;
		this.ostate = ostate;
		this.onum = onum;
		this.osubtotal = osubtotal;
	}
	public Orders(int cid, int bid, int oid, Date otime, String bimage, String bname, int bprice, String cname,
			String caddress, String ostate, int onum, int osubtotal) {
		this.cid = cid;
		this.bid = bid;
		this.oid = oid;
		this.otime = otime;
		this.bimage = bimage;
		this.bname = bname;
		this.bprice = bprice;
		this.cname = cname;
		this.caddress = caddress;
		this.ostate = ostate;
		this.onum = onum;
		this.osubtotal = osubtotal;
	}
	public String getOstate() {
		return ostate;
	}
	public void setOstate(String ostate) {
		this.ostate = ostate;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public Date getOtime() {
		return otime;
	}
	public void setOtime(Date otime) {
		this.otime = otime;
	}
	public String getBimage() {
		return bimage;
	}
	public void setBimage(String bimage) {
		this.bimage = bimage;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getBprice() {
		return bprice;
	}
	public void setBprice(int bprice) {
		this.bprice = bprice;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public int getOnum() {
		return onum;
	}
	public void setOnum(int onum) {
		this.onum = onum;
	}
	public int getOsubtotal() {
		return osubtotal;
	}
	public void setOsubtotal(int osubtotal) {
		this.osubtotal = osubtotal;
	}
}
