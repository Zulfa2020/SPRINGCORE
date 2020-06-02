package zulfa.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import zulfa.beans.PersonProfile;

public class RequiredAnnoTestWithBF {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		PersonProfile pp=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("zulfa/cfgs/applicationContext.xml");
		//get  bean
		pp=factory.getBean("pp",PersonProfile.class);
		System.out.println(pp);
		
		

	}

}


