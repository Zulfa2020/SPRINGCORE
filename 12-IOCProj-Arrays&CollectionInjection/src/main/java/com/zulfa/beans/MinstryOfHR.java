package com.zulfa.beans;
//Set Collection
import java.util.Date;
import java.util.Set;

public class MinstryOfHR {
private Set<Long> aadharNo;
private Set<Date> impDates;

public MinstryOfHR() {
	System.out.println("..........................Set Collection....................");
}

public void setAadharNo(Set<Long> aadharNo) {
	this.aadharNo = aadharNo;
}
public void setImpDates(Set<Date> impDates) {
	this.impDates = impDates;
}
@Override
public String toString() {
	return "AadharNo= " + aadharNo + "\nImpDates= " + impDates + "-->"+aadharNo.getClass();
}


	
}
