package com.board.dao;

import java.util.List;

public interface BoardDAOinterface {
	public List<BoardVO> list() throws Exception;

	public void write(BoardVO vo) throws Exception;

	public BoardVO view(long tNo) throws Exception;
	
	public BoardVO checker(long tNo, String tPassword ) throws Exception;

	public void modify(BoardVO vo) throws Exception;

	public void delete(long tNo, String tPassword) throws Exception;

}
