package zulfa.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import zulfa.beans.TravelAgent;


public class AutoWiringTest {

	public static void main(String[] args) {
		//create IOC Container
		DefaultListableBeanFactory fac=null;
		XmlBeanDefinitionReader reader=null;
		TravelAgent agent=null;
		fac=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(fac);
		reader.loadBeanDefinitions("zulfa/cfgs/applicationContext.xml");
		//get bean class obj
		agent=fac.getBean("agent", TravelAgent.class);
	System.out.println(agent.tourBudgeting());
	
	}//main

}
