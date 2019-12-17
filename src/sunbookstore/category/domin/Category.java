package sunbookstore.category.domin;

public class Category {
	private int cgid;
	private String cgname;
	public Category(int cgid, String cgname) {
		super();
		this.cgid = cgid;
		this.cgname = cgname;
	}
	public Category() {
		super();
	}
	public int getCgid() {
		return cgid;
	}
	public void setCgid(int cgid) {
		this.cgid = cgid;
	}
	public String getCgname() {
		return cgname;
	}
	public void setCgname(String cgname) {
		this.cgname = cgname;
	}
	

}
