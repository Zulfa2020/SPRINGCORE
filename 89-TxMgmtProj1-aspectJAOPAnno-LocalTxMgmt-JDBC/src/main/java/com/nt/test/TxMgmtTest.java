package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankMgmtService;

public class TxMgmtTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankMgmtService proxy=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Proxy object
		proxy=ctx.getBean("bankService",BankMgmtService.class);
		System.out.println(proxy.getClass()+"      "+proxy.getClass().getSuperclass());
		//invoke methods
		try {
			System.out.println(proxy.transferMoney(104, 101,2000));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//close container
		((AbstractApplicationContext) ctx).close();
		
		

	}

}
