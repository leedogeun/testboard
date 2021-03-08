package com.board.paging;

public class Criteria {
	private int nowPage;
	private int cntBulletin;
	
	public int getSomePage() {
		return (this.nowPage-1)*cntBulletin;
	}
	
	public Criteria() {
		this.nowPage = 1;
		this.cntBulletin = 10;
	}
	
	public int getNowPage() {
		return nowPage;
	}
	
	public void setNowPage(int Page) {
		if (Page < 0) {
			this.nowPage = 1;
		}else {
			this.nowPage = Page;
		}
	}
	
	public int getCntBulletin() {
		return cntBulletin;
	}
	
	public void setCntBulletin(int pageCount) {
		int cnt = this.cntBulletin;
		
		if (pageCount != cnt) {
			this.cntBulletin = cnt;
		}else {
			this.cntBulletin = pageCount;
		}
	}
}