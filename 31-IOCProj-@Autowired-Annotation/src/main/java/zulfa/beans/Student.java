package zulfa.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
private int sno;
private String sname;
 @Autowired
private Course course;
 @Autowired
private Date dob;
 
 public Student() {
	 System.out.println("Student.Student()");
 }
 
public void setSno(int sno) {
	System.out.println("Student.setSno()");
	this.sno = sno;
}
public void setSname(String sname) {
	System.out.println("Student.setSname()");
	this.sname = sname;
}

public void setCourse(Course course) {
	System.out.println("Student.setCourse()");
	this.course = course;
}

public void setDob(Date dob) {
	System.out.println("Student.setDob()");
	this.dob = dob;
}



@Override
public String toString() {
	return "Student [sno=" + sno + ", sname=" + sname + ", course=" + course + ", dob=" + dob + "]";
}








}
