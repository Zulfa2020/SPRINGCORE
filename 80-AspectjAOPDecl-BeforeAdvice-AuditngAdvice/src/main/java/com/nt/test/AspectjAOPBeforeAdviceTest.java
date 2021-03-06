package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.CarShowRoom;

public class AspectjAOPBeforeAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		 CarShowRoom proxy=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Proxy class object
		proxy=ctx.getBean("showRoom",CarShowRoom.class);
		//invoke the b.method
		try {
			System.out.println(proxy.purchaseCar("swift",900000, "white","karan"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//close container
		((AbstractApplicationContext) ctx).close();

	}//main
}//class
