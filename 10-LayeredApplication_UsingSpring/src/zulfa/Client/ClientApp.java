package zulfa.Client;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import zulfa.controller.StudentController;
import zulfa.vo.StudentVO;

public class ClientApp {

	public static void main(String[] args) {
		StudentController controller=null;
		BeanFactory fac=null;
		StudentVO vo=null;
		String result=null;
		Scanner sc=null;
		String sno=null,
				  sname=null,
				  m1=null,
				  m2=null,
				  m3=null;
    //create IOC Container
	 fac=new XmlBeanFactory(new ClassPathResource("zulfa/cfgs/applicationContext.xml"));
	//get bean class object
	 controller=fac.getBean("stController", StudentController.class);
		
		//Read Inputs
	 sc=new Scanner(System.in);
		System.out.println("Enter Student Number: ");
		sno=sc.nextLine();
		System.out.println("Enter Student Name: ");
		sname=sc.nextLine();
		System.out.println("Enter Marks 1: ");
		m1=sc.nextLine();
		System.out.println("Enter Marks 2: ");
		m2=sc.nextLine();
		System.out.println("Enter Marks 3: ");
		m3=sc.next();
		
		
		//prepare vo class obj
		vo=new StudentVO();
		vo.setSno(sno);
		vo.setSname(sname);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		//invoke method
		try {
			result=controller.process(vo);
			System.out.println(result);
			}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Student Registration Failed");
		}
		
		}//main
}//class
