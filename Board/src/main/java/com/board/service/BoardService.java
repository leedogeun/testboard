package com.board.service;

import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.board.dao.BoardDAO;
import com.board.dao.BoardVO;

@Service
public class BoardService implements BoardServiceinterface {

	@Inject
//	private BoardDAOinterface dao;
	private BoardDAO dao;
	
	@Override
	public List<BoardVO> list() throws Exception {
		return dao.list();
	}
	@Override
	public void write(BoardVO vo) throws Exception {
		dao.write(vo);
	}
	@Override
	public BoardVO view(Long tNo) throws Exception {
		return dao.view(tNo);
	}
	
	@Override
	public int check(Map<String, Object> map) throws Exception {
		return dao.check(map);
	}
	@Override
	public void modify(BoardVO vo) throws Exception {
		dao.modify(vo);
	}
	@Override
	public int delete(Map<String, Object> map) throws Exception {
		return dao.delete(map);
	}
}