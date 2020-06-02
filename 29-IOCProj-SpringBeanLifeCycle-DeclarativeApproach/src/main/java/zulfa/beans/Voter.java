package zulfa.beans;

import java.util.Date;

import org.springframework.beans.factory.InitializingBean;

public class Voter{
private String name;
private int age;
private String addrs;
private Date dov;

public Voter() {
System.out.println("Voter:0-param-Constructor)");	
}

public void setName(String name) {
	System.out.println("Voter.setName()");
	this.name = name;
}
public void setAge(int age) {
	System.out.println("Voter.setAge()");
	this.age = age;
}
public void setAddrs(String addrs) {
	System.out.println("Voter.setAddrs()");
	this.addrs = addrs;
}

public String checkEligibility() {
	System.out.println("Voter.checkEligibility()");
	if(age<18) {
		return "Mr/Miss/Mrs. "+name+" you are not eligible for voting";
	}
	else {
		return "Mr/Miss/Mrs. "+name+" you are eligible for voting";
	}
}//method

@Override
public String toString() {
	return "Voter [name=" + name + ", age=" + age + ", addrs=" + addrs + ", dov=" + dov + "]";
}

//custom Init method
public void myInit() {
	System.out.println("Voter.myInit()");
	//bean processing
	if(age<0) 
		age=age*-1;
   //verifying bean properties
	if(name==null || age<2)
	throw new  IllegalArgumentException("Invalid age , name Values");
//initialize remaining properties
	dov=new Date();
}//Init

//custom Destroy method
public void myDestroy() {
	System.out.println("Voter.myDestroy()");
	name=null;
	age=0;
	dov=null;
	addrs=null;
}//mydestroy




}//class
