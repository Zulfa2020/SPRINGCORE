package zulfa.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import zulfa.beans.Student;



public class AutowiredTest {

	public static void main(String[] args) {
		ApplicationContext fac=null;
		Student st=null;
		fac=new ClassPathXmlApplicationContext("zulfa/cfgs/applicationContext.xml");
		//get bean class obj
	st=fac.getBean("st", Student.class);
	System.out.println(st);
		
	((AbstractApplicationContext) fac).close();
	}

}
