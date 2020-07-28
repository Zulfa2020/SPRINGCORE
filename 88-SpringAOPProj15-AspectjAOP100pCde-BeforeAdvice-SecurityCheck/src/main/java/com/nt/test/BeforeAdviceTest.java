package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config.AppConfig;
import com.nt.manager.AuthenticationManager;
import com.nt.service.BankMgmtService;

public class BeforeAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		AuthenticationManager manager=null;
		BankMgmtService proxy=null;
		//create IOC conatiner
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//Get Manager
		manager=ctx.getBean("authManager",AuthenticationManager.class);
		proxy=ctx.getBean("bankService",BankMgmtService.class);
		manager.signIn("Naz","nazizi");
		try {
			//withdraw
			System.out.println(proxy.withdrawMoney(103,2000));
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(".................................");
		try {
			//withdraw
			System.out.println(proxy.depositeMoney(101,2000));
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		manager.singnOut();
		
		//close container
		((AbstractApplicationContext) ctx).close();

	}//main

}//class
