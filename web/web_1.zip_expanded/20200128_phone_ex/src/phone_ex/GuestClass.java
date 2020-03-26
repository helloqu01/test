package phone_ex;

import java.sql.ResultSet;

public class GuestClass implements Database{//11¹ø
	public GuestClass (){

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
