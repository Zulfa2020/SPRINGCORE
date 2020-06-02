package zulfa.service;

import zulfa.bo.StudentBO;
import zulfa.dao.StudentDAO;
import zulfa.dto.StudentDTO;

public final class StudentServiceImpl implements StudentService {
private StudentDAO dao;

public StudentServiceImpl(StudentDAO dao) {
	System.out.println("StudentServiceImpl:1-param constructor");
	this.dao = dao;
}
@Override
	public String generateResult(StudentDTO dto)throws Exception {
	int total=0;
	float avg=0.0f;
	String result=null;
	StudentBO bo=null;
	int cnt=0;
	//write business logic
	total=dto.getM1()+dto.getM2()+dto.getM3();
	avg=(float)total/3.0f;
	
	if(avg<40) {
		result="Fail ";
	}
	else {
		result="Pass ";
	}
	
	//prepare BO class object having persistable data
	bo=new StudentBO();
	bo.setSno(dto.getSno());
	bo.setSname(dto.getSname());
	bo.setM1(dto.getM1());
	bo.setM2(dto.getM2());
	bo.setM3(dto.getM3());
	bo.setTotal(total);
	bo.setAvg(avg);
	bo.setResult(result);
	
	//use DAO 
	cnt=dao.insert(bo);
	if(cnt==0) {
		return "Student Registration Failed.";
	}
	else {
		return "Student Registration Succeeded --> " + "Result: " + bo.getResult()  ;
	}
	}//method
}//class
