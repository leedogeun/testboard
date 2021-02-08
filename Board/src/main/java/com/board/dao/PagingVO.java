package com.board.dao;

public class PagingVO {
	private int total;
	private int now;
	private int end;
	private int stard;
	private int cntshow=10;
	private int cntpage=5;
	private int firstpage;
	private int lastpage;
	private int efterpage;
	private int endpage;
	
	public PagingVO() {
		
	}
	/* 
	public void makeLastPage(int total, int now, int cntpage) {
		setNow(now);
		setCntpage(cntpage);
		setTotal(total);
		setLastPage(getTotal,);
	}
	 */

	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getNow() {
		return now;
	}
	
	public void setNow(int now) {
		this.now = now;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getStard() {
		return stard;
	}

	public void setStard(int stard) {
		this.stard = stard;
	}

	public int getCntshow() {
		return cntshow;
	}

	public void setCntshow(int cntshow) {
		this.cntshow = cntshow;
	}

	public int getCntpage() {
		return cntpage;
	}

	public void setCntpage(int cntpage) {
		this.cntpage = cntpage;
	}

	public int getFirstpage() {
		return firstpage;
	}

	public void setFirstpage(int firstpage) {
		this.firstpage = firstpage;
	}

	public int getLastpage() {
		return lastpage;
	}

	public void setLastpage(int lastpage) {
		this.lastpage = lastpage;
	}

	public int getEfterpage() {
		return efterpage;
	}

	public void setEfterpage(int efterpage) {
		this.efterpage = efterpage;
	}

	public int getEndpage() {
		return endpage;
	}

	public void setEndpage(int endpage) {
		this.endpage = endpage;
	}

}
