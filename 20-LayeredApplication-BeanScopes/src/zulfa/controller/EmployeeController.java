package zulfa.controller;

import zulfa.dto.EmployeeDTO;
import zulfa.service.EmployeeService;
import zulfa.vo.EmployeeVO;

public class EmployeeController {
private EmployeeService service;
private EmployeeDTO dto;

public EmployeeController(EmployeeService service,EmployeeDTO dto) {
	System.out.println("EmployeeController:2-param constructor");
	this.service = service;
    this.dto=dto;
}
public String process(EmployeeVO vo)throws Exception{
	String res=null;
	//convert vo obj to dto obj
	
	dto.setEmpname(vo.getEmpname());
	dto.setDesignation(vo.getDesignation());
	dto.setBasicsalary(Float.parseFloat(vo.getBasicsalary()));
	dto.setAllowances(Float.parseFloat(vo.getAllowances()));
	//use service class
	res=service.calculate(dto);
	return res;
} 

}
