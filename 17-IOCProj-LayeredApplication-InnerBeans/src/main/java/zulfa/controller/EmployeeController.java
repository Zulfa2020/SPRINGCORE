package zulfa.controller;

import zulfa.dto.EmployeeDTO;
import zulfa.service.EmployeeService;
import zulfa.vo.EmployeeVO;

public class EmployeeController {
private EmployeeService service;

public EmployeeController(EmployeeService service) {
	this.service = service;
}
public String process(EmployeeVO vo)throws Exception{
	String res=null;
	EmployeeDTO dto=null;
	//convert vo obj to dto obj
	dto=new EmployeeDTO();
	dto.setEmpname(vo.getEmpname());
	dto.setDesignation(vo.getDesignation());
	dto.setBasicsalary(Float.parseFloat(vo.getBasicsalary()));
	dto.setAllowances(Float.parseFloat(vo.getAllowances()));
	//use service class
	res=service.calculate(dto);
	return res;
} 

}
