package zulfa.client;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import zulfa.controller.MainController;
import zulfa.dto.EmployeeDTO;

public class NestedContainerTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory pfactory=null,cfactory=null;
		XmlBeanDefinitionReader preader=null,creader=null;
		MainController con=null;
		List<EmployeeDTO> listDTO=null;
		//create Parent IOC Container
		pfactory=new DefaultListableBeanFactory();
		preader=new XmlBeanDefinitionReader(pfactory);
		preader.loadBeanDefinitions("zulfa/cfgs/business.xml");
		//create Child IOC Container
				cfactory=new DefaultListableBeanFactory(pfactory);
				creader=new XmlBeanDefinitionReader(cfactory);
				creader.loadBeanDefinitions("zulfa/cfgs/presentation.xml");
				
		//get controller class bean object
				con=cfactory.getBean("controller", MainController.class);
				
				//invoke methods
				try {
					listDTO=con.fetchEmpByDesg("MANAGER", "SUPERVISOR");
			       listDTO.forEach(dto->{
			    	   System.out.println(dto);
			       });	
				
				}
				catch(Exception e) {
					e.printStackTrace();
				}
	}//main

}
