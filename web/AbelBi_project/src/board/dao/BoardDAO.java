package board.dao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {
	DataSource ds;
	
	//생성자:DataSource 얻기 InitialContext와 JNDI명
		public BoardDAO() {	
			try {
				//InitialContext ctx = new InitialContext();도 가능
				//이유 :  InitialContext implements(구현) Context
				Context ctx = new InitialContext();
				
				//lookup("java:comp/env/찾고자하는 JNDI명");
				//찾고자하는 JNDI명:=> Context.xml<Resource name="~~"> 반드시 형변환이 필요하다.
				ds=(DataSource)ctx.lookup("java:comp/env/jdbc/orcl");
				
				System.out.println("ds:"+ ds);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//BoardDAO() END
		
		/**글 목록 조회 메서드*/

		/** 글 번호 얻기 메서드(글 쓰기 메서드에서 사용) */
		
		/** 글 쓰기 메서드 */
		
		/** 글 자세히 보기 메서드 */
		
		/** 글 수정하기 메서드 */
		
		/** 글 삭제하기 메서드 */


		/** 검색하기 메서드 */
		
		
		
		/** 합계 매서드*/


}
