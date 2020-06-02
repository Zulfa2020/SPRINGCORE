package zulfa.beans;

import java.util.Arrays;

public class TourPlan {
private String[] places;

public TourPlan() {
System.out.println("TourPlan:Constructor");	
}

public String[] getPlaces() {
	return places;
}

public void setPlaces(String[] places) {
	System.out.println("TourPlan.setPlaces()");
	this.places = places;
}

@Override
public String toString() {
	return "Places= " + Arrays.toString(places);
}



}
