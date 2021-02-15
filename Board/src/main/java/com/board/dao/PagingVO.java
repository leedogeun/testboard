package com.board.dao;

public class PagingVO {
	private int total;
	private int now;
	private int end;
	private int start;
	private int cntshow=10;
	private int cntpage=5;
	private int firstpage =1;
	private int lastpage;
	// 아래 두개 구지 필요 없음
	private int efterpage;
	private int endpage;
	
	public PagingVO() {
		
	}
	
	public PagingVO(int total, int now, int cntpage) {
		setTotal(total);
		setNow(now);
		setCntpage(cntpage);
		
		makeLastpage(getTotal(),getCntshow());
		
		
	}
	
	//제일 마지막 페이지
	public void makeLastpage(int total, int cntshow) {
		setLastpage((int)(Math.ceil((double)total/(double)cntshow)));
	}
	
	//보여지는 페이지들 시작과 끝
	public void makeFirstendtpage(int now, int cntshow) {
		setEndpage((int)Math.ceil((double)now/(double)cntshow)*cntshow);
		/* 수정방향 -> 원래 라스트 가 엔드보다 작으면 라스트는 엔드가 되는식이다. 중간 값 도출이 힘들다
		if(getLastpage()<getEndpage()) {
			setEndpage();
		}
		 * */
		
		setTotal(total);
		setNow(now);
		// setCntpage(cntshow); 원래 화면에서 넘어 오는 값을 한다.
		
	}
	
	//글이 보여질 시작과 끝 값
	public void makeStartent(int now, int cntshow) {
		setEnd(now*cntshow);
		setStart(getEnd()-cntshow +1);
	}

	
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

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
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
