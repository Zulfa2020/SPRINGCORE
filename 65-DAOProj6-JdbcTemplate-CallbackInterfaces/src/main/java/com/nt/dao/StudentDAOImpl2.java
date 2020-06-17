package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;

//@Repository("studDAO")
public class StudentDAOImpl2 implements StudentDAO {
	private static final  String GET_STUDENT_BY_NO="SELECT SNO,SNAME,SADD,AVG FROM  STUDENT1 WHERE SNO=?";
	@Autowired
	private JdbcTemplate jt;

	@Override
	public StudentBO getStudentById(int no) {
		StudentBO bo1=null;
		bo1=jt.queryForObject(GET_STUDENT_BY_NO,
				              (rs,index)->{
									StudentBO bo=null;
									//copy ResultSet object records  BO class obbj
									bo=new StudentBO();
									bo.setSno(rs.getInt(1));
									bo.setSname(rs.getString(2));
									bo.setSadd(rs.getString(3));
									bo.setAvg(rs.getFloat(4));
									return bo;
								}//mapRow(-)
			                     ,
				             no);
		
		return bo1;
	}//method
	
	

}
