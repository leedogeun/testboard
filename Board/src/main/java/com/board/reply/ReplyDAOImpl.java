package com.board.reply;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

public class ReplyDAOImpl implements ReplyDAO{
	
	@Inject
	SqlSession sql;

	@Override
	public List<ReplyVO> replyList(Long tNo) {
		return sql.selectList("reply.replyList");
	}

	@Override
	public void replyInsert(ReplyVO vo) {
		sql.insert("reply.replyInsert");
	}

	@Override
	public void replyUpdate(ReplyVO vo) {
		sql.update("reply.replyUpdate");
	}

	@Override
	public int replyDelete(Long Bno) {
		return sql.delete("reply.replyDelete");
	}
	
}