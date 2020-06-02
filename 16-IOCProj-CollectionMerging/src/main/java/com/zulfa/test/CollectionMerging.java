package com.zulfa.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.zulfa.beans.EnggCourse;


public class CollectionMerging {

	public static void main(String[] args) {
		//create ioc container
		BeanFactory fac=null;
		XmlBeanDefinitionReader re=null;
		EnggCourse course1=null,course2=null;
	   // fac=new XmlBeanFactory(new ClassPathResource("com/zulfa/cfgs/applicationContext.xml"));
        fac=new DefaultListableBeanFactory();
        re=new XmlBeanDefinitionReader((BeanDefinitionRegistry) fac);
        re.loadBeanDefinitions("com/zulfa/cfgs/applicationContext.xml");
	    //get bean obj
	    course1=fac.getBean("ecy", EnggCourse.class);
	    System.out.println(course1);
		System.out.println("...................................");
		
		 course2=fac.getBean("csy", EnggCourse.class);
		    System.out.println(course2);
	}//main
}
