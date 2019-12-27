package sunbookstore.book_order.domin;

import java.sql.Date;

public class Book_order {
	       private  int  oid;
		   private  int  bid;
		   private Date otime; 
		   private double osubtotal;
		   private String oweradder;
		   private int onum;
		   private int mothcount;
		public Book_order(int mothcount) {
			this.mothcount=mothcount;
		}
		public int getMothcount() {
			return mothcount;
		}
		public void setMothcount(int mothcount) {
			this.mothcount = mothcount;
		}
		public int getOid() {
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
		public String getOweradder() {
			return oweradder;
		}
		public void setOweradder(String oweradder) {
			this.oweradder = oweradder;
		}
		public Date getOtime() {
			return otime;
		}
		public void setOtime(Date otime) {
			this.otime = otime;
		}
		public double getOsubtotal() {
			return osubtotal;
		}
		public void setOsubtotal(double osubtotal) {
			this.osubtotal = osubtotal;
		}
		public int getOnum() {
			return onum;
		}
		public void setOnum(int onum) {
			this.onum = onum;
		}
		   
}
