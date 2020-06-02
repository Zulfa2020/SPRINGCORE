package zulfa.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import javax.sql.DataSource;

import zulfa.bo.StudentBO;

public final class StudentDaoImpl implements StudentDAO {
	private static final String STUDENT_INSERT_QUERY = "INSERT INTO STUDENT VALUES(?,?,?,?,?,?,?,?)";
private DataSource ds;

public StudentDaoImpl(DataSource ds) {
	System.out.println("StudentDaoImpl:1-param constructor");
	this.ds = ds;
}
@Override
	public int insert(StudentBO bo) throws Exception{
	Connection con=null;
	PreparedStatement ps=null;
	int result=0;
	//get jdbc connection
		con=ds.getConnection();
		//create jdbc preparedstatement obj
	   ps=con.prepareStatement(STUDENT_INSERT_QUERY);
		//set query param by gathering from BO class
		ps.setInt(1, bo.getSno());
		ps.setString(2, bo.getSname());
		ps.setInt(3, bo.getM1());
		ps.setInt(4, bo.getM2());
		ps.setInt(5, bo.getM3());
		ps.setInt(6, bo.getTotal());
		ps.setFloat(7, bo.getAvg());
		ps.setString(8, bo.getResult());
		
		//execute the SQL query
		result=ps.executeUpdate();
		return result;

	}//method
}//class
