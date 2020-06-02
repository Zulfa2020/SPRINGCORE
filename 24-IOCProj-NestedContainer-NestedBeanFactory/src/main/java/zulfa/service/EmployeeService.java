package zulfa.service;

import java.util.List;

import zulfa.dto.EmployeeDTO;

public interface EmployeeService {
public List<EmployeeDTO> fetchEmpByDesg(String desig1,String desig2)throws Exception;
}
