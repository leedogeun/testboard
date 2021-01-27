package com.board.dao;

import java.util.Date;

public class BoardVO {
	private Long tNo;
	private String tTitle;
	private String tWriter;
	private Date tDate;
	private String tContents;
	private String tPassword;
	private Long tReference;

	public Long gettNo() {
		return tNo;
	}

	public void settNo(Long tNo) {
		this.tNo = tNo;
	}

	public String gettTitle() {
		return tTitle;
	}

	public void settTitle(String tTitle) {
		this.tTitle = tTitle;
	}

	public String gettWriter() {
		return tWriter;
	}

	public void settWriter(String tWriter) {
		this.tWriter = tWriter;
	}

	public Date gettDate() {
		return tDate;
	}

	public void settDate(Date tDate) {
		this.tDate = tDate;
	}

	public String gettContents() {
		return tContents;
	}

	public void settContents(String tContents) {
		this.tContents = tContents;
	}

	public String gettPassword() {
		return tPassword;
	}

	public void settPassword(String tPassword) {
		this.tPassword = tPassword;
	}

	public Long gettReference() {
		return tReference;
	}

	public void settReference(Long tReference) {
		this.tReference = tReference;
	}

	@Override
	public String toString() {
		return "BoardVO [tNo=" + tNo + ", tTitle=" + tTitle + ", tWriter=" + tWriter + ", tDate=" + tDate
				+ ", tContents=" + tContents + ", tPassword=" + tPassword + ", tReference=" + tReference + "]";
	}
}
