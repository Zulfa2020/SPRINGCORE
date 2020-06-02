package com.zulfa.test;

import java.io.IOException;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.zulfa.beans.Flipkart;

public class FlipkartTest {

	public static void main(String[] args) throws IOException{
		BeanFactory factory=null;
		Resource res=null ;
		Flipkart fk=null;
		
		//locating the spring bean configuration file
		res=new ClassPathResource("com/zulfa/cfgs/applicationContext.xml");
		
		//res=new FileSystemResource("src/com/zulfa/cfgs/applicationContext.xml");
		factory=new XmlBeanFactory(res);
		
		//create beanfactory container
		Object obj=factory.getBean("fpkt");
		
		//downcasting
		fk=(Flipkart) obj;
		
		System.out.println("Constructor_Injection_Application");
		fk.welcomeMessage("Zulfa");
		
		
	}//main
}//class
