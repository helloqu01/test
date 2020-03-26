package phone_ex;

import java.sql.ResultSet;

public interface Database {//9번 
	
	String db_driver="com.mysql.jdbc.Drtver";
	String db_url="jdbc:mysql://localhost:3306/";
	
	public void connect(String db_name);
	public ResultSet selectAll(String query);
	public ResultSet selectOne(String query);
	public int insert(String query);
	public int delete(String query);
	public int update(String query);
	public int hit(String query);
}
