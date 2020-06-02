package zulfa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import zulfa.beans.Vechicle;

public class JavaConfigAnnotationsTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Vechicle vehicle=null,vehicle1=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("zulfa/cfgs/applicationContext.xml");
		//get  Bean
			vehicle=ctx.getBean("vehicle",Vechicle.class);
			//invoke method
			vehicle.jounery("hyd","goa");
		
		
		
		//close container
		((AbstractApplicationContext) ctx).close();
		
				

	}//main

}//class
