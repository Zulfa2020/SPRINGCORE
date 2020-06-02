package com.zulfa.beans;
//List Collection
import java.util.Date;
import java.util.List;

public class CollegeDetails {
private List<String> stdNames;
private List<Date>  impDates;

public CollegeDetails() {
	System.out.println("......................List Collection..........................");
}

public void setStdNames(List<String> stdNames) {
	this.stdNames = stdNames;
}
public void setImpDates(List<Date> impDates) {
	this.impDates = impDates;
}

@Override
public String toString() {
	return "StudentNames= " + stdNames + "\nImpDates= " + impDates + "-->" + stdNames.getClass();
}





	
	
}
