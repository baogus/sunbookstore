package sunbookstore.shopcart.domin;

import java.util.List;

public class PageBean<E> {
	private int pc;//当前页码
	//private int tp;//总页数
	private int tr;//总记录数
	private int ps;//每页记录数
	private List<E> beanList;//当前页的记录
	public PageBean() {
		
	}
	public PageBean(int pc, int tr, int ps, List<E> beanList) {
		this.pc = pc;
		this.tr = tr;
		this.ps = ps;
		this.beanList = beanList;
	}
	public PageBean(int pc, int ps) {
		this.pc = pc;
		this.ps = ps;
	}
	public int getPc() {
		return pc;
	}
	public void setPc(int pc) {
		this.pc = pc;
	}
	//记算总页数
	public int getTp() {
		int tp = tr/ps;
		return tr%ps == 0 ? tp : tp+1;
	}
	/*public void setTp(int tp) {
		this.tp = tp;
	}*/
	public int getTr() {
		return tr;
	}
	public void setTr(int tr) {
		this.tr = tr;
	}
	public int getPs() {
		return ps;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}
	public List<E> getBeanList() {
		return beanList;
	}
	public void setBeanList(List<E> beanList) {
		this.beanList = beanList;
	}
	@Override
	public String toString() {
		return "PageBean [pc=" + pc + ", tr=" + tr + ", ps=" + ps + ", beanList=" + beanList + "]";
	}
}
