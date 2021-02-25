package com.board.dao;

import java.util.List;
import java.util.Map;

public interface BoardDAOinterface {
	public List<BoardVO> list() throws Exception;

	public void write(BoardVO vo) throws Exception;

	public BoardVO view(Long tNo) throws Exception;

	public int check(Map<String, Object> map) throws Exception;

	public void modify(BoardVO vo) throws Exception;

	public int delete(Long tNo) throws Exception;

}
