package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;

//@Repository("studDAO")
public class StudentDAOImpl implements StudentDAO {
	private static final  String GET_STUDENT_BY_NO="SELECT SNO,SNAME,SADD,AVG FROM  STUDENT1 WHERE SNO=?";
	private static final  String GET_STUDENTS_BY_CITY="SELECT SNO,SNAME,SADD,AVG FROM  STUDENT1 WHERE SADD=?";
	
	@Autowired
	private JdbcTemplate jt;

	@Override
	public StudentBO getStudentById(int no) {
		StudentBO bo=null;
		bo=jt.queryForObject(GET_STUDENT_BY_NO,
				             new StudentMapper(),
				             no);
		
		return bo;
	}
	
	//nested inner class
	private static class StudentMapper implements RowMapper<StudentBO>{

		@Override
		public StudentBO mapRow(ResultSet rs, int index) throws SQLException {
			StudentBO bo=null;
			//copy ResultSet object to BO class object
			bo=new StudentBO();
			bo.setSno(rs.getInt(1));
			bo.setSname(rs.getString(2));
			bo.setSadd(rs.getString(3));
			bo.setAvg(rs.getFloat(4));
			return bo;
		}//mapRow(-,-)
		
	}//inner class

	@Override
	public List<StudentBO> getStudentsByAddrs(String addrs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentBO> getStudentsByCity(String city) {
		List<StudentBO> listBO=null;
		listBO=new ArrayList();
		 jt.query(GET_STUDENTS_BY_CITY,
				 new StudentRowCallbackHandler(listBO),
				 city);
		
		return listBO;
	}
	
	//inner class
	private static class StudentRowCallbackHandler implements RowCallbackHandler{
            private List<StudentBO> listBO=null;
		public StudentRowCallbackHandler(List<StudentBO> listBO) {
		      this.listBO=listBO;
		}
		
		@Override
		public void processRow(ResultSet rs) throws SQLException {
			System.out.println("StudentDAOImpl.StudentRowCallbackHandler.processRow(-)");
			StudentBO bo=null;
			//copy record  to BO class obj
			bo=new StudentBO();
			bo.setSno(rs.getInt(1));
			bo.setSname(rs.getString(2));
			bo.setSadd(rs.getString(3));
			bo.setAvg(rs.getFloat(4));
			//add each BO class object to listBO
			listBO.add(bo);
			
		}
		
	}

}
