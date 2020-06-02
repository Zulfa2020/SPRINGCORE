package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;

@Repository("studDAO")
public  class StudentDAOImpl implements StudentDAO {
	private static final String STUDENT_INSERT_QUERY = "INSERT INTO STUDENT VALUES(?,?,?,?,?,?,?,?)";

	@Autowired		
	private DataSource ds;
	
	

	@Override
	public int insert(@NonNull StudentBO bo) throws Exception {
		System.out.println("Dataource obj class name::"+ds.getClass());
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//get Pooled JDBC con object  using the injected DataSource object
		con=ds.getConnection();
		//create JDBC PreparedStatement object having preCompiled SQL Query
		ps=con.prepareStatement(STUDENT_INSERT_QUERY );
		//set values to query param by gathering  BO class object
		ps.setInt(1, bo.getSno());
		ps.setString(2, bo.getSname());
		ps.setInt(3, bo.getM1());
		ps.setInt(4, bo.getM2());
		ps.setInt(5, bo.getM3());
		ps.setInt(6, bo.getTotal());
		ps.setFloat(7, bo.getAvg());
		ps.setString(8, bo.getResult());
		//execute the pre-compiled SQL Query
		count=ps.executeUpdate();
		//close jdbc objs
		ps.close();
		con.close();
		return count;
	}

}
