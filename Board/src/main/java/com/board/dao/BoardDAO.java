package com.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO implements BoardDAOinterface {
	
	@Inject
	private SqlSession sql;
	@Mapper
	private static String namespace = "boardMapper";


	@Override
	public List<BoardVO> list() throws Exception {
		return sql.selectList(namespace + ".list");
	}

	@Override
	public void write(BoardVO vo) throws Exception {
		sql.insert(namespace + ".write", vo);
	}

	@Override
	public BoardVO view(Long tNo) throws Exception {
		return sql.selectOne(namespace + ".view", tNo);
	}

	@Override
	public BoardVO check(BoardVO vo) throws Exception {
		return sql.selectOne(namespace + ".view", vo);
	}

	@Override
	public void modify(BoardVO vo) throws Exception {
		sql.update(namespace + ".modify", vo);
	}

	@Override
	public void delete(Long tNo, String tPassword) throws Exception {
		sql.delete(namespace + ".delete", tNo);
	}
	
	/*
	@Override
	public List<BoardVO> list() throws Exception {
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://127.0.0.1:3306/testboard";
		Connection conn = null;
		PreparedStatement ppst = null;
		ResultSet rs = null; // ResultSet import!
		List<BoardVO> list = null;
		try {
			// JDBC Driver 로딩
			Class.forName(driver);
			// Connection 객체 생성 / DB 연결(접속)
			conn = DriverManager.getConnection(url, "boardMaster", "1234");
			// 수행할 쿼리 정의 / 특정 데이터만 검색하고자 한다면 where 조건절과 매개변수 추가 필요
			ppst = conn.prepareStatement("select tNo, tTitle, tWriter, tDate from testboard.board");
			// 쿼리 수행
			rs = ppst.executeQuery();
			// 수행된 결과를 List<MemberInfoDTO)에 저장
			if (rs.next()) {
				list = new ArrayList<>(); // List 객체 생성
				do {
					// 반복문이 수행될 때 마다 MemberInfoDTO 생성(참조값이 다름)
					BoardVO data = new BoardVO();
					// 생성된 객체(data)에 수행된 쿼리의 값(해당 컬럼)을 순서대로 저장
					data.settNo(rs.getLong("tNo"));
					data.settTitle(rs.getString("tTitle"));
					data.settWriter(rs.getString("tWriter"));
					data.settDate(rs.getDate("tDate"));
					// list에 0번 index부터 순서대로 data 객체의 참조값을 저장
					list.add(data);
				} while (rs.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (ppst != null)
					ppst.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}
		return list; // list 리턴
	}

	@Override
	public void write(BoardVO vo) throws Exception {
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://127.0.0.1:3306/testboard";
		Connection conn = null;
		PreparedStatement ppst = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "boardMaster", "1234");
			ppst = conn.prepareStatement( 
					"insert into testboard.board(tTitle, tWriter, tContents, tPassword)\r\n"
					+ "		values(?, ?, ?, ?)");
			ppst.setString(1, vo.gettTitle());
			ppst.setString(2, vo.gettWriter());
			ppst.setString(3, vo.gettContents());
			ppst.setString(4, vo.gettPassword());
			// 쿼리 수행
			ppst.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ppst != null)
					ppst.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}
	}

	@Override
	public BoardVO view(Long tNo) throws Exception {
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://127.0.0.1:3306/testboard";
		Connection conn = null;
		PreparedStatement ppst = null;
		ResultSet rs = null;
		BoardVO vo = null ;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "boardMaster", "1234");
			ppst = conn.prepareStatement(
					"select tNo, tTitle, tWriter, tDate, tContents from testboard.board where tNo = ?");
			ppst.setLong(1, tNo);
			
			rs = ppst.executeQuery();
			
			if (rs.next()) {
				vo = new BoardVO();
				vo.settNo(rs.getLong("tNo"));
				vo.settTitle(rs.getString("tTitle"));
				vo.settWriter(rs.getString("tWriter"));
				vo.settDate(rs.getDate("tDate"));
				vo.settContents(rs.getString("tContents"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ppst != null)
					ppst.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}
		return vo;
	}
	

	@Override
	public BoardVO check(Long tNo, String tPassword) throws Exception {
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://127.0.0.1:3306/testboard";
		Connection conn = null;
		PreparedStatement ppst = null;
		ResultSet rs = null;
		BoardVO vo = null ;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "boardMaster", "1234");
			ppst = conn.prepareStatement(
					"select tNo, tTitle, tWriter, tContents from testboard.board where tNo = ? and tPassword=?");
			ppst.setLong(1, tNo);
			ppst.setString(2, tPassword);
			
			rs = ppst.executeQuery();
			
			if (rs.next()) {
				vo = new BoardVO();
				vo.settNo(rs.getLong("tNo"));
				vo.settTitle(rs.getString("tTitle"));
				vo.settWriter(rs.getString("tWriter"));
				vo.settContents(rs.getString("tContents"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ppst != null)
					ppst.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}
		return vo;
	}

	@Override
	public void modify(BoardVO vo) throws Exception {
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://127.0.0.1:3306/testboard";
		Connection conn = null;
		PreparedStatement ppst = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "boardMaster", "1234");
			ppst = conn.prepareStatement("update testboard.board\r\n"
					+ "		set tTitle= ?,\r\n"
					+ "		tContents= ?\r\n"
					+ "		where tNo = ?");

			ppst.setString(1, vo.gettTitle());
			ppst.setString(2, vo.gettContents());
			ppst.setLong(3, vo.gettNo());
			// 쿼리 수행
			ppst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ppst != null)
					ppst.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}

	}

	@Override
	public void delete(Long tNo, String tPassword) throws Exception {
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://127.0.0.1:3306/testboard";
		Connection conn = null;
		PreparedStatement ppst = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "boardMaster", "1234");
			ppst = conn.prepareStatement(""
					+ "delete from testboard.board\r\n"
					+ "		where tNo = ?"
					+ "	and tPassword =?");

			ppst.setLong(1, tNo);
			ppst.setString(2, tPassword);
			ppst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ppst != null)
					ppst.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}
	 * */
}