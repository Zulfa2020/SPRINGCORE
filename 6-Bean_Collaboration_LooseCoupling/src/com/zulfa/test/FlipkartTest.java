package com.zulfa.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.zulfa.beans.Flipkart;

public class FlipkartTest {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory fac=null;
		Flipkart fpk=null;
		String billmsg=null;
		//hold spring cfgs file
		res=new ClassPathResource("com/zulfa/cfgs/applicationContext.xml");
		//create BeanFactory IOC Container
		fac=new XmlBeanFactory(res);
		//get Target class object
		fpk=fac.getBean("fpkt", Flipkart.class);
	    billmsg=fpk.purchase(
	    		                             new String[] {"shirts", "trousers", "shoes"}, 
				                             new float[] { 2000.0f,6500.0f,3000.0f}
	                                    );
		System.out.println(billmsg);
	}

}
