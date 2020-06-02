package com.zulfa.beans;
//Arrays
import java.util.Arrays;
import java.util.Date;

public class Student {
private int marks[];
private Date ImpDates[];

public Student() {
System.out.println("..................Arrays..........");	
}
public void setMarks(int[] marks) {
	this.marks = marks;
}

public void setImpDates(Date[] impDates) {
	ImpDates = impDates;
}

@Override
public String toString() {
	return "Marks= " + Arrays.toString(marks) +
			"\nImpDates=" + Arrays.toString(ImpDates) ;
}
}
