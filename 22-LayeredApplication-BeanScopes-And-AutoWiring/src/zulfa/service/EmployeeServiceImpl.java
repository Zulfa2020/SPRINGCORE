package zulfa.service;

import zulfa.bo.EmployeeBO;
import zulfa.dao.EmployeeDAO;
import zulfa.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
private EmployeeDAO dao;
private EmployeeBO bo;
	public EmployeeServiceImpl(EmployeeDAO dao,EmployeeBO bo) {
	System.out.println("EmployeeServiceImpl:2-param constructor");
		this.dao = dao;
    this.bo=bo;
	}

	@Override
	public String calculate(EmployeeDTO dto) throws Exception {
	float grosssalary=0.0f;
	float incometax=0.0f;
	float netsalary=0.0f;
	
	
	grosssalary=dto.getBasicsalary()+dto.getAllowances();
	incometax=(float) (grosssalary*0.2);
	netsalary=grosssalary-incometax;
	
	//prepare BO class object having persistable data
	
	bo.setEmpname(dto.getEmpname());
	bo.setDesignation(dto.getDesignation());
	bo.setBasicsalary(dto.getBasicsalary());
	bo.setGrosssalary(grosssalary);
	bo.setIncometax(incometax);
	bo.setNetsalary(netsalary);
	
	int cnt=dao.insert(bo);
	if(cnt==0) {
		return "Employee Registration Failed.";
	}
	else {
		return "Employee Registration Succeeded "  ;
	}
		
	}

}
