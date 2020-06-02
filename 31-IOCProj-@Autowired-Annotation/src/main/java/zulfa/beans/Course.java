package zulfa.beans;

import java.util.Calendar;

public class Course {
private int courseid;
private String courseName;
private Calendar dos;


public void setDos(Calendar dos) {
	System.out.println("Course.setDos()");
	this.dos = dos;
}
public void setCourseid(int courseid) {
	System.out.println("Course.setCourseid()");
	this.courseid = courseid;
}
public void setCourseName(String courseName) {
	System.out.println("Course.setCourseName()");
	this.courseName = courseName;
}

@Override
public String toString() {
	return "Course [courseid=" + courseid + ", courseName=" + courseName + ", dos=" + dos + "]";
}







}
