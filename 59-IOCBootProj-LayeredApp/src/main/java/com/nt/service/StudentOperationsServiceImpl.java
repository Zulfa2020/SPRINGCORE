package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;
import com.sun.istack.internal.NotNull;

@Service("studService")
public  class StudentOperationsServiceImpl implements StudentOperationsService {
	@Autowired
	private  StudentDAO dao;
	

	


	@Override
	public  @Nullable String register(@NotNull StudentDTO dto) throws Exception {
		int total=0;
		float avg=0.0f;
		String result=null;
		StudentBO bo=null;
		int  count=0;
		//write b.logic to total,avg and resuslt
		total=dto.getM1()+dto.getM2()+dto.getM3();
		avg=total/3.0f;
		if(dto.getM1()<35 || dto.getM2()<35 ||dto.getM3()<35)
			result="fail";
		else
			result="pass";
		//prepare BO class obj having Persistable Data
		 bo=new StudentBO();
	
		 bo.setSno(dto.getSno());
			bo.setSname(dto.getSname());
			bo.setM1(dto.getM1());
			bo.setM2(dto.getM2());
			bo.setM3(dto.getM3());
			bo.setTotal(total);
			bo.setAvg(avg);
			bo.setResult(result);
	// use DAO
		 count=dao.insert(bo);
		 //process the result
		 if(count==0)
			 return "Student Registration failed ";
		 else
			 return "Student Registration Succeeded --> " + "Result: " + bo.getResult()  ;
		
	}

}
