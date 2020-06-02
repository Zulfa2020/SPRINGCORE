package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("empDAO")
public final class EmployeeDAOImpl implements EmployeeDAO {
	private static final String  GET_EMPS_BY_DESGS="SELECT EMPNO,EMPNAME,JOB,SAL,DEPTNO FROM EMPLOYEE_DETAILS WHERE JOB IN(?)";
	@Autowired
	private DataSource ds;
	

	

	@Override
	public @NonNull List<EmployeeBO> getEmpsByDesgs(@NonNull String desg1) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet  rs=null;
		List<EmployeeBO> listBO=null;
		EmployeeBO bo=null;
		try {
			//get Pooled JDBC con object
			con=ds.getConnection();
			//create PreparedStatement object
			ps=con.prepareStatement(GET_EMPS_BY_DESGS);
			//set query param values
			ps.setString(1,desg1);
			//execute the query
			rs=ps.executeQuery();
			//copy RS records  to Listof BO objects
			listBO=new ArrayList();
			while(rs.next()) {
				//copy each record of RS to BO class object
				bo=new EmployeeBO();
				bo.setEmpNo(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setSal(rs.getFloat(4));
				bo.setDeptNo(rs.getInt(5));
				//add each BO class object to listBO
				listBO.add(bo);
			}//while
			
		}//try
		/*catch(SQLException se) {
			se.printStackTrace();
			throw se;  //exceptio rethrowing...
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}*/
		finally {
			//close jdbc objs
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
