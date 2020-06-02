package zulfa.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import zulfa.controller.EmployeeController;
import zulfa.vo.EmployeeVO;

public class EmployeeRegistration {

	
	public static void main(String[] args) {
	//create IOC Container
		ApplicationContext fac=null;
		Scanner sc=null;
		String  empname=null,
				  desig=null,
				  salary=null,
				  allowance=null;
		String result=null;
		EmployeeController con=null;
		EmployeeVO vo=null;
		fac=new ClassPathXmlApplicationContext("zulfa/cfgs/applicationContext.xml");
	//get bean class obj
		con=fac.getBean("empcon", EmployeeController.class);
		//enter inputs
		sc=new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		empname=sc.nextLine();
		System.out.println("Enter Employee Designation: ");
		desig=sc.nextLine();
		System.out.println("Enter Employee Salary: ");
		salary=sc.next();
		System.out.println("Enter Allowances: ");
		allowance=sc.next();
		//prepare vo class obj
		vo=new EmployeeVO();
		vo.setEmpname(empname);
		vo.setDesignation(desig);
		vo.setBasicsalary(salary);
		vo.setAllowances(allowance);
		//invoke controller class method
		try {
			result=con.process(vo);
			System.out.println(result);
			}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Student Registration Failed");
		}
		
		((AbstractApplicationContext) fac).close();
		System.out.println(System.getProperties());
	}//main

}
