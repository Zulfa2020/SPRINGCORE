package zulfa.controller;

import zulfa.dto.StudentDTO;
import zulfa.service.StudentService;
import zulfa.vo.StudentVO;

public final class StudentController {
       private StudentService service;

	public StudentController(StudentService service) {
		System.out.println("StudentController:1-param constructor");
		this.service = service;
	}
      
	public String process(StudentVO vo)throws Exception {
		StudentDTO dto=null;
		String result=null;
		//convert VO obj to DTO obj
		 dto=new StudentDTO();
		dto.setSno(Integer.parseInt(vo.getSno()));
		dto.setSname(vo.getSname());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		//use service class
		result=service.generateResult(dto);
		return result;
	}//method
}//class