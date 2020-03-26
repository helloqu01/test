package com.ohj.emroDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.ohj.emroModel.EmroModel;

public class emroDAO {
	
	private Connection conn=null;
	private PreparedStatement pstmt =null;
	private ResultSet rs=null;
	private Statement stmt=null;
	
	public emroDAO() {	
	}
	
	private void commit(){
		String commit="commit";
		try {
			this.stmt=conn.createStatement();
			this.stmt.executeQuery(commit);
		} catch (SQLException e) {
			System.out.println("COMMIT ERR "+e.getMessage());
		} finally{
			try {
				this.stmt.close();
			} catch (SQLException e) {
				System.out.println("STMT CLOSE ERR COMMIT "+e.getMessage());
			}
		}
	}//commit END
	
	   private void connectDB() {
		      try {
		         Class.forName("oracle.jdbc.driver.OracleDriver");
		         String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		         this.conn = DriverManager.getConnection(url, "ohj", "920424");
		      } catch (ClassNotFoundException e) {
		         System.out.println("CLASS FOR NAME ERR "+e.getMessage());
		      } catch (SQLException e) {
		    	 System.out.println("DRIVER MANAGER ERR "+e.getMessage());
		      }
	   } // connectDB() END
	
		public void insert1(EmroModel emroModel){
			connectDB();
			String query="insert into emro1(koname, engname, field, job, writedate, proposer, birth,address,email,phone,imgurl) values(?,?,?,?,?, ?,?,?,?,?, ?)";
			
			try {
				this.pstmt=conn.prepareStatement(query);
				this.pstmt.setString(1, emroModel.getKoname());
				this.pstmt.setString(2, emroModel.getEngname());
				this.pstmt.setString(3, emroModel.getField());
				this.pstmt.setString(4, emroModel.getJob());
				this.pstmt.setString(5, emroModel.getWritedate());
				this.pstmt.setString(6, emroModel.getProposer());
				
				this.pstmt.setString(7, emroModel.getBirth());
				this.pstmt.setString(8, emroModel.getAddress());
				this.pstmt.setString(9, emroModel.getEmail());
				this.pstmt.setString(10, emroModel.getPhone());
				this.pstmt.setString(11, emroModel.getImgurl());
				
				this.pstmt.setString(12, emroModel.getHighin());
				this.pstmt.setString(13, emroModel.getHighout());
				this.pstmt.setString(14, emroModel.getHighname());
				
				this.pstmt.setString(15, emroModel.getColin());
				this.pstmt.setString(16, emroModel.getColout());
				this.pstmt.setString(17, emroModel.getColinfo());
				this.pstmt.setString(18, emroModel.getColsub());
				
				this.pstmt.setString(19, emroModel.getMasterin());
				this.pstmt.setString(20, emroModel.getMasterout());
				this.pstmt.setString(21, emroModel.getMasterinfo());
				
				this.pstmt.setString(22, emroModel.getPart());
				this.pstmt.setString(23, emroModel.getSubject());
				this.pstmt.setString(24, emroModel.getGapyear());
			
				this.pstmt.executeUpdate();
				commit();
			} catch (SQLException e) {
				System.out.println("insert prepareStatement ERR "+e.getMessage());
			} finally {
				this.close(null, this.pstmt, this.conn);
			}
		}//insert1 END
		
	
		
		public void update1(EmroModel emroModel){
			 try{
				 connectDB();
				 String query="UPDATE emro1 SET koname = ?, engname = ?, field = ?, job = ?, writedate = ?, proposer = ?, birth = ?, address WHERE userid = ?";
				 this.pstmt=this.conn.prepareStatement(query);
				 
				 this.pstmt=conn.prepareStatement(query);
					this.pstmt.setString(1, emroModel.getKoname());
					this.pstmt.setString(2, emroModel.getEngname());
					this.pstmt.setString(3, emroModel.getField());
					this.pstmt.setString(4, emroModel.getJob());
					this.pstmt.setString(5, emroModel.getWritedate());
					
					this.pstmt.setString(6, emroModel.getProposer());
					this.pstmt.setString(7, emroModel.getBirth());
					this.pstmt.setString(8, emroModel.getAddress());
					this.pstmt.setString(9, emroModel.getEmail());
					this.pstmt.setString(10, emroModel.getPhone());
					this.pstmt.setString(11, emroModel.getImgurl());
				
					this.pstmt.setString(12, emroModel.getHighin());
					this.pstmt.setString(13, emroModel.getHighout());
					this.pstmt.setString(14, emroModel.getHighname());
					this.pstmt.setString(15, emroModel.getColin());
					this.pstmt.setString(16, emroModel.getColout());
					
					this.pstmt.setString(17, emroModel.getColinfo());
					this.pstmt.setString(18, emroModel.getColsub());
					this.pstmt.setString(19, emroModel.getMasterin());
					this.pstmt.setString(20, emroModel.getMasterout());
					this.pstmt.setString(21, emroModel.getMasterinfo());
					
					this.pstmt.setString(22, emroModel.getPart());
					this.pstmt.setString(23, emroModel.getSubject());
					this.pstmt.setString(24, emroModel.getGapyear());
					
					this.pstmt.executeUpdate();
					commit();
					
			 }catch(Exception e){
				 System.out.println("update() ERR "+e.getMessage());
			 }finally{
				 this.close(null, pstmt, conn);
			 }
		 }//update END
		
		public void close(ResultSet rs, PreparedStatement pstmt, Connection conn){
			if(rs!=null){
				try {
					rs.close();
				} catch (SQLException e) {
					System.out.println("rs.close ERR "+e.getMessage());
				}
			}// if(rs!=null) END
			
			if(pstmt!=null){
				try {
					pstmt.close();
				} catch (SQLException e) {
					System.out.println("pstmt.close ERR "+e.getMessage());
				}
			}// if(pstmt!=null) END
			
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					System.out.println("conn.close ERR "+e.getMessage());
				}
			}//if(conn!=null) END
		}// close END

}
