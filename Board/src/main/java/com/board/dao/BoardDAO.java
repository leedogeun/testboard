package com.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO implements BoardDAOinterface {
	
	@Inject
	private SqlSession sqlSession;

	private static String namespace="com.board.mapper.BoardMapper";

	@Override
	public void insert(BoardVO VO) throws Exception {
		sqlSession.insert(namespace+".insert", VO);
	}

	@Override
	public List<BoardVO> list() throws Exception {
		return sqlSession.selectList(namespace+".list");
	}

	@Override
	public BoardVO detail(Integer Tno) throws Exception {
		return sqlSession.selectOne(namespace+".detail",Tno);
	}

	@Override
	public void update(BoardVO VO) throws Exception {
		sqlSession.update(namespace+".update",VO);
	}

	@Override
	public void delete(Integer Tno) throws Exception {
		sqlSession.delete(namespace+".delete",Tno);
	}
	

}
