package zulfa.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import zulfa.beans.Voter;

public class DeclarativeApproachUsingBeanFactoryIOC {
		public static void main(String[] args) {
			DefaultListableBeanFactory fac=null;
			XmlBeanDefinitionReader read=null;
			Voter vt=null;
			//IOC Container Creation
			fac=new DefaultListableBeanFactory();
			read=new XmlBeanDefinitionReader(fac);
			read.loadBeanDefinitions("zulfa/cfgs/applicationContext.xml");
			
			//get bean class object
			vt=fac.getBean("vt", Voter.class);
			System.out.println(vt);
			System.out.println(vt.checkEligibility());

		}//main

	}
