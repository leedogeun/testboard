package com.board.paging;

public class Maker {
	
	private Criteria cri;
	private int total;
	private int startPage;
	private int endPage;
	private int cntPage = 10;
	private boolean prev;
	private boolean next;
	
	public Criteria getCri() {
		return cri;
	}

	public void setCri(Criteria cri) {
		this.cri = cri;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
		calc();
	}
	
	private void calc() {
		endPage = (int) (Math.ceil(cri.getNowPage()/(double)cntPage) * cntPage);
		
		startPage = endPage - cntPage;
		if(startPage <= 0) {
			startPage = 1;
		}
		
		int temp = (int)(Math.ceil(total/(double)cri.getCntBulletin()));
		if(endPage > temp) {
			endPage = temp;
		}
		
		prev = startPage == 1 ? false : true ;
		next = endPage * cri.getCntBulletin() < total ? true : false ;
		
	}
	
	public int getStartPage() {
		return startPage;
	}
	
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	
	public int getEndPage() {
		return endPage;
	}
	
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	
	public int getCntPage() {
		return cntPage;
	}
	
	public void setCntPage(int cntPage) {
		this.cntPage = cntPage;
	}
	
	public boolean isPrev() {
		return prev;
	}
	
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	
	public boolean isNext() {
		return next;
	}
	
	public void setNext(boolean next) {
		this.next = next;
	}
	
}