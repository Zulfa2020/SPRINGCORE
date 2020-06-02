package zulfa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import zulfa.bo.EmployeeBO;
import zulfa.dao.EmployeeDAO;
import zulfa.dto.EmployeeDTO;

public class EmployeeServiceIimpl implements EmployeeService {
private EmployeeDAO dao;

	public EmployeeServiceIimpl(EmployeeDAO dao) {
	this.dao = dao;
}

	@Override
	public List<EmployeeDTO> fetchEmpByDesg(String desig1, String desig2) throws Exception {
		List<EmployeeDTO> listDTO=new ArrayList();
		List<EmployeeBO> listBO=null;
		//use DAO
		listBO=dao.getEmployeeDesig(desig1, desig2);
		//copy listBO to listDTO 
		listBO.forEach(bo->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			dto.setSrNo(listDTO.size()+1);
			listDTO.add(dto);
			
		});
		
		
		return listDTO;
	}

}
