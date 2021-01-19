package com.board.service;

import java.util.List;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.board.dao.BoardDAO;
import com.board.dao.BoardDAOinterface;
import com.board.dao.BoardVO;

@Service
public class BoardService {
	
	private BoardDAOinterface dao;
	
	public void insert(BoardVO board) throws Exception {
		dao.insert(board);
	}

	public List<BoardVO> list() throws Exception {
		return dao.list();
	}

	public BoardVO detail(Integer Tno) throws Exception {
		return dao.detail(Tno);
	}

	public void update(BoardVO VO) throws Exception {
		dao.update(VO);
	}

	public void delete(Integer Tno) throws Exception {
		dao.delete(Tno);
	}
}