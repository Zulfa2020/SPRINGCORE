package com.zulfa.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.zulfa.beans.Flipkart;

public class FlipkartTest {

	public static void main(String[] args) {
		BeanFactory factory;
		ClassPathResource res;
		//create BeanFactory object  
		res=new ClassPathResource("com/zulfa/cfgs/applicationContext.xml");
		//create IOC Container
		factory=new XmlBeanFactory(res);
		//get bean object
		Flipkart bean=factory.getBean("fpk", Flipkart.class);
		String billmsg=bean.purchase(new String[] {"shirt", "mobile", "books"});
		System.out.println(billmsg);
	}

}
