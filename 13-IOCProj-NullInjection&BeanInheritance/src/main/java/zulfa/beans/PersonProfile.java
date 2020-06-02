package zulfa.beans;

import java.util.Date;

public class PersonProfile {
private long aadharNo;
private String name;
private float age;
private Date dob,doj,dom;
public PersonProfile(long aadharNo, String name, float age, Date dob, Date doj, Date dom) {
	System.out.println("PersonProfile:6-param constructor");
	this.aadharNo = aadharNo;
	this.name = name;
	this.age = age;
	this.dob = dob;
	this.doj = doj;
	this.dom = dom;
}
@Override
public String toString() {
	return ".........................................Personal Profile..................................."  + "\nAadharNo= " + aadharNo + "\nName= " + name + "\nAge=" + age + "\nDob= " + dob + "\nDoj= " + doj
			+ "\nDom=" + dom ;
}





}
