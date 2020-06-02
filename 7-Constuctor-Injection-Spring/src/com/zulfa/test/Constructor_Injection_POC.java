package com.zulfa.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.zulfa.comps.Course;
import com.zulfa.comps.Marks;
import com.zulfa.comps.Student;

public class Constructor_Injection_POC {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Student std=null;
		Marks mks=null;
		Course crs=null;
		//create IOC Container
		factory=new XmlBeanFactory(new ClassPathResource("com/zulfa/cfgs/applicationContext.xml"));
		//get Student bean class obejct
		std=factory.getBean("st", Student.class);
		System.out.println(std);
		System.out.println("---------------------------------------------------------");
		mks=factory.getBean("mks", Marks.class);
		System.out.println(mks);
		System.out.println("------------------------------------------------------------");
		crs=factory.getBean("crs", Course.class);
		System.out.println(crs);
		
	}

}
