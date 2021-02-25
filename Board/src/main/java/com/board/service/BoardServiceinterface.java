package com.board.service;

import java.util.List;
import java.util.Map;

import com.board.dao.BoardVO;

public interface BoardServiceinterface {
	public List<BoardVO> list() throws Exception;
	
	public void write(BoardVO vo) throws Exception;
	
	public BoardVO view(Long tNo) throws Exception;
	
	public int check(Map<String, Object> map) throws Exception;
	
	public void modify(BoardVO vo) throws Exception;
	
	public int delete(Long tNo) throws Exception;
}