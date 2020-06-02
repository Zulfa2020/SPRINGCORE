package com.zulfa.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.zulfa.beans.CollegeDetails;
import com.zulfa.beans.FruitStore;
import com.zulfa.beans.MinstryOfHR;
import com.zulfa.beans.PersonProfile;
import com.zulfa.beans.Student;

public class CollectionInjection {

	public static void main(String[] args) {
		//create ioc container
		BeanFactory fac=null;
		Student st=null;
		CollegeDetails clg=null;
		MinstryOfHR moh=null;
	    PersonProfile prof=null;
		FruitStore fs=null;
	    fac=new XmlBeanFactory(new ClassPathResource("com/zulfa/cfgs/applicationContext.xml"));
        
		//get bean obj
		st=fac.getBean("std", Student.class);
		System.out.println(st);
	
	System.out.println("");
	//get bean class obj
	clg=fac.getBean("clg", CollegeDetails.class);
	System.out.println(clg);
			
			System.out.println("");
			//get bean class obj
			moh=fac.getBean("moh", MinstryOfHR.class);
					System.out.println(moh);
	
	System.out.println("");
	//get bean class obj
	prof=fac.getBean("profile", PersonProfile.class);
System.out.println(prof);

System.out.println();
//get bean class obj
fs=fac.getBean("fru", FruitStore.class);
System.out.println(fs);

	}//main
}
