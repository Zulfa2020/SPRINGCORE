package zulfa.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import zulfa.beans.PersonProfile;

public class RequiredAnnoTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		PersonProfile pp=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("zulfa/cfgs/applicationContext.xml");
		//get  bean
		pp=ctx.getBean("pp",PersonProfile.class);
		System.out.println(pp);
		
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
