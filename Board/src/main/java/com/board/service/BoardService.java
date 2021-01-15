package com.board.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.board.dao.BoardDAO;
import com.board.dao.BoardVO;

@Service
public class BoardService {
	
	@Inject
	private BoardDAO boardDao;

	public void insert(BoardVO board) throws Exception {
		boardDao.insert(board);
	}

	public List<BoardVO> list() throws Exception {
		return boardDao.list();
	}

	public BoardVO detail(Integer Tno) throws Exception {
		return boardDao.detail(Tno);
	}

	public void update(BoardVO VO) throws Exception {
		boardDao.update(VO);
	}

	public void delete(Integer Tno) throws Exception {
		boardDao.delete(Tno);
	}

}
