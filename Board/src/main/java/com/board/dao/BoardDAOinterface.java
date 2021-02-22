package com.board.dao;

import java.util.List;

public interface BoardDAOinterface {
	public List<BoardVO> list() throws Exception;

	public void write(BoardVO vo) throws Exception;

	public BoardVO view(Long tNo) throws Exception;

//	public BoardVO check(BoardVO vo) throws Exception;
	public BoardVO check(Long tNo, String tPassword) throws Exception;

	public void modify(BoardVO vo) throws Exception;

	public void delete(Long tNo, String tPassword) throws Exception;

}
