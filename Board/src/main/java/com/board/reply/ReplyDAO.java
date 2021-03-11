package com.board.reply;

import java.util.List;

public interface ReplyDAO {
	public List<ReplyVO> replyList(Long tNo);
	public void replyInsert(ReplyVO vo);
	public void replyUpdate(ReplyVO vo);
	public int replyDelete(Long Bno);
	
}
