package com.nt;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.StudentVO;

@SpringBootApplication
public class IocBootProj82LayeredAppApplication {
	
	

	public static void main(String[] args) {
		ConfigurableApplicationContext  ctx=null;
		MainController controller=null;
		StudentVO vo=null;
		String result=null;
		Scanner sc=null;
		String sno=null,
				  sname=null,
				  m1=null,
				  m2=null,
				  m3=null;
		//Boot Strapping 
		ctx=SpringApplication.run(IocBootProj82LayeredAppApplication.class, args);
		//get IOC container
		controller =ctx.getBean("controller",MainController.class);
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
		
		
		//create vo class object
		vo=new StudentVO();
		vo.setSno(sno);
		vo.setSname(sname);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		//invoke method
		try{
			result=controller.handleStudent(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		sc.close();
		//close container
		ctx.close();
	}

}
