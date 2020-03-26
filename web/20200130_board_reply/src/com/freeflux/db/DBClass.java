package com.freeflux.db;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	import com.freeflux.encode.ChangeEncoding;

	import java.sql.PreparedStatement;


	public class DBClass {
		private static Connection conn=null;
		
		public DBClass() {//�⺻ ������
		}
		
		//mysql ����̹� �ε� �� DB ���� �޼���
		public static void connectlist() {//1��
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/board_db";
				conn =  DriverManager.getConnection(url,"root","920424");
			} catch (ClassNotFoundException e) {
				System.out.println("com.mysql.jdbc.Driver ����"+e.getMessage());
			} catch (SQLException e) {
				System.out.println("DriverManager.getConnection ����"+e.getMessage());
			}
			
		}
		
		//��ü ������ ��ȸ �޼���
			public static ResultSet dataSelectAll() {
				connectlist();
				ResultSet rs = null;
				String querySelect = "select idx, name, contents from board";
				Statement stmt =null;
				try {
					stmt = conn.createStatement();
					 rs = stmt.executeQuery(querySelect);
					
				} catch (SQLException e) {
					System.out.println("������ Select ����"+e.getMessage());
				}
				return rs;
			}
			
			
		//������ ���� �޼ҵ� write.jsp���� ���� ����
		public static String dataInsert(String na,String c) {//2��
			connectlist();//3�� ȣ��
			String status = null; // �� ���� ���� ����
			String queryInsert = "insert into board(name,contents) values(?,?)";
			PreparedStatement pstmt=null;
			
			try {
				pstmt=conn.prepareStatement(queryInsert);
				pstmt.setString(1, ChangeEncoding.toLatin(na));
				pstmt.setString(2, ChangeEncoding.toLatin(c));
		
				int n = pstmt.executeUpdate();
				status=(n>0) ? "SUCCESS":"FAIL";//n�� ��� ����Ǿ����� Ȯ���ϴ� ��
			} catch (SQLException e) {
				System.out.println("pstmt.setString ERR"+e.getMessage());
				return "FAIL";
			}finally {   // ���� try / catch ���� �� �ڿ� ����
				try {
					pstmt.close();
					conn.close();
				} catch (SQLException e) {
					System.out.println("CLOSE ERR : "+e.getMessage());
				}
			}
			return status;
		}//dataInsert end
		
		
		
		//������ ��ȸ �޼���(select*from~where~)
			public static ResultSet dataSelectOne(int no) {
				connectlist();
				ResultSet  rs = null;
				String querySelectOne = "select name, contents from board where idx=?";
				
				try {
					PreparedStatement pstmt=conn.prepareStatement(querySelectOne);
					pstmt.setInt(1, no);
					rs=pstmt.executeQuery();
					
				} catch (SQLException e) {
					System.out.println("conn.prepareStatement(querySelectOne) ERR :"+e.getMessage());
				}
				return rs;
			}
			
		//������ ���� �޼���(update~set~where)
			public static String dataUpdate(String w, String c) {
				connectlist();
				
				String querydataUpdate ="update board set name=?, contents=?, where idx=?"; 
				PreparedStatement pstmt = null;
				String status = null;
				
				try {
					pstmt=conn.prepareStatement(querydataUpdate);
					
					pstmt.setString(1, w);
					pstmt.setString(1, c);
					
					int n = pstmt.executeUpdate();
					
					status=(n>0) ? "SUCCESS" : "FAIL";
					
				} catch (SQLException e) {
					System.out.println("conn.prepareStatement(queryhit) ERR:"+e.getMessage());
				}finally{
					try {
						pstmt.close();
					} catch (SQLException e) {
						System.out.println("pstmt.close(); ERR:"+e.getMessage());
					}
					try {
						conn.close();
					} catch (SQLException e) {
						System.out.println("conn.close(); ERR:"+e.getMessage());
					}
				}
				return status;
			}
			
			//��й�ȣ Ȯ�� �޼ҵ�
					public static String pwConfirm(int n, String pw) {
						String querypwConfirm = "select idx, password from board where no=? AND password=?";
						String status = null;
						ResultSet rs=null;
						PreparedStatement pstmt = null;
						
						try {
							pstmt=conn.prepareStatement(querypwConfirm);
							pstmt.setInt(1, n);
							pstmt.setString(2, pw);
							rs=pstmt.executeQuery();
							status=(rs.next()) ? "OK":"BAD";
						} catch (SQLException e) {
							System.out.println("prepareStatement(querypwConfirm) ERR:"+e.getMessage());
						}
								return status;		
							}
					
			//������ ���� �޼���(delete from~where~)
			public static String dataDeleteOne(int no, String p) {
				connectlist();
				
				String status =null;
				String queryDeleteOne = "delete from board where idx=? AND PW=?";
				PreparedStatement pstmt = null;
				try {
					pstmt = conn.prepareStatement(queryDeleteOne);
					pstmt.setInt(1, no);
					pstmt.setString(2, p);
					int n =pstmt.executeUpdate();
					status=(n>0)?"SUCCESS":"FAIL";
				} catch (SQLException e) {
					System.out.println("queryDeleteOne ERR:"+e.getMessage());
				}
				return status;
			}
			
			//hit �� �ø���
			public static String hitUp(int no){
				connectlist();
				PreparedStatement pstmt=null;
				String queryHit = "update board set hit = hit+1 where idx =?";
				String status = null; 
				
				try {
					pstmt = conn.prepareStatement(queryHit);
					pstmt.setInt(1,no);
					int n = pstmt.executeUpdate();
					status=(n>0) ? "SUCCESS":"FAIL";
				} catch (SQLException e) {
					System.out.println("prepareStatement ERR"+e.getMessage());
				}finally{
					try {
						pstmt.close();
						conn.close();
					} catch (SQLException e) {
						System.out.println("pstmt.close()"+e.getMessage());
					}
				}
				return status;
			}
			
			//��۾��� query
			public static String reply(String r){
				connectlist();
				
				String queryreply1 = "select depth=depth+1 from board";
				String queryreply2 = "update board set uit+1 where uid >=$uid"; 
				String queryreply3 = "insert into board (name,title,message,email,check,hit,pass,depth,uid) values('name','title','message','email','now()',hit,'pass',depth,uid)";
				PreparedStatement  pstm = null;
				ResultSet  rs = null;
				try {
					 pstm = conn.prepareStatement(queryreply1);
					 pstm = conn.prepareStatement(queryreply2);
					 pstm = conn.prepareStatement(queryreply3);
					 pstm.setString(1, r);
					 rs=pstm.executeQuery();
					 
				} catch (SQLException e) {
					System.out.println("conn.prepareStatement(queryreply);"+e.getMessage()
					);
				}
				
				
				return r;
			}
			
			//���ο� �۾���  query
			public static String newreply(String n){
				connectlist();
				
				String queryreply1 = "select MAX(uid)+1 from board";
				String queryreply2 = "update board set uit+1 where uid >=$uid"; 
				String queryreply3 = "insert into board (name,title,message,email,check,hit,pass,depth,uid) values('name','title','message','email','now()',hit,'pass',depth,uid)";
				PreparedStatement  pstm = null;
				ResultSet  rs = null;
				try {
					 pstm = conn.prepareStatement(queryreply1);
					 pstm = conn.prepareStatement(queryreply2);
					 pstm = conn.prepareStatement(queryreply3);
					 pstm.setString(1, n);
					 rs=pstm.executeQuery();
					 
				} catch (SQLException e) {
					System.out.println("conn.prepareStatement(queryreply);"+e.getMessage()
					);
				}
				
				return n;
			}
			
			
	}	



