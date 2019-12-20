package sunbookstore.shopcart.domin;

public class ShopCart {
	private int sid;
	private int cid;
	public ShopCart(int sid, int cid) {
		this.sid = sid;
		this.cid = cid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
}
