package com.freeflux.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.crypto.AEADBadTagException;

import com.freeflux.model.JoinModel;

import jdk.nashorn.internal.scripts.JO;

/**
 * 회원가입 DAO클래스(데이터베이스 질의문 실행)
 * @since 2020.02.05
 * @author 오현지
 * */


public class JoinDAO {
	
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	//데이터 베이스 접속 설정 정보
	/**JDBC DRIVER 패키지 정보*/
	private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	/**데이터베이스 URL*/
	private final String DB_URL = "jdbc:mysql://127.0.0.1:3306/dao_db";
	/**데이터베이스 ID*/
	private final String DB_ID = "root";
	/**데이터베이스 PW*/
	private final String DB_PW = "920424";
	
	/**
	 * 사용한 객체를 닫음
	 * @param conn
	 * @param stmt
	 * @param pstmt
	 * @param rs
	 * */
	
	public void close(ResultSet rs,Statement stmt,PreparedStatement pstmt,Connection conn){//순서를 지켜야함
		if(rs!=null){
			try{
			rs.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(stmt!=null){
			try{
				stmt.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(pstmt!=null){
			try{
			pstmt.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try{
			conn.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**데이터베이스 접속
	 */
	private void connectDAO(){
	  
		try {
			Class.forName(JDBC_DRIVER);
			this.conn=DriverManager.getConnection(DB_URL,DB_ID,DB_PW);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	/**데이터베이스의 테이블 조회
	 */
	public ArrayList<JoinModel> selectAll(){
		this.connectDAO();
		String query = "select*from dao_test";
		ArrayList<JoinModel> list =null;
		try {
			this.stmt=this.conn.createStatement();
			this.rs=stmt.executeQuery(query);
			
			//태스트 확인 코드
			/*rs.next();
			System.out.println(rs.getInt(1)+"**********");
			System.out.println(rs.getString(2)+"**********");
			System.out.println(rs.getString(3)+"**********");
			System.out.println(rs.getString(4)+"**********");
			System.out.println(rs.getString(5)+"**********");*/
			
			list = new ArrayList<JoinModel>();
			while(rs.next()){
				JoinModel joinModel = new JoinModel();
				joinModel.setnum(rs.getInt(1));
				joinModel.setid(rs.getString(2));
				joinModel.setpw(rs.getString(3));
				joinModel.setemail(rs.getString(4));
				joinModel.setphone(rs.getString(5));
				list.add(joinModel);
				
				System.out.println(joinModel.getnum()+"============");
			}
		} catch (SQLException e) {
			System.out.println("select ERR:"+e.getMessage());
		}finally {
			this.close(rs, stmt, null, conn);
		}
		return list;
	}
	
	/**데이터베이스의 테이블 검색 조회
	 *@param id
	 */
	public void selectOne(String id){
		
	}

	/**데이터베이스의 테이블 수정
	 *@param joinModel
	 */
	public void insert(JoinModel joinModel){
		this.connectDAO();
		String query = "insert into dao_test (id,pw,email,phone) values (?,?,?,?)";
		try {
			
			System.out.println(joinModel.getid()+"----------");
			System.out.println(joinModel.getpw()+"----------");
			System.out.println(joinModel.getemail()+"----------");
			System.out.println(joinModel.getphone()+"----------");
			
			this.pstmt= this.conn.prepareStatement(query);//쿼리문을 실행하는 객체
			this.pstmt.setString(1, joinModel.getid());
			this.pstmt.setString(2, joinModel.getpw());
			this.pstmt.setString(3, joinModel.getemail());
			this.pstmt.setString(4, joinModel.getphone());
			
			this.pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("INSERT ERR:"+e.getMessage());
			e.printStackTrace();
		}finally{
			this.close(null, null, pstmt, conn);
		}
	}
	
	/**데이터베이스의 테이블 수정
	 *@param num
	 */
	public void modify(int num){
		
	}
	/**데이터베이스의 테이블 삭제
	 *@param num 
	 */
	public void delete(int num){
		
	}
	
	
	public String idCheck(String use){
		this.connectDAO();
		String result = null;
		String query = "select id from dao_test where id = ?";
		
		try {
			this.pstmt = this.conn.prepareStatement(query);
			pstmt.setString(1,use);
			this.rs= this.pstmt.executeQuery();
			
			if(rs.next()){
				result="이미 존재하는 아이디";
			}else{
				result="사용가능한 아이디";
			}
			
		} catch (SQLException e) {
			System.out.println("INSERT ERR"+e.getMessage());
		}finally {
			this.close(rs, null, pstmt, conn);
		}
		
		return result;
	}
	/*private int num;
	private String id;
	private String pw;
	private String email;
	private String phone;
	public int getnum(){
		return num;
	}
	
	public void setnum(int num){
		this.num = num;
	}
	
	
	
	public String getid(){
		return id;
	}
	public void setid(String id){
		this.id = id;
	}
	
	
	
	public String getpw(){
		return pw;
	}
	public void setpw(String pw){
		this.pw = pw;
	}
	
	
	public String getemail(){
		return email;
	}
	public void setemail(String email){
		this.email = email;
	}
	
	
	public String getephone(){
		return phone;
	}
	public void setphone(String phone){
		this.phone = phone;
	}*/
	
}
