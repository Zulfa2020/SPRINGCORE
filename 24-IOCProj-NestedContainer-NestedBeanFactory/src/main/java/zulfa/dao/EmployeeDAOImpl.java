package zulfa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import zulfa.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
private static final String GET_EMP_BY_DESG="SELECT EMPNO,EMPNAME,JOB,SAL,DEPTNO FROM EMPLOYEE_DETAILS WHERE JOB IN(?,?)";
	private DataSource ds;

	public EmployeeDAOImpl(DataSource ds) {
	this.ds = ds;
}

	@Override
	public List<EmployeeBO> getEmployeeDesig(String desig1, String desig2) throws Exception {
		
			Connection con=null;
			PreparedStatement ps=null;
			List<EmployeeBO> listBO=null;
			ResultSet rs=null;
			EmployeeBO bo=null;
			try {
			//get jdbc conn obj
			con=ds.getConnection();
			ps=con.prepareStatement(GET_EMP_BY_DESG);
			//set query param values
			ps.setString(1, desig1);
			ps.setString(2, desig2);
			//execute the query
			rs=ps.executeQuery();
			//copy rs records to listBO objects
			listBO=new ArrayList();
			while(rs.next()) {
				bo=new EmployeeBO();
				bo.setEmpno(rs.getInt(1));
				bo.setEmpName(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setSal(rs.getInt(4));
				bo.setDeptNo(rs.getInt(5));
				//add each BO class object to listBO class object
				listBO.add(bo);
			}//while
			
		}//try
	catch(SQLException se) {
		se.printStackTrace();
		throw se;
	}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	finally {
		//close jdbc connections
		try {
			if(rs!=null) 
				rs.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
		try {
			if(ps!=null) 
				ps.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
		
		try {
			if(con!=null) 
				con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
	}//finally
	return listBO;
	}//method
}//class
