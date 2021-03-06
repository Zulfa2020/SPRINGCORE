package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.config.AppConfig;
import com.nt.dto.ProjectDTO;
import com.nt.service.ProjectMgmtService;

public class ORMHibernateTest {

	public static void main(String[] args) {
		   ApplicationContext ctx=null;
		   ProjectMgmtService  service=null;
		   ProjectDTO dto=null;
		   //create IOC container
		   ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		   //get Service class object
		   service=ctx.getBean("projService",ProjectMgmtService.class);
		   //save object
		try {
		   //create DTO
		    dto=new ProjectDTO();
		    dto.setProjName("openFx3"); dto.setTeamSize(23);
		    dto.setCompany("CANNON"); dto.setCost(10000.0);
		    dto.setLocation("Nai");
		   //use service
		   System.out.println(service.registerProject(dto));
		}
		catch(DataAccessException dae) {
		   dae.printStackTrace();
		}
		
		/* System.out.println("......................................");
		 System.out.println("2 Project details ::"+service.fetchProjectById(1));*/
		/*   System.out.println("................................................");
		   System.out.println("2 Project updation::"+service.modifyProjectById(2,10, 200000));*/
		   
		   /*System.out.println("................................................");
		   System.out.println("2 Project deletion::"+service.removeProjectById(2)); */
		   
		   System.out.println("-------------------------------------------");  //for each
		   List<ProjectDTO> listDTO=service.fetchProjectsByCostRange(100000, 300000);
		   listDTO.forEach(dto1->{
			   System.out.println(dto1);
		   });
		   System.out.println(".....................................");
		   listDTO.forEach(System.out::println);  //method reference
		   System.out.println("...................................");
		   System.out.println(listDTO);   //toString
		   System.out.println(".......................................");
		   listDTO.stream().forEach(System.out::println);  //Streaming api
		   
	//close container
		   ((AbstractApplicationContext) ctx).close();

	}//main
}//class
