package com.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO implements BoardDAOinterface {
	
	@Inject
	private SqlSession sql;
	private static String namespace = "com.board.mappers.boardMapper";

	@Override
	public List<BoardVO> list() throws Exception {
		return 
				null;
//				sql.selectList(namespace + ".list");
	}

	@Override
	public void write(BoardVO vo) throws Exception {
//		sql.insert(namespace + ".write", vo);
	}

	@Override
	public BoardVO view(long tNo) throws Exception {
		return 
				null;
//				sql.selectOne(namespace + ".view", tNo);
	}
	
	@Override
	public void modify(BoardVO vo) throws Exception {
//		sql.update(namespace + ".modify", vo);
	}

	@Override
	public void delete(long tNo) throws Exception {
//		sql.delete(namespace + ".delete", tNo);
	}
}