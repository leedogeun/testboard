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
	public BoardVO check(BoardVO vo) throws Exception {
		return dao.check(vo);
	}
	@Override
	public void modify(BoardVO vo) throws Exception {
		dao.modify(vo);
	}
	@Override
	public void delete(Long tNo, String tPassword) throws Exception {
		dao.delete(tNo, tPassword);
	}
}
