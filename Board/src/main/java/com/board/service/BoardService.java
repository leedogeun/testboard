package com.board.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.board.dao.BoardDAO;
import com.board.dao.BoardVO;

@Service
public class BoardService implements BoardServiceinterface {
	
	@Inject
	private BoardDAO dao;

	@Override
	public void insert(BoardVO vo) throws Exception {
		dao.insert(vo);
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
	public void update(BoardVO vo) throws Exception {
		dao.update(vo);
	}

	@Override
	public void delete(Integer tNo) throws Exception {
		dao.delete(tNo);
	}

}