package sunbookstore.category.domain;

public class Category {
	private int cgid;
	private String cgname;
	public Category(int cgid, String cgname) {
	
		this.cgid = cgid;
		this.cgname = cgname;
	}
	
	public Category(String cgname) {
	
		this.cgname = cgname;
	}

	public Category() {
		
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
