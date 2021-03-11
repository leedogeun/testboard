package com.board.reply;

import java.util.Date;

public class ReplyVO {
	private Long Rno;
	private String Rwriter;
	private Date Rdate;
	private String Rconstents;
	private String Rpassword;
	private Long tNo;
	
	public Long getRno() {
		return Rno;
	}
	public void setRno(Long rno) {
		Rno = rno;
	}
	public String getRwriter() {
		return Rwriter;
	}
	public void setRwriter(String rwriter) {
		Rwriter = rwriter;
	}
	public Date getRdate() {
		return Rdate;
	}
	public void setRdate(Date rdate) {
		Rdate = rdate;
	}
	public String getRconstents() {
		return Rconstents;
	}
	public void setRconstents(String rconstents) {
		Rconstents = rconstents;
	}
	public String getRpassword() {
		return Rpassword;
	}
	public void setRpassword(String rpassword) {
		Rpassword = rpassword;
	}
	public Long gettNo() {
		return tNo;
	}
	public void settNo(Long tNo) {
		this.tNo = tNo;
	}
	@Override
	public String toString() {
		return "ReplyVO [Rno=" + Rno + ", Rwriter=" + Rwriter + ", Rdate=" + Rdate + ", Rconstents=" + Rconstents
				+ ", Rpassword=" + Rpassword + ", tNo=" + tNo + "]";
	}
}