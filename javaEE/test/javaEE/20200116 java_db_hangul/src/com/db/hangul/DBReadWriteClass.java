package com.db.hangul;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class DBReadWriteClass {
	private static Connection conn=null;//11번 어떤베이스에 접속이 가능하다는 것을 가지고 있다. 데이터베이스에 접속 할때 마다 매번 필요하다.
	
	public DBReadWriteClass() {//기본 생성자
	}
	//mySQL 드라이버 로딩 및 db 접속 메서드
	public static void connectMySQL() {//12번
		try {
			Class.forName("com.mysql.jdbc.Driver");//13번  예외처리 필요
			System.out.println("mysql 드라이버 성공");//14번
			String url = "jdbc:mysql://localhost:3306/lms_db";//17번 mysql 드라이버 성공
			conn=DriverManager.getConnection(url,"root","920424");//16번 예외처리 추가
		} catch (ClassNotFoundException e) {
			System.out.println("mysql 드라이버 에러"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("데이터 커넥트 에러"+e.getMessage());
		}
		
	}
	
	//데이터 삽입 메서드(insert into~)
	public static void dataInsert( ArrayList<String> lines) {//18번  ArrayList<String> lines입력
		//메인으로 보낼 필요 없음으로 void를 유지한다.
		
		String[] words = null;//19번
		words=lines.get(0).split(", ");//20번
		//System.out.println(words.length);//21번 몇조각이 났는지 확인한다
		//0			1				2	3	4	5
		//1292001, 900424-1825409, 김광식, 3, 서울, 920
		String name = ChangeEncoding.toLatin(words[2]);//23번
		int y = Integer.parseInt(words[3]);
		String addr = ChangeEncoding.toLatin(words[4]);//24번
		
/**아래의insert문을 편한방법(작은 따옴표 없이)로 수정
 * 쿼리내부에 데이터부분 변수를 사용할 경우 (특히 문자열 부분),
 * 쿼리문의 데이터부분을 ?로 처리한 후, 나중에 메소드를 통하여 
 * ?위치에 데이터를 설정 할 수 있다. 
 * **/		
		
		String queryInsert="insert into stu_table values ('"+words[0]+"','"+words[1]+"','"+name+"',"+y+",'"+addr+"','"+words[5]+"')";//25번
		String newQueryInsert="insert into stu_table values(?,?,?,?,?,?)";//34번 ?는 데이터만 들어갈 수 있다.
		//System.out.println(queryInsert);//26번//변경되는 내용 확인 insert into stu_table values('1292001','900424-1825409','±?±¤½?',3,'¼­¿?','920')
		
		try {
			
			//Statement stmt = conn.createStatement();//27번 예외처리
			PreparedStatement pstmt = conn.prepareStatement(newQueryInsert);//35번 객체가 생성 될때 미리 가지고 있다.
			pstmt.setString(1, words[0]);//36번
			pstmt.setString(2, words[1]);
			pstmt.setString(3, name);
			pstmt.setInt(4, y);
			pstmt.setString(5, addr);
			pstmt.setString(6, words[5]);
			//int n=stmt.executeUpdate(queryInsert);//29번
			int n=pstmt.executeUpdate();//37번	
			
			
			if(n>0){
					System.out.println("데이터 insert 성공");//28번//한글이 잘 들어가는 지 확인
				}
			
		} catch (SQLException e) {
			System.out.println("데이터 insert 에러"+e.getMessage());
		}
	}
	
	//전체 데이터 조회 메서드(select*from~)
	public static void dataSelectAll() {
		String querySelect = "select*from stu_table";//30번
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(querySelect);//31번
			
			ResultSetMetaData rsmd = rs.getMetaData();//32번
			System.out.println("필드 갯수:"+rsmd.getColumnCount());
			
			for(int i=1;i<rsmd.getColumnCount()+1;i++){//33번
				System.out.println(rsmd.getColumnName(i)+"\t");//이름명
				System.out.println(rsmd.getColumnTypeName(i));//타입명
			}
			/*while(rs.next()){//32번
				System.out.println(rs.getString("stu_id")+"\t");
				System.out.println(rs.getString("stu_resident_id")+"\t");
				String name = ChangeEncoding.toUnicode(rs.getString("stu_name"));//한글로 바꾸는 것
				System.out.println(name+"\t");
				System.out.println(rs.getInt("stu_years"));
				String addr= ChangeEncoding.toUnicode(rs.getString("stu_address"));//한글로 바꾸는 것
				System.out.println(addr);
				System.out.println(rs.getString(" dept_id"+"\t"));
			}*/
			
		} catch (SQLException e) {
			System.out.println("데이터 Select 에러"+e.getMessage());
		}
	}
	//주민번호로 데이터 조회 메서드(select*from~where~)
	public static void dataSelectOne() {
		String querySelect = "select*from~where~";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(querySelect);
		} catch (SQLException e) {
			System.out.println("데이터 Select 에러"+e.getMessage());
		}
			
	}
	
	//전체 데이터 삭제 메서드(delete from~)
	public static void dataDeleteAll() {
	}
	//주민번호 데이터 삭제 메서드(delete from~where~)
	public static void dataDeleteOne() {
	}
	//모든 데이터 수정 메서드(update~set~)
	public static void dataUpdateAll() {
	}
	//주민번호로 데이터 수정 메서드(update~set~where)
	public static void dataUpdateOne() {
	}
}
