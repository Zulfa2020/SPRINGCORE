package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.A;
import com.nt.beans.B;

public class CyclicTest {

	public static void main(String[] args) {
		BeanFactory fac=null;
		A a1=null;
		B b1=null;
		fac=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//a1=fac.getBean("a1", A.class);
		//System.out.println(a1);
		
		b1=fac.getBean("b1", B.class);
		System.out.println(b1);
		

	
	
	
	}

}
