package com.zulfa.comps;

public class Course {
	private int cid;
	private String crsname;
	private String faculty;
	private float fee;
	public Course(int cid, String crsname, String faculty, float fee) {
		System.out.println("Course:: 4-param constructor");
		this.cid = cid;
		this.crsname = crsname;
		this.faculty = faculty;
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", crsname=" + crsname + ", faculty=" + faculty + ", fee=" + fee + "]";
	}
	
	
}
