package com.nt.test;

public class New1_zeroParameter {
	public static void main(String[] args)throws Exception {
		Class c1=null,c2=null;
		Object obj1=null,obj2=null;
	//Load Test class (Test)
		c1=Class.forName(args[0]);
	//create object loaded class
		 obj1=c1.newInstance();
		 System.out.println(obj1.toString());
		 System.out.println(".......................");
		//Load Test class (java.util.Date)
			c2=Class.forName(args[1]);
		//create object loaded class
			 obj2=c2.newInstance();
			 System.out.println(obj2.toString());
			 
			
	}
}
