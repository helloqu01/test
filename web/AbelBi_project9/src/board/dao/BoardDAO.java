package board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import board.command.BoardCommand;
import board.dto.BoardDTO;

/**
 * AbelBi Project (Shopping_mall Homepage)
 * @since 2020.02.22
 * @author AREUM, HYUNJI
 */
public class BoardDAO {
	
	DataSource ds;

	public BoardDAO() {
		 
		try {
			Context ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/orcl");
			System.out.println("ds : " + ds);
			
		} catch (NamingException e) {
			System.out.println("connect err : " + e.getMessage());
		}	
	} // BoardDAO() END
	
	// 글 목록
	public ArrayList<BoardDTO> list() {
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		
		String sql = "select * from main order by idx desc";
		try {
			Connection con = ds.getConnection();
			
			PreparedStatement pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, "top");
//			pstmt.setString(2, "bottom");
//			pstmt.setString(3, "dress");
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardDTO data = new BoardDTO();
				data.setIdx(rs.getInt("idx"));
				data.setProductImage(rs.getString("productImage"));
				data.setProductName(rs.getString("productName"));
				data.setProductPrice(rs.getString("productPrice"));
				data.setProductContent(rs.getString("productContent"));
				data.setCountProduct(rs.getInt("countProduct"));
				data.setDelivery(rs.getInt("delivery"));
				data.setSumOfProduct(rs.getInt("sumOfProduct"));
				
				list.add(data);
				
			} // while() END
			
			rs.close();
			pstmt.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("SELECT ERR : " +e.getMessage());
		}
		return list;
		
	} // select( ) END
	
	//이미지 입력
	public void insertImage(BoardDTO boardDTO) {

		String sql = "insert into main (idx, productImage) values (?, ?)";
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, boardDTO.getIdx());
			pstmt.setString(2, boardDTO.getProductImage());
			
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("insertImage () err : " + e.getMessage());
			
		}
		
	} // insertImage() END
	
	public int getNewNum(){
	      System.out.println("=============");
	      int newNum = 1;
	      String sql = "select max(idx) from main";
	      try {
	         Connection con = ds.getConnection();
	         PreparedStatement pstmt = con.prepareStatement(sql);
	         ResultSet rs = pstmt.executeQuery();
	         if(rs.next()){
	            newNum = rs.getInt(1)+1;
	         }
	         System.out.println("dddddddddddddd");
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	      return newNum;
	      
	   }
	// 글쓰기 String productName, int productPrice, String productContent, String productImage, int countProduct, int sumOfProduct, int delivery
	public void write(BoardCommand data){
		int newNum = getNewNum();
		// String productName, int productPrice, String productContent, String productImage, int countProduct, int sumOfProduct, int delivery
		String sql = "insert into main (idx, productName, productPrice, summary, productContent) values (?, ?, ?, ?, ?)";
		// 한글 깨지는지 확인
		System.out.println(sql);
		
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, newNum);
			pstmt.setString(2, data.getProductName());
			System.out.println(data.getProductName());
			
			pstmt.setInt(3, data.getProductPrice());
			System.out.println(data.getProductPrice());
			
			pstmt.setString(4, data.getSummary());
			System.out.println(data.getSummary());
			
			pstmt.setString(5, data.getProductContent());
			System.out.println(data.getProductContent());
/*			pstmt.setString(4, data.getProductImage());*/

			
			pstmt.executeUpdate();
			
			pstmt.close();
			con.close();		
			
		} catch (SQLException e) {
			System.out.println("insert err : " + e.getMessage());
		}
	} // write() END
	
	// 글상세보기
	public BoardDTO retrieve(int idx) {
		BoardDTO data = new BoardDTO();

		try {
			String sql = "select * from main where idx=" + idx;
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				// 상품명, 상품가격, 상품설명, 이미지
				data.setIdx(rs.getInt("idx"));
				data.setProductName(rs.getString("productName"));
				data.setProductPrice(rs.getString("productPrice"));
				data.setProductContent(rs.getString("productContent"));
				
			} // if() END
			
			pstmt = null;
			sql = "select * from cart where idx="+idx;
			con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				data.setProductImage(rs.getString("productImage"));
				data.setProductName(rs.getString("productName"));
				data.setProductPrice(rs.getString("productPrice"));
				data.setCountProduct(rs.getInt("countProduct"));
				data.setDelivery(rs.getInt("delivery"));
				data.setSumOfProduct(rs.getInt("sumOfProduct"));
			}

			rs.close();
			pstmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("retrieve() err : " + e.getMessage());
		}
		return data;
	} // retrieve() END
	
	// 글 수정
	public void update(BoardCommand data, int idx) {
		// String productName, int productPrice, String productContent, String productImage, int countProduct, int sumOfProduct, int delivery
		String sql = "update main set productName=?, productPrice=?, productContent=?, productImage=? summary=?";
		sql += " where num=?";
		System.out.println(sql);

		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, data.getProductName());
			pstmt.setInt(2, data.getProductPrice());
			pstmt.setString(3, data.getProductContent());
			pstmt.setString(4, data.getProductImage());
			pstmt.setString(5, data.getSummary());
			pstmt.executeUpdate();
			pstmt.setInt(6, idx);
			
			pstmt.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("update() ERR : " +e.getMessage());
		}
		
	} // update() END	
	
	/**글 삭제*/
	   public void delete(String idx) {
	      BoardDTO data = new BoardDTO();
	      try {
	  
	         String sql = "delete main where idx=?";
	         System.out.println(sql);
	         
	         Connection con=ds.getConnection();
	         PreparedStatement stmt = con.prepareStatement(sql);
	         stmt.setInt(1, Integer.parseInt(idx));
	         stmt.executeUpdate();
	         
	         stmt.close();
	         con.close();
	         
	      } catch (SQLException e) {
	      System.out.println("delete err : " +e.getMessage());
	      }
	   } // delete() END
	   
	   /** 검색하기 메서드*/
	   public ArrayList<BoardDTO> search(String name, String value) {
	      //name(""또는"")
	      ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
	   
	      try {
	         String sql = "select * from main";
	      sql+=" where "+name+" like '%"+value+"%' ";
	      sql+=" order by num desc";
	      
	      System.out.println(sql);
	      
	         Connection con=ds.getConnection();
	         PreparedStatement stmt = con.prepareStatement(sql);
	         ResultSet rs = stmt.executeQuery();
	         
	         while(rs.next()){
	               BoardDTO data = new BoardDTO();
	             //productName, productPrice, productContent, productImage
					data.setIdx(rs.getInt("idx"));
					data.setProductName(rs.getString("productName"));
					data.setProductPrice(rs.getString("productPrice"));
					data.setProductContent(rs.getString("productContent"));
					data.setProductImage(rs.getString("productImage"));
					list.add(data);
					
	            }//while END
	         
	         rs.close();
	         stmt.close();
	         con.close();
	      } catch (SQLException e) {
	         System.out.println("search() err : " + e.getMessage());
	      }
	      return list;
	   }//search() END
	 
} // class END
