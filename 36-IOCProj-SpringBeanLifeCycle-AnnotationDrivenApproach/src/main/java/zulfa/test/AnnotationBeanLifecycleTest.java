package zulfa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import zulfa.beans.Voter;

public class AnnotationBeanLifecycleTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Voter  voter=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("zulfa/cfgs/applicationContext.xml");
		//get Bean object
		voter=ctx.getBean("voter",Voter.class);
		System.out.println(voter);
		System.out.println(voter.checkVotingElgibility());
		
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
