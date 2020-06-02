package zulfa.client;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import zulfa.controller.EmployeeController;
import zulfa.vo.EmployeeVO;

public class EmployeeRegistration {

	
	public static void main(String[] args) {
	//create IOC Container
		DefaultListableBeanFactory fac=null;
		Scanner sc=null;
		String  empname=null,
				  desig=null,
				  salary=null,
				  allowance=null;
		String result=null;
		XmlBeanDefinitionReader reader=null;
		EmployeeController con=null;
		EmployeeVO vo=null;
		/*fac=new XmlBeanFactory(new ClassPathResource("zulfa/cfgs/applicationContext.xml"));
	*/
		fac=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(fac);
		reader.loadBeanDefinitions("zulfa/cfgs/applicationContext.xml");
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
	}//main

}
