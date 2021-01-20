package com.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO implements BoardDAOinterface {
	
	@Inject
	private SqlSession sqlSession;

	private static String namespace="com.board.mappers.board";

	@Override
	public void insert(BoardVO VO) throws Exception {
		sqlSession.insert(namespace+".insert", VO);
	}

	@Override
	public List<BoardVO> list() throws Exception {
		return sqlSession.selectList(namespace + ".list");
	}

	@Override
	public BoardVO detail(Integer tNo) throws Exception {
		return sqlSession.selectOne(namespace+".detail",tNo);
	}

	@Override
	public void update(BoardVO VO) throws Exception {
		sqlSession.update(namespace+".update",VO);
	}

	@Override
	public void delete(Integer tNo) throws Exception {
		sqlSession.delete(namespace+".delete",tNo);
	}
	

}
