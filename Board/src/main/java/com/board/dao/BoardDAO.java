package com.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {
	
	@Inject
	private SqlSessionFactory sqlSession;
	
	
	private static String namespace ="com.board.mapper.BoardMapper";
	   
	  public void insert(BoardVO VO) throws Exception {
		  sqlSession.insert(namespace+".insert", VO);
	  }
	 
	  public List<BoardVO> list() throws Exception {
		  return sqlSession.list(namespace+".list");
	  }
	  
	  public BoardVO detail(Integer Tno) throws Exception {
	    return sqlSession.detail(namespace+".detail",Tno);
	  }
	 
	  public void update(BoardVO VO) throws Exception {
	    sqlSession.update(namespace+".update",VO);
	  }
	 
	  public void delete(Integer Tno) throws Exception {
	    sqlSession.delete(namespace+".delete",Tno);
	  }
	
}
