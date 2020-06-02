package com.zulfa.comps;

public class Student {
private int sno;
private String sname;
private float avg;
public Student(int sno, String sname, float avg) {
	System.out.println("Student:: 3-param constructor");
	this.sno = sno;
	this.sname = sname;
	this.avg = avg;
}

public Student(int sno, String sname) {
	System.out.println("Student:: 2-param constructor");
	this.sno = sno;
	this.sname = sname;
}

@Override
public String toString() {
	return "Student [sno=" + sno + ", sname=" + sname + ", avg=" + avg + "]";
}


}
