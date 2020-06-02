package com.nt.test;

import java.lang.reflect.Constructor;

public class New2_withParameters {
	public static void main(String[] args)throws Exception {
		Class c1=null,c2=null;
		Constructor cons1[]=null,cons2[]=null;
		Object obj1=null,obj2=null;
	//Load Test class (Test)
		c1=Class.forName(args[0]);
	//get All constructors
		cons1=c1.getDeclaredConstructors();
   //create object loaded class
		 obj1=cons1[1].newInstance(10,20);
		 System.out.println(obj1.toString());
		 
		 System.out.println(".......................");
	//Load Test class (java.util.Date)
			c2=Class.forName(args[1]);
	//get All constructors
			cons2=c2.getDeclaredConstructors();
	//create object loaded class
			 obj2=cons2[5].newInstance(119,10,23);
			 System.out.println(obj2.toString());
			 
			
	}//main
}//class
