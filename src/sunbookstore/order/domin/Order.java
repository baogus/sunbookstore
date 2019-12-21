package sunbookstore.order.domin;

public class Order {
	private int oid;
	private int cid;
	private String ostate;
	public Order() {
		
	}
	public Order(int oid, int cid) {
		this.oid = oid;
		this.cid = cid;
	}
	public Order(int oid, int cid, String ostate) {
		this.oid = oid;
		this.cid = cid;
		this.ostate = ostate;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getOstate() {
		return ostate;
	}
	public void setOstate(String ostate) {
		this.ostate = ostate;
	}
}
