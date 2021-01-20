package com.board.dao;

import java.util.List;

public interface BoardDAOinterface {

	public void insert(BoardVO vo) throws Exception;

	public List<BoardVO> list() throws Exception;

	public BoardVO detail(Integer tNo) throws Exception;

	public void update(BoardVO vo) throws Exception;

	public void delete(Integer tNo) throws Exception;

}
