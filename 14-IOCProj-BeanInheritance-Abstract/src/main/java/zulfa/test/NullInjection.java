package zulfa.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import zulfa.beans.PersonProfile;

public class NullInjection {

	public static void main(String[] args) {
		BeanFactory fac=null;
		/*
		 DefaultListableBeanFactory dlbf=null; 
		 XmlBeanDefinitionReader xbdr=null;
		 */
		PersonProfile aliprofile=null,abdiprofile=null;
		fac=new XmlBeanFactory(new ClassPathResource("zulfa/cfgs/applicationContext.xml"));
		
		/*
		  dlbf=new DefaultListableBeanFactory(); xbdr=new
		  XmlBeanDefinitionReader(dlbf);
		  xbdr.loadBeanDefinitions("zulfa/cfgs/applicationContext.xml");
		 */
		
		//get bean class obj
		aliprofile=fac.getBean("aliprofile", PersonProfile.class);
		System.out.println(aliprofile);
		System.out.println();
		
		/*
		 * ankoprofile=fac.getBean("ankoprofile", PersonProfile.class);
		 * System.out.println(ankoprofile); System.out.println();
		 */
		
		abdiprofile=fac.getBean("abdiprofile", PersonProfile.class);
		System.out.println(abdiprofile);
		System.out.println();
		
		
	}

}
