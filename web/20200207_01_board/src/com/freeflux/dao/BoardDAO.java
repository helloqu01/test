package com.freeflux.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.freeflux.model.BoardModel;



/**
 * 게시판 DAO 클래스(데이터베이스 질의문 실행)
 *@since 2020.02.07
 *@author freeflux
 **/

public class BoardDAO{
	//사용할 객체 초기화
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	//데이터베이스 접속 설정 정보
	/**JDBC 드라이버 패키지 정보*/
	private final String JDBC_DRIVVER = "com.mysql.jdbc.Driver";
	/**데이터베이스 URL*/
	private final String DB_URL = "jdbc:mysql://127.0.0.1:3306/dao_db";
	/**데이터베이스 ID,PW*/
	private final String DB_ID = "root";
	private final String DB_PWD = "920424";
	
	
	/**
	 * 게시판조회목록
	 *@param boardModel
	 *@return 
	 */

	public List<BoardModel> selectList(BoardModel boardModel){
		String whereSQL = "where subject like concat('%',?,'%')";
		String query = "select num,subject,writer,reg_date,hit from board1"+whereSQL+
				"order by num desc limit ?,?";
		return null;
	}
	
	/**
	 * 게시판 수 조회
	 *@param boardModel
	 *@return 
	 */
	public int selectCount(BoardModel boardModel) {
		
		String whereSQL = "where subject like concat('%',?,'%')";
		String query = "select count(num) as total from board1"+whereSQL;
		return 0;
	}
	
	/**
	 * 게시판 상세 조회
	 *@param boardModel
	 *@return 
	 */
	public BoardModel selectOne(BoardModel boardModel) {
		String query = "select num,subject,contents,writer,hit,reg_date from board1 where num =?";
		return null;
	}
	
	/**
	 * 게시판  등록 처리
	 *@param boardModel
	 */
	public void insert(BoardModel boardModel) {
		String query = "insert into (subject,writer,contents,ip,hit,"
				+ "reg_date,mod_date) values(?,?,?,?,0,now(),now())";
	}
	
	/**
	 * 게시판  수정 처리
	 *@param boardModel
	 */
	public void update(BoardModel boardModel) {
		String query = "update board1 set subject =?, writer=?,contents=?,ip=?,mod_date=now() where num=?";
	}
	/**
	 * 게시판  조회수 증가 수정 처리
	 *@param boardModel
	 */
	public void updateHit(BoardModel boardModel) {
		String query = "update board1 set hit = hit+1 where num=?";
	}
	
	/**
	 * 게시판  삭제 처리
	 *@param boardModel
	 */
	public void delete(BoardModel boardModel) {
		String query = "delete from board1 where num=?";
	}
	
	/**
	 * 사용한 객체를 닫음
	 *@param  rs
	 *@param  pstmt
	 *@param  conn
	 */
	public void close(ResultSet rs,PreparedStatement pstm, Connection conn){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(pstm!=null){
			try {
				pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}//close
	
}
