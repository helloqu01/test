package phone_ex;

import java.sql.ResultSet;

public class BoardClass implements Database{//10번 

	public BoardClass(){
	}
	
	@Override
	public void connect(String db_name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ResultSet selectAll(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet selectOne(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(String query) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String query) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(String query) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int hit(String query) {
		// TODO Auto-generated method stub
		return 0;
	}

}
