package com.board.dao;

import java.util.List;

public interface BoardDAOinterface {

	public void insert(BoardVO VO) throws Exception;

	public List<BoardVO> list() throws Exception;

	public BoardVO detail(Integer Tno) throws Exception;

	public void update(BoardVO VO) throws Exception;

	public void delete(Integer Tno) throws Exception;

}
