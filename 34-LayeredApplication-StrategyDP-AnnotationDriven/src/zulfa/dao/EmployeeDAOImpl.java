package zulfa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import zulfa.bo.EmployeeBO;
@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String Employee_Query = "INSERT INTO EMPLOYEE_INFO VALUES(ID_SEQ.NEXTVAL,?,?,?,?,?,?)";
   @Autowired
	private DataSource ds;

public EmployeeDAOImpl(DataSource ds) {
	this.ds = ds;
}

@Override
	public int insert(EmployeeBO bo) throws Exception {
	Connection con=null;
	PreparedStatement ps=null;
	//get jdbc connection
	con=ds.getConnection();
	//create preparedstatement
   ps=con.prepareStatement(Employee_Query);	
   ps.setString(1, bo.getEmpname());
   ps.setString(2, bo.getDesignation());
   ps.setFloat(3, bo.getBasicsalary());
   ps.setFloat(4, bo.getGrosssalary());
   ps.setFloat(5, bo.getIncometax());
   ps.setFloat(6, bo.getNetsalary());
   
		//execute query
   int result=0;
   result=ps.executeUpdate();
		return result;
	}

}
