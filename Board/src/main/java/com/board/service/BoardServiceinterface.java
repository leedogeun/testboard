package com.board.service;

import java.util.List;

import com.board.dao.BoardVO;

public interface BoardServiceinterface {
	public List<BoardVO> list() throws Exception;
	
	public void write(BoardVO vo) throws Exception;
	
	public BoardVO view(long tNo) throws Exception;
	
	public BoardVO checker(long tNo, String tPassword) throws Exception;
	
	public void modify(BoardVO vo) throws Exception;
	
	public void delete(long tNo, String tPassword) throws Exception;
}