package zulfa.controller;

import java.util.List;

import zulfa.dto.EmployeeDTO;
import zulfa.service.EmployeeService;

public class MainController {
private EmployeeService service;

public MainController(EmployeeService service) {
	this.service = service;
}

public List<EmployeeDTO> fetchEmpByDesg(String desg1,String desg2)throws Exception{
	List<EmployeeDTO> listDTO=null;
	//use service
	listDTO=service.fetchEmpByDesg(desg1, desg2);
	
return listDTO;	
}//method
}
