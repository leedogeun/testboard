package com.board.service;

import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.board.dao.BoardDAO;
import com.board.dao.BoardVO;
import com.board.paging.Criteria;

@Service
public class BoardService implements BoardServiceinterface {

	@Inject
//	private BoardDAOinterface dao;
	private BoardDAO dao;
	
	@Override
	public List<Map<String, Object>> list(Criteria cri) throws Exception {
		return dao.list(cri);
	}
	
	@Override
	public int count() throws Exception {
		return dao.count();
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
	public int delete(Long tNo) throws Exception {
		return dao.delete(tNo);
	}
	@Override
	public int total() throws Exception {
		return dao.total();
	}
	
}