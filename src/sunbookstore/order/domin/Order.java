package sunbookstore.order.domin;

public class Order {
	private double oid;
	private int cid;
	private String ostate;
	public Order() {
		
	}
	public Order(double oid, int cid) {
		this.oid = oid;
		this.cid = cid;
	}
	public Order(double oid, String ostate) {
		this.oid = oid;
		this.ostate = ostate;
	}
	public Order(double oid, int cid, String ostate) {
		this.oid = oid;
		this.cid = cid;
		this.ostate = ostate;
	}
	public double getOid() {
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
