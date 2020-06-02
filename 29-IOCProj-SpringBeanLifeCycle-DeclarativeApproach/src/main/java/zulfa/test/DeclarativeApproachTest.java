package zulfa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import zulfa.beans.Voter;

public class DeclarativeApproachTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Voter vt=null;
		//IOC Container Creation
		ctx=new ClassPathXmlApplicationContext("zulfa/cfgs/applicationContext.xml");
		
		//get bean class object
		vt=ctx.getBean("vt", Voter.class);
		System.out.println(vt);
		System.out.println(vt.checkEligibility());

		((AbstractApplicationContext) ctx).close();
	}//main

}
