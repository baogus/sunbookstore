package sunbookstore.shopcart.domin;

public class Shop_Book {
	private int sid;
	private int bid;
	private int sbnum;
	public Shop_Book() {
	}
	public Shop_Book(int sid, int bid) {
		this.sid = sid;
		this.bid = bid;
	}
	public Shop_Book(int sid, int bid, int sbnum) {
		this.sid = sid;
		this.bid = bid;
		this.sbnum = sbnum;
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
	
}
