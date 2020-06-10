package com.nt.test;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.config.AppConfig;
import com.nt.service.EmployeeMgmtService;

public class JdbcTemplateDirectMethodsTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeMgmtService  service=null;
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get Service calss object
		service=ctx.getBean("empService",EmployeeMgmtService.class);
		try {
			System.out.println("Emps count ::"+service.fetchEmpsCount());
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		System.out.println("..............................");
		try {
			System.out.println("117 emp name::"+service.fetchEmpNameByNo(117));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		System.out.println(".........................");
		try {
		 System.out.println("117 Emp Details are::"+service.fetchEmpDetailsByNo(117));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		
		System.out.println(".........................");
		try {
		 System.out.println("CFO,CEO Desg  Emp Details are::"+service.fetchEmpDetailsByDesgs("CFO","CEO"));
		}
		catch(DataAccessException dae) {
			System.out.println("11111");
			dae.printStackTrace();
		}
		/*System.out.println("...............................");
		try {
			System.out.println(service.registerEmployee(4567, "Rajesh","SALESMAN",90000));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}*/
		/*	try {
				System.out.println(service.hikeEmpSalaryBySalRange(1600, 5));
			}
			catch(DataAccessException dae) {
				dae.printStackTrace();
			}
		*/
		/*	try {
				System.out.println(service.fireEmpsBySalaryRange(50000, 100000));
			}
			catch(DataAccessException dae) {
				dae.printStackTrace();
			}*/
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
