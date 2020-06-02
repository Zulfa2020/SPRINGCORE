package zulfa.dao;

import java.util.List;

import zulfa.bo.EmployeeBO;

public interface EmployeeDAO {
	public List<EmployeeBO> getEmployeeDesig(String desig1,String desig2)throws Exception;
	
}

