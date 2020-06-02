package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjection_Test {

	public static void main(String[] args) {
		Resource res=null;
		Object obj=null;
		BeanFactory factory=null;
		WishMessageGenerator generator=null;
		
		//Hold springbean file
		res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		
		//create beanFactory IOC Container
		factory=new  XmlBeanFactory(res);
		
		//get target bean class object
		obj=factory.getBean("wmg");
		
		//downcasting 
		generator=(WishMessageGenerator) obj;
		//invoke b.method
	     System.out.println("Result is: "+generator.generateMessage("Ali"));
	}//main
}//class
