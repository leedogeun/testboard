package com.board.dao;

import java.util.Date;

public class BoardVO {
	private long Tno;
	private String Ttitle;
	private String Twriter;
	private Date Tdate;
	private String Tcontents;
	private String Tpassword;
	private long Treference;

	public long getTno() {
		return Tno;
	}

	public void setTno(long tno) {
		Tno = tno;
	}

	public String getTtitle() {
		return Ttitle;
	}

	public void setTtitle(String ttitle) {
		Ttitle = ttitle;
	}

	public String getTwriter() {
		return Twriter;
	}

	public void setTwriter(String twriter) {
		Twriter = twriter;
	}

	public Date getTdate() {
		return Tdate;
	}

	public void setTdate(Date tdate) {
		Tdate = tdate;
	}

	public String getTcontents() {
		return Tcontents;
	}

	public void setTcontents(String tcontents) {
		Tcontents = tcontents;
	}

	public String getTpassword() {
		return Tpassword;
	}

	public void setTpassword(String tpassword) {
		Tpassword = tpassword;
	}

	public long getTreference() {
		return Treference;
	}

	public void setTreference(long treference) {
		Treference = treference;
	}

	@Override
	public String toString() {
		return "BoardVO [Tno=" + Tno + ", Ttitle=" + Ttitle + ", Twriter=" + Twriter + ", Tdate=" + Tdate
				+ ", Tcontents=" + Tcontents + ", Tpassword=" + Tpassword + ", Treference=" + Treference + "]";
	}

}