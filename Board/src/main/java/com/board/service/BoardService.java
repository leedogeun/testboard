package com.board.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.board.dao.BoardDAO;
import com.board.dao.BoardVO;

@Service
public class BoardService implements BoardServiceinterface {

	private BoardDAO dao;

	@Override
	public void insert(BoardVO board) throws Exception {
		dao.insert(board);

	}

	@Override
	public List<BoardVO> list() throws Exception {
		return dao.list();
	}

	@Override
	public BoardVO detail(Integer tNo) throws Exception {
		return dao.detail(tNo);
	}

	@Override
	public void update(BoardVO VO) throws Exception {
		dao.update(VO);
	}

	@Override
	public void delete(Integer tNo) throws Exception {

		dao.delete(tNo);
	}

}