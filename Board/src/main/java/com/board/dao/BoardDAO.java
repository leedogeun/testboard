package com.board.dao;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO implements BoardDAOinterface {
	
	/*
	@Inject
	SqlSession sql;
	private static String namespace="com.board.mappers.boardMapper";
 * */	
	
	 private SqlSessionTemplate sql;
	@Autowired
    public void setSqlMapClient(SqlSessionTemplate sqlSessionTemplate) {
        sql = sqlSessionTemplate;
    }


	@Override
	public void insert(BoardVO vo) throws Exception {
		sql.insert("insert", vo);
		//sql.insert(namespace+".insert", vo);
	}

	@Override
	public List<BoardVO> list() throws Exception {
		return sql.selectList("list");
				//sql.selectList(namespace + ".list");
	}

	@Override
	public BoardVO detail(Integer tNo) throws Exception {
		return sql.selectOne("select", tNo);
				//sql.selectOne(namespace+".detail",tNo);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		sql.update("update", vo);
		//sql.update(namespace+".update",vo);
	}

	@Override
	public void delete(Integer tNo) throws Exception {
		sql.delete("delete", tNo);
		//sql.delete(namespace+".delete",tNo);
	}

}