package zulfa.beans;

import java.util.Date;

public class PersonProfile {
private long aadharNo;
private String name;
private float age;
private Date dob,doj,dom;

	
	  public void setAadharNo(long aadharNo) { 
		  this.aadharNo = aadharNo;
	  } 
	  public void setName(String name) { 
		  this.name = name; 
		  }
	 
	  public void setAge(float age) {
		  this.age = age; 
		  } 
	  public void setDob(Date dob) {
	  this.dob = dob; 
	  } 
	  public void setDoj(Date doj) { 
		  this.doj = doj; 
		  }
	  public void setDom(Date dom) {
		  this.dom = dom; 
		  } 
	 

@Override
public String toString() {
	return ".........................................Personal Profile..................................."  + "\nAadharNo= " + aadharNo + "\nName= " + name + "\nAge=" + age + "\nDob= " + dob + "\nDoj= " + doj
			+ "\nDom=" + dom ;
}





}
