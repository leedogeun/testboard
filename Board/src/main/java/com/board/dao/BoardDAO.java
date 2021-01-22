package com.board.dao;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO implements BoardDAOinterface {
	
	/*
	private SqlSessionTemplate sql;
	@Autowired
	public void setSqlMapClient(SqlSessionTemplate sqlSessionTemplate) {
		sql = sqlSessionTemplate;
	}
	 */
	
	@Inject
	SqlSession sql;
	
	private static String namespace = "src/main/resources/mappers/boardMapper";

	@Override
	public void insert(BoardVO vo) throws Exception {
		//sql.insert("insert", vo);
		sql.insert(namespace+".insert", vo);
		
		System.out.println("DAO-insert");
	}

	@Override
	public List<BoardVO> list() throws Exception {
		System.out.println("DAO-list");
		return 
				//sql.selectList("list");
				sql.selectList(namespace + ".list");
	}

	@Override
	public BoardVO detail(Integer tNo) throws Exception {
		System.out.println("DAO-detail");
		return 
				//sql.selectOne("select", tNo);
				sql.selectOne(namespace+".detail",tNo);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		System.out.println("DAO-update");
//		sql.update("update", vo);
		sql.update(namespace+".update",vo);
	}

	@Override
	public void delete(Integer tNo) throws Exception {
		System.out.println("DAO-delete");
//		sql.delete("delete", tNo);
		sql.delete(namespace+".delete",tNo);
	}

}