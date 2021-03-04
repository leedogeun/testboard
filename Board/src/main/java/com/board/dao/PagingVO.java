package com.board.dao;

public class PagingVO {
	/* *******************
	 * 현재페이지, 처음 페이지, 보여지는 페이지중 마지막 페이지, 모든 게시글 수, 보여질 글의 수, 제일 마지막 페이지, limit 에 처음값, 보여질 목록의 갯수
	 * *******************/
	private int nowpage;
	private int firstpage;
	private int endpage;
	private int total;
	private int cntshow=10;
	private int lastpage;
	private int start;
	private int cntpage=5;
	
	public PagingVO() {
	}
	
	public PagingVO(int total,int nowpage, int cntshow) {
		setTotal(total);
		setNowpage(nowpage);
		setCntshow(cntshow);
	}
	// lastpage 만들기
	public void makeLastPage(int total, int cntshow) {
		setLastpage((int) Math.ceil((double)total/(double)cntshow));
	}
	//보여지는 페이지에서 양끝단 만들기
	public void makeFirstEndPage(int nowpage, int cntpage) {
		setEndpage((int)Math.ceil((double)nowpage/(double)cntpage)*cntpage);
		if (getLastpage()<getEndpage()) {
			//목록의 끝 페이지가 마지막 페이지랑 같으면 마지막 페이지 값 대입
			setEndpage(getLastpage());
		}
		
		setFirstpage(getEndpage() - cntpage +1);
		
		if(getFirstpage()<1) {
			//현재 목록의 값이 음수(첫페이지에서 발생)일시 1페이지로 고정
			setFirstpage(1);
		}
	}
	// limit 처음 값
	public void makeStartValue(int nowpage, int cntshow) {
		setStart((nowpage-1)*cntshow);
		if (getStart()<0) {
			//음수가 나올수 없으나 예외시 1로 처리
			setStart(1);
		}
	}
	
	public int getNowpage() {
		return nowpage;
	}
	public void setNowpage(int nowpage) {
		this.nowpage = nowpage;
	}
	public int getFirstpage() {
		return firstpage;
	}
	public void setFirstpage(int firstpage) {
		this.firstpage = firstpage;
	}
	public int getEndpage() {
		return endpage;
	}
	public void setEndpage(int endpage) {
		this.endpage = endpage;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getCntshow() {
		return cntshow;
	}
	public void setCntshow(int cntshow) {
		this.cntshow = cntshow;
	}
	public int getLastpage() {
		return lastpage;
	}
	public void setLastpage(int lastpage) {
		this.lastpage = lastpage;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getCntpage() {
		return cntpage;
	}
	public void setCntpage(int cntpage) {
		this.cntpage = cntpage;
	}
	@Override
	public String toString() {
		return "PagingVO [nowpage=" + nowpage + ", firstpage=" + firstpage + ", endpage=" + endpage + ", total=" + total
				+ ", cntshow=" + cntshow + ", lastpage=" + lastpage + ", start=" + start + ", cntpage=" + cntpage + "]";
	}
	
}